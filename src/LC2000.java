class LC2000 {
    public String reversePrefix(String word, char ch) {
        int idx  = word.indexOf(ch+"");
        if(idx > -1 ){

            StringBuilder s = new StringBuilder(word.substring(0 , idx+1 ));
            s.reverse();
            String result = new String();
            result+=s.toString();
            result+=word.substring(idx+1);
            return result;

        }

        return word;

    }


}