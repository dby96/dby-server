package com.dby.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbyRestController {

	@RequestMapping("/")
	public String hello() {
		return "SpringBoot所具备的特征有：\n" + "（1）可以创建独立的Spring应用程序，并且基于其Maven或Gradle插件，可以创建可执行的JARs和WARs；\n"
				+ "（2）内嵌Tomcat或Jetty等Servlet容器；\n" + "（3）提供自动配置的“starter”项目对象模型（POMS）以简化Maven配置；\n"
				+ "（4）尽可能自动配置Spring容器；\n" + "（5）提供准备好的特性，如指标、健康检查和外部化配置；\n" + "（6）绝对没有代码生成，不需要XML配置。\n"
				+ "SpringBoot重要策略：开箱即用、约定优于配置\n"
				+ "开箱即用，Outofbox，是指在开发过程中，通过在MAVEN项目的pom文件中添加相关依赖包，然后使用对应注解来代替繁琐的XML配置文件以管理对象的生命周期。这个特点使得开发人员摆脱了复杂的配置工作以及依赖的管理工作，更加专注于业务逻辑。\n"
				+ "约定优于配置，Convention over configuration，是一种由SpringBoot本身来配置目标结构，由开发者在结构中添加信息的软件设计范式。这一特点虽降低了部分灵活性，增加了BUG定位的复杂性，但减少了开发人员需要做出决定的数量，同时减少了大量的XML配置，并且可以将代码编译、测试和打包等工作自动化。";
	}
}
