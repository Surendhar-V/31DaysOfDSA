import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        LC50 obj = new LC50();
//        double result = obj.myPow(2.0 ,10);

        LC238 obj = new LC238();
        int[] result = obj.productExceptSelf(new int[] {1,2,3,4});

        System.out.println(Arrays.toString(result));
    }

}
