bean的类型	作用
HandlerMapping	处理器映射。它会根据某些规则将进入容器的请求映射到具体的处理器以及一系列前处理器和后处理器（ 即处理器拦截器） 上。
具体的规则视 HandlerMapping 类的实现不同而有所不同。其最常用的一个实现支持你在控制器上添加注解，配置请求路径。当然，也存在其他的实现。




HandlerAdapter	处理器适配器。拿到请求所对应的处理器后，适配器将负责去调用该处理器，这使得 DispatcherServlet 无需关心具体的调用细节。
比方说，要调用的是一个基于注解配置的控制器，那么调用前还需要从许多注解中解析出一些相应的信息。因此， HandlerAdapter 的主要任务就是对 DispatcherServlet 屏蔽这些具体的细节。



HandlerExceptionResolver	处理器异常解析器。它负责将捕获的异常映射到不同的视图上去，此外还支持更复杂的异常处理代码。


ViewResolver	视图解析器。它负责将一个代表逻辑视图名的字符串（ String） 映射到实际的视图类型 View 上。


LocaleResolver&LocaleContextResolver	地区解析器 和 地区上下文解析器。它们负责解析客户端所在的地区信息甚至时区信息，为国际化的视图定制提供了支持。


ThemeResolver	主题解析器。它负责解析你web应用中可用的主题，比如，提供一些个性化定制的布局等。


MultipartResolver	解析multi-part的传输请求，比如支持通过HTML表单进行的文件上传等。



FlashMapManager	FlashMap管理器。它能够存储并取回两次请求之间的 FlashMap 对象。后者可用于在请求之间传递数据，通常是在请求重定向的情境下使用。

