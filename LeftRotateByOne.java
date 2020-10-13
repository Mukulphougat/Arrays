import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import javax.security.sasl.SaslServer;
import java.util.Scanner;

public class LeftRotateByOne {
    void lRotateOne(int arr[], int n){              // Solution with O(n) time complexity.
        int temp = arr[0];
        for( int i = 1 ; i < n ; i++ )
            arr[i-1] = arr[i];
        arr[n-1] = temp;
    }

    void LeftRotateByK(int arr[], int n, int k){       // Left Rotate by K Places using left rotate by one with O(n*d) time complexity. .
        for( int i = 0 ; i < k ; i++ )
            lRotateOne(arr,n);
    }

    void LeftRotate(int arr[], int n, int k){       // Sufficient Solution for left rotate by k places with O(n) time complexity
        int temp[] = new int[k];
        for( int i = 0 ; i < k ; i++ )
            temp[i] = arr[i];

        for( int i = k ; i < n ; i++ )
            arr[i - k] = arr[i];

        for( int i = 0 ; i < k ; i++ )
            arr[n - k + i] = temp[i];

    }

    void SufficientLeftRotate(int arr1[], int n1, int d){    // Most Sufficient solution with O(2n)
        reverse(arr1,0,d-1);                        // using reversal algorithm.
        reverse(arr1,d,n1-1);
        reverse(arr1,0,n1-1);
    }

    void reverse(int arr1[], int low, int high){
        while( low < high )
        {
            int temp = arr1[low];
            arr1[low] = arr1[high];
            arr1[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};

        System.out.println("Array Rotated by one.");
        LeftRotateByOne ob = new LeftRotateByOne();
        ob.lRotateOne(arr,arr.length);

        for( int i = 0 ; i < arr.length ; i++ )
            System.out.print(arr[i]+" ");

        System.out.println();
        int k = 2 ;
        System.out.println("Array Rotated by "+k+".");
        ob.LeftRotateByK(arr,arr.length,k);
        for( int i = 0 ; i < arr.length ; i++ )
            System.out.print(arr[i]+" ");


        // Solution using temp array.


        System.out.println();
        int k1 = 3;
        System.out.println("Array Rotated by "+k1+".");
        ob.LeftRotate(arr,arr.length,k1);
        for( int i = 0 ; i < arr.length ; i++ )
            System.out.print(arr[i]+" ");

        int arr1[] = {11,12,13,14,15};
        ob.SufficientLeftRotate(arr1,arr1.length,2);
        System.out.println();
        System.out.println("Most Sufficient Solution Using Reversal Algorithm: ");
        for( int i = 0 ; i < arr1.length ; i++ )
            System.out.print(arr1[i]+" ");

    }
}
