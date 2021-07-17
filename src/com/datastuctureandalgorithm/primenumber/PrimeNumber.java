package com.datastuctureandalgorithm.primenumber;

public class PrimeNumber
{
	private void findPrimeNumbers(int startpoint, int endPoint)
	{
		for (int i = startpoint; i <= endPoint; i++)
		{
            if (i == 1 || i == 0)
            {
                continue;
            }
            int flag = 1;
            for (int j = 2; j <= i / 2; ++j)
            {
                if (i % j == 0)
                {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
            {
                System.out.println(i);
            }
        }
	}
	
	public static void main(String[] args)
	{
		PrimeNumber primeNumberObject = new PrimeNumber();
		int startpoint = 0, endPoint = 1000;
		
		primeNumberObject.findPrimeNumbers(startpoint,endPoint);
	}
}
