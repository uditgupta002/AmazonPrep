import java.util.*;
import java.lang.*;
import java.io.*;

class Kadanes {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        for(int test=0;test<testCases;test++) {
            int size = Integer.parseInt(br.readLine());
            int arr[] = new int[size];
            String temp[] = br.readLine().split(" ");
            for(int i=0;i<size;i++){
                arr[i] = Integer.parseInt(temp[i]);
            }
            
            int maxFinal = Integer.MIN_VALUE;
            int maxSoFar=0;
        
            /* O(n3) algorithm
            for(int i=0;i<size;i++) {
                for(int j=0;j<=i;j++) {
                    maxSoFar = findSum(arr,i,j);
                    //System.out.println(maxSoFar+" i is "+i+" j is "+j);
                    if(maxSoFar >= maxFinal)
                        maxFinal = maxSoFar;
                }
            }
            */
            
            /* O(n) algorithm */
            int i=0;
            while(i < size){
                if(arr[i] + maxSoFar > arr[i])
                    maxSoFar = maxSoFar + arr[i];
                else 
                    maxSoFar = arr[i];
                if(maxSoFar > maxFinal)
                    maxFinal = maxSoFar;       
                i++;
            }
            System.out.println(maxFinal);
        }
	}
	
	public static int findSum(int[] arr,int i,int j) {
	    int accuSum = arr[j];
	    for(int ptr=j+1;ptr<=i;ptr++){
	        accuSum += arr[ptr];
	    }
	    return accuSum;
	}
}
