
package sorting;

/**
 * BubbleSort:
 * bubbleSort is a local changes based sorting algorithm that swaps adjacent 
 * elements that are out of order, it is ussually the slower of the algorithm
 * in this project for general case tests, the best case is when the array is
 * sorted ascendingly.
 * 
 * The general complexity of Bubblesort is O(n^2)
 * @author wwvargas
 */
public class BubbleSort implements Sorter{
    public int array[];
    
    private long comp, access, iter, swaps;
    public BubbleSort(int a[]){
        if(a.length>0){
            this.array = a;
        }
        else throw new IllegalArgumentException("Array must have at least one element");
        comp = 0;
        access = 0;
        iter = 0;
        swaps = 0;
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
        access = 0;
        swaps = 0;
        iter = 0;
        int aux, aux1;
        boolean swapped;
        do{
            swapped= false;
            aux = this.array[0];
            access++;
            for(int i = 1; i<this.array.length; i++){
                aux1 = this.array[i];
                access++;
                comp++;
                if(aux>aux1){
                    swaps++;
                    access+=2;
                    this.array[i] = aux;
                    this.array[i-1] = aux1;
                    swapped = true;
                }
                aux = aux1;
                
            }
            iter++;
        }while(swapped);
        
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
