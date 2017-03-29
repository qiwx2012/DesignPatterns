package qiwx.com.designpatterns.decorator;

import qiwx.com.designpatterns.common.Shape;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/29 9:39
 * @desc: 抽象装饰器类
 */

public  abstract  class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
