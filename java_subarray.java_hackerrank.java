#https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //checking the subarray and its sum
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            int sums=0;
            for(int j=i;j<n;j++)
            {
               // System.out.print(arr[j]);
                sums=sums+arr[j];
                 if (sums<0)//sums is negative
            {
                    cnt=cnt+1;
            }
                
            }
            
        /*if (sums<0)//sums is negative
            {
                cnt=cnt+1;
            }*/
            
        }
        
        System.out.println(cnt);
        
    }
}
