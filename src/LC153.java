class LC153 {
    public int findMin(int[] arr) {

        int start = 0;
        int end = arr.length-1;
        int ans = Integer.MAX_VALUE;

        while(start <= end){

            int mid = (start+end)/2;

            if(arr[start] <= arr[mid]){

                ans = Math.min(arr[start] , ans);
                start = mid+1;

            }else{

                ans = Math.min(arr[mid] , ans);
                end = mid-1;


            }


        }

        return ans;

    }

}