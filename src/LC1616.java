class LC1616 {
    public static boolean checkPalindromeFormation(String a, String b) {

        boolean res = false;

        int i = 0;
        int j = b.length()-1;

        while(i<j &&  a.charAt(i) == b.charAt(j)){

            i++;
            j--;

        }

        if(i>j)
            return true;

        res |= isPalindrome(b.substring(i , j+1));
        res |= isPalindrome(a.substring(i , j+1));

        i = a.length()-1;
        j = 0;

        while( i>j &&  a.charAt(i) == b.charAt(j)){

            i--;
            j++;

        }

        if(i < j)
            return true;

        res |= isPalindrome(a.substring( j , i+1));
        res |= isPalindrome(b.substring(j , i+1));

        return res;

    }








    public static boolean isPalindrome(String s ){

        int i =0 ;
        int j = s.length()-1;


        while(i<j){

            if(s.charAt(i) != s.charAt(j)){


                return false;

            }

            i++;
            j--;



        }


        return true;


    }


}