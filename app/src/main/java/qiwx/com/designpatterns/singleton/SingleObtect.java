package qiwx.com.designpatterns.singleton;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/28 15:19
 * @desc:
 */

public class SingleObtect {
    private static SingleObtect instance = new SingleObtect();

    private SingleObtect() {

    }

    public static SingleObtect getInstance() {
        return instance;
    }
    public void showMessage(){
        System.out.println("单例 singgleTon !");
    }
}
