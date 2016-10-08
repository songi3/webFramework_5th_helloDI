package kr.ac.hansung.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"kr/ac/hansung/spring/di/beans/animal.xml");

		PetOwner person = (PetOwner) context.getBean("petOwner"); // 레퍼런스 얻어옴
		person.paly();

		context.close();

	}
}
