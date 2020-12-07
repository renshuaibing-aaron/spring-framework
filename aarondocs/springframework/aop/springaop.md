aspect:一定要给spring去管理  抽象  aspectj->类  

pointcut:切点表示连接点的集合  ------------------->           表
  （我的理解：PointCut是JoinPoint的谓语，这是一个动作，主要是告诉通知连接点在哪里，切点表达式决定 JoinPoint 的数量）
  
Joinpoint:连接点   目标对象中的方法 ---------------->    记录
  （我的理解：JoinPoint是要关注和增强的方法，也就是我们要作用的点）
  
Weaving :把代理逻辑加入到目标对象上的过程叫做织入
target 目标对象 原始对象
aop Proxy 代理对象  包含了原始对象的代码和增加后的代码的那个对象

advice:通知    (位置 + logic)


![](http://www.baidu.com/img/bdlogo.gif)  


1.  @Import注解：可以引入一个类，将这个类注入到Spring IOC容器中被当前Spring管理
    @EnableAspectJAutoProxy注解 的作用
    
    
    
    
结合之前的java的动态代理 仔细思考springaop的实现原理 为什么说 spring aop依赖spingioc呢？

通知（Advice）:定义了切面(各处业务代码中都需要的逻辑提炼成的一个切面)做什么what+when何时使用。例如：前置通知Before、后置通知After、返回通知After-returning、异常通知After-throwing、环绕通知Around.
连接点（Joint point）：程序执行过程中能够插入切面的点，一般有多个。比如调用方式时、抛出异常时。
切点（Pointcut）:切点定义了连接点，切点包含多个连接点,即where哪里使用通知.通常指定类+方法 或者 正则表达式来匹配 类和方法名称。
切面（Aspect）:切面=通知+切点，即when+where+what何时何地做什么。
引入（Introduction）:允许我们向现有的类添加新方法或属性。
织入（Weaving）:织入是把切面应用到目标对象并创建新的代理对象的过程。 



2.Spring aop中出现的问题  这里是指在aop里面不能嵌套 具体案例看jdk动态代理部门 
这里要说明的是 和spring的事务传播机制 中的嵌套注意区别  aop嵌套和事务嵌套不是一个意思

只要aop中代理的方法不调用本类里面的方法 就可以 
这个也是一个配置spring 事务中失效的原因   