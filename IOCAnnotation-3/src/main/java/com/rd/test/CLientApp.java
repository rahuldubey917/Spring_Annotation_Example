package com.rd.test;

import com.rd.beans.Vehical;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CLientApp {

	public static void main(String[] args) {
	   	ApplicationContext ctx=null;
		Vehical vehical=null;
		
	//creating ioc container
	ctx=new ClassPathXmlApplicationContext("com/rd/cfgs/applicationContext.xml");	
	
	//getting bean
	vehical=ctx.getBean("vehical",Vehical.class);
	
	System.out.println(vehical);

	((AbstractApplicationContext) ctx).close();
	}

}
