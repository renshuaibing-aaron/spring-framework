1.spring 共提供5种scope的bean类型
singleton（单例）
prototype（原型,这个就是多例模式）
request
session
global session


2.单例bean的优点
减少生成新实例的消耗
减少JVM垃圾回收的
可以快速的获取bean 利用单例模式可以直接从本地缓存里面获取

3.spring 单例模式生成,以及单例模式带来的问题并且一般的解决思路
由单例模式我们知道 最常见的有两种实现方式 一种是饿汉 一种是懒汉 spring采用的不是这两种方式 因为这两种方式 都要求其构造方法是私有方法,这个肯定是在
spring种不成立  实际上spring种的单例模式创建时采用的另外一种方式 单例注册表的方法 具体类DefaultSingletonBeanRegistry  这个类里面是采用缓存
ConcurrentHashMap 这个缓存  


4.懒加载  默认的情况下 容器启动 将所有作用域为单例的Bean都创建好 可以通过lzay-init = "true" 进行配置是否懒加载







































 
 