package qiwx.com.designpatterns.iterator;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/29 14:35
 * @desc:
 */

public class ConcreteAggregate implements List{

    private Object[] list;
    private int size=0;
    private int index=0;
    public ConcreteAggregate(){
        index=0;
        size=0;
        list=new Object[100];
    }
    @Override
    public void add(Object obj) {
        list[index++]=obj;
        size++;
    }

    @Override
    public Iterator iterator() {

        return new ConcreteIterator(this);
    }
    @Override
    public Object get(int index) {

        return list[index];
    }
    @Override
    public int getSize() {

        return size;
    }

}
