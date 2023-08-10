class helper implements MountainArray{


    int[] arr ;

    helper(){

        arr = new int[]{1,2,3,4,5,3,1};

    }

    @Override
    public int get(int index) {
        return arr[index];
    }

    @Override
    public int length() {
        return arr.length;
    }


}


public class Main {


    public static void main(String[] args) {

//        MountainArray obj = new helper();
//
//        LC1095 obj1 = new LC1095();
//        int ans  = obj1.findInMountainArray(3 , obj);
//        System.out.println(ans);

        LC153_1 obj = new LC153_1();
        int[] arr = {4,5,6,7,0,1,2};
        int idx = obj.findMin(arr);

        System.out.println(arr[idx]);
    }




}


interface MountainArray{

    public int get(int index);
    public int length();

}
