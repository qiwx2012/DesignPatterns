package qiwx.com.designpatterns.absfactory;

import qiwx.com.designpatterns.factory.Shape;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/28 14:59
 * @desc: 定义一个抽象类 实现类实现具体的工厂
 */

public abstract class AbsFactory {

    public abstract Shape getShape(String shape);

    public abstract Colors getColors(String color);
}
