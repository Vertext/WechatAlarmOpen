package com.alarm.wechat.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: zhangchengk
 * @Date: 2019-05-22 16:45
 */
@Configuration
public class WeChatConfig {
  private static final Logger logger = LoggerFactory.getLogger(WeChatConfig.class);
  private static String appid;
  private static String appsecret;
  private static String accessTokenUrl;

  public static String getAppid() {
    return appid;
  }

  @Autowired
  public  void setAppid(@Value("${wechat.config.appid}") String appid) {
    logger.info("**************************************");
    WeChatConfig.appid = appid;
  }

  public static String getAppsecret() {
    return appsecret;
  }

  @Autowired
  public  void setAppsecret(@Value("${wechat.config.appsecret}") String appsecret) {
    WeChatConfig.appsecret = appsecret;
  }

  public static String getAccessTokenUrl() {
    return accessTokenUrl;
  }

  @Autowired
  public  void setAccessTokenUrl(@Value("${wechat.config.accessTokenUrl}")
      String accessTokenUrl) {
    WeChatConfig.accessTokenUrl = accessTokenUrl;
  }
}
