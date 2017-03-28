package qiwx.com.designpatterns.factory;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/28 14:42
 * @desc:
 */

public class ShapeFactory {

    public Shape getShape(String shape) {

        if (shape == null)
            return null;
        if (shape.equals("circle")) {
            return new Circle();
        } else {
            return new Square();
        }
    }

}
