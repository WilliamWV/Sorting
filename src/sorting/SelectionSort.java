
package sorting;

/**
 *  SelectionSort:
 *  Selectionsort is a simple algorithm that in each step chooses the smaller
 *  value that wasnot sorted and put it in the first poition that wasnot sorted.
 *  The complexity of SelectionSort is O(n^2)
 * @author wwvargas
 */
public class SelectionSort implements Sorter{
    public int array[];
    private long comp, access, iter, swaps;
    public SelectionSort(int a[]){
        if(a.length>0){
            comp = 0;
            access = 0;
            iter = 0;
            swaps = 0;
            this.array = a;
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
        access = 0;
        iter = 0;
        swaps = 0;
        int currentPos = 0, current, small, first, smallPos;
        while(currentPos<this.array.length-1){
            first = this.array[currentPos];
            access++;
            iter++;
            small = first;
            smallPos = currentPos;
            for(int i = currentPos+1; i<this.array.length; i++){
                current = this.array[i];
                access++;
                comp++;
                if(current<small){
                    
                    small = current;
                    smallPos = i;
                }
            }
            if(currentPos!=smallPos){
                access+=2;
                swaps++;
                this.array[currentPos] = small;
                this.array[smallPos] = first;
            }
            currentPos++;
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
