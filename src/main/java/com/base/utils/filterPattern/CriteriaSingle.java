package com.base.utils.filterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * <P></P>
 * Created by kevin on 2017/9/12 16:20.
 */
public class CriteriaSingle implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for(Person person:singlePersons){
           if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
           }
        }
        return singlePersons;
    }
}
