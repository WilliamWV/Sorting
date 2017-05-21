/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Random;

/**
 *
 * @author ACEW
 */
public class Util {
    final int smallSize = 20;
    final int midSize = 50000;
    final int bigSize = 200000;
    final int hugeSize = 5000000;
    
    public void printArray(int arr[]){
        System.out.print("[");
        for(int i = 0; i<arr.length; i++){
           System.out.print(arr[i] + ", ");
           if(i%10 == 9 && i+1<arr.length){
               System.out.println("");
           }
        }
        System.out.println("]");
    }
    
    public int[] generateRandomArray(int size){
        int[] array= new int[size];
        Random rand = new Random();
        for(int i = 0; i<size; i++){
            array[i] = Math.abs(rand.nextInt()%(size*5));
        
        }
        return array;
    }
    
    public int[] generateAscendingArray(int size){
        int[] array = new int[size];
        Random rand = new Random();
        int currentEl = 0;
        for(int i = 0; i<size; i++){
            currentEl+=((Math.abs(rand.nextInt()))%5);
            array[i] = currentEl;
        }
        return array;
    }
    
    public int[] generateDescendingArray(int size){
        int[] array = new int[size];
        Random rand = new Random();
        int currentEl = size*5;
        for(int i = 0; i<size; i++){
            currentEl-=((Math.abs(rand.nextInt()))%5);
            array[i] = currentEl;
        }
        return array;
    }
    
    public int[] generateLowVariantArray(int size){
        int[] array = new int [size];
        int lowVar = (int) Math.sqrt(size);
        int amplitude = (int) Math.ceil(size/lowVar);
        Random rand = new Random();
        for(int i = 0; i<size; i++){
            array[i] = Math.abs(rand.nextInt())%amplitude;
        }
        return array;
    }
    
    public boolean isSorted(int arr[]){
        for(int i = 0; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
