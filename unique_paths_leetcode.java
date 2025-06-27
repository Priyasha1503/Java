
//https://leetcode.com/problems/unique-paths/

import java.util.*;
class Solution {
    public int uniquePaths(int m, int n) {
        //USED MEMOIZATION
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
        Arrays.fill(dp[i],-1);}
        int res=rec(0,0,m-1,n-1,dp);
        return res;
    }
    public int rec(int row,int col,int m,int n,int[][] dp)
    {
        if(row>m ||col>n)
        return 0;
        else if(row==m && col==n)//caame to last row and last col
        return 1;
        else if(dp[row][col]!=-1)
        return dp[row][col];
        else
        {
            int x=rec(row+1,col,m,n,dp);
            int y=rec(row,col+1,m,n,dp);
            dp[row][col]=x+y;
            return dp[row][col];
        }
    }
}
