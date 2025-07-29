package hello.hello_spring.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TimeTraceAop {

    @Around("execution(* hello.hello_spring..*(..))")
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable{
        long start = System.currentTimeMillis();

        System.out.println("Start" + joinPoint.toString());

        try {
            return joinPoint.proceed();
        }finally {
            long finsh = System.currentTimeMillis();
            long timeMs = finsh - start;
            System.out.println("END:" + joinPoint.toString()+" " + timeMs + "ms");
        }
    }
}
