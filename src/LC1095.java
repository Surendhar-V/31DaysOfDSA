/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class LC1095 {
    public int findInMountainArray(int target, MountainArray mountainArr) {

        int peek = findPeek(mountainArr);
        int[] pos = {Integer.MAX_VALUE , Integer.MAX_VALUE};

        pos[0] = bs_a(mountainArr, target , peek);
        pos[1] = bs_d(mountainArr , target , peek+1);


        if(pos[0] == pos[1] && pos[0] == Integer.MAX_VALUE){


            return -1;

        }else{

            return Math.min(pos[0] , pos[1]);

        }
    }

    public static int findPeek(MountainArray mountainArr){

        int start = 0;
        int end = mountainArr.length()-1;

        while(start !=  end){

            int mid = (start + end )/2;

            if(mountainArr.get(mid+1) > mountainArr.get(mid) ){


                start = mid+1;

            }else{

                end = mid;
            }

        }

        return start;




    }


    public static int bs_a(MountainArray mountainArr , int search , int end){

        int start = 0;

        while(start <= end){

            int mid = (start + end)/2;


            if(search>mountainArr.get(mid)){

                start = mid+1;

            }else if(mountainArr.get(mid) > search){

                end = mid-1;

            }else{

                return mid;

            }

        }

        return Integer.MAX_VALUE;


    }


    public static int bs_d(MountainArray mountainArr, int search , int start){

        int end = mountainArr.length()-1;

        while(start <= end){

            int mid = (start + end)/2;

            if(search< mountainArr.get(mid)){

                start = mid+1;

            }else if(mountainArr.get(mid) < search){

                end = mid-1;

            }else{

                return mid;

            }
        }

        return Integer.MAX_VALUE;

    }

}