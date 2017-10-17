package com.base.utils.filterPattern;

import java.util.List;

/**
 * <P></P>
 * Created by kevin on 2017/9/12 16:23.
 */
public class AndCriteria implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria,Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }
    @Override
    public List<Person> meetCriteria(List<Person> person) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(person);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
