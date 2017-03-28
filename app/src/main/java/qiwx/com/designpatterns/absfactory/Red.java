package qiwx.com.designpatterns.absfactory;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/28 14:57
 * @desc:
 */

public class Red implements Colors {
    @Override
    public void fill() {
        System.out.println(" this is Red");
    }
}
