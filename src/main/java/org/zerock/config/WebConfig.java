package org.zerock.config;

import javax.servlet.ServletRegistration;

//자바로 설정하는 경우 : servlet-context, root-context, web.xml 파일 삭제
// pom.xml 에 plugin 추가 

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;;

public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {ServletConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
	
	//404 에러 (서블릿 3.0 이상만 가능)
	@Override
	protected void customizeRegistration(ServletRegistration.Dynamic registration) {
		// TODO Auto-generated method stub
		registration.setInitParameter("throwExceptionIfNoHandlerFound", "true");
	}
	
	

}
