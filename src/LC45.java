class LC45 {
    public int jump(int[] arr) {


        int left = 0;
        int right = 0;

        int max = Integer.MIN_VALUE;
        int count = 0;

        while(right < arr.length-1){

            for(int i = left ; i <= right ; i++)
                max = Math.max(max , arr[i]+i);

            count++;
            left =right+1;
            right = max;


        }

        return count;



    }
}