## 场景:

线程池 \
数据库的连接池 \
系统环境信息 \
上下文

## 面试：

1. **系统环境信息(System.getProperties())**: Java程序可以通过`System.getProperties()`
   方法获取当前的系统环境信息，包括操作系统版本、Java版本、用户目录等。

2. **Spring中怎么保持组件单例的**:
   在Spring框架中，默认情况下，所有的Bean都是以单例模式创建的。这是通过Spring的容器（ApplicationContext）来控制的，确保每个Bean只被实例化一次。

3. **ServletContext是什么? 是单例吗? 怎么保证?**: `ServletContext`
   是一个接口，它为servlet提供了一个视图，用于与servlet容器进行通信。每个Web应用都有一个且仅有一个`ServletContext`
   实例，由Web容器在应用启动时创建，以保证其单例性。

4. **ApplicationContext是什么? 是单例吗? 怎么保证?**: `ApplicationContext`
   是Spring中用于提供配置信息的中心接口。它是单例的，Spring容器启动时创建`ApplicationContext`
   实例，并通过这个实例来管理和配置应用中的所有Bean。Spring通过容器级别的控制和配置文件来保证`ApplicationContext`的单例性。

5. **数据库连接池一般怎么创建出来的，怎么保证单实例?**: 数据库连接池通常通过连接池管理器（如Apache DBCP,
   HikariCP等）来创建和管理。在应用启动时，连接池管理器初始化连接池，创建一定数量的数据库连接，并在整个应用生命周期内复用这些连接。通过将连接池作为全局资源并通过单例模式或Spring框架来管理，可以保证连接池的单实例性。这样做减少了频繁创建和销毁连接的开销，提高了应用性能。

