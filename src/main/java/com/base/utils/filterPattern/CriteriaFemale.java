package com.base.utils.filterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * <P></P>
 * Created by kevin on 2017/9/12 16:18.
 */
public class CriteriaFemale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for(Person person:persons){
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
