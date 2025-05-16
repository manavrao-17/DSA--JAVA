// 1.write a program to add two numbers and print the result

import java.util.Scanner;

public class BasicQ{
    public static void main(String[]arrStrings){
        int a=8;
        int b=17;
        int c=a+b;
        
        System.out.println(c +"\n");
    
//2.wirte a program to calculate the area of a rectangle(length and breadth)

    int lenght=7;
    int breadth = 8;
    int area = lenght * breadth;{
        System.out.println("area of rectangle" + area +"\n");
    }
  
//3.write a program to swap two numbers using third variable
int m =8;
int j =17;
int temp;
temp =m;
m=j;
j=temp;
System.out.println("after swapping m =" + m + "and j="+ j + "\n");

//4.write a program to convert temperature from Celsius to Fahrenheit

int Celsius=25;
int Fahrenheit=(Celsius * 9/5)+32;
System.out.println("Celsius to Fahrenheit" + Fahrenheit + "\n");

//5.write a program to check if a number is positive or negative
int number= -17;
if (number >= 0){
    System.out.println("number is positive");}
        else{
            System.out.println("number is negative");
            System.out.println("\n");
        }
//6.write a program to find the length of 2 numbers
 int num1=8;
 int num2=17;
 if (m>j){
    System.out.println("num2 is grether then num1");
 }else{
    System.out.println("num1 is grether then num2");
    System.out.println("\n");
 }
//7.write a program to check whether a number is even odd
int no=2;
        if(no % 2 == 0)
            System.out.println(no + " is even");
        else
            System.out.println(no + " is odd");
            System.out.println("\n");

//8.write a program to check if a person  is eligible to vote(age > 18)
int age=17; 
if (age>18){
    System.out.println("you are eligible to vote");
}else{
    System.out.println("you are not eligiable to vote");
    System.out.println("\n");
}
//9.write a program to find whether a character is a vowel or consonant
char ch = 'v';
if (ch == 'A' || ch == 'E' || ch ==  'I'|| ch =='O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
System.out.println(ch+"is a vowel");
}else{
    System.out.println(ch +"is a consonant");
}

//10.write a program to find the largest of 3 numbers
int num5 =24;
int num6=53;
int num7=12;

if (num5>num6 && num5>num7){
    System.out.println("num5 is largest");
}else if(num6>num7 && num6>num7){
    System.out.println("num6 is largest");
}else{
    System.out.println("num7 is largest");
}
//11.write a program to check whether a year is leap year are not
int year;
Scanner readScanner = new Scanner(System.in);
year = readScanner.nextInt();
if ( ((year % 4 == 0) && (year % 100 != 0)) || (year % 400  == 0)) {
    System.out.println(year + " : Leap Year");
}

else {
    System.out.println(year + " : Non - Leap Year");

    }
}
}

