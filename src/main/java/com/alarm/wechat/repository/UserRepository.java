package com.alarm.wechat.repository;

import com.alarm.wechat.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description:
 * @Author: zhangchengk
 * @Date: 2019-05-18 14:15
 */
public interface UserRepository extends JpaRepository<User, Integer> {

  User findByOAuthTypeAndOAuthId(String oAuthType, String oAuthId);

//  @Query(value = "update user set name=?1 where id=?2 ", nativeQuery = true)
//  void updateOpenIdById(@Param("id") String id, @Param("openId") String openId);
}
