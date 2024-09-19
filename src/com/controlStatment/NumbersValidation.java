package com.controlStatment;

public class NumbersValidation
{
    public static void main(String[] args)
    {
        /* Write a Java program  print whether a given number  is positive or negative */
        int number = -5;
        if(number >= 0)
        {
            System.out.println("number is positive");
        }
        else if (number < 0)
        {
            System.out.println("number is negative");
        }

        /* write Java Program to Find the Largest Among two Numbers */
        int a = 5;
        int b = 8;
        if( a > b)
        {
            System.out.println(a);
        }
        else if (a < b )
        {
            System.out.println(b);
        }

        /* write Java Program to Find the Largest Among Three Numbers */
        int c = 40;
        int d = 25;
        int e = 35;
        if( c > d && c > e )
        {
            System.out.println(c);
        }
        else if( d > c && d > e )
        {
            System.out.println(d);
        }
        else

        {
            System.out.println(e);
        }

        /* write java Program to Check Whether Number is Divisible by 5 */
        int x = 9;
        if(x % 5 == 0)
        {
            System.out.println("x is divisible by 5");
        }
        else
        {
            System.out.println( "x is not divisible by 5");

        }

        /* Write a program to check whether a number is divisible by 5 and 11 or not */
        int z = 15;
        if(z % 5 == 0 && z % 11 == 0)
        {
            System.out.println("z is divisible by 5 and 11");
        }
        else
        {
            System.out.println("z is not divisible by 5 and 11");
        }

        /* write Java Program to Check Whether a Number is Even or Odd */
        int l = 21;
        if(l % 2 == 0 )
        {
            System.out.println("l is even");
        } else if (l % 2 == 1)
        {
            System.out.println("l is odd");

        }

        /* Write java program to check whether a character is alphabet or not */
        char letter = '$';
        if(letter >= 'a' && letter <= 'z')
        {
            System.out.println("letter is a character alphabet");
        }
        else
        {
            System.out.println("letter is non a character alphabet");
        }

        /* Write java program to input any alphabet and check whether it is vowel or consonant */
        char alphletter ='b';
        if(alphletter == 'a' || alphletter == 'e' || alphletter =='i' || alphletter == 'o' || alphletter =='u' || alphletter == 'y' || alphletter == 'w')
        {
            System.out.println(alphletter + " is a vowal");
        }
        else
        {
            System.out.println(alphletter + " is a consonant");
        }
        /* Write a Java program to check whether the given integer is a multiple of 5 */

        int multiple5 = 10;
        if(multiple5 % 5 == 0)
        {
            System.out.println(multiple5 + " is multiple by 5");
        }
        else
        {
            System.out.println( multiple5 + " is not multiple by 5");
        }

        /* Write a program to check whether a character is uppercase or lowercase alphabet */
        char alphabet = '$';
        if(alphabet >= 'A' && alphabet <= 'Z')
        {
            System.out.println(alphabet + " is uppercase");
        }
        else if (alphabet >= 'a' && alphabet <= 'z')
        {
            System.out.println(alphabet + " is lowercase");
        }
        else
        {
            System.out.println(alphabet + " is not alphabet");
        }

        /* write a Java program to create a simple calculator Declare two variable integer */

        int m = 5;
        int n = 2;
        int result;
        char operator = '*';
        switch (operator) {
            case '*':
                result = m*n;
                System.out.println("the result of multiplication is " + result);
                break;
            case '+':
                result = m+n;
                System.out.println("the result of addition is " + result);
                break;
            case '-':
                result = m-n;
                System.out.println("the result of minus is " + result);
                break;
            case '/':
                result = (m/n);
                System.out.println("the result of division is " + result);
                break;
            default:
                System.out.println("invalid operator");
        }







        {

        }
    }
}
