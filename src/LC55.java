class LC55 {
    public boolean canJump(int[] arr) {

        int max = 0;

        for(int i = 0 ; i<arr.length  && i<= max ; i++ ){

            System.out.println("i = " + i);

            if(max >= arr.length-1){

                return true;

            }

            if( max < arr[i]+i ){

                max = arr[i]+i;

            }

        }

        System.out.println(max);


        return false;



    }
}