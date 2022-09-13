package ch2.repositories;


import org.springframework.stereotype.Component;

@Component
public class MailRepositoryImpl implements MailRepository {
    @Override
    public void delivery() {
        System.out.println("Hello from MailRepositoryImpl");
        return;
    }
}
