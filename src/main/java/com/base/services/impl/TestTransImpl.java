package com.base.services.impl;

import com.base.config.UserRepository;
import com.base.services.TestTrans;
import com.base.services.TestTransOne;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *     测试spring事务管理
 *
 *     spring的事务管理是通过切面进行，所以只有通过类对象调用方法，声明式事务才会起作用，调用类内部方法
 *     内部方法的事务注解不生效
 *
 *     @see com.base.services.TestTrans
 *     @see com.base.services.impl.TestTransOneImpl 事务执行
 * </p>
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
