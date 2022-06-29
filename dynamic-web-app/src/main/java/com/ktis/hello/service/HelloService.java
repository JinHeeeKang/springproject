package com.ktis.hello.service;

import com.ktis.hello.dao.AnotherDAO;
import com.ktis.hello.dao.HelloDAO;

public class HelloService {

    private HelloDAO HelloDAO;
    private AnotherDAO AnotherDAO;

    //setter
    public void setHelloDAO(HelloDAO dao) {
        this.HelloDAO = dao;
    }

    public void setAnotherDAO(AnotherDAO dao) {
        this.AnotherDAO = dao;
    }

    //생성자
//    public HelloService(HelloDAO dao){
//        this.HelloDAO = dao;
//    }

    public  int calcTwoNumbers(int a, int b){
        //직접
//        dao = new HelloDAO();
        return  HelloDAO.addTwoNumber(a,b);
    }

    public  int calcTwoNumbersAndSquare(int a, int b){
        int result = HelloDAO.addTwoNumber(a,b);

        return AnotherDAO.square(result);
    }

}
