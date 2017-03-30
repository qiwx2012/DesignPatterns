package qiwx.com.designpatterns.observer;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/30 9:34
 * @desc: 二进制表达
 */

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;

    }

    @Override
    public void update() {
        System.out.println("二进制: " + Integer.toBinaryString(subject.getState()));
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
