package qiwx.com.designpatterns.prototype;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/28 16:07
 * @desc:
 */

public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("这是一个Square");
    }
}
