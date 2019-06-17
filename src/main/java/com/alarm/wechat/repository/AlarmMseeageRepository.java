package com.alarm.wechat.repository;

import com.alarm.wechat.domain.AlarmMessage;
import com.alarm.wechat.domain.SendUrl;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description:
 * @Author: zhangchengk
 * @Date: 2019-05-22 11:19
 */
public interface AlarmMseeageRepository extends JpaRepository<AlarmMessage, Integer> {

  int countAlarmMessageBySendUrlAndCreatetimeAfterAndMsg(SendUrl sendUrl,long createtime,String msg);
}
