package com.datastuctureandalgorithm.insertionsort;

import java.util.Arrays;

public class InsertionSortTechnique
{
	private<T extends Comparable<T>> void insertionSort(T[] inputArray)
	{
		int i,j;
		T key;
		//will start comparing from arrays first index element.
		for (j = 1; j < inputArray.length; j++)
		{
			//key is nothing but temporary variable.
			key = inputArray[j];
		    i = j - 1;
		    //while loop will run until we traverse to arrays 0th index.
		    while (i >= 0)
		    {
		    	if (key.compareTo(inputArray[i]) > 0)
		    	{
		    		break;
		    	}
		    		inputArray[i + 1] = inputArray[i];
		    		i--;
		    }
		    inputArray[i + 1] = key;
		    System.out.println(Arrays.toString(inputArray));
		}
		System.out.println(Arrays.toString(inputArray));
	}
	
	public static void main(String[] args)
	{
		String[] inputArray = {"Hello","Chandan","Good","Night","Keep","Calmn"};
		System.out.println(Arrays.toString(inputArray));
	  
		InsertionSortTechnique insertionSortTechniqueobject = new InsertionSortTechnique();
		insertionSortTechniqueobject.insertionSort(inputArray);
	}
}
