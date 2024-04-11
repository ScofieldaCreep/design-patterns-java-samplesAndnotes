创建的细节复杂，但还必须暴露给使用者。 \
屏蔽过程，不屏蔽细节。

### 场景:

StringBuilder: append()给谁append？ \
Swagger-ApiBuilder: 是什么？ \
快速实现： Lombok-Builder模式

1. **创建的细节复杂，但还必须暴露给使用者。屏蔽过程，不屏蔽细节。**
   这是建造者模式的一个关键特性。建造者模式用于构建复杂对象，它将复杂对象的构建过程封装在建造者类中，但是构建的细节（例如，对象的各个部分）仍然可以通过建造者的方法暴露给客户端代码。

2. **StringBuilder: append()给谁append？** `StringBuilder`是Java中的一个类，它使用了建造者模式。`append()`
   方法是`StringBuilder`的一个建造者方法，它将参数添加到`StringBuilder`对象的内部字符序列中，并返回`StringBuilder`
   对象本身，以便进行链式调用。

3. **Swagger-ApiBuilder: 是什么？** `ApiBuilder`
   是Swagger框架中的一个类，它使用了建造者模式来构建API文档。你可以使用`ApiBuilder`
   的方法来设置API的各种属性，如路径、操作、参数等，然后调用`build()`方法来生成API文档。

4. **快速实现： Lombok-Builder模式**
   Lombok是一个Java库，它提供了一种简洁的方式来生成常用的方法，如getter和setter，构造函数，`equals()`，`hashCode()`
   和`toString()`等。Lombok的`@Builder`注解可以自动生成建造者模式的代码。例如，你可以在类上添加`@Builder`
   注解，然后Lombok会为这个类生成一个静态的内部建造者类，以及一些用于设置对象属性的方法和一个`build()`方法。