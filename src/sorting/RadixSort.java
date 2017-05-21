
package sorting;

/**
 *  RadixSort 
 * Linear time sorting algorithm, adapts the idea of the Countingsort, it counts
 * the number by its digits starting on the units, growing to the maximum position
 * @author wwvargas
 */
public class RadixSort implements Sorter{
    private int array[];
    private long comp, access, iter, swaps;
    
    public RadixSort(int a[]){
        if(a.length>0){
            this.array = a;
            comp = 0;
            access=0;
            swaps=0;
            iter=0;
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

    @Override
    public void Sort()
    {
        comp = 0;
        access=0;
        swaps=0;
        iter=0;
        // Find the maximum number to know number of digits
        int m = this.max();
 
        // Do counting sort for every digit. Note that instead
        // of passing digit number, exp is passed. exp is 10^i
        // where i is current digit number
        int t = 0;
        for (int pos = 1;m/pos>0;pos*=10){
            countingSort(pos);
        }
    }
    /**
     * max()
     * @return the greater number within the internal array
     */
    private int max(){
        int gr = this.array[0];
        access++;
        for(int i = 1; i<this.array.length; i++){
            if(this.array[i]>gr){
                access++;
                gr = this.array[i];
            }
        }
        
        return gr;
    }
    /**
     * countingSort(int pos):
     * uses the countingSort idea for each position element's digits from the
     * internal array, so it separate them based on the digit of position pos
     * @param pos is a power of 10 that represents the position of the current
     * analized digit
     */
    private void countingSort(int pos)
    {
        iter++;
        int output[] = new int[this.array.length]; // output array
        int count[] = new int[10];
        
        for(int i = 0; i<10; i++){
            count[i] = 0;
        }
        // Store count of occurrences in count[]
        for (int i = 0; i < this.array.length; i++){
            count[(this.array[i]/pos)%10]++;
            access++;
        }
 
        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];
 
        // Build the output array
        for (int i = this.array.length - 1; i >= 0; i--)
        {
            output[count[ (this.array[i]/pos)%10 ] - 1] = this.array[i];
            count[ (this.array[i]/pos)%10 ]--;
            access++;
        }
 
        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to curent digit
        System.arraycopy(output, 0, this.array, 0, this.array.length);
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
