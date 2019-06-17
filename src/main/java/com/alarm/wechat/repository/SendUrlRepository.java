package com.alarm.wechat.repository;

import com.alarm.wechat.domain.SendUrl;
import com.alarm.wechat.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description:
 * @Author: zhangchengk
 * @Date: 2019-05-20 14:31
 */
public interface SendUrlRepository extends JpaRepository<SendUrl, Integer> {

  SendUrl findByParam(String param);

  SendUrl findByOpenId(String openId);

  SendUrl findByUser(User user);
}
