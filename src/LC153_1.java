class LC153_1 {
    public int findMin(int[] arr) {

        if(arr[0] <= arr[arr.length-1]){

            return arr[0];
        }


        int start = 0;
        int end = arr.length-1;

        while(end - start > 1){

            System.out.println("start " + start + "   " + "end  " + end);

            int mid = (start + end )/2;

            if(arr[start] <= arr[mid]){


                start = mid;


            }else{

                end = mid;


            }

        }

        return arr[end];



    }

}