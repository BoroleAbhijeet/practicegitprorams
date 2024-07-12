package com.git;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import com.service.Arithmetic;


public class AppTest 
{
//    private static Arithmetic ar;
//    
//    @BeforeAll
//    public static void setUp() {
//    	ar=new Arithmetic();
//    }
//   
    @Test
    public void testWithPositives()
    {
    	Arithmetic ar=new Arithmetic();
        int excepected=30;
        int actual=ar.sum(15, 15);
        assertEquals(excepected, actual);
    }
}
