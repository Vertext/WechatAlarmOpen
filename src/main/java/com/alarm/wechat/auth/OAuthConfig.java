package com.alarm.wechat.auth;

import com.alarm.wechat.common.OauthTypes;
import org.scribe.builder.ServiceBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OAuthConfig {

  private static final String CALLBACK_URL = "%s/oauth/%s/callback";

  @Value("${oAuth.github.state}") String state;
  @Value("${oAuth.github.clientId}") String githubClientId;
  @Value("${oAuth.github.clientSecret}") String githubClientSecret;
  @Value("${demo.host}") String host;

  //@Bean注解在方法上,返回值是一个类的实例,并声明这个返回值(返回一个对象)是spring上下文环境中的一个bean

  @Bean
  public GithubApi githubApi(){
    return new GithubApi(state);
  }

  @Bean
  public OAuthServiceDeractor getGithubOAuthService(){
    return new GithubOAuthService(new ServiceBuilder()
        .provider(githubApi())
        .apiKey(githubClientId)
        .apiSecret(githubClientSecret)
        .callback(String.format(CALLBACK_URL, host, OauthTypes.GITHUB))
        .build());
  }
}