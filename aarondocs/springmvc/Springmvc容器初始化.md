1.spring mvc和spring web什么关系?
要注意区分 spring mvc依赖于springweb  springmvc是mvc的是实现 ，所以spring mvc肯定是要比spring web的
功能丰富 spring mvc的主要特点是有个dispatchservlet类 这个作为统一的入口 然后 在这个入口的情况下 把所有的请求进行
了拦截 然后 根据handmapping  进行匹配 然后加上视图解析器 

2.spring mvc里面有两个容器  一个存放的是应用层的bean  比如service  controller
另外一个bean是mvc特的容器 当然 这两个容器为父子容器

从历史来看 最早的web开发 就是servlet开发  tomcat是servlet容器 servlet的生命周期由tomcat进行控制 

spring mvc的特殊的dispatchServlet 也是个servlet  也是被tomcat进行控制 特殊的是在这个dispatchservlet的启动过程中
 会进行一些的调用方法(spring mvc控制)  会进行一些bean的初始化 
 
 另外还有一个监听器类 在tomcat启动过程中 会进行spring mvc的初始化设置 
 
 最初的spring mvc需要配置xml文件 配置视图解析器 视图路径等东西
 
 现在springboot  直接使用自动配置减少了 xml的配置
  这里面的过程需要了解(利用到了servlet3的特性)