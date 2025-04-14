/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author godwin-ofwono
 */
import java.util.Scanner;
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello Programmers");
//      Variables In Java
//Instance variables are declared inside the class but outside the method body
//Static variables declared using static keyword and outside the method body
//Local variables declared inside te method body.
//type casting
        int x = 11;
        byte y = (byte)x;
        System.out.println("This is he value of Y = "+y);
        //Decisoin Making. If statements
        int a,b;
        a=20;
        b=100;
        if (a>b){
            System.out.println(a+" is greater than "+b);
        }
        else{}
        System.out.println("You are outside the Block");
        //Adding some aspect of else if
        
        //Simple grading.
        int mark=40;
        if(mark>=80 && mark<=100){
            System.out.println("Grade is A");
        
        }
        else if(mark>=60 && mark<=79){
            System.out.println("Grade is B");
        
        }
        
        else if(mark>=40 && mark<=59){
            System.out.println("Grade is c");
        
        }
        else{
            System.out.println("Invalid Mark");
        }
        // Inputs.
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = myObj.nextLine();
        System.out.println("Welcome "+name);
        
        System.out.println("Enter your age ");
        int age = myObj.nextInt();
        System.out.println(name+" you are "+age+" years old");
        
        
    }
    
}
