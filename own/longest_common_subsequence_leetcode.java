
//https://leetcode.com/problems/longest-common-subsequence/

//BRUTEFORCE
/*class Solution {

    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int res=0;
        res=LCS(text1,text2,m,n);
        return res;
        
    }

    public int LCS(String text1,String text2,int m,int n)
    {
        if(m==0||n==0) return 0;
        int maxs=1;
        if(text1.charAt(m-1)==text2.charAt(n-1))
        {
            return LCS(text1,text2,m-1,n-1)+1;
        }
        else
        {
            int a=LCS(text1,text2,m-1,n);
            int b=LCS(text1,text2,m,n-1);
            maxs= Math.max(a,b);
            return maxs;
        }
    }
}*/
///MEMOIZATION
class Solution {
    public int longestCommonSubsequence(String text1, String text2)
    {
        int m=text1.length();
        int n=text2.length();
        int [][] dp = new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
        Arrays.fill(dp[i],-1);}
        int res=0;
        res=LCS(text1,text2,m,n,dp);
        return res;
    }
    public int LCS(String text1,String text2,int m,int n,int[][] dp)
    {
        int maxs=1;
        if (m==0||n==0) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        else if(text1.charAt(m-1)==text2.charAt(n-1))
        {
            dp[m][n]=LCS(text1,text2,m-1,n-1,dp)+1;
            return dp[m][n];
        }
        else
        {
            int a=LCS(text1,text2,m-1,n,dp);
            int b=LCS(text1,text2,m,n-1,dp);
            maxs= Math.max(a,b);
            dp[m][n]=maxs;
            return dp[m][n];
        }
    }
}
