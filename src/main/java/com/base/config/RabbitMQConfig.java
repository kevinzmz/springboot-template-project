package com.base.config;

import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * Config rabbitmq
 * define queue's name
 * </P>
 * Created by kevin on 2018/03/12 14:43.
 */
@Configuration
public class RabbitMQConfig {
   /*@Value("${ecec.esmart.noticeEmpFanoutExchang}")
   private static String esmartNoticeEmpFanoutExchang;

   @Bean
   public FanoutExchange fanoutExchange() {
      return new FanoutExchange(esmartNoticeEmpFanoutExchang);
   }*/

}
