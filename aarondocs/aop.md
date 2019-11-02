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