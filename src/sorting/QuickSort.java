
package sorting;

import java.util.Random;

/**
 * Quicksort:
 * Quicksort is the fastest O(n*log(n)) algorithm for the general case. It divide
 * the array in three partitions according to some element from the array called
 * pivot, that can be any of the array elements, the three partitions are, the 
 * elements smaller than pivot, the own pivot and the elements that are greater
 * than pivot. The smaller and greater partitions are sorted recursivelly using
 * quicksort.
 * 
 * Although quicksort is simple and generally fast, it have a weak point, when 
 * the internal arrays is sorted, either ascendingly either descendingly, it goes
 * to it wors case, when one of the partitions always have the same number of 
 * elements minus one and this elevates the complexity of quicksort to O(n^2)
 * 
 * P.S.: In this class I added a solution ussually used to the worst case problem,
 * that is randomizing the choose of the pivot and I have also added a personal 
 * optimization of the process using some auxiliar function that make the general
 * case process faster and the worst case a linear time process.
 * 
 * @author wwvargas
 */
public class QuickSort implements Sorter{
    public int array[];
    private long comp, access, iter, swaps;
    public QuickSort(int a[]){
        if(a.length>0){
            this.array = a;
            comp = 0;
            access = 0;
            iter = 0;
            swaps = 0;
        }
        else throw new IllegalArgumentException("Array must have at least one element");
    }
    
    @Override
    public void setArray(int a[]){
        if(a.length>0){
            this.array = a;
        }
        else throw new IllegalArgumentException("Array must have at least one element");
    }
    
   
    //default Quicksort
    @Override
    public void Sort(){
        comp = 0;
        access = 0;
        iter = 0;
        swaps = 0;
        quickSort(0, this.array.length);
        
    }
        
    //default Quicksort
    private void quickSort(int l, int h){
        int p;
        if(l<h){
            iter+=2;
            p = partition(l, h);
            quickSort(l, p);
            quickSort(p+1, h);
            
        }
        
        
    }
    
    //partitio fuction, the same is used to the three implementations
    private int partition(int l, int h){
        
        
        int pivot = this.array[l];
        access++;
        int i = l-1, j = h;
        
        int low, high;
        
        while(true){
            
            do{
                
                i++;
                low = this.array[i];
                comp++;
                access++;
            }while(low<pivot);
            
            do{
                j--;
                access++;
                comp++;
                high = this.array[j];
                
            }while(high>pivot);
            
            if(i>=j){
                break;
            }
            swaps++;
            this.array[i] = high;
            this.array[j] = low;
            
                
        }
        swaps++;
        this.array[l] = high;
        this.array[j] = pivot;
        return j;
        
    }
    
    //randomized version of the quicksort
    public void QuickSort_R(){
        comp = 0;
        access = 0;
        iter = 0;
        swaps = 0;
        
        quickSortRand(0, this.array.length);
        
    }
    
    private void quickSortRand(int l, int h){
        int p;
        
        //randomization
        
        if(h-l == 0){
            return;
        }
        Random r = new Random();
        
        int rand = Math.abs(r.nextInt())%(h-l);
        int aux = this.array[l+rand];
        this.array[l+rand] = this.array[l];
        this.array[l] = aux;
        //normal quickSort
        if(l<h){
            p = partition(l, h);
            iter+=2;
            quickSortRand(l, p);
            quickSortRand(p+1, h);
            
        }
    }
    
    
    /**
     * personal optimization of quicksort, it uses the following ideas:
     * 
     * For each partition the algorithm check if it is sorted ascendingly or
     * descendingly, if yes the default process is not needed, just an invertion
     * when descendingly
     * 
     * When the partition gets smaller the algorithm avoid doing recursions and 
     * tries to simplify the process using InsertionSort, that is ussually faster
     * for such cases.  
     * 
     */
    public void O_QuickSort(){
        
        comp = 0;
        access = 0;
        iter = 0;
        swaps = 0;
        OptQuickSort(0, this.array.length);
        
        
    }
    
    private void OptQuickSort(int l, int h){
        
        int p;
        if(h-l <= 1){
            return;
        }
        
        if(isOrdered(l, h)){
            return;
        }
        
        
        if(h-l<64){
            
            
            for(int i = l; i<h; i++){
                int key = array[i];
                int j = i-1;
                while(j>=0 && key<array[j]){
                    array[j+1] = array[j];
                    j--;
                }
                j++;
                array[j] = key;
            
            
            }
            
        }
        
        
        else if(l<h){
            
            if(h-l>=3){
                //Look for a median element
                access+=3;
                
                if((this.array[l+1]>this.array[l] && this.array[l+1]<this.array[l+2]) || 
                   (this.array[l+1]>this.array[l+2] && this.array[l+1]<this.array[l])){
                    comp+=2;
                    swaps++;
                    int temp = this.array[l];
                    this.array[l] = this.array[l+1];
                    this.array[l+1] = temp;
                }
                
                if((this.array[l+2]>this.array[l] && this.array[l+2]<this.array[l+1]) || 
                   (this.array[l+2]>this.array[l+1] && this.array[l+2]<this.array[l])){
                    comp+=2;
                    swaps++;
                    int temp = this.array[l];
                    this.array[l] = this.array[l+2];
                    this.array[l+2] = temp;
                }
            
            }
            p = partition(l, h);
            if(p-l>1){
                iter++;
                OptQuickSort(l, p);
            }
            if(h-p>2){
                iter++;
                OptQuickSort(p+1, h);
            }
        }
        
    }
    
    private boolean isOrdered(int l, int h){
        int tester = this.array[l], aux;
        access+=2;
        comp++;
        if(this.array[l]<=this.array[h-1]){
            for(int i = l+1; i<h; i++){
                aux = this.array[i];
                access++;
                comp++;
                if(aux<tester)
                    return false;
                tester = aux;
            }

            return true;
        }
        else{
            for(int i = l+1; i<h; i++){
                aux = this.array[i];
                access++;
                comp++;
                if(aux>tester)
                    return false;
                tester = aux;
            }

            revert(l, h-1);
            return true;
        }
    }
    private void revert(int l, int h){
        int t;
        while(l<h){
            access+=2;
            t = this.array[l];
            
            this.array[l] = this.array[h];
            this.array[h] = t;
            swaps++;
            l++;
            h--;
                    
        }
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