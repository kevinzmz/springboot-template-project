package com.base.pattern.filter;

import java.util.List;

/**
 * <p></p>
 *
 * @author kevin
 * @create 2018-05-16 14:51
 **/
public class AndCriteria implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;
    public AndCriteria(Criteria criteria,Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteria = criteria.meetCriteria(persons);

        return otherCriteria.meetCriteria(persons);
    }
}
