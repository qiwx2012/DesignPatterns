package qiwx.com.designpatterns.adapter;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/28 17:14
 * @desc:
 */

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
