package com.datastuctureandalgorithm.anagramdetection;

import java.util.Scanner;

public class AnagramDetection
{
	int[] asciiArray = new int[256];
	boolean isAnagram = true;
	
	private void checkAnagramOrNot(String firString, String seconString)
	{
		for(char charecter : firString.toCharArray())
		{
			int index = (int) charecter;
			asciiArray[index] ++;
		}
		for(char charecter : firString.toCharArray())
		{
			int index = (int) charecter;
			asciiArray[index] --;
		}
		for(int i = 0; i < 256; i ++)
		{
			if(asciiArray[i] != 0)
			{
				isAnagram = false;
				break;
			}
		}
		if(isAnagram)
		{
			System.out.println("Strings " + firString + " and " + seconString + " are Anagram.");
		}
		else
		{
			System.err.println("Strings " + firString + " and " + seconString + " are NOT Anagram.");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Check if both the strings are Anagram Or Not.\n");
		System.out.print("Enter First String : ");
		String firstString = sc.next();
		System.out.print("Enter Second String : ");
		String secondString = sc.next();
		sc.close();
		
		AnagramDetection anagramObject = new AnagramDetection();
		anagramObject.checkAnagramOrNot(firstString, secondString);
	}
}
