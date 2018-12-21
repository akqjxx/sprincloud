package com.atguigu.springcloud;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
 
@EnableEurekaClient
@SpringBootApplication
public class DeptProvider8003_App
{
  public static void main(String[] args)
  {
	  
   SpringApplication.run(DeptProvider8003_App.class, args);
   System.out.println("启动---dd    --成功");
  }
}
 