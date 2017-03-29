package qiwx.com.designpatterns.Chain;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/29 10:50
 * @desc:
 */

public class ConsoleLogger extends AbstractLogger {


    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard ::Logger: " + message);
    }
}
