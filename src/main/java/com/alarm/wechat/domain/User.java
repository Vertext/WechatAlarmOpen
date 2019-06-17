package com.alarm.wechat.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Description:
 * @Author: zhangchengk
 * @Date: 2019-05-18 14:05
 */
@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  private String oAuthType;
  private String oAuthId;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }



  public String getoAuthType() {
    return oAuthType;
  }

  public void setoAuthType(String oAuthType) {
    this.oAuthType = oAuthType;
  }

  public String getoAuthId() {
    return oAuthId;
  }

  public void setoAuthId(String oAuthId) {
    this.oAuthId = oAuthId;
  }
}
