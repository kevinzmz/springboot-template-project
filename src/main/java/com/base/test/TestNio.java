package com.base.test;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author kevin
 * @version V1.0
 * @Description: TODO
 * @date 2019/7/31 10:39
 **/
public class TestNio {

    public static void method1(){
        RandomAccessFile accessFile = null;

        try {
            accessFile = new RandomAccessFile("d://temp/nomal_id.txt","rw");
            FileChannel fileChannel = accessFile.getChannel();
            ByteBuffer buf = ByteBuffer.allocate(1024);
            int bytesRead = fileChannel.read(buf);
            System.out.println(bytesRead);
            while(bytesRead != -1){
                buf.flip();
                while(buf.hasRemaining()){
                    System.out.print((char)buf.get());
                }
                buf.compact();
                bytesRead = fileChannel.read(buf);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(accessFile != null){
                try {
                    accessFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    public static void method2(){

        InputStream  in = null;
        try {
            in = new BufferedInputStream(new FileInputStream("d://temp/nomal_id.txt"));
            byte[] buf = new byte[1024];
            int bytesRead = in.read(buf);
            while(bytesRead != -1){
                for(int i=0;i<bytesRead;i++){
                    System.out.print((char)buf[i]);
                }
                bytesRead = in.read(buf);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("----------------IO-开始打印-----------------------");
        TestNio.method2();
        System.out.println("----------------IO-结束打印-----------------------");

        System.out.println("----------------NIO-开始打印----------------------");
        TestNio.method1();
        System.out.println("----------------NIO-结束打印----------------------");
    }
}
