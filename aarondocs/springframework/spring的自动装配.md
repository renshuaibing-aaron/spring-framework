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

经过我的测试 发现 spring在进行bean构造时  默认使用无参数构造器 如果在xml配置文件里面指定 就使参数的构造器

