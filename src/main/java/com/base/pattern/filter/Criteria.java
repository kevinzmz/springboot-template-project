package com.base.pattern.filter;

import java.util.List;

/**
 * <p></p>
 *
 * @author kevin
 * @create 2018-05-16 11:13
 **/
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
