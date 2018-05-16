package com.base.pattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * <p></p>
 *
 * @author kevin
 * @create 2018-05-16 11:15
 **/
public class CriteriaMale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        persons.stream().filter(a->a.getGender().equalsIgnoreCase("MAIL")).forEach(b->{
            malePersons.add(b);
        });
        return malePersons;
    }
}
