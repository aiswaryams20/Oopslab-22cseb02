/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*package javaapplication2;*/

/**
 *
 * @author AISWARYA.MS
 */
/*public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        // TODO code application logic here
    }
    
}*/

//1)Find Minimum of 2 nos. And get the input through command line argument


/*package javaapplication2;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        // TODO code application logic here
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        if (a>b)
        {
            System.out.println("b is Minimum");
        }
        else
        {
            System.out.println("a is minimum");
        }
    }
}*/


//2)Write a program to find SUM AND PRODUCT of a given Digit


/*package javaapplication2;
import java.util.*;

/**
 *
 * @author AISWARYA.MS
 */
/*public class JavaApplication2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values of a and b:");
        int a,b,c,d;
        a = sc.nextInt();
        b =sc.nextInt();
        c = a+b;
        d = a*b;
        System.out.println("Sum:"+c);
        System.out.println("Product:"+d);
    }
}*/


//3)Write a program to convert given no. of days into months and days


/*package javaapplication2;
import java .util.*;

/**
 *
 * @author AISWARYA.MS
 */
/*public class JavaApplication2
{
    public static void main(String args[])
    {
      Scanner in = new Scanner (System.in);
      int a,b,y,m,d;
      System.out.println("enter a");
      a=in.nextInt();
      y=a/365;
      b=a%365;
      m=b/30;
      d=b%30;
      System.out.println("The number of years="+y);
      System.out.println("The number of months ="+m);
      System.out.println("The number of days="+d);
    }
}*/


//4)Write a program to display a greet message according to Marks obtained by 
//student using switch case.


/*public class JavaApplication2
{
    public static void main(String[] args)
    {
        int marks=10;
        String message;
        message = switch (marks) {
            case 10 -> "excellent";
            case 9, 8 -> "very good";
            case 7, 6 -> "good";
            case 5, 4, 3 -> "poor";
            case 2, 1, 0 -> "very poor";
            default -> "invalid marks";
        };
        System.out.println("Greeting message"+ message);
    }
}*/


//5)print the left half side pattern


/*public class JavaApplication2
{
    public static void main(String[]args)
    {
        int i,j, n=5;
        for(i=0;i<n;i++)
        {
            for(j=2*(n-i);j>=0;j--)
            {
                System.out.print(" ");
            }
            for(j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}*/



     




