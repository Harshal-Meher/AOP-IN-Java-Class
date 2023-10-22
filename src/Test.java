
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pack.Operation;



public class Test 
{
public static void main(String[] args) {
	
	ApplicationContext c=new ClassPathXmlApplicationContext("pack/aop.xml");
    Operation op=c.getBean("opBean",Operation.class);
    op.msg();
	op.m();
	op.k();
   }
}
