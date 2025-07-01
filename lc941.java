class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3) return false;
        int b=0;
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]) return false;
            if(arr[i]>arr[i+1]){
                if(i==0) return false;
                count++;
                if(count==1) b=i;
            }
        }
        if((arr.length-1)-b==count) return true;
        return false;
        
    }
}
