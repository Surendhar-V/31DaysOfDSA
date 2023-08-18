class LC1768 {
    public String mergeAlternately(String word1, String word2) {

        String res = "";

        int i = 0;
        int j= 0;

        while(i<word1.length() && j<word2.length()){

            res+=word1.charAt(i);
            i++;
            res+=word2.charAt(j);
            j++;

        }

        while(j < word2.length()){

            res+=word2.charAt(j);
            j++;

        }

        while(i < word1.length()){

            res+=word1.charAt(i);
            i++;

        }


        return res;

    }
}