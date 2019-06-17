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
 * @Date: 2019-05-20 14:26
 */
@Entity
public class SendUrl {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  @Unique
  @OneToOne
  private User user;
  private String param;
  private String url;
  private String openId;
  private boolean flag;

  public String getOpenId() {
    return openId;
  }

  public void setOpenId(String openId) {
    this.openId = openId;
  }

  public boolean isFlag() {
    return flag;
  }

  public void setFlag(boolean flag) {
    this.flag = flag;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public String getParam() {
    return param;
  }

  public void setParam(String param) {
    this.param = param;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

}
