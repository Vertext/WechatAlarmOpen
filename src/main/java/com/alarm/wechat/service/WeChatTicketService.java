package com.alarm.wechat.service;

import com.alarm.wechat.common.AccessTokenUtil;
import com.alarm.wechat.common.HttpClientUtils;
import org.json.JSONObject;
import org.springframework.stereotype.Service;


/**
 * 微信二维码获取
 * @author PLA
 */
@Service
public class WeChatTicketService {

  public String getQrcode(String userID) throws Exception {
    String ticketUrl = "{\"action_name\": \"QR_LIMIT_STR_SCENE\", \"action_info\": {\"scene\": {\"scene_str\": \"userID_$\"}}}";
    String body = ticketUrl.replace("$", userID);
    String accessToken = AccessTokenUtil.getAccessTokenUtil().getAccessToken();
    JSONObject jsonObject = new JSONObject(HttpClientUtils.postWXQrcode(accessToken, body));
    return jsonObject.getString("url");
  }
}
