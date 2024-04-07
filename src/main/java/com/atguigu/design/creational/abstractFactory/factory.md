场景：
NumberFormat, SimpleDataFormat \
LoggerFactory \
SqlSessionFactory \
BeanFactory

工厂模式是一种创建型设计模式，它提供了一种封装对象创建过程的方式。以下是你提到的一些类如何使用工厂模式：

1. `NumberFormat`
   ：这是一个抽象类，它提供了格式化和解析数字的方法。它有几个静态工厂方法，如`getNumberInstance()`, `getCurrencyInstance()`, `getPercentInstance()`
   等，这些方法根据不同的需求返回不同的`NumberFormat`实例。

```java
NumberFormat currencyFormat=NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(currencyFormat.format(123456.789)); // Prints "$123,456.79"
```

2. `SimpleDateFormat`
   ：这是一个具体类，它允许进行日期和时间的格式化和解析。虽然它不是一个典型的工厂类，但它的构造函数可以看作是一个工厂方法，因为它根据给定的模式字符串创建一个`SimpleDateFormat`
   实例。

```java
SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(format.format(new Date())); // Prints current date in "yyyy-MM-dd" format
```

3. `LoggerFactory`：这是一个典型的工厂类，它提供了一个静态方法`getLogger()`，该方法根据给定的类或字符串返回一个`Logger`实例。

```java
Logger logger=LoggerFactory.getLogger(MyClass.class);
        logger.info("This is an info message");
```

4. `SqlSessionFactory`：这是MyBatis框架中的一个接口，它有一个方法`openSession()`，该方法返回一个`SqlSession`
   实例。`SqlSessionFactory`的实例通常通过`SqlSessionFactoryBuilder`创建，这是一个建造者模式的例子。

```java
SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        SqlSession session=sqlSessionFactory.openSession();
```

5. `BeanFactory`：这是Spring框架中的一个核心接口，它提供了一种获取bean（即由Spring管理的对象）的方式。`BeanFactory`
   有几个实现类，如`XmlBeanFactory`，`DefaultListableBeanFactory`等，这些类提供了创建和管理bean的具体实现。

```java
BeanFactory factory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
        MyBean myBean=(MyBean)factory.getBean("myBean");
```

以上就是这些类如何使用工厂模式的简单解释。