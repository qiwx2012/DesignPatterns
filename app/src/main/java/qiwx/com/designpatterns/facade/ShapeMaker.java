package qiwx.com.designpatterns.facade;

import qiwx.com.designpatterns.common.Circle;
import qiwx.com.designpatterns.common.Square;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/29 10:02
 * @desc: 外观类
 */

public class ShapeMaker {

    private Circle circle;
    private Square square;

    public ShapeMaker() {
        circle = new Circle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
