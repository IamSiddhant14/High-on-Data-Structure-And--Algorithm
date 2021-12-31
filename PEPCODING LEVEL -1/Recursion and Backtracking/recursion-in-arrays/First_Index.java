import java.io.*;x
import java.util.*;

public class First_Index {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int [] arr = new int[n];

        for( int i =0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int x = scn.nextInt();

        System.out.println(firstIndex(arr,0 ,x));
        
    }

    public static int firstIndex(int[] arr, int idx, int x){

        if( idx == arr.length ){

            return -1;

        }
        
        if( arr[idx] == x ){

            return idx;
            
        }

        int val = firstIndex(arr, idx+1 ,x);

        return val ;


    }

}