package com.senayinan.number_checker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

import static com.senayinan.number_checker.NumberChecker.isEven;

@SpringBootApplication
public class NumberCheckerApplication {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		NumberChecker.isEven(number);
		NumberChecker.checkSignOfTheNumber(number);
		NumberChecker.isPrime(number);
		NumberChecker.isPerfectNumber(number);
		}
	}


