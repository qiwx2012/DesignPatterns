package qiwx.com.designpatterns.iterator;


/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/29 14:33
 * @desc:
 */

public class ConcreteIterator implements Iterator {
    private List list = null;
    private int index;

    public ConcreteIterator(List list) {
        super();
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (index >= list.getSize()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Object object = list.get(index);
        index++;
        return object;
    }

}