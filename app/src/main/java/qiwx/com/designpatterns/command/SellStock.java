package qiwx.com.designpatterns.command;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/29 11:33
 * @desc:
 */

public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}