package qiwx.com.designpatterns.factory;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/28 14:40
 * @desc:
 */

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("画的是个Square");
    }
}
