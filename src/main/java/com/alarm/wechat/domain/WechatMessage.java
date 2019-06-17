package com.alarm.wechat.domain;


import lombok.Getter;
import lombok.Setter;

/**
 * @author PLA
 */
@Getter
@Setter
public class WechatMessage {

  private String ToUserName;

  private String FromUserName;

  private String CreateTime;

  private String MsgType;

  private String Content;

}
