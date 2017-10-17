package com.base.utils.adapterPattern;

/**
 * <P></P>
 * Created by kevin on 2017/9/6 10:33.
 */
public class VlcPlayer implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file.Name："+fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
