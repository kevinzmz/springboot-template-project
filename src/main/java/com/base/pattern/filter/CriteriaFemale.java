package com.base.pattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * <p></p>
 *
 * @author kevin
 * @create 2018-05-16 11:19
 **/
public class CriteriaFemale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();
        persons.stream().filter(a->a.getGender().equalsIgnoreCase("FEMALE")).forEach(b->{
            femalePersons.add(b);
        });
        return femalePersons;
    }
}
