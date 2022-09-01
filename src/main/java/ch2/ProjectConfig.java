package ch2;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
}
