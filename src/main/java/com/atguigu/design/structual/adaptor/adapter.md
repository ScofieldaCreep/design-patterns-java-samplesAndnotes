1. **Tomcat如何将Request流转为标准Request**：Tomcat使用了适配器模式来将底层的HTTP请求转换为Servlet
   API可以使用的`HttpServletRequest`对象。这个过程主要由`CoyoteAdapter`
   类完成。当Tomcat接收到一个HTTP请求时，它首先会创建一个`org.apache.coyote.Request`
   对象来表示这个请求。然后，`CoyoteAdapter`会将这个`Coyote.Request`对象转换为`org.apache.catalina.connector.Request`
   对象，最后再将其转换为`javax.servlet.http.HttpServletRequest`对象。

2. **Spring AOP中的AdvisorAdapter是什么**：在Spring AOP中，`AdvisorAdapter`
   是一个接口，它定义了如何将不同类型的增强（Advice）适配为`Advisor`。Spring AOP中有多种类型的增强，如前置增强（Before
   Advice）、后置增强（After Advice）、环绕增强（Around Advice）等，`AdvisorAdapter`接口定义了将这些增强适配为`Advisor`
   的方法。具体的适配过程由实现`AdvisorAdapter`
   接口的类完成，如`BeforeAdviceAdapter`、`AfterAdviceAdapter`、`ThrowsAdviceAdapter`等。

3. **Spring MVC中经典的HandlerAdapter是什么**：在Spring MVC中，`HandlerAdapter`
   是一个接口，它定义了处理器（Handler）的执行方式。当一个HTTP请求到达Spring
   MVC框架时，框架会根据请求的URL找到对应的处理器，然后通过`HandlerAdapter`来执行这个处理器。Spring
   MVC提供了多种`HandlerAdapter`
   的实现，如`HttpRequestHandlerAdapter`、`SimpleControllerHandlerAdapter`、`RequestMappingHandlerAdapter`等，它们分别对应不同类型的处理器。

4. **SpringBoot 中 WebMvcConfigurerAdapter为什么存在又取消**：`WebMvcConfigurerAdapter`是Spring Boot 1.x版本中用于自定义Spring
   MVC配置的类，它实现了`WebMvcConfigurer`接口。然而在Spring 5.0及Spring Boot 2.0版本中，`WebMvcConfigurerAdapter`
   被废弃，原因是Java 8开始接口可以有默认方法，因此可以直接实现`WebMvcConfigurer`接口来自定义Spring
   MVC配置，无需再使用`WebMvcConfigurerAdapter`类。