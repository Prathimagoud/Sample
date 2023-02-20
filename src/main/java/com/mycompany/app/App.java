package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        System.out.println("A NullPointerException is a drag...");
        Object myObject = null;
        String nullStr = null;
        System.out.println("print null string.."+nullStr.length());
        
        try{
            System.out.println("myObject: " + myObject.toString());
        }finally{
             System.out.println("final block");
        }
            
        if(true){
            System.out.println("true block");
        }
            
    }
   // public void method1(
}
