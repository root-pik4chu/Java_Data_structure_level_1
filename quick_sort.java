import java.util.Arrays;

public class quick_sort {

    public static void main(String[] args) {

    int [] arr = { 5,4,3,2,1};
    Sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    static void Sort(int[] arr , int low , int high){
        if(low >= high) return;
        // main pointer are the low and high .....
        // these are only the pointers
        int start = low;
        int end = high;

        int mid = start + (end - start)/2;
        /*
        /pivot = its random element but its condition is like the other element
        in arr[] lower element are left to the pivot and the higher ot greater element
        in arr[] should be on right
        eg.
        arr[] = {5,7,4,2,8};
        pivot = 4;

        then
        pivot -> choose random element from arr[]
        {2,4,5,8,7} -----> see like this....

         */
        int pivot = arr[mid];

        while(start <= end){
            while(arr[start] < pivot){
                start++;
            }
            while (arr[end] > pivot){
                end--;
            }

            if(start <= end ){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }

        Sort(arr , low , end);
        Sort(arr , start , high);

    }
// pikahu yo bro

}
