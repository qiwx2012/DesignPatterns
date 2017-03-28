package qiwx.com.designpatterns.builder;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/28 15:41
 * @desc:
 */

public abstract  class Burger implements Item {

    @Override
    public Packing packing() {
        return new Warpper();
    }
    @Override
    public abstract float price();
}
