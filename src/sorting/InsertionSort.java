
package sorting;

/**
 * InsertionSort:
 * Insertionsort is a simple algorithm by comparisons and changes dividing the
 * array by two hipothetical parts, the first that is sorted and the second that
 * will be sorted, the process goes one by one element of the second part and 
 * insert it in the first part so that it remains sorted
 * 
 * InsertionSort has complexity of O(n^2)
 * 
 * @author wwvargas
 */
public class InsertionSort implements Sorter{
    private long comp, access, iter, swaps;
    public int array[];
    public InsertionSort(int arr[]){
        this.array = arr;
        comp = 0;
        access = 0;
        iter = 0;
        swaps = 0;
    }
    
    @Override
    public void setArray(int arr[]){
        this.array = arr;
    }
    
    @Override
    public void Sort(){
        
        comp = 0;
        access = 0;
        iter = 0;
        swaps = 0;
        for(int i = 1; i<array.length; i++){
            int key = array[i];
            int j = i-1;
            access+=2;
            comp++;
            iter++;
            while(j>=0 && key<array[j]){
                comp++;
                array[j+1] = array[j];
                swaps++;
                j--;
            }
            j++;
            array[j] = key;
            access++;
            
           
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
