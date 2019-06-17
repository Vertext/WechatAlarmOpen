package com.alarm.wechat.common;


/**
 * 不同的消息类型
 *
 * @author PLA
 */
public class WeChatConstants {

  /**
   * 文本消息
   */
  static final String MESSAGE_TEXT = "text";
  /**
   * 图文消息
   */
  public static final String MESSAGE_NEWS = "news";
  /**
   * 图片消息
   */
  public static final String MESSAGE_IMAGE = "image";
  /**
   * 语音消息
   */
  public static final String MESSAGE_VOICE = "voice";
  /**
   * 视频消息
   */
  public static final String MESSAGE_VIDEO = "video";
  /**
   * 小视频消息
   */
  public static final String MESSAGE_SHORTVIDEO = "shortvideo";
  /**
   * 音乐消息
   */
  public static final String MESSAGE_MUSIC = "music";
  /**
   * 链接消息
   */
  public static final String MESSAGE_LINK = "link";
  /**
   * 上传地理位置
   */
  public static final String MESSAGE_LOCATION = "location";
  /**
   * 事件推送
   */
  public static final String MESSAGE_EVENT = "event";
  /**
   * 关注
   */
  public static final String MESSAGE_SUBSCRIBE = "subscribe";
  /**
   * 取消关注
   */
  public static final String MESSAGE_UNSUBSCRIBE = "unsubscribe";
  /**
   * 菜单点击——点击菜单获取消息时触发click
   */
  public static final String MESSAGE_CLICK = "CLICK";
  /**
   * 点击菜单跳转链接时触发view
   */
  public static final String MESSAGE_VIEW = "VIEW";
  /**
   * 扫描带参数二维码——未关注时触发subscribe已关注时触发scan
   */
  public static final String MESSAGE_SCAN = "SCAN";
  /**
   * 模板消息送达情况提醒
   */
  public static final String TEMPLATESENDJOBFINISH = "TEMPLATESENDJOBFINISH";

}
