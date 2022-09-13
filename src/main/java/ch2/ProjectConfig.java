package ch2;


import ch2.models.Car;
import ch2.models.Dog;
import ch2.models.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@ComponentScan
@Configuration
public class ProjectConfig {

    @Bean
    public Dog dog(){
        return new Dog("Miki");
    }

    @Primary
    @Bean("dogBonya")
    public Dog dog1(){
        return new Dog("Bonya");
    }

    @Bean
    public Car car(){
        return new Car("Mitsubishi Lancer X");
    }

    @Bean
    public Car car1(){
        return new Car("Mitsubishi Lancer IX");
    }


    //Внедрение зависимости через вызов метода car() с аннотацией @Bean.
    @Bean
    public Person personCall(){
        Person person = new Person();
        person.setName("Mike");
        person.setCar(car());
        return person;
    }

    //Внедрение зависимости через передачу параметра car типа ch2.models.Car в метод
    @Bean
    public Person personParameter(Car car){
        Person person = new Person();
        person.setName("Ivan");
        person.setCar(car);
        return person;
    }
}
