package com.alarm.wechat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import org.junit.Test;

/**
 * @Description:
 * @Author: zhangchengk
 * @Date: 2019-05-22 11:10
 */
public class TestDate {

  @Test
  public void test(){
    String date = LocalDate.now().toString()+"  "+ LocalTime.now().toString();
    System.out.println(date);

    String date2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    System.out.println(date2);
  }

}
