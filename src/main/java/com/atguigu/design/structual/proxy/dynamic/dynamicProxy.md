静态代理和动态代理是两种常见的代理模式，它们都用于在不修改原始类代码的情况下增加或修改原始类的行为。以下是它们的主要区别和使用场景：

**静态代理：**

静态代理在编译时就已经实现，代理类和目标类在编译时就确定下来了。静态代理实现简单，代理类和目标类的关系一目了然。但是如果目标类被代理的接口增加方法，则代理类也需要修改，维护成本较高。

使用场景：当需要为一个类在不改变其源代码的情况下增加额外功能，如权限验证、日志记录等，且被代理的类和方法在编译时就可以确定时，可以使用静态代理。

```java
public interface Subject {
    void request();
}

public class RealSubject implements Subject {
    @Override
    public void request() {
        // 实际业务逻辑
    }
}

public class StaticProxy implements Subject {
    private RealSubject realSubject;

    public StaticProxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        // 在调用实际业务之前添加的额外处理
        realSubject.request();
        // 在调用实际业务之后添加的额外处理
    }
}
```

**动态代理：**

动态代理是在运行时动态生成的，不需要我们手动创建代理类。动态代理可以很方便地对多个类进行代理，减少了重复代码。但是动态代理的创建需要特定的编程技巧，如Java的反射机制。

使用场景：当需要为多个类添加相同的功能，或者在运行时动态代理一个类时，可以使用动态代理。

```java
public interface Subject {
    void request();
}

public class RealSubject implements Subject {
    @Override
    public void request() {
        // 实际业务逻辑
    }
}

public class DynamicProxy implements InvocationHandler {
    private Object target;

    public DynamicProxy(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 在调用实际业务之前添加的额外处理
        Object result = method.invoke(target, args);
        // 在调用实际业务之后添加的额外处理
        return result;
    }
}
```

在使用时，只需要创建一个`DynamicProxy`对象，并通过`getProxyInstance()`方法获取代理对象即可。