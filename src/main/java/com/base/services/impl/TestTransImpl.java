package com.base.services.impl;

import com.alibaba.fastjson.JSON;
import com.base.config.UserRepository;
import com.base.model.User;
import com.base.services.TestTrans;
import com.base.services.TestTransOne;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p></p>
 *
 * @author kevin
 * @create 2018-04-12 17:03
 **/
@Service("testTrans")
public class TestTransImpl implements TestTrans{
    private static final Logger logger = LoggerFactory.getLogger(TestTransImpl.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TestTransOne testTransOne;

    @Override
    @Transactional(rollbackFor = Exception.class,timeout = 30)
    public void testTrans() throws Exception {
        testTransOne.delete();
        testTransOne.saveUser();
    }
}
