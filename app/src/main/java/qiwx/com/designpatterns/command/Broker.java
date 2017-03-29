package qiwx.com.designpatterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/29 11:34
 * @desc: 命令调用程序类
 */

public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
