package com.base.pattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * <p></p>
 *
 * @author kevin
 * @create 2018-05-16 14:49
 **/
public class CriteriaSingle implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        persons.stream().filter(a->a.getMaritalStatus().equalsIgnoreCase("SINGLE")).forEach(b->{
            singlePersons.add(b);
        });
        return singlePersons;
    }
}
