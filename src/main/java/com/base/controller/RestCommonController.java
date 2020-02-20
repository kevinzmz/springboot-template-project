package com.base.controller;

import com.base.model.TestObj;
import com.base.utils.UUIDUtil;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * <P></P>
 * Created by kevin on 2017/8/2 14:29.
 */
@RestController
public class RestCommonController {
    @Resource
    private MongoTemplate mongoTemplate;

    @RequestMapping("test")
    public Map<String, String> getCommonTestResult() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "123");
        map.put("b", "456");
        return map;
    }

    @RequestMapping("mongoData")
    public List<TestObj> getMongoData() {
        TestObj testObj = new TestObj();
        testObj.setId(UUIDUtil.getUUID());
        testObj.setBusinessType(1);
        testObj.setCheckBalanceFkag("01");
        testObj.setTestId(UUIDUtil.getUUID());
        mongoTemplate.insert(testObj);

        TestObj test = mongoTemplate.findById("20170102145900", TestObj.class);
        Query query = new Query(Criteria.where("businessType").is(1).and("testId").ne("9bf444e0659749bc8c6e5ec2bbaa61d4"));
        List<TestObj> testOne = mongoTemplate.find(query,TestObj.class);
        Optional.ofNullable(testObj);

        return testOne;
    }
}
