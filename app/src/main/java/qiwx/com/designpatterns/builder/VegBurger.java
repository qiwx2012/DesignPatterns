package qiwx.com.designpatterns.builder;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/28 15:46
 * @desc:
 */

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.2f;
    }
}
