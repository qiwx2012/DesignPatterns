package qiwx.com.designpatterns.iterator;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/29 14:34
 * @desc:
 */

public interface List {
    void add(Object obj);

    Object get(int index);

    Iterator iterator();

    int getSize();
}
