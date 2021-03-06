package com.example.demo.dao;

import com.example.demo.domain.User;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Repository
 * @author zwq
 * Created by zwq on 2018/3/9.
 */
public interface UserDao extends JpaRepository<User, Long> {
    /**
     * 新增用户
     * @param user
     * @return
     */
    @Override
    public User save(User user);

    @Query("select u from User u where u.username = ?1")
    public User selectByName(String name);
}
