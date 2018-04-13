package com.base.config;

import com.base.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * <p></p>
 *
 * @author kevin
 * @create 2018-04-12 16:07
 **/
public interface UserRepository extends CrudRepository<User,Long>{

}
