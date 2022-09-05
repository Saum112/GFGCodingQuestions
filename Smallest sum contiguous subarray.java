class Solution
{
    static int smallestSumSubarray(int a[], int size)
    {
        // your code here
        
        
        int min_till = 0 , min_val = Integer.MAX_VALUE;
        
        for(int i = 0 ; i < size ; i++){
            
             if(min_till > 0){
                
                min_till = a[i];
            }
            
            else{
                
                min_till += a[i];
            }
            
            if(min_till < min_val)
                min_val = min_till;   
                
            
        }
        
        return min_val;
    }
}
