package kr.co.onlyone.aop.xml;

import org.aspectj.lang.ProceedingJoinPoint;

public class PerformanceAdvice {
	
	 public Object trace(ProceedingJoinPoint joinPoint) {
		 // 타겟 메서드의 정보를 문자열로 얻어오기
		 String targetMethodInfo = joinPoint.getSignature().getName();
		 System.out.println(targetMethodInfo+ " 시작 ");
		 long start = System.currentTimeMillis();
		 //타겟 메서드가 실행되기 전에 수행할 동작을 정의
		 //아래 내용은 고정된 내용
		try {
			Object result = joinPoint.proceed();//타겟 메서드가 동작하도록 호출한다.
			 return result;
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			long end = System.currentTimeMillis();
			System.out.println(targetMethodInfo+ " 종료 ");
			System.out.println(targetMethodInfo+ " 실행시간 "+ (end - start) + "ms");
		}
		 
		 return null;
	 }
}
