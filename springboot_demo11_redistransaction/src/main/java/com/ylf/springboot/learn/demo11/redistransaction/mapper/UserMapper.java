package com.ylf.springboot.learn.demo11.redistransaction.mapper;


import com.ylf.springboot.learn.demo11.redistransaction.entity.Users;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.CacheConfig;

@CacheConfig(cacheNames = { "userCache" })
public interface UserMapper {
    @Select("SELECT ID ,NAME,AGE FROM users where id=#{id}")
    Users getUser(@Param("id") Long id);
    // @CacheConfig 配置缓存基本信息cacheNames缓存名称
    // @Cacheable 该方法查询数据库完毕之后，存入到缓存
}
