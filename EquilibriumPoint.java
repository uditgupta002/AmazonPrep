import java.util.*;
import java.lang.*;
import java.io.*;

class EquilibriumPoint {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        for(int test=0;test<testCases;test++) {
            int arraySum = 0;
            int size = Integer.parseInt(br.readLine());
            int arr[] = new int[size];
            String tempArr[] = br.readLine().split(" ");
            for(int i=0;i<size;i++){
                arr[i] = Integer.parseInt(tempArr[i]);
                arraySum += arr[i];
            }
            if(size == 1) {
                System.out.println(1);
                continue;
            }
            
            int leftSum = arr[0];
            int rightSum = arraySum - arr[0] - arr[1];
            int i = 1;
            int index = -1;
            while(i < size-1) {
                //System.out.println(leftSum+" "+rightSum);
                if(leftSum == rightSum){
                    index = i;
                    break;
                }
                leftSum += arr[i];
                rightSum -= arr[i+1];
                i++;
            }
            
            if(index == -1) {
                System.out.println(-1);
            } else 
                System.out.println(index+1);
        }
	}
}
