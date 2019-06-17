package com.alarm.wechat.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import org.checkerframework.common.aliasing.qual.Unique;

/**
 * @Description:
 * @Author: zhangchengk
 * @Date: 2019-05-22 11:16
 */
@Entity
public class AlarmMessage {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  @Unique
  @OneToOne
  private SendUrl sendUrl;

  private String msg;

  long createtime;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SendUrl getSendUrl() {
    return sendUrl;
  }

  public void setSendUrl(SendUrl sendUrl) {
    this.sendUrl = sendUrl;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public long getCreatetime() {
    return createtime;
  }

  public void setCreatetime(long createtime) {
    this.createtime = createtime;
  }
}
