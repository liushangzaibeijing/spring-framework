package com.xiu.test;

import com.xiu.bean.Son;
import com.xiu.bean.Worker;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryTest {

	@Test
	public void testGetBean(){
		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring-beans.xml"));
		Worker worker = beanFactory.getBean("worker", Worker.class);
	}


	@Test
	public void testExtends(){
		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring-beans.xml"));
		Worker worker = beanFactory.getBean("worker", Worker.class);
		Son son = beanFactory.getBean("son", Son.class);

		System.out.println("我继承了父亲的"+son.getWeathy()+"，我拥有"+son.getLife());
	}

}
