1.spring 事务的传播相关知识？
https://mp.weixin.qq.com/s?__biz=MzU2Njg3OTU1Mg==&mid=2247485241&idx=1&sn=2b34ef78e0accf519a80e6ab0494f7e4&chksm=fca4f316cbd37a002ee66f8fab94dc55cdf2d0747af70523f7b513b7be17fa35189f16e28de2&scene=27#wechat_redirect
1


2.
https://blog.csdn.net/wys0125/article/details/100114909
spring的事务传播不是事务本身所有的性质 是spring的扩展 这里保证了
事务传播行为类型	说明
  PROPAGATION_NOT_SUPPORTED(  propagation_not_supported 不支持事务)	以非事务方式执行操作，如果当前存在事务，就把当前事务挂起。
  PROPAGATION_REQUIRED(propagation_required)	如果当前没有事务，就新建一个事务，如果已经存在一个事务中，加入到这个事务中。这是最常见的选择。
  PROPAGATION_SUPPORTS(propagation_supports)	支持当前事务，如果当前没有事务，就以非事务方式执行。
  PROPAGATION_MANDATORY(propagation_mandatory)	使用当前的事务，如果当前没有事务，就抛出异常。
  PROPAGATION_REQUIRES_NEW(propagation_requires_new)	新建事务，如果当前存在事务，把当前事务挂起。

  PROPAGATION_NEVER(propagation_never)	以非事务方式执行，如果当前存在事务，则抛出异常。
  PROPAGATION_NESTED(propagation_nested)	如果当前存在事务，则在嵌套事务内执行。如果当前没有事务，则执行与PROPAGATION_REQUIRED类似的操作。
  
  
3.举例说明 事务传播机制应用
比如在电商活动中 主要是外围方法和内部方法的事务使用
例如有一个注册接口 注册借口哦实现后有一个积分增加的接口 内部嵌套 
那么 可以这样使用事务的传播机制  外围方法失败 内部方法一定失败  内部方法失败 外部方法可以不失败 这里用到的是嵌套事务  内部事务是外部事务的子事务




4.我们先回想下 Spring 是如何管理数据库 Transaction 的。
在应用程序中处理一个请求时，如果我们的方法开启Trasaction 功能，Spring 会把数据库的 Connection 连接和当前线程进行绑定，
从而实现 Connection 打开一个 Transaction 后，所有当前线程的数据库操作都在该 Connection 上执行，
达到所有操作在这个 Transaction 中，最终提交或回滚

