package com.datastuctureandalgorithm.primepalindrome;


public class PrimePalindRome
{
	private boolean isPrime(int number)
	{
		int counter = 0;
		for(int i = 2; i < number; i++)
		{
			if(number % i == 0)
			{
				counter ++;
			}
		}
		if(counter == 2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	private boolean isPalindRome(int number)
	{
		int temp = number;
		int reverse = 0;
		while(temp != 0)
		{
			reverse = reverse * 10 + temp % 10;
			temp = temp / 10;
		}
		if(number == reverse)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args)
	{
		PrimePalindRome primePRObject =  new PrimePalindRome();
		System.out.println("Following are the prime as well as palindrome numbers.\n");
		for(int i = 0; i <= 1000; i++)
		{
			if(primePRObject.isPrime(i) && primePRObject.isPalindRome(i))
			{
				System.out.print(i + " ");
			}
		}
	}
}
