package com.mypractice.test;

import java.util.Date;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.mypractice.bean.Message;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub // class.ForMa

		Resource  res = null;
		BeanFactory bean= null;
		Message msg = null;
		res =   new ClassPathResource("applicationContext.xml");
				//FileSystemResource("src\\main\\java\\com\\mypractice\\cfg\\applicationContext.xml");
		bean = new XmlBeanFactory(res);
		//msg =(Message) bean.getBean("msg");
		msg =bean.getBean("msg", Message.class);
		System.out.println(msg.message("Hamid "));
		Date date = bean.getBean("dt", Date.class);
		System.out.println(date);
		System.out.println(msg.hashCode());
		System.out.println(bean.getBean("msg", Message.class).hashCode());

	}

}
