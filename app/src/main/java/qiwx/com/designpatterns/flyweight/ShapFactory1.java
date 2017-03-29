package qiwx.com.designpatterns.flyweight;

import java.util.HashMap;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/29 10:13
 * @desc: 创建一个工厂根据给定的信息生成具体类的对象。
 */

public class ShapFactory1 {
    private static final HashMap<String, Shape> circleMap = new HashMap();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);
        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
