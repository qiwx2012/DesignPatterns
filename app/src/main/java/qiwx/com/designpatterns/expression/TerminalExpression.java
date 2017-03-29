package qiwx.com.designpatterns.expression;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/29 13:54
 * @desc:
 */

public class TerminalExpression implements Expression {


    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }
    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
