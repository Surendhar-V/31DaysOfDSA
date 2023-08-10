class LC33 {
    public static int search(int[] arr, int target)
    {

        if( arr.length == 1 ){

            if(arr[0] == target){

                return 0;

            }else{

                return -1;

            }
        }


        if(arr[0] <= arr[arr.length-1]){

            return binarySearch(arr , 0 , arr.length-1 , target);

        }


        int peek = findPeek( arr );

        System.out.println("peek = " + arr[peek]);


        int m =  binarySearch(arr , 0 ,peek , target);
        int n =  binarySearch(arr , peek+1 , arr.length-1 ,target);

        return Math.max(m , n);


    }

    public static int binarySearch(int[] arr ,int start , int end ,int target){

        while(start <= end){

            int mid = (start + end )/2;


            if(arr[mid] < target){

                start = mid+1;

            }else if(arr[mid] > target){

                end = mid-1;


            }else{

                return mid;


            }


        }


        return -1;



    }

    public static int findPeek(int[] arr){

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

        return start;




    }

}