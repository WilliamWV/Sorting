
package sorting;

import java.util.LinkedList;

/**
 * ShellSort:
 * Shellsort was invented by Donald Shell in 1959 and is the fastest O(n^2) algorithm
 * used in this project, it is basically an adaptation of InsertionSort, that 
 * goes from the principle that it is really fast with small arrays, so what 
 * shellSort does is divide the array using gaps, that starts with some value and
 * goes down until one. The optimal value for the gaps sequence still unknown. Here
 * is used one of the fastest sequences that is 
 * Math.ceil((Math.pow(9, k) - Math.pow(4, k))/(5 * Math.pow(4, k-1)))
 * 
 * Then for each value of gaps the algorithm sorts the elements in these partitions
 * 
 * @author wwvargas
 */
public class ShellSort implements Sorter{
    public int array[];
    private long comp, access, iter, swaps;
    public LinkedList<Integer> gaps = new LinkedList<>();
    
    public ShellSort(int arr[]){
        
        this.array = arr;
        comp = 0;
        access = 0;
        iter = 0;
        swaps = 0;
        int gap = 1;
        int k = 2;
        //determine the sequence of gaps 
        do{
            
            gaps.add(gap);
            gap =(int) Math.ceil((Math.pow(9, k) - Math.pow(4, k))/(5 * Math.pow(4, k-1)));
            k++;
        }while (arr.length>gap);
        
        
    }
    @Override
    public void setArray(int[] a) {
        this.array = a;
        int gap = 1;
        int k = 2;
        do{
            
            gaps.add(gap);
            gap =(int) Math.ceil((Math.pow(9, k) - Math.pow(4, k))/(5 * Math.pow(4, k-1)));
            k++;
        }while (a.length>gap);
    }
    
    @Override
    public void Sort(){
        //for each gap do a gapped insertion sort
        //whith the gap size
        comp = 0;
        access = 0;
        iter = 0;
        swaps = 0;
        int s = gaps.size();
        int i = s-1, gap;
        do{ 
            gap = gaps.get(i);
            iter++;
            for(int j = gap; j<this.array.length; j++){
                int key = array[j];
                access++;
                
                int k;
                comp++;
                for(k = j; k>=gap && array[k-gap]>key; k-=gap)
                {
                    comp++;
                    access+=2;
                    swaps++;
                    array[k] = array[k-gap];
                }
                access++;
                array[k] = key;
            }
            i--;
        }while(i>=0 && gap>1);
        
        
    }
    @Override
    public long[] getStats(){
        long ret[] = new long[4];
        ret[0] = this.access;
        ret[1] = this.comp;
        ret[2] = this.swaps;
        ret[3] = this.iter;
        return ret;
    }

    
}
