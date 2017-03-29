package qiwx.com.designpatterns.Chain;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/29 10:51
 * @desc:
 */

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error ::Logger: " + message);
    }
}
