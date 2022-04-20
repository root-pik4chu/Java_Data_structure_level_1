import java.util.*;
public class Sorting {

    static void Sorting(int [] arr ){
        for(int i=0 ; i< arr.length-1 ; i++){
            int lastIndex = arr.length -i -1 ;
            int max = GetMaxElement(arr , 0 , lastIndex);
            swap(arr, max , lastIndex);
        }
    }

    static int GetMaxElement( int[] arr , int start , int end){

        int max = start;
        for(int i = start ; i <= end ; i++){
            if(arr[max] < arr[i]) max = i;
        }
        return max;
    }

    static void swap(int [] arr , int first , int second){
        int temp = arr[first];
        arr[first]  = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {

        //Selection sort
        int [] arr ={5,4,3,2,1};
        Sorting(arr);
        System.out.println(Arrays.toString(arr));

    }
}
