package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootLoggingApplicationTests {
	Logger logger = LoggerFactory.getLogger(getClass());

	@Test
	public void contextLoads() {
		//日志级别
		//由低到高trace<debug<info<warn<error  可以根据日志级别自定义打印日志
		logger.debug("debug调试日志");
		logger.error("错误信息日志");	//springboot默认日志级别是info
		logger.info("日志信息 ");			//调整级别在配置文件
		logger.trace("trace");
		logger.warn("日志警告信息");
	}

}
