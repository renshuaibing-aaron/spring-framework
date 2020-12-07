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
  检查InitializingBean和init-method   (这里要详细说说呢InitializingBean#afterPropertiesSet和在xml里面配置的 init-method="myInit"
   主要是实现这个接口InitializingBean  不符合spring的规范 侵入性太强  )
  BeanProcessor后置方法 #postProcessAfterInitialization
  注册必要的Dstruction回调
  使用bean
  检查DisposableBean和destory-method 
  
  
3.讲一讲spring的前置后置处理器
  BeanPostProcessor 的作用域是容器级别的，它只和所在的容器相关 ，当 BeanPostProcessor 完成注册后，
  它会应用于所有跟它在同一个容器内的 bean 。
  BeanFactory 和 ApplicationContext 对 BeanPostProcessor 的处理不同，ApplicationContext 
  会自动检测所有实现了 BeanPostProcessor 接口的 bean，并完成注册，但是使用 BeanFactory 容器时则
  需要手动调用 AbstractBeanFactory#addBeanPostProcessor(BeanPostProcessor beanPostProcessor)
   方法来完成注册
  ApplicationContext 的 BeanPostProcessor 支持 Ordered，而 BeanFactory 的 BeanPostProcessor 
  是不支持的，原因在于ApplicationContext 会对 BeanPostProcessor 进行 Ordered 检测并完成排序，而 
  BeanFactory 中的 BeanPostProcessor 只跟注册的顺序有关。