package com.ktis.hello;

import com.ktis.hello.dao.vo.Article;
import com.ktis.hello.service.BbsService;
import com.ktis.hello.service.HelloService;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {
    public static void main(String[] args) {
//        HelloDAO dao = new HelloDAO();
//        int result = dao.addTwoNumber(3,5);
//        System.out.println("result = " + result); //8
//

          //HelloDAO lookup 실습
//        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-context.xml");
//        //bean 태그로 등록된 파일을 가져옴 DL
//        HelloDAO dao = ctx.getBean("helloDAO", HelloDAO.class);
//        //변수가 사라져도 참조했던 객체는 컨테이너로 반환되어 물리적으로 메모리가 제거되지않음
//        int result = dao.addTwoNumber(5,67); //72
//        System.out.println("result = " + result);


//        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-context.xml");
//        HelloService service = ctx.getBean("helloService", HelloService.class);
//        int result = service.calcTwoNumbers(5,10); //15
//        System.out.println("result = " + result);



//        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-context.xml");
//        HelloService service = ctx.getBean("helloService", HelloService.class);
//        int result = service.calcTwoNumbersAndSquare(4,8); //144
//        System.out.println("result = " + result);

        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-context.xml");

        BbsService service = ctx.getBean("bbsService", BbsService.class);
        service.registArticle(new Article());
//        int result =
//        System.out.println("result = " + result);



    }
}
