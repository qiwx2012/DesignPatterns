package qiwx.com.designpatterns.state;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/30 10:36
 * @desc:
 */

public class Sunshine implements State{

    @Override
    public String getState() {

        return "晴天";
    }

}