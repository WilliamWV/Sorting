
package sorting;

/**
 * Interface Sorter:
 * Organize requirements for all sorting classes in this project 
 * @author wwvargas
 */
public interface Sorter {
    /**
     * setArray: sets the array a as the internal array, the one that will be 
     * sorted, of a class as the passed array a
     * @param a array to set as the internal array of the class
     */
    public void setArray(int a[]);
    /**
     * Sort(): sorts the internal array following each class method
     */
    public void Sort();
    /**
     * getStats(): usefull for estatistical analize, it return four useful values
     * when comparing algorithm, the values always should reffers to the last
     * sorting process made by the class, and should follow the standard bellow:
     * @return 
     *  [0] -> memory accesses on the array when it is being sorted
     *  [1] -> comparisons made while soting the array, naturally when the 
     *      algorithm is not by comparison, like radix sort, this number will 
     *      be zero
     *  [2] -> swaps done while sorting the array 
     *  [3] -> iterations or recursions done, depending of the algorithm
     */
    public long[] getStats();
}