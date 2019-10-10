//package com.mayikt.aop;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.*;
//import org.springframework.context.annotation.EnableAspectJAutoProxy;
//import org.springframework.stereotype.Component;
//
//@Aspect
//@Component
//@EnableAspectJAutoProxy
//public class LogAop {
//    //@Aspect定义切面类
//    //定义切入点 Pointcut 开始方法拦截入口 所有类方法参数都会拦截
//    @Pointcut("execution(* com.mayikt.service..*.*(..))")
//    public void logAop() {
//    }
//
//    @Before(" logAop()")
//    public void doBefore() {
//        System.out.println("前置通知>>>调用方法之前拦截");
//    }
//
//    @After(" logAop()")
//    public void doAfter() {
//        System.out.println("后置通知>>>调用方法之后拦截");
//    }
//
//    @AfterThrowing("logAop()")
//    public void afterReturing(JoinPoint joinPoint){
//        System.out.println(">>>运行时执行通知");
//
//    }    @AfterThrowing("logAop()")
//    public void afterThrowing(JoinPoint joinPoint){
//        System.out.println(">>>异常通知");
//    }
//}
