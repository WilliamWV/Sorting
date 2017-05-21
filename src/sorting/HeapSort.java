
package sorting;

/**
 *  HeapSort:
 *  Heapsort introduces an interesting idea to sorting problems, it uses a data
 *  structure called heap, that is basically a tree in which all the descendents
 *  of a node is smaller or greater than it, depending of the program requests.
 *  In this case is used a max-heap (the root is greater than all its descendents)
 *  to sort the array.
 *  HeapSort has complexity n*log(n)
 * @author wwvargas
 */
public class HeapSort implements Sorter{
    int array[], n;
    private long comp, access, iter, swaps;
    
    HeapSort(int a[]){
        
        if(a.length>0){
            comp = 0;
            access=0;
            swaps=0;
            iter=0;
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
    
    //Sort function
    @Override
    public void Sort(){
        
        n = this.array.length -1;
        
        comp = 0;
        access=0;
        swaps=0;
        iter=0;
        
        buildHeap();
        for(int i = n; i>0; i--){
            exchange(0, i);
            n = n-1;
            maxHeap(0);
        }
        
    }
    //Build a heap where the sons of a node are always smaller than it
    private void buildHeap(){
        int last = n;
        for (int i = last/2; i>=0; i--){
            maxHeap(i);
        }
    }
    //Select the greater node of a descendency of nodes and put it as the root of
    //this descendency
    private void maxHeap(int index){
        int left = 2*index;
        int right = 2*index+1;
        int greater = index;
        iter++;
        access+=2;
        comp++;
        if(left<=n && this.array[left]>this.array[index]){
            greater = left;
        }
        comp++;
        access+=2;
        if(right<=n && this.array[right]>this.array[greater]){
            greater = right;
        }
        
        if(greater != index){
            exchange(index, greater);
            maxHeap(greater);
        }
    }
    //exchanges the position of two elements on the array
    private void exchange(int i, int g){
        int t = this.array[i];
        swaps++;
        access+=2;
        this.array[i] = this.array[g];
        this.array[g] = t;
        
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
