package com.enjoy.example.cap08.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

@Aspect // 声明日志切面类
public class LogAspect {
    //                          *返回类型不限                         ..参数不限
    @Pointcut("execution(public * com.enjoy.example.cap08.aop.Caculator.*(..))")
    public void pointCut() {}
    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName() + "执行logStart：{" + Arrays.asList(joinPoint.getArgs()) + "}");
    }
    @After("pointCut()")
    public void logEnd(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName() + "执行logEnd：{}");
    }
    @AfterReturning(value = "pointCut()", returning = "result")
    public void logReturn(Object result) {
        System.out.println("执行logReturn：{" + result + "}");
    }
    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void logException(Exception exception) {
        System.out.println("执行logException：{" + exception + "}");
    }
    @Around("pointCut()")
    public Object around(ProceedingJoinPoint proceed) throws Throwable {
        System.out.println("around执行目标之前");
        Object obj = proceed.proceed();
        System.out.println("around执行目标之后");
        return obj;
    }
}
