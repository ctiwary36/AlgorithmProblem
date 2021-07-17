package com.datastuctureandalgorithm.mergesort;

import java.util.Arrays;


public class MergeSort
{
	public static void mergeSort(String[] stringArray, int from, int to)
	{
		if (from == to)
		{
			return;
		}
		int mid = (from + to) / 2;
		// sort the first and the second half
		mergeSort(stringArray, from, mid);
		mergeSort(stringArray, mid + 1, to);
		merge(stringArray, from, mid, to);
	}

	public static void merge(String[] stringArray, int from, int mid, int to)
	{
		int n = to - from + 1;
		String[] tempArray = new String[n];
		int i = from;
		int j = mid + 1;
		int k = 0;

		while (i <= mid && j <= to)
		{
			if (stringArray[i].compareTo(stringArray[j]) < 0)
			{
				tempArray[k] = stringArray[i];
				i++;
			}
			else
			{
				tempArray[k] = stringArray[j];
				j++;
			}
			k++;
		}
		while (i <= mid)
		{
			tempArray[k] = stringArray[i];
			i++;
			k++;
		}

		while (j <= to)
		{
			tempArray[k] = stringArray[j];
			j++;
			k++;
		}
		// copy back from the temporary array
		for (k = 0; k < n; k++)
		{
			stringArray[from + k] = tempArray[k];
		}
	}
	
	public static void main(String[] args)
	{
		String[] stringArray = { "naruto", "hinata", "kakashi", "hokage", "leaf", "village" };
		System.out.println("Before sorting " + Arrays.toString(stringArray) + "\n");
		
		mergeSort(stringArray, 0, stringArray.length - 1);
		System.out.println("After sorting " + Arrays.toString(stringArray));
	}
}
