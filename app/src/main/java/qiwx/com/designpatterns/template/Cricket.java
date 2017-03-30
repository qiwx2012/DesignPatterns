package qiwx.com.designpatterns.template;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/30 10:56
 * @desc:
 */

public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");

    }
}
