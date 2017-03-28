package qiwx.com.designpatterns.builder;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/28 15:39
 * @desc:
 */

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
