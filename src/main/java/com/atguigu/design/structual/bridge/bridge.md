## 桥接模式（Bridge Pattern）

是一种结构型设计模式，它主要用于将抽象部分与实现部分分离，使它们可以独立地变化。这种模式通过提供一个桥接结构来实现两个独立的接口，使得实现可以在不影响客户端的情况下进行修改。

### 场景：

当一个类存在两个独立变化的维度，且两个维度都需要进行扩展时。

当一个系统不希望使用集成或因为多层次集成导致系统类的个数急剧增加时。

当一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性时。

### 例子：

在Java的IO库中，`InputStreamReader`就是一个使用了桥接模式的例子。`InputStreamReader`是一个桥接类，它将字节流（`InputStream`
）转换为字符流（`Reader`）。这里，`InputStream`和`Reader`就是两个独立变化的维度，它们都可以进行扩展，而`InputStreamReader`
则是连接这两个维度的桥梁。

以下是一个使用`InputStreamReader`的例子：

```java
try{
        // 创建一个文件字节输入流
        InputStream inputStream=new FileInputStream("test.txt");

        // 使用InputStreamReader将字节流转换为字符流
        InputStreamReader reader=new InputStreamReader(inputStream,StandardCharsets.UTF_8);

        // 读取字符
        int data=reader.read();
        while(data!=-1){
        char theChar=(char)data;
        System.out.print(theChar);
        data=reader.read();
        }

        // 关闭流
        reader.close();
        }catch(IOException e){
        e.printStackTrace();
        }
```

在这个例子中，`InputStreamReader`将`FileInputStream`（一个`InputStream`的实现）转换为字符流，然后我们可以使用`Reader`
的`read()`方法来读取字符。这样，无论我们使用哪种`InputStream`的实现，都可以通过`InputStreamReader`来读取字符，这就是桥接模式的优点。