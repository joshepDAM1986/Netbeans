
package com.mycompany.comparaciones;

import java.util.Scanner;

/**
 *
 * @author damci
 */

public class Comparaciones 
{

    public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in);
    int a=0;
    int b=0;
        System.out.println("Introduce el valor de a:");
        a=sc.nextInt();
        System.out.println("Introduce el valor de b:");
        b=sc.nextInt();
            if (a==b)
            {
                System.out.println("a es igual a b");
            }
            else
            {
                if (a>b)
                    {
                        System.out.println("a es mayor que b");  
                    }
                else
                    {
                        System.out.println("b es mayor que a");
                    }
            }
    }
}
