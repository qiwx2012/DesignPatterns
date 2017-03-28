package qiwx.com.designpatterns.absfactory;

import qiwx.com.designpatterns.factory.Shape;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/28 15:02
 * @desc:
 */

public class ColorFactory extends AbsFactory {
    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Colors getColors(String color) {
        if (color == null) {
            return null;
        }

        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else {
            return new Green();
        }
    }
}
