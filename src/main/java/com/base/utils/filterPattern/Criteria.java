package com.base.utils.filterPattern;

import java.util.List;

/**
 * <P></P>
 * Created by kevin on 2017/9/12 16:12.
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> person);
}
