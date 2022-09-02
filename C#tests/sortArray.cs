using System;
using System.Collections.Generic;

public class ArraySort
{
    
    private static int SumOfDigit(int n)
    {
        var sum = 0;
        
        while (n > 0)
        {
            sum += n % 10;
            n /= 10;
        }
        
        return sum;
    }
    
    private static int[] SortArray(int[] unsortedArray, int arrayLength)
    {
        int[] sortedArray = new int[arrayLength];
        
        var vp = new List<List<int>>();
        
        for (var i = 0; i < arrayLength; i++)
        {
            var temp = new List<int>();
            var a = unsortedArray[i];
            temp.Add(SumOfDigit(a));
            temp.Add(a);
            vp.Add(temp);
        }
        
        vp.Sort(delegate(List<int>o1, List<int> o2) {
            return o1[0].CompareTo(o2[0]);
        });
	     
	     for (var j = 0; j < arrayLength; j++)
	     {
	         sortedArray[j] = vp[j][1];
	     }
        
        return sortedArray;
    }
    
    public static void Main(string[] args)
    {
        var inputLine = Console.ReadLine().Trim().Split(" ");
        var arrayLength = inputLine.Length;
        var unsortedArray = new int[arrayLength];
        
        for(var i = 0; i < arrayLength; i++)
        {
            unsortedArray[i] = int.Parse(inputLine[i]);
        }
        
        int[] sortedArray = SortArray(unsortedArray, arrayLength);
        
        for (var j = 0; j < arrayLength; j++) {
            Console.Write($"{sortedArray[j]} ");
        }
    }
}