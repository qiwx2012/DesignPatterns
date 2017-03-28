package qiwx.com.designpatterns.prototype;

import qiwx.com.designpatterns.factory.*;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/28 16:05
 * @desc:
 */

public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("这是一个Circle");
    }
}
