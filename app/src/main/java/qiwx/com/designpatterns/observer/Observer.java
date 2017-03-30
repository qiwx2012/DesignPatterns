package qiwx.com.designpatterns.observer;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/30 9:33
 * @desc:
 */

public abstract  class Observer {
    protected Subject subject;
    public abstract void update();
    //订阅
    public abstract void subscribe();
    //取消订阅
    public abstract void unSubscribe();

}
