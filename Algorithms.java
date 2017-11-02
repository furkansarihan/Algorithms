package Algorithms;

import java.util.ArrayList;

/**
 *
 * @author furkansarihan
 */
 
public class Algorithms {
    static int FibonacciRec(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return FibonacciRec(n-1)+FibonacciRec(n-2);
        }
    }
    
    static int FibonacciIter(int n){
        int []array = new int [n];
        array[0]=0;
        array[1]=1;
        for (int i = 2; i < n; i++) {
            array[i]= array[i-1]+array[i-2];
        }
        return array[n-1];
    }
    static int[] SelectionSort(int [] array){   
        
        int temp;
        for (int i = 0; i < array.length-1; i++) {
            int min = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j]<array[min]) min = j;
            }
            temp = array[i];
            array[i]= array[min];
            array[min]=temp;
        }
        return array;
    }
    static int[] InsertionSort(int [] array){
        
        for (int i = 1; i < array.length; i++) {
            int v = array[i];
            int j = i-1;
            while(j>=0&&array[j]>v){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=v;
        }   
        return array;
    }
    static void PrintArray(int [] dizi){
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i]+" ");
        }
    }
    public static void main(String[] args) {
    
    }
}