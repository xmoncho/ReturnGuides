package com.ferromex.returnGuides.tests;

import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ferromex.returnGuides.beans.ReleasedCar;
import com.ferromex.returnGuides.daos.ReleasedCarDAO;

public class ReleasedCarsTest {
	private ApplicationContext context;
	
	@Before
	public void init() {
		context = new ClassPathXmlApplicationContext("context.xml");
	}

	@Test
	public void test() {
		ReleasedCarDAO releasedCars = context.getBean("releasedCarDAO", ReleasedCarDAO.class);
		List<ReleasedCar> cars =  releasedCars.getList();
		System.out.println("Carros liberados: " + cars.size());
	}
}
