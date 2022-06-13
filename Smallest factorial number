class Solution
{
    
    boolean fact(int mid , int n){
        
        int prod = 5, c = 0;   
        
        while(prod <= mid){        
            
            c += (mid/prod);
            prod = prod*5;
            
        }
        
        return c>=n;
    }
    int findNum(int n)
    {
        // Complete this function
        if(n == 1)
        return 5;
        
        
        int lo = 0 , hi = 5*n;
        
        while(lo < hi){
            
            int mid = lo + (hi-lo)/2;
            
            if(fact(mid , n)){
                
                hi = mid;
            }
            
            else{
                
                lo = mid+1;
            }
            
        }
        
        return lo;
    }
}
