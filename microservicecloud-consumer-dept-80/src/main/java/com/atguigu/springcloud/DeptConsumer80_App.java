package com.atguigu.springcloud;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.atguigu.myrule.MySelfRule;
 
 
@SpringBootApplication
@EnableEurekaClient
//自定义轮询规则 MySelfRule
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=MySelfRule.class)
public class DeptConsumer80_App
{
	
	
	/**
	 * 
	 * 
	 * 
	 * 
	 * @param args
	 */
	
	
  public static void main(String[] args)
  {
   SpringApplication.run(DeptConsumer80_App.class, args);
   System.out.println("启动成功1");
  }
  
  
  /**
   * 
   * 
   * 
   * 
   */
  
  
  
  
}  
 
