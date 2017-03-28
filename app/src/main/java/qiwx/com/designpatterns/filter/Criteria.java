package qiwx.com.designpatterns.filter;

import java.util.List;

/**
 * @author: qiwx
 * email: qiwx@jingzhengu.com
 * @time: 2017/3/28 18:00
 * @desc:
 */

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
