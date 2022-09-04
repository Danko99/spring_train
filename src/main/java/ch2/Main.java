package ch2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Dog bean = applicationContext.getBean(Dog.class);
//        System.out.println(bean.getName());
        Parrot parrot = applicationContext.getBean(Parrot.class);
        System.out.println(parrot.toString());

        Person person = applicationContext.getBean(Person.class);

        System.out.println(person.getCar());
    }
}
