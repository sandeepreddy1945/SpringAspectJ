/**
 * 
 */
package com.app.spring.aspectj.aj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * @author Sandeep
 *
 */
@Aspect
@Component
public class AccountAspect {

    @Around("execution( private * *(..))")
    public Object arounfAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("##### Method : " + MethodSignature.class.cast(joinPoint.getSignature()).getName());
        Object result = joinPoint.proceed();
        System.out
                .println("##### Completed Method : " + MethodSignature.class.cast(joinPoint.getSignature()).getName());
        return result;
    }
}
