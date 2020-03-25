1.单纯的spring framework提供的方式一共有三种
  xml配置文件  这些配置文件通常包含bean定义的标签开始 比如
   <bean id="studentBean" class="org.edureka.firstSpring.StudentBean">
       <property name="name" value="Edureka"></property>
   </bean>
   
   
   注解配置 注意单纯的注解配置需要用xml文件 用这个   <context:annotation-config/> 
   但是单纯的用这个标签 并不能实现bean的注入  需要<context:component-scan base-package="com***notation"/>
   并且需明白的是component-scan  这个标签实现了 上面标签的语义 同理另外一个注解 @ComponentScan等价于上面
   的这句话  注解配置 会使@service @controller @Autowired生效
   
   
   Java config配置 使用Java config配置 是结合@Configuation @Bean 一起使用  
   
   让人比较头大的是 三种方式可以混合使用 都生效 需要注意底层的实现原理
  