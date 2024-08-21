class ValidAnagram{
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        int []a=new int[256];
        for(int i=0; i<s.length(); i++){
            a[s.charAt(i)]++;
            a[t.charAt(i)]--;
        }
        for(int i=97; i<125; i++){
            if(a[i]!=0) return false;
        }
        return true;
    }
}