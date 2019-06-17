package com.alarm.wechat.auth;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OAuthServices {

  @Autowired List<AbstractOauthServiceDeractor> abstractOauthServiceDeractors;

  public AbstractOauthServiceDeractor getOAuthService(String type){
    Optional<AbstractOauthServiceDeractor> oAuthService = abstractOauthServiceDeractors.stream().filter(o -> o.getoAuthType().equals(type))
        .findFirst();
    if(oAuthService.isPresent()){
      return oAuthService.get();
    }
    return null;
  }

  public List<AbstractOauthServiceDeractor> getAllOAuthServices(){
    return abstractOauthServiceDeractors;
  }

}