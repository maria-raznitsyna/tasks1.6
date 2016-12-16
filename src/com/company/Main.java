package com.company;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// entering integer numbers from command line
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int size = input.nextInt();
        int [] array= new int[size];
        for (int i=0;i<size;i++)
        {
            System.out.println("Insert array element ["+(i+1)+"] :");
            array[i]=input.nextInt();
        }
        System.out.println("The Array is :");
        System.out.println(Arrays.toString(array));
      /*  //display even numbers from array
        System.out.println("even numbers of array: ");
        for (int i=0;i<size;i++){
            if (array[i]%2==0)
                System.out.print(array[i]+";");
        }
        System.out.println(" ");
        //display uneven numbers from array
        System.out.println("uneven numbers of array: ");
        for (int i=0;i<size;i++){
            if (array[i]%2!=0)
                System.out.print(array[i]+";");
        }*/


     /*   // MAX number
        int max=array[0];
        int min=array[size-1];
        for (int i=0;i<size-1;i++)
        {
            if (array[i]>array[i+1]&& array[i]>max)
                max = array[i];
        }
        if (array[size-1]>max){
            max=array[size-1];
        }
        System.out.println("Maximum of array: "+ max);
        // MIN number
        for (int i=size-2;i>0;i--)
        {
            if (array[i]<array[i-1]&& array[i]<min)
                min = array[i];
        }
        if (array[0]<min){
            min=array[0];
        }
        System.out.println("Minimum of array: "+ min);*/

      /* //Numbers which devide in 3,9,5,7

       boolean devider=false;
       boolean devider1=false;
        System.out.println(" numbers, which devide in 3 and 9: ");
       for (int i =0;i<size;i++)
           if ((array[i]%3==0)&&(array[i]%9==0)) {
               System.out.print(" " + array[i]);
               devider=true;
           }
           if (devider==false){
               System.out.println("\n there are no such numbers in this array!");
           }
        System.out.println("\n numbers, which devide in 5 and 7: ");
        for (int i =0;i<size;i++)
            if ((array[i]%5==0)&&(array[i]%7==0))
            {System.out.print(" "+array[i]);
                devider1=true;
            }
        if (devider1==false){
            System.out.println("\n there are no such numbers in this array!");
        }*/

      /*//Полусумма соседних элементов
        System.out.println("half sum of round elements: ");
        for (int i=1;i<size-1;i++)
        {
            if ((array[i - 1] + array[i + 1]) / 2 == array[i]) {
                System.out.println("element ["+(i)+"]: " + array[i] + "=" + "("+ array[i-1]+ "+" +array[i+1]+")" +"/2");
            }
        }*/
      //no similar numbers
//  ДЛЯ ВВОДА В МАССИВ ТОЛЬКО ТРЕХНЧНЫХ ЭЛЕМЕНТОВ
    /*    Scanner input = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int size = input.nextInt();
        int [] array= new int[size];
        String a;
        for (int i=0;i<size;i++)
        {
            System.out.println("Please, enter three-digit number: ["+(i+1)+"] :");
            array[i]=input.nextInt();
            a=String.valueOf(array[i]);
            while (a.length()!=3){
                System.out.println("this number is not three-digit,please try again: ");
                array[i]=input.nextInt();
                a=String.valueOf(array[i]);
            }
        }
        System.out.println("The Array is :");
        System.out.println(Arrays.toString(array));*/

//ВЫВОД ИЗ МАССИВА ТОЛЬКО ТРЕХЗНАЧНЫХ ЭЛЕМЕНТОВ С НЕПОВТОРЯЮЩИМИСЯ ЧИСЛАМИ
     /*   String b;
        for (int i=0;i<size;i++)
        {
            b= String.valueOf(array[i]);
            if (b.length()==3) {
                if ((b.charAt(0) != b.charAt(1)) & (b.charAt(1) != b.charAt(2)) & (b.charAt(0) != b.charAt(2))) {
                    System.out.println("the element is: " + array[i]);
                }
            }
        }*/

        //LUCKY NUMBERS
        String c;
        for (int i=0;i<size;i++){
           c = String.valueOf(array[i]);
            if (c.length()==4){
                if ((c.charAt(0)+c.charAt(1))==(c.charAt(2)+c.charAt(3)))
                {
                    System.out.println("the lucky number is: " + array[i]);
                }
            }
            if (c.length()==6){
                if ((c.charAt(0)+c.charAt(1)+c.charAt(2))==(c.charAt(3)+c.charAt(4)+c.charAt(5)))
                {
                    System.out.println("the lucky number is: " + array[i]);
                }
            }
            if (c.length()==8){
                if ((c.charAt(0)+c.charAt(1)+c.charAt(2)+c.charAt(3))==(c.charAt(6)+c.charAt(4)+c.charAt(5)+c.charAt(7)))
                {
                    System.out.println("the lucky number is: " + array[i]);
                }
            }

        }
    }
}
