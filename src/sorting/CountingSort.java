
package sorting;


/**
 * Countingsort:
 * countingSort introduces the linear time sorting algorithm, it is not based
 * on comparisons but it counts the number of times that each value appear inside
 * the array and sort it reconstructing the array from this counters.
 * 
 * As may be expected, it can uses large amount of memory depending of the data
 * structures used to represent the data and the total amplitude of the array
 * 
 * @author wwvargas
 */
public class CountingSort implements Sorter{
    private long comp, access, iter, swaps;
    private int array[];
    private int count[];
    private int aux[];
    public CountingSort(int a[]){
        if(a.length>0){
            this.array = a;
            this.aux = new int[a.length];
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
    public void Sort(){
        comp = 0;
        access=0;
        swaps=0;
        iter=1;
        /**Look for the grater and the lower values*/
        int greater = Integer.MIN_VALUE;
        for(int i = 0; i<this.array.length; i++){
            if(this.array[i]>greater){
                greater = this.array[i];
                access++;
            }
        }
        this.count = new int[greater+1];
        
        for(int i = 0; i<=greater; i++){
            this.count[i] =  0;
            
        }
        
        /**Count the elements*/
        
        for(int i = 0; i<this.array.length; i++){
            count[this.array[i]] =count[this.array[i]] +1;
            access++;
        }
        
        /**Acumulate the elements*/
        for(int i = 1; i<=greater; i++){
            count[i] +=count[i-1];
            access+=2;
        }
        /**Generate the result*/
        for(int i = this.array.length-1; i>=0; i--){
            if(count[array[i]]>0){
                aux[count[array[i]]-1] = this.array[i];
                count[array[i]] = count[array[i]]-1;
                access+=2;
            }
        }
        
        System.arraycopy(aux, 0, this.array, 0, this.array.length);
        
     
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
