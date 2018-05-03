package com.base.pattern.adapter;

/**
 * <p></p>
 *
 * @author kevin
 * @create 2018-05-03 16:33
 **/
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("play mp4 file.Name:"+fileName);
    }
}
