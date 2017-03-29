package qiwx.com.designpatterns.factory;

import qiwx.com.designpatterns.common.Circle;
import qiwx.com.designpatterns.common.Shape;
import qiwx.com.designpatterns.common.Square;

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
