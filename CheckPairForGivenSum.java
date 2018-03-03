import java.util.*;
import java.lang.*;
import java.io.*;

class CheckPairForGivenSum {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        for(int test=0;test<testCases;test++) {
            String[] tempArr = br.readLine().split(" ");
            int size = Integer.parseInt(tempArr[0]);
            int expectedSum = Integer.parseInt(tempArr[1]);
            int arr[] = new int[size];
            String tempArr2[] = br.readLine().split(" ");
            for(int i=0;i<size;i++){
                arr[i] = Integer.parseInt(tempArr2[i]);
            }
            
            Set<Integer> set = new HashSet<Integer>(size);
            boolean found = false;
            for(int i=0;i<size;i++) {
                if(set.contains(expectedSum - arr[i])) {
                    found = true;
                    break;
                } else {
                    set.add(arr[i]);
                }
            }
            System.out.println(found ? "Yes":"No");
        }
	}
}
