适配器连接两个类，可以增强一个类；

装饰器只增强一个类

## 代码解释

装饰器模式是一种设计模式，它允许我们在运行时动态地向对象添加新的行为。在这个模式中，我们创建一个装饰器类来包装原始类，这个装饰器类镜像了原始类的行为，并在保持原始类行为不变的同时提供额外的行为。

在你的代码中，`ManTikTok`是一个接口，定义了一个`ticktok`方法。`LeiTikTok`是`ManTikTok`的一个实现。`TiktokDecorator`
是一个装饰器接口，它也实现了`ManTikTok`接口，并添加了一个新的方法`enable`。`MeiYanDecorator`是`TiktokDecorator`
的一个实现，它包装了一个`ManTikTok`对象，并在`ticktok`方法中首先调用`enable`方法，然后调用被包装对象的`ticktok`方法。

这就是装饰器模式的一个典型应用。你可以创建更多的`TiktokDecorator`
的实现，每个实现都可以添加不同的行为。然后，你可以动态地将这些装饰器应用到任何`ManTikTok`对象上，以增加新的行为。

例如，你可以创建一个`FilterDecorator`，它在`ticktok`方法中添加了一个滤镜效果：

```java
public class FilterDecorator implements TiktokDecorator {

    private ManTikTok manTikTok;

    public FilterDecorator(ManTikTok manTikTok) {
        this.manTikTok = manTikTok;
    }

    @Override
    public void tiktok() {
        // 开启滤镜
        enable();
        // 开始直播
        manTikTok.tiktok();
    }

    @Override
    public void enable() {
        System.out.println("开启滤镜效果...");
    }
}
```

然后，你可以这样使用装饰器：

```java
ManTikTok manTikTok=new LeiTikTok();
        manTikTok=new MeiYanDecorator(manTikTok);
        manTikTok=new FilterDecorator(manTikTok);
        manTikTok.tiktok();
```

这样，`manTikTok`对象在直播时就会先开启美颜效果，然后开启滤镜效果。

## 使用场景

1. **SpringSession中如何进行session与redis关联**：Spring
   Session提供了一种将session数据存储在Redis中的机制。当你在应用中获取HttpSession并在其中存储数据时，这些数据实际上被存储在Redis中。这是通过使用`SessionRepositoryFilter`
   实现的，这个过滤器会将HttpSession替换为Spring Session提供的实现，这个实现会在每个请求结束时将session数据存储在Redis中。

```java

@Configuration
@EnableRedisHttpSession
public class HttpSessionConfig {

    @Bean
    public LettuceConnectionFactory connectionFactory() {
        return new LettuceConnectionFactory(); // default localhost:6379
    }
}
```

2. **MyBatisPlus提取了QueryWrapper，这是什么?**：在MyBatis Plus中，`QueryWrapper`
   是一个用于构建SQL查询条件的工具类。你可以使用`QueryWrapper`的方法来添加查询条件，如等于、不等于、大于、小于等。

```java
QueryWrapper<User> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("name","John");
        List<User> users=userMapper.selectList(queryWrapper);
```

3. **Spring中的BeanWrapper是做什么?**：在Spring中，`BeanWrapper`是一个接口，它定义了操作JavaBean属性的方法。`BeanWrapper`
   提供了一种灵活的方式来设置和获取bean的属性，它支持嵌套属性、集合属性等。

```java
BeanWrapper bw=PropertyAccessorFactory.forBeanPropertyAccess(new Person());
        bw.setPropertyValue("name","John");
        String name=(String)bw.getPropertyValue("name");
```

4. **Spring Webflux中的 WebHandlerDecorator ?**：在Spring WebFlux中，`WebHandlerDecorator`
   是一个接口，它定义了如何装饰`WebHandler`。你可以实现`WebHandlerDecorator`
   接口来添加一些预处理或后处理逻辑，然后将这个装饰器应用到`WebHandler`上。

```java
public class CustomWebHandlerDecorator implements WebHandlerDecorator {

    @Override
    public WebHandler decorate(WebHandler handler) {
        return (serverWebExchange) -> {
            // Pre-processing logic here
            return handler.handle(serverWebExchange)
                    .doOnSuccess(aVoid -> {
                        // Post-processing logic here
                    });
        };
    }
}
```

以上就是这些类和接口的简单解释和使用例子。