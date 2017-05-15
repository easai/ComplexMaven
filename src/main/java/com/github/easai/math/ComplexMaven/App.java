package com.github.easai.math.ComplexMaven;

import com.github.easai.math.Complex;

public class App 
{
    public static void main( String[] args )
    {
    	Complex c=new Complex(1.0,1.0);
        System.out.println( Complex.sin(c).toString() );
    }
}
