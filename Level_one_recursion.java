public class Level_one_recursion {

    static void num(int n){

        if( n == 0){
            return ;
        }
        System.out.println(n);
        num(n-1);

    }

    static void numRev(int n){

        if( n == 0){
            return ;
        }
        numRev(n-1);
        System.out.println(n);

    }

    static int Fact(int n){
        if( n == 1 ) return  1;
        return n * Fact(n-1);
    }

    static int fibonacci(int n){

        if(n < 2) return  n;
        return fibonacci(n-1)+ fibonacci(n-2);
    }

    static int BinarySearch(int start , int end , int arr[] , int target){

        if(start >  end ) return -1;

        int mid = start + (end - start) / 2;
        if(arr[mid] == target) return mid;

        if(arr[mid] > target){
            return BinarySearch(start , mid -1 , arr, target);
        }return BinarySearch(mid+1 , end , arr , target);

    }

    static int SumOfDigit(int n){

        if(n == 0) return  0;
        return SumOfDigit(n/10) + (n%10);


    }

    static int ProductOfNumber(int n){
        if( n % 10 == n) return  n;
        return n%10 * ProductOfNumber(n/10)  ;
    }

    //reverse a number way 1
    static  int sum = 0;
    static void ReverseNo(int n){
        if(n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        ReverseNo(n/10);
    }

    /*

    count the number rof zeros present in the number
    1010203 ----> input
    3 ---> output

     */
//  upper comment for count question

    static int count( int n ){

        return helper(n , 0);
    }

    static int helper(int n , int c){
        if(n == 0 ) return c;
        int rem = n % 10;
        if(rem == 0) {
            return helper(n/10 , c+1);
        }
        return helper(n/10 , c);
    }


    //leet code question |

//Number of Steps to Reduce a Number to Zero
    /*
    Input: num = 14
Output: 6
Explanation:
Step 1) 14 is even; divide by 2 and obtain 7.
Step 2) 7 is odd; subtract 1 and obtain 6.
Step 3) 6 is even; divide by 2 and obtain 3.
Step 4) 3 is odd; subtract 1 and obtain 2.
Step 5) 2 is even; divide by 2 and obtain 1.
Step 6) 1 is odd; subtract 1 and obtain 0.

return steps =6
     */
    static int NumberOfrSteps(int num){
        return helper_1(num , 0);
    }

    static int helper_1(int num , int steps){
        if(num == 0){
            return steps;
        }
        if(num % 2 == 0){
            return helper_1(num/2 ,steps+1);
        }
        return helper_1(num -1 , steps+1);
    }



    public static void main(String[] args) {

//        num(6);

//        numRev(6);

//        System.out.println(Fact(5));

//        System.out.println(fibonacci(7));

//        System.out.println(SumOfDigit(5342));

//        System.out.println(ProductOfNumber(1234));

        ReverseNo(4321);
//        System.out.println(sum);

//        System.out.println(count(302000000));

        System.out.println(NumberOfrSteps(14));


        int arr[] = { 1 ,2,3,4,5,6,7};
        int start = 0 ;
        int end = arr.length;
//        int target = 5;
//        System.out.println(BinarySearch(start , end, arr , 7));


    }
}


