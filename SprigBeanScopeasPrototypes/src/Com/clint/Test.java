package Com.clint;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import Com.model.Student;

public class Test {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("beans.xml");
		BeanFactory bf = new XmlBeanFactory(r);
		Student s= (Student) bf.getBean("s");
		System.out.println(s);
		
		Student s1= (Student) bf.getBean("s");
		System.out.println(s1);
		
		Student s2= (Student) bf.getBean("s");
		System.out.println(s2);
		
		
		
	}

}
