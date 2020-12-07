1.spring的自动装配技术 可以实现依赖注入的功能 以xml配置为例
<bean>标签有一个autowire属性 我们可以通过指定它来让容器为受管的Javabean 自动注入依赖对象
共有如下几种方式
1) No  不启用自动装配,这个是Autowire的默认值  默认的情况下需要通过ref 来装配bean
```java
	<bean id="braveKnightXml" class="com.aaron.ren.ioc.threetypes.xml.BraveKnightXml" autowire="no">
		<constructor-arg ref="weaponXml"/>
	</bean>
```
2)byName 按照名字装配 假如再bean容器里面有一个属性名字相同的bean  spring就会自动注入
```java
	<bean id="braveKnightXml" class="com.aaron.ren.ioc.threetypes.xml.BraveKnightXml" autowire="byName">
	</bean>  
```
这里配置了byName 那么bean的属性 会按照名字自动注入

3)byType：按类型装配。可以根据属性类型，在容器中寻找该类型匹配的bean，如有多个，则会抛出异常，如果没有找到，则属性值为null。
假设Boss类中有一个Car类型的属性，如果容器中刚好有一个Car类型的Bean，Spring就会自动将其装配给Boss的这个属性
```java
<bean id="braveKnightXml" class="com.aaron.ren.ioc.threetypes.xml.BraveKnightXml" autowire="byType">
	</bean>
```
4)constructor：与byType方式相似，不同之处在与它应用于构造器参数，如果在容器中没有找到与构造器参数类型一致的bean，
那么将抛出异常。(根据构造函数参数的数据类型，进行byType模式的自动装配)
```java
	<bean id="braveKnightXml" class="com.aaron.ren.ioc.threetypes.xml.BraveKnightXml" autowire="constructor">
	</bean>
```

5)autodetect：通过bean类的自省机制(introspection)来决定是使用constructor还是byType的方式进行自动装配。
如果Bean有空构造器那么将采用“byType”自动装配方式，否则使用“constructor”自动装配方式

6)default：由上级标签<beans>的default-autowire属性确定。


2.spring 使用那种构造函数

经过我的测试 发现 spring在进行bean构造时  默认使用无参数构造器(牢记,除非在xml里面配置了构造函数)
如果在xml配置文件里面指定 就使参数的构造器  
这个也是查看spring5的文档可知
 If a class, which is configured as a Spring bean, has only one constructor, the Autowired annotation can be 
 omitted and Spring will use that constructor and inject all necessary dependencies.
 
 http://cache.baiducontent.com/c?m=9f65cb4a8c8507ed19fa950d100b92235c438014648c83493e8ed45f93130a1c187ba1a62228470483c2286507ae430bfeb56b32610c37c79bdff83acabae23f59893045710b873105a51cb8b84632b156872de9b81897adf63084afa28098120e8f08452dd6e78a2a1762cf7883142692ac8e3f654811cafa4665e828753eee2157c640&p=9972c35d85cc43fe0ebd9b7d0c17a5&newp=9a39f90a85cc43e713bd9b7d0c17c1231610db2151d6d71e6b82c825d7331b001c3bbfb42328120ed9c47d6401a44a57effa32723d0923a3dda5c91d9fb4c57479c06c&user=baidu&fm=sc&query=%B2%BB%D3%C3%D7%A2%BD%E2%40Autowired%D7%A2%C8%EB%D2%C0%C0%B5&qid=8449e0030022f06d&p1=1

3.注意理解下面这段话
在项目中我们经常使用 spring 提供的 IOC 功能，目前主要有两种方式：xml、注解，而这两种方式的原理是不同的，
xml 的注入主要依赖 BeanWrapperImpl 进行属性注入，而注解是依赖 BeanPostProcessor 进行注入