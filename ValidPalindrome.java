class ValidPalindrome{
    public boolean isPalindrome(String s) {
        String low = s.toLowerCase();
        for(int i=0, j=low.length()-1; j>=i; i++, j--){
            while(i<low.length()&&!(low.charAt(i)>='a'&&low.charAt(i)<='z'||low.charAt(i)>='0'&&low.charAt(i)<='9')){
                i++;
            }
            while(j>=0&&!(low.charAt(j)>='a'&&low.charAt(j)<='z'||low.charAt(j)>='0'&&low.charAt(j)<='9')){
                j--;
            }
            if((i<low.length()&&j>=0)&&low.charAt(i)!=low.charAt(j)) return false;
        }

        return true;
    }
}