package com.northbaysolutions.sumfunction;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class SumFunction implements RequestHandler<Input, Integer>{

    public Integer handleRequest(Input input, Context context) {
        Integer s  = input.getNum1() + input.getNum2();
        System.out.println(input.getNum1());
        System.out.println(input.getNum2());
        System.out.println(s);
        return s;
    }
}
