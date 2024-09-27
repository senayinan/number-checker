package com.senayinan.number_checker;

public class NumberChecker {
    public static boolean isEven(int number)    {
        System.out.println(number + " is an even number");
        return number%2==0;
    }
    public static void checkSignOfTheNumber(int number) {
        if (number > 0) {
            System.out.println(number + " is a positive number");
        } else if (number < 0) {
            System.out.println(number + " is a negative number");
        } else {
            System.out.println("The number is zero");
        }
    }
    //to check if it's a prime number
    public static boolean isPrime(int number)   {
        if(number<=1)   {
            System.out.println(number + " is not a prime number");
            return false;
        }
        for(int i = 2; i < number ; i ++)   {
            if(number % i == 0) {
                System.out.println(number + " is not a prime number");
                return false;
            }
        }
        System.out.println(number + " is a prime number");
        return true;
        }

        public static boolean isPerfectNumber(int number) {
        if(number < 0)  {
            System.out.println(number + " is not a perfect square number");
            return false;
        }
            int sqrt = (int) Math.sqrt(number);
            System.out.println(number + " is a perfect square number");
            return sqrt * sqrt == number;
        }
    }

