package ch2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Dog bean = applicationContext.getBean(Dog.class);
        System.out.println(bean.getName());
    }
}
