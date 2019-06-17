package com.alarm.wechat.auth;

import com.alarm.wechat.common.OauthTypes;
import com.alarm.wechat.domain.User;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONPath;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.oauth.OAuthService;


/**
 * @author PLA
 */
public class GithubAbstractOauthService extends AbstractOauthServiceDeractor {

  private static final String PROTECTED_RESOURCE_URL = "https://api.github.com/user";

  GithubAbstractOauthService(OAuthService oAuthService) {
    super(oAuthService, OauthTypes.GITHUB);
  }

  @Override
  public User getUser(Token accessToken) {
    OAuthRequest request = new OAuthRequest(Verb.GET, PROTECTED_RESOURCE_URL);
    this.signRequest(accessToken, request);
    Response response = request.send();
    User user = new User();
    user.setOAuthType(getoAuthType());
    Object result = JSON.parse(response.getBody());
    user.setOAuthId(JSONPath.eval(result, "$.id").toString());
    return user;
  }


}