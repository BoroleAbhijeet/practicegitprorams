package com.git;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import com.service.Arithmetic;


public class AppTest 
{
  
    @Test
    public void testWithPositives()
    {
    	Arithmetic ar=new Arithmetic();
        int excepected=30;
        int actual=ar.sum(15, 15);
        assertEquals(excepected, actual);
    }
    @Test
    public void testWithNegatives()
    {
    	Arithmetic ar=new Arithmetic();
        int excepected=-39;
        int actual=ar.sum(-20, -19);
        assertEquals(excepected, actual);
    }
    @Test
    public void testWithZeros()
    {
    	Arithmetic ar=new Arithmetic();
        int excepected=0;
        int actual=ar.sum(0, 0);
        assertEquals(excepected, actual);
    }
    @Test
    public void testWithMixedValues()
    {
    	Arithmetic ar=new Arithmetic();
        int excepected=-5;
        int actual=ar.sum(-15, 10);
        assertEquals(excepected, actual);
    }
}
