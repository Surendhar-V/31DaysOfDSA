class LC50 {
    public double myPow(double x, int n) {

        double ans = 1.0;
        long expo =n ;

        if(expo <0){
            expo = -1* expo;
        }

        while(expo> 0){

            if( (expo & 1) == 1 )
            {
                ans*=x;
                expo--;
            }
            else
            {
                x=x*x;
                expo=expo/2;
            }

        }

        if(n <0){
            return 1.0/ans;
        }

        return ans;


    }
}


/*

Here is the solution for Leetcode Problem no 50 .The very first brute force solution that comes to our mind is multiplying the base repeatedly upto N times which results in the TC of O(n).

It is very Time consuming when N = Integer.MAX_VALUE. 

We can reduce the TC of O(n) to O(log(n)) by using Binomial Expansion Algorithm.

Here X is the initial base and N is the expo(exponent).

Core idea

When the expo is Even, we are reducing the expo variable by two and multiplying the base with the base. 
When the expo is Odd, we are multiplying the obtained X(base) by the ans variable and decrement it by 1, and looping it until we get expo equal to 0.

*/