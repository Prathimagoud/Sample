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
        
        try{
            System.out.println("myObject: " + myObject.toString());
        }catch(Exception e){
            
        }
            
    }
}
