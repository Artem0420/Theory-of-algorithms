/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheoryOfAlgorithms.Markichev.Lab8;

import java.util.Arrays;
import java.util.Random;

public class Algorithms {
    private int[] _array;
    
    public Algorithms(int length)
    {
        _array = GenerateArray(length);
    }
    
    public int[] GenerateArray(int length)
    {
        Random rd = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++)
           array[i] = rd.nextInt();
        return array;
    }
    
       public AlgorithmDetails HeapSort()
    {
        int[] array = Arrays.copyOf(_array, _array.length);
        AlgorithmDetails details = new AlgorithmDetails();
        int temp = 0;
        long startTime = System.nanoTime();
        int n = array.length;
 
        for (int i = n / 2 - 1; i >= 0; i--){
            details = heapify(array, n, i, details);
            details.setComparisons(details.getComparisons() + 1);
        }

        for (int i = n - 1; i > 0; i--) {
            temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            details.setComparisons(details.getComparisons() + 1);
            details.setSubstitutions(details.getSubstitutions()+ 1);
            details = heapify(array, i, 0, details);
        }
        
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        details.setTime(duration);
        return details;
    }
 
    AlgorithmDetails heapify(int arr[], int n, int i, AlgorithmDetails details)
    {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
 
        details.setComparisons(details.getComparisons() + 2);
        if (l < n && arr[l] > arr[largest])
            largest = l;
 
        details.setComparisons(details.getComparisons() + 2);
        if (r < n && arr[r] > arr[largest])
            largest = r;
 
        details.setComparisons(details.getComparisons() + 1);
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            details.setSubstitutions(details.getSubstitutions()+ 1);
            details = heapify(arr, n, largest, details);
        }
        return details;
    }
    
    public AlgorithmDetails bubbleSort() {
        int[] array = Arrays.copyOf(_array, _array.length);
        AlgorithmDetails details = new AlgorithmDetails();
        int temp = 0;
        int substitutions = 0;
        int comparisons = 0;
        long startTime = System.nanoTime();
        for(int i=0; i < array.length; i++){ 
            comparisons++;
            for(int j=1; j < array.length - i; j++){  
                comparisons += 2;
                if(array[j-1] > array[j]){  
                    temp = array[j-1];  
                    array[j-1] = array[j];  
                    array[j] = temp;
                    substitutions++;
                }                
            }  
        }
        long endTime = System.nanoTime();
        details.setComparisons(comparisons);
        details.setSubstitutions(substitutions);
        long duration = (endTime - startTime) / 1000000;
        details.setTime(duration);
        return details;
    }
    
    private void QuickSortInner(int[] array, int low, int high, AlgorithmDetails details)
    {
       details.setComparisons(details.getComparisons() + 1);
       if (array.length == 0)
            return;
       
        details.setComparisons(details.getComparisons() + 1);
        if (low >= high)
            return;
 
        int middle = low + (high - low) / 2;
        int opora = array[middle];
 
        int i = low, j = high;
        while (i <= j) {
            details.setComparisons(details.getComparisons() + 1);
            while (array[i] < opora) {
                i++;
                details.setComparisons(details.getComparisons() + 1);
            }
 
            while (array[j] > opora) {
                j--;
                details.setComparisons(details.getComparisons() + 1);
            }
 
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
                details.setSubstitutions(details.getSubstitutions() + 1);
                details.setComparisons(details.getComparisons() + 1);
            }
        }
 
        details.setComparisons(details.getComparisons() + 1);
        if (low < j)
            QuickSortInner(array, low, j, details);
        details.setComparisons(details.getComparisons() + 1);
        if (high > i)
            QuickSortInner(array, i, high, details);
    }
    
    public AlgorithmDetails QuickSort()
    {
        int[] array = Arrays.copyOf(_array, _array.length);
        AlgorithmDetails details = new AlgorithmDetails();
        long startTime = System.nanoTime();
        QuickSortInner(array, 0, array.length - 1, details);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        details.setTime(duration);
        return details;
    }
}

