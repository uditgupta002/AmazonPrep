import java.util.*;
import java.lang.*;
import java.io.*;

class SubarrayWithGivenSum {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		for(int test=0;test<testCases;test++) {
		    String[] tempDim = br.readLine().split(" ");
		    int size = Integer.parseInt(tempDim[0]);
		    int expectedSum = Integer.parseInt(tempDim[1]);
		    String[] tempArr = br.readLine().split(" ");
		    int[] arr = new int[size];
		    for(int i=0;i<size;i++) {
		        arr[i] = Integer.parseInt(tempArr[i]);
		    }
		    int startIndex = 0;
		    int endIndex = 0;
		    int currentSum = 0;
		    boolean found = false;
		    int i=0;
		    while(startIndex < size) {
		        if(currentSum == expectedSum) {
		            found = true;
		            break;
		        } else if(currentSum > expectedSum) {
		            currentSum -= arr[startIndex];
		            startIndex++;
		        } else if(currentSum < expectedSum && i < size) {
		            currentSum += arr[i];
		            endIndex = i;
		            i++;
		        } else {
		            break;
		        }
		        //System.out.println(currentSum+" start "+startIndex+" endIndex "+endIndex);     
		    }
		    
		    if(found) {
		        System.out.println((startIndex+1) +" "+ (endIndex+1));
		    } else 
		        System.out.println("-1");
		    
		}
	}
}
