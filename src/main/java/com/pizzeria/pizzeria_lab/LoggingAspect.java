package com.pizzeria.pizzeria_lab;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Around("execution(* com.pizzeria.pizzeria_lab.*.*(..))")
    public Object beforeMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime=System.currentTimeMillis();
        Object result= joinPoint.proceed();
        long endTime=System.currentTimeMillis();
        System.out.println("Method took: " +(endTime-startTime)+" ms");
        return result;
    }


}
