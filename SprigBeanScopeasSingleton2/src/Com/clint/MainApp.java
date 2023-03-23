package Com.clint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Com.model.HelloWorld;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld objA = (HelloWorld) context.getBean("helloworld");
		
		objA.setMessage("I am object A");
		objA.getMessage();
		
HelloWorld objB = (HelloWorld) context.getBean("helloworld");
		
		//objB.setMessage("I am object B");
		objB.getMessage();
		
HelloWorld objC = (HelloWorld) context.getBean("helloworld");
		
		//objC.setMessage("I am object C");
		objC.getMessage();

	}

}
