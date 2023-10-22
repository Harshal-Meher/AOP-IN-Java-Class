package pack;

import org.aspectj.lang.JoinPoint;  
import org.aspectj.lang.annotation.Aspect;  
import org.aspectj.lang.annotation.Before;  
import org.aspectj.lang.annotation.Pointcut;  
  
@Aspect  
public class Track{  
	//pointcut name  
	
    @Pointcut("execution(* Operation.*(..))")  
    
    
    public void k()
    {
    	
    }
      
  //applying pointcut on before advice  
    
    @Before("k()")
    public void myadvice(JoinPoint jp)//it is advice (before advice)  
    {  
        System.out.println("additional concern");  
        //System.out.println("Method Signature: "  + jp.getSignature());  
    }  
}  
