package com.base.pattern.filter;

import java.util.List;

/**
 * <p></p>
 *
 * @author kevin
 * @create 2018-05-16 14:54
 **/
public class OrCriteria implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;
    public OrCriteria(Criteria criteria,Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteria = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

        for(Person person:otherCriteriaItems){
            if(!firstCriteria.contains(person)){
                firstCriteria.add(person);
            }
        }
        return firstCriteria;
    }
}
