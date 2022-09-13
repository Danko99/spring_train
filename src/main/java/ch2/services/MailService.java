package ch2.services;

import ch2.repositories.MailRepository;
import org.springframework.stereotype.Component;

@Component
public class MailService {

    public MailService(MailRepository mailRepository) {
        this.mailRepository = mailRepository;
    }

    private MailRepository mailRepository;

    public void callMail(){
        mailRepository.delivery();
    }
}
