package qiwx.com.designpatterns.state;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/30 10:36
 * @desc:
 */

public class Context {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    public String stateMessage(){
        return state.getState();
    }
}
