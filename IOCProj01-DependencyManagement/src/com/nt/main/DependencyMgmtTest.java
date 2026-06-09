package com.nt.main;

//import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.nt.sbeans.WishMessageGenerator;

public class DependencyMgmtTest {

    public static void main(String[] args) {

    	ClassPathXmlApplicationContext ctx =
    		    new ClassPathXmlApplicationContext(
    		        "com/nt/cfgs/applicationContext.xml");
      
        WishMessageGenerator generator =
            (WishMessageGenerator) ctx.getBean("wmg");

        String msg = generator.generateWishMessage("Alam");

        System.out.println(msg);

    
        ctx.close();
    }
}