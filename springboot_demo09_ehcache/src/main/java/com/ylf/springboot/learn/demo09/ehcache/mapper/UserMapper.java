/**
 * 功能说明:
 * 功能作者:
 * 创建日期:
 * 版权归属:每特教育|蚂蚁课堂所有 www.itmayiedu.com
 */
package com.ylf.springboot.learn.demo09.ehcache.mapper;

import java.util.List;

import com.ylf.springboot.learn.demo09.ehcache.entity.Users;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;


/**
 *
 */
@CacheConfig(cacheNames = "userCache")
public interface UserMapper {
	@Select("SELECT ID ,NAME,AGE FROM users where id=#{id}")
	@Cacheable
	List<Users> getUser(@Param("id") Long id);
}
