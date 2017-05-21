
package sorting;

/**
 * MergeSort:
 * Mergesort is a typical example of divide and conquer algorithm. It divide the
 * array by two until each partition is as small as possible and then merge them
 * comsidering that each partition are sorted. The general problem has complexity
 * of O(n*log(n))
 * @author wwvargas
 */
public class MergeSort implements Sorter{
    public int array[];
    public int aux[];
    private long comp, access, iter, swaps;
    public MergeSort(int a[]){
        if(a.length>0){
            this.array = a;
            this.aux = new int [a.length];
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
            this.aux = new int [a.length];
        }
        else throw new IllegalArgumentException("Array must have at least one element");
    }
    
    @Override
    public void Sort(){
        comp = 0;
        access=0;
        swaps=0;
        iter=0;
        mergeSort(0, this.array.length-1);
        
    }
    
    /**
     * mergesort() divide the array by two
     * @param l represents the inferior limit of the partition
     * @param h represents the superir limit of the partition
     * so partition = array[l..h]
     */
    private void mergeSort(int l, int h){
        if(l<h){
            int mid = l + (h - l)/2;
            mergeSort(l, mid);
            mergeSort(mid+1, h);
            iter+=2;
            merge(l, mid, h);
        }
    }
    /**
     * merge() merge two sorted partitions in a single sorted partition
     * @param l inferior limit
     * @param m median value used when this partitions was divided
     * @param h superior limit
     */
    private void merge(int l, int m, int h){
        for(int i = l; i<=h; i++){
            this.aux[i] = this.array[i];
            access+=2;
        }
        int i = l;
        int j = m + 1;
        int k = l;
        while (i <= m && j <= h) {
            comp++;
            access+=3;
            if (this.aux[i] <= this.aux[j]) {
                swaps++;
                this.array[k] = this.aux[i];
                
                    i++;
            } else {
                swaps++;
                this.array[k] = this.aux[j];
                j++;
            }
            k++;
        }
        while (i <= m) {
            swaps++;
            access+=2;
            this.array[k] = this.aux[i];
            k++;
            i++;
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
