package com.base.services.impl;

import com.alibaba.fastjson.JSON;
import com.base.config.UserRepository;
import com.base.model.User;
import com.base.services.TestTransOne;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *     测试spring事务管理
 * </p>
 * @see com.base.services.TestTransOne
 * @see com.base.services.impl TestTransImpl 事务入口
 *
 * @author kevin
 * @create 2018-04-12 18:10
 **/
@Service("testTransOne")
public class TestTransOneImpl implements TestTransOne{
    private static final Logger logger = LoggerFactory.getLogger(TestTransOneImpl.class);

    @Autowired
    private UserRepository userRepository;

   /**
     * 测试事务
     */
    @Override
    @Transactional(rollbackFor = Exception.class,timeout = 30,propagation= Propagation.REQUIRES_NEW)
    public void delete() throws Exception{
        User user = new User();
        user.setId(1);
        logger.info("开始删除记录，入参: {}", JSON.toJSONString(user));
        userRepository.delete(user);
        logger.info("删除记录结束");

        //Thread.sleep(5000);
        //throw new Exception();

        User u = new User();
        u.setName("dd");
        u.setEmail("dd");
        logger.info("删除内部-开始保存记录，入参：{}",JSON.toJSONString(u));

        userRepository.save(u);
        logger.info("删除内部-记录保存成功");

        Thread.sleep(5000);

        //throw new Exception();

    }

    @Override
    @Transactional(rollbackFor = Exception.class,timeout = 30)
    public void saveUser() throws Exception{
        User u = new User();
        u.setId(1);
        u.setName("a1");
        u.setEmail("a1");
        logger.info("新增内部-开始保存记录，入参：{}",JSON.toJSONString(u));

        userRepository.save(u);
        logger.info("新增内部-记录保存成功");

        Thread.sleep(5000);

        //throw new Exception();
    }
}
