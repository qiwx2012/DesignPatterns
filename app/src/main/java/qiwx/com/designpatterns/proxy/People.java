package qiwx.com.designpatterns.proxy;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/30 11:16
 * @desc:
 */

public class People implements ITalk {
    @Override
    public void talk(String msg) {
        System.out.println(msg);
    }
}
