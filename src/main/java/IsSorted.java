public class IsSorted {
    /**
     * Return true if arr is sorted, smallest to largest, false otherwise.
     * For example, {1,2,3,4} is storted but {1,2,4,3} is unsorted
     *
     * @param arr an int array
     * @return true if arr is sorted (all the numbers are in order). false if arr is not sorted.
     */
    public boolean checkSort(int[] arr){
        int i = 0;
        int a = arr[0];
        boolean True = true;
        boolean False = false;
        boolean b = true;


        while (i < arr.length){
    
            if (arr[i] < arr[i+1]){
                b = True; 
                break;
            }
            else if (arr[i]>arr[i+1]) { 
                b = False;
                break;
            }
            else{
                b = False;
            }
            i++;
        }
        return b;
    }
}
