package qiwx.com.designpatterns.factory;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/28 14:38
 * @desc: 圆形 实现图形接口，实现具体绘制行为
 */

public class Circle implements Shape {
    @Override
    public void draw() {
      System.out.println("画的是个Circle");
    }
}
