1.根据代码可以看出spring bean的生命周期  
  
       【现在开始初始化容器】
		【这是BeanFactoryPostProcessor实现类构造器！！】
		【BeanFactoryPostProcessor调用postProcessBeanFactory方法】
		【这是BeanPostProcessor实现类构造器！！】
		【这是InstantiationAwareBeanPostProcessorAdapter实现类构造器！！】
		【InstantiationAwareBeanPostProcessor调用postProcessBeforeInstantiation方法】
		【构造器】调用Person的构造器实例化
		【InstantiationAwareBeanPostProcessor调用postProcessPropertyValues方法】
		【注入属性】address
		【注入属性】nameApplicationListener
		【注入属性】phone
		【BeanNameAware接口】调用setBeanName方法
		【BeanFactoryAware接口】调用setBeanFactory方法
		【BeanPostProcessor接口方法postProcessBeforeInitialization对属性进行更改！！】
		【InitializingBean接口】调用afterPropertiesSet方法
		【init-method】调用<bean>的init-method属性指定的初始化方法
		【BeanPostProcessor接口方法postProcessAfterInitialization对属性进行更改】
		【InstantiationAwareBeanPostProcessor调用postProcessAfterInitialization方法】
		【容器容器初始化成功】
		【现在开始关闭容器】！
		【DiposibleBean接口】调用destroy方法
		【destroy-method】调用<bean>的destroy-method属性指定的初始化方法
	
	
2.spring bean的生命周期是
  实例化bean对象 (这里有几种方式的 怎么选择合适的构造方法？)
  注入对象属性(依赖注入的种类?怎么解决循环依赖)
  检查激活Aware方法
  BeanProcessor前置处理 #postProcessBeforeInitialization
  检查InitializingBean和init-method
  BeanProcessor后置方法 #postProcessAfterInitialization
  注册必要的Dstruction回调
  使用bean
  检查DisposableBean和destory-method 