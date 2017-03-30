package qiwx.com.designpatterns.observer;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/30 9:37
 * @desc:
 */

public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println( "八进制: " + Integer.toOctalString( subject.getState() ) );
    }
    @Override
    public void subscribe() {
        this.subject.attach(this);
    }

    @Override
    public void unSubscribe() {
        this.subject.delete(this);

    }
}
