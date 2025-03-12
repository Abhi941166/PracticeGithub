package com.pack;

import java.util.Scanner;

public class SecondCode {

	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Take input from user
	        System.out.print("Enter a string or number: ");
	        String input = scanner.nextLine();
	        
	        // Check if it's a palindrome
	        if (isPalindrome(input)) {
	            System.out.println(input + " is a palindrome.");
	        } else {
	            System.out.println(input + " is not a palindrome.");
	        }
	        
	        scanner.close();
	    }

	    public static boolean isPalindrome(String str) {
	        int left = 0, right = str.length() - 1;
	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	    }
	}

