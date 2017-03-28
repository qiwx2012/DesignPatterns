package qiwx.com.designpatterns.builder;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/28 15:36
 * @desc:
 */

public interface Item {
    String name();
    Packing packing();
    float price();

}
