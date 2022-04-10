import java.util.ArrayList;
import java.util.*;
public class Arrays_code {
    //main
    public static void main(String[] args) {


        int arr[] = { 1 , 2 , 3 ,4 ,8 ,6}; // it gives false
        int arr1[] = { 1 , 2 ,2 , 3 ,4 ,4 ,5 ,6}; // it gives true

//        System.out.println(Sorted(arr1 , 0));

//        System.out.println(Search(arr1 , 0 , 5));

//        FindAllIndex(arr1 , 0 , 4);
//        System.out.println(list);

        System.out.println(FindAllIndex_1(arr1 , 4 , 0 , new ArrayList<>()));
        //here answer is list ...

        //rotated array list
        int arr3[] = {5,6,7,8,9,1,2,3};
        int start = 0;
        int end = arr3.length-1;
        System.out.println(binarySearchRotated(arr3 , start , end , 3));

    }


    //methods ...
//Array is sorted or not
    static boolean Sorted(int arr[ ] , int index){
        if(index == arr.length - 1) return true;

        return arr[index] <= arr[index+1] && Sorted(arr , index+1);
    }


    //linear search
    static int Search(int arr[] , int index , int target ){
        if(index == arr.length )  return -1;

        if (arr[index] == target) return index ;
        else return Search(arr , index+1 , target);
    }

    //Find all index of given number

    static ArrayList<Integer> list = new ArrayList();
    static void FindAllIndex( int arr[] , int index , int target){

        if(index == arr.length) return;

        if(arr[index] == target) list.add(index);

        FindAllIndex(arr , index+1  , target );

    }
    // another approch to find all the index into list
    // return a list ...
    static ArrayList<Integer> FindAllIndex_1 ( int arr[] , int target , int index , ArrayList<Integer> list ){
        if(index == arr.length) return list;
        if(arr[index] == target) list.add(index);

        // 1] now if the arr[index] == target the index will added too the list and return the array list
        // which is fill with the target (index)
        // 2] also with every call the reference variable are created but these all call are pointing to
        // the same object of the list .... which is created only once ...
        return FindAllIndex_1(arr , target , index+1,list);
    }

    //binary search with rotated array list
    static int binarySearchRotated( int arr[] , int start , int end , int target){
        if(start > end ) return -1;

        int mid = start + ( end - start )/2;
        if(arr[mid] == target ) return mid;

        if(arr[start] <= arr[mid]){
            if(target >= arr[start] && target <= arr[mid]){
                return binarySearchRotated(arr , start , mid-1 , target);
            }else {
                return binarySearchRotated(arr , mid+1 , end , target);
            }
        }
        if(target >= arr[mid] && target <= arr[end]){
            return binarySearchRotated(arr ,mid+1  , end , target);
        }
        return binarySearchRotated(arr , start , mid-1 , target);

    }
}















