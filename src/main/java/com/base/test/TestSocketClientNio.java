package com.base.test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.concurrent.TimeUnit;

/**
 * @author kevin
 * @version V1.0
 * @Description: TODO
 * @date 2019/7/31 11:52
 **/
public class TestSocketClientNio {
    public static void client(){
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        SocketChannel socketChannel = null;
        try {
            socketChannel = SocketChannel.open();
            socketChannel.configureBlocking(false);
            socketChannel.connect(new InetSocketAddress("10.4.81.59",9000));
            if(socketChannel.finishConnect()){
                int i = 0;
                while(true){
                    TimeUnit.SECONDS.sleep(1);
                    String info = "I’am " + i++ + "-th information from client";
                    byteBuffer.clear();
                    byteBuffer.put(info.getBytes());
                    byteBuffer.flip();
                    while(byteBuffer.hasRemaining()){
                        System.out.println(byteBuffer);
                        socketChannel.write(byteBuffer);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            if(socketChannel!=null){
                try {
                    socketChannel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        TestSocketClientNio.client();
    }
}
