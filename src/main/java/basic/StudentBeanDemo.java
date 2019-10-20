package basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentBeanDemo {
	public static void main(String[] args) {
		ApplicationContext appCon=new ClassPathXmlApplicationContext("StudentConfig.xml"); 
		StudentBean factory=(StudentBean)appCon.getBean("studentbean"); 
		factory.displayInfo(); 
	}
}
