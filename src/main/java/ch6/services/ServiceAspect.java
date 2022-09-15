package ch6.services;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {

    @Around("execution(* ch6.services.CommentService.publishComment(..))")
    public Object log(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Началось выполнение метода");
        Object proceed = pjp.proceed();
//        System.out.println("Закончилось выполнение метода");
        return proceed;
    }

}
