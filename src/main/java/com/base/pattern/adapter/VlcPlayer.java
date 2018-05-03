package com.base.pattern.adapter;

/**
 * <p></p>
 *
 * @author kevin
 * @create 2018-05-03 16:32
 **/
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("playing vlc fine.Name :" + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
