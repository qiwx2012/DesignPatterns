package qiwx.com.designpatterns.common;

import qiwx.com.designpatterns.common.Shape;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/29 10:02
 * @desc:
 */

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square:这事一个方形");
    }
}
