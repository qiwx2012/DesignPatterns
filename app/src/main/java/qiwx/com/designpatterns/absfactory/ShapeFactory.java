package qiwx.com.designpatterns.absfactory;

import qiwx.com.designpatterns.common.Circle;
import qiwx.com.designpatterns.common.Shape;
import qiwx.com.designpatterns.common.Square;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/28 15:02
 * @desc:
 */

public class ShapeFactory extends AbsFactory {
    @Override
    public Shape getShape(String shape) {
        if (shape == null)
            return null;
        if (shape.equals("circle")) {
            return new Circle();
        } else {
            return new Square();
        }
    }

    @Override
    public Colors getColors(String color) {
        return null;
    }
}
