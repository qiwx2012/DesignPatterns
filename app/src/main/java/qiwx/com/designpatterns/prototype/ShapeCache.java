package qiwx.com.designpatterns.prototype;

import java.util.Hashtable;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/28 16:09
 * @desc:
 */

public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap  = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // for each shape run database query and create shape
    // shapeMap.put(shapeKey, shape);
    // for example, we are adding three shapes

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);
        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);
    }
}
