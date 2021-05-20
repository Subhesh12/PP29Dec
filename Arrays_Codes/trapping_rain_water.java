package Arrays2;

public class trapping_rain_water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	   public int trap(int[] height) {
	        int i =0;
	        int j = height.length-1;
	        
	        int prefixmax =0;
	        int suffixmax = 0;
	        
	        int ans = 0;
	        
	        while(i < j){
	            prefixmax = Math.max(prefixmax,height[i]);
	            suffixmax = Math.max(suffixmax, height[j]);
	            
	            if(prefixmax <= suffixmax){
	                ans = ans + (prefixmax - height[i]);
	                i++;
	            }else{
	                ans = ans + (suffixmax - height[j]);
	                j--;
	            }
	        }
	        
	        return ans;
	    }

}
