package com.base.utils.adapterPattern;

/**
 * <P></P>
 * Created by kevin on 2017/9/6 10:42.
 */
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file.Name: "+fileName);
    }
}
