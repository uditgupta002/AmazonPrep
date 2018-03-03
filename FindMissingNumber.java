import java.util.*;
import java.lang.*;
import java.io.*;

class FindMissingNumber {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        for(int test=0;test<testCases;test++) {
            int arraySum = 0;
            int size = Integer.parseInt(br.readLine());
            String temp[] = br.readLine().split(" ");
            int arr[] = new int[temp.length];
            for(int i=0;i<temp.length;i++){
                arr[i] = Integer.parseInt(temp[i]);
                arraySum += arr[i];
            }
            
            int expectedSum = (size * (size + 1)) / 2;
            int missingNum = expectedSum - arraySum;
            
            System.out.println(missingNum); 
        }
	}
}
