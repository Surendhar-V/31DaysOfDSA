class LC238 {
    public int[] productExceptSelf(int[] nums) {

        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        //Inserting values in left 
        left[0] = 1;
        left[1] = nums[0];


        for(int i = 2 ; i<nums.length;i++){
            left[i] = nums[i-1] * left[i-1];
        }

        //Inserting values in right
        right[nums.length-1] = 1;
        right[nums.length-2] = nums[nums.length-1];


        for(int i = right.length-3 ; i>= 0 ; i--){
            right[i] = right[i+1] * nums[i+1];
        }

        for(int i = 0 ;i<nums.length;i++){
            nums[i] = right[i]*left[i];
        }

        return nums;

    }
}