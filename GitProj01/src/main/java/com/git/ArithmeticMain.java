package com.git;

import com.service.Arithmetic;

public class ArithmeticMain
{
    public static void main( String[] args )
    {
        Arithmetic ar=new Arithmetic();
        System.out.println("Sum is:: "+ar.sum(10,20));
    }
}
