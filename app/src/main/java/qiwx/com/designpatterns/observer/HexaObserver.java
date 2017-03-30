package qiwx.com.designpatterns.observer;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/30 9:37
 * @desc:
 */

public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
    }

    @Override
    public void subscribe() {
        this.subject.attach(this);
    }

    @Override
    public void unSubscribe() {
        this.subject.delete(this);

    }

    @Override
    public void update() {
        System.out.println( "十六进制: " + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
