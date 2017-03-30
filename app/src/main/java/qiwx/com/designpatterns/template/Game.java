package qiwx.com.designpatterns.template;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/30 10:54
 * @desc: 模板方法为final的抽象类
 */

public abstract class Game {

    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    //template method

    public final void play() {

        //initialize the game
        initialize();

        //start game
        startPlay();

        //end game
        endPlay();
    }

}
