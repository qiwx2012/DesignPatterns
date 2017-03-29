package qiwx.com.designpatterns.expression;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/29 13:53
 * @desc: 表达式接口
 */

public interface Expression {
     boolean interpret(String context);
}
