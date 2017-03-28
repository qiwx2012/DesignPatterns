package qiwx.com.designpatterns.absfactory;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/28 15:05
 * @desc: 生产器类
 */

public class FactoryProducer {

    public static AbsFactory getFactory(String choice) {
        if (choice == null)
            return null;
        if (choice.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("color")) {
            return new ColorFactory();

        }
        return null;
    }

}
