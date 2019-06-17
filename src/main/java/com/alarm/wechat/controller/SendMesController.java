package com.alarm.wechat.controller;

import com.alarm.wechat.domain.SendUrl;
import com.alarm.wechat.domain.User;
import com.alarm.wechat.repository.SendUrlRepository;
import com.alarm.wechat.service.SendMsgService;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * 发送微信消息
 * @author PLA
 */
@Controller
public class SendMesController {

  private final SendMsgService sendMsgService;
  private final SendUrlRepository sendUrlRepository;

  @Autowired
  public SendMesController(SendMsgService sendMsgService, SendUrlRepository sendUrlRepository) {
    this.sendMsgService = sendMsgService;
    this.sendUrlRepository = sendUrlRepository;
  }

  @RequestMapping(value = "/sendMsg/{param}", method = RequestMethod.GET)
  public void sendMsg(@RequestParam(value = "msg") String msg,
      @PathVariable(value = "param") String param, HttpServletResponse response) throws Exception {
    try {
      sendMsgService.sendMsg(param, msg);
    } catch (Exception e) {
      e.printStackTrace();
    }
    PrintWriter out = response.getWriter();
    out.print("{\"sucess\",true}");
  }

  @RequestMapping(value = "/postMsg", method = RequestMethod.POST)
  public String postMsg(@RequestParam(value = "desp") String msg, HttpServletRequest request,
      Model model) throws Exception {
    User user = (User) request.getSession().getAttribute("user");
    SendUrl sendUrl = sendUrlRepository.findByUser(user);
    sendMsgService.sendMsg(sendUrl.getParam(), msg);
    model.addAttribute("sendUrl", sendUrl.getUrl());
    return  "send";
  }


}
