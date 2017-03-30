package qiwx.com.designpatterns.proxy;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/30 11:16
 * @desc:
 */

public class TalkProxy implements ITalk {
    ITalk iTalk;

    public TalkProxy(final ITalk italk)
    {
        this.iTalk = italk;
    }


    @Override
    public void talk(String msg) {
        this.iTalk.talk(msg);
    }
    public void sing( String songName)
    {
        System.out.println("Song Name:" + songName);
    }
}
