# 设计模式七大原则
## 开闭原则
- 开放扩展、关闭修改
- 通过抽象构建框架、通过实现扩展细节
> 核心思想：面向抽象编程，抽象相对稳定，实现相对灵活多变。
## 依赖导致原则
- 高层模块不依赖于底层模块、二者共同依赖于抽象
- 抽象不应该依赖细节，细节应该依赖抽象
- 针对接口编程，而不是针对实现编程
## 单一职责原则
- 不要存在多于一个导致类变更的原因
- 一个类、接口、方法等，只负责一项职责
## 接口隔离原则
- 使用多个独立的接口，不使用单一的总接口，客户端不应该依赖他不使用的接口
- 类对类的依赖应该建立在最小的接口上
- 尽量细化接口，接口中的方法尽量少
> 需要适度
## 迪米特原则（最少知道原则）
- 一个对象应对其他对象保持最少的了解（只和朋友交流，不和陌生人说话）
- 尽量降低类与类之间的耦合
- 尽量使用private、protected、package访问控制符
## 里氏替换原则
- 所有引用基类的地方必须能透明地使用其子类的对象，子类对象必须能够替换掉所有父类对象，而程序逻辑不变
## 合成复用原则
- 尽量使用合成/聚合的方式，而不是使用继承来达到软件复用的目的
# 设计模式
## 创建型
### 工厂模式
- 简单工厂不属于23种标准的设计模式中的一种，通过传递type，创建对应的对象。
- 工厂方法将对象的创建推迟到子类，不同的子类负责创建不同类型的对象。抽象方法：创建同一产品等级的对象。[工厂方法代码示例](src/main/java/creation/factory/factoryMethod)
- 抽象工厂提供 创建一系列相关或相互依赖的对象 的接口。[抽象工厂代码示例](src/main/java/creation/factory/abstraceFactory)
### 建造者模式
- 将复杂对象的创建和表示相分离，使得同样的构建过程可以创建不同的表示。
- 适用于非常复杂的内部结构（有很多属性）、想把创建和使用分离。[建造者模式代码示例](src/main/java/creation/builder)
### 单例模式
- 确保某一个类只有一个实例，并提供一个访问它的全局访问点。
- 常用于配置、数据库连接池、缓存等。
- 重点：私有构造、线程安全、延迟加载、序列化与反序列化的安全、需要考虑反射攻击
1. 懒汉式
   - 使用的时候在进行初始化
   - 可以通过类锁、DCL的机制保证单例
   - 需要使用volatile修饰，因为可能会发生指令重排序（即：分配内存->返回引用->初始化）
2. 饿汉式
   - 类加载的时候进行初始化
3. 使用枚举类型定义，[反编译](src/main/java/creation/singleton/padfile/EnumInstance.jad)后可以发现：
   - 枚举类的构造方法私有化
   - 通过饿汉式创建实例对象，避免了多线程带来的问题。
   - 反射天生不支持枚举类的构造来创建对象，反序列化类对枚举也有很好的支持。
4. 定义线程安全的map，将创建好的对象放置在map中，通过key获取对象。
5. 基于ThreadLocal实现的单例，只能在线程内保持唯一。
#### 对单例模式的攻击手段
1. 序列化后通过反序列化手段反复创建。可以通过在反序列化过程中，重写readResolve方法返回单例对象来避免。
2. 通过反射手段重复创建对象。可以通过在构造器中判断是否已经创建对象，如果是则抛出异常，此方法仅对饿汉式有效。
### 原型模式
- 通过拷贝原型对象创建新对象
- 比new方式性能更高
- 需要实现Cloneable接口，重写clone方法。[原型模型代码示例](src%2Fmain%2Fjava%2Fcreation%2Fprototype)
## 结构型
### [外观模式](src%2Fmain%2Fjava%2Fstruction%2Ffacade)
- 又称门面模式，提供一个统一的接口，用来访问子系统中的一群接口。
- 定义一个高层接口，让子系统更容易使用。
- 当系统越来越复杂时，可以简化层间的调用。 符合迪米特法则
### [装饰者模式](src%2Fmain%2Fjava%2Fstruction%2Fdecorator)
- 不改变原有对象的基础上，将功能附加到对象上。
- 提供了比继承更有弹性的代替方案。
- 扩展一个类的功能或给一个类添加附加职责，动态的给一个对象添加功能，这些功能可以撤销。
### [适配器模式](src%2Fmain%2Fjava%2Fstruction%2Fadapter)
- 将一个类的接口转换成客户希望的另外一个接口。
- 使得原本接口不兼容的类可以一起工作。
- 可以分为类适配（通过继承）和对象适配（通过组合）
### [享元模式](src%2Fmain%2Fjava%2Fstruction%2Fflyweight)
- 运用共享技术支持大量细粒度的对象。
- 减少创建对象数量，降低内存占用。
- 常用于系统底层开发，解决系统性能问题。例如：数据库连接池、字符串常量池、图片缓存池等。
### [组合模式](src%2Fmain%2Fjava%2Fstruction%2Fcomposite)
- 将对象组合成树形结构以表示“部分-整体”的层次结构。
- 使客户端对单个对象和组合对象保持一致的处理方式。
### [桥接模式](src%2Fmain%2Fjava%2Fstruction%2Fbirdge)
- 将抽象部分与具体实现部分相分离，使它们都可以独立地变化。
- 通过组合来建立两个类之间的联系，而不是继承。
- 常用于处理多维度变化，避免使用多重继承。
- 抽象类将某一行为委托给一个实现类，实现类可以动态的改变。 
### [代理模式](src%2Fmain%2Fjava%2Fstruction%2Fproxy)
- 为其他对象提供一种代理，以控制对这个对象的访问。
- 代理对象在客户端和目标对象之间起到中介的作用。
- 作用：保护目标对象、增强目标对象。
  - 静态代理
  - 动态代理：JDK中只能对实现接口的类进行代理。
  - CGLib：可以代理类，通过继承实现子类的方式实现。所以类不能定义成final
> Spring中的代理选择：
> 当Bean实现接口时，会选用JDK动态代理。  
> 当Bean没有实现接口时，会选用CGLib代理。  
> 也可以强制使用CGLib代理。   
## 行为性
### [模版方法模式](src%2Fmain%2Fjava%2Fbehavioral%2Ftemplatemethod)
- 定义一个算法的骨架(一般会通过final进行修饰，不允许子类修改)，允许子类为一个或多个步骤提供实现。
- 模版方法使得子类可以在不改变算法结构的情况下，重新定义算法的某些步骤。
- 一次性实现算法不变的部分，将可变的部分留给子类来实现。
- 扩展：钩子方法，提供了缺省的行为，子类可以在必要时进行扩展。
### [迭代器模式](src%2Fmain%2Fjava%2Fbehavioral%2Fiterator)
- 提供一种方法，顺序访问一个集合对象中的各个元素，而又不暴露该对象的内部表示。
- 访问一个集合对象的内部而无需暴露它的内部表示，为遍历不同的集合结构提供统一的接口
### [策略模式](src%2Fmain%2Fjava%2Fbehavioral%2Fstrategy)
- 定义算法家族，分别封装起来，让他们之间可以互相替换，此模式让算法的变化不会影响到使用算法的用户。
- 可以消除代码里的if-else语句。
### [解释器模式](src%2Fmain%2Fjava%2Fbehavioral%2Finterpreter)
- 给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子。
- 为了解释语言，而为语言创建的解释器。Expression4j、jep、mesp
### [观察者模式](src%2Fmain%2Fjava%2Fbehavioral%2Fobserver)
- 定义对象之间一对多的依赖，让多个观察者对象同时监听某一主题对象，当主题对象发生变化时，所有的依赖（观察者）都能收到通知并更新。
- 适用场景：关联行为场景，建立一套触发机制。
### [中介者模式](src%2Fmain%2Fjava%2Fbehavioral%2Fmediator)
- 定义了一个对象，这个对象封装了一组对象之间交互的逻辑。
- 使对象明确地相互引用来促进松散耦合，允许独立地改变他们之间的交互。
- 适用场景：对象之间存在复杂的引用关系，导致它们之间的依赖关系结构混乱且难以复用该对象。
### [访问者模式](src%2Fmain%2Fjava%2Fbehavioral%2Fvisitor)
- 封装作用于某种数据结构各个元素的操作。
- 在不改变各个元素类的前提下，定义作用于这些元素的操作。
### [备忘录模式](src%2Fmain%2Fjava%2Fbehavioral%2Fmenento)
- 保存一个对象的某个状态，以便在适当的时候恢复对象。
- 适用场景：保存及恢复数据相关的场景，游戏存档
### [命令模式](src%2Fmain%2Fjava%2Fbehavioral%2Fcommand)
- 将“请求”封装成不同的对象，以便使用不同的请求。
- 解决了应用程序中对象的职责以及他们之间的通信方式。
- 命令发送者和命令执行者需要解耦，他们不直接交互。
### [责任链模式](src%2Fmain%2Fjava%2Fbehavioral%2Fchainofresponsibility)
- 创建一个对象连，用来处理请求。
- 适用于对请求的处理需要一个或多个步骤来协作。OA审批、权限认证
- 可以将请求发送者和请求处理者进行解耦。
- 可以动态组合。
### [状态模式](src%2Fmain%2Fjava%2Fbehavioral%2Fstate)
- 一个对象内部状态改变时，它的行为也会改变。
- 将不同的状态隔离，将状态转换逻辑分布到各个state当中。