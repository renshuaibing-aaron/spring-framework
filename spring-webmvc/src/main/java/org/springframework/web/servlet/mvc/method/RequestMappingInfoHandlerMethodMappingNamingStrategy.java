package org.springframework.web.servlet.mvc.method;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerMethodMappingNamingStrategy;

/**
 * A {@link org.springframework.web.servlet.handler.HandlerMethodMappingNamingStrategy
 * HandlerMethodMappingNamingStrategy} for {@code RequestMappingInfo}-based handler
 * method mappings.
 *
 * If the {@code RequestMappingInfo} name attribute is set, its value is used.
 * Otherwise the name is based on the capital letters of the class name,
 * followed by "#" as a separator, and the method name. For example "TC#getFoo"
 * for a class named TestController with method getFoo.
 *
 * @author Rossen Stoyanchev
 * @since 4.1
 */
public class RequestMappingInfoHandlerMethodMappingNamingStrategy
		implements HandlerMethodMappingNamingStrategy<RequestMappingInfo> {

	/** Separator between the type and method-level parts of a HandlerMethod mapping name */
	public static final String SEPARATOR = "#";


	/**
	 * 情况一，如果 Mapping 已经配置名字，则直接返回。例如，@RequestMapping(name = "login", value = "user/login") 注解的方法，
	 *    它对应的 Mapping 的名字就是 "login" 。
	 * 情况二，如果 Mapping 未配置名字，则使用使用类名大写 + "#" + 方法名。例如，@RequestMapping(value = "user/login") 注解的方法，
	 *     假设它所在的类为 UserController ，对应的方法名为 login ，则它对应的 Mapping 的名字就是 USERCONTROLLER#login 。
	 * @param handlerMethod the handler method
	 * @param mapping the mapping
	 * @return
	 */

	@Override
	public String getName(HandlerMethod handlerMethod, RequestMappingInfo mapping) {
		// 情况一，mapping 名字非空，则使用 mapping 的名字
		if (mapping.getName() != null) {
			return mapping.getName();
		}
		// 情况二，使用类名大写 + "#" + 方法名
		StringBuilder sb = new StringBuilder();
		String simpleTypeName = handlerMethod.getBeanType().getSimpleName();
		for (int i = 0 ; i < simpleTypeName.length(); i++) {
			if (Character.isUpperCase(simpleTypeName.charAt(i))) {
				sb.append(simpleTypeName.charAt(i));
			}
		}
		sb.append(SEPARATOR).append(handlerMethod.getMethod().getName());
		return sb.toString();
	}

}
