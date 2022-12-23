package kr.co.onlyone.aop.anno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAdvice {
	
	@Before(value = "execution(public * kr.co.onlyone.service..*.*(..))")
	public void before(JoinPoint joinPoint) {
		String aopInfo = joinPoint.getSignature().getName();
		System.out.println(aopInfo +"를 실행하기 전에 처리되는 내용임 before");
		for(Object arg: joinPoint.getArgs()) {
			System.out.println("joinPoint.getArgs()의 정보" + arg);
		}
	}
	
	@After(value = "execution(public * kr.co.onlyone.service..*.*(..))")
	public void after(JoinPoint joinPoint) {
		System.out.println("=========코어 컨선 실행후 나오는 어드바이스====================");
	}
}
