package Rongrong;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Triangle tri = new Triangle();
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle tri = (Triangle) factory.getBean("tri");
		tri.draw();
	
	}

}