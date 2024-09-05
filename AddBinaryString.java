class AddBinaryString {
    public String addBinary(String a, String b) {
        int la = a.length()-1;
        int lb = b.length()-1;
        StringBuilder sb = new StringBuilder();
        char carry = '0';

        while(la>=0 || lb>=0){
            char A = '0';
            char B = '0';
            if(la>=0){
                A = a.charAt(la);
                la--;
            }
            if(lb>=0){
                B = b.charAt(lb);
                lb--;
            }
            if(A=='1'&&B=='1'&&carry=='1'){
                sb.append('1');
                carry='1';
            }else if(A=='0'&&B=='0'&&carry=='0'){
                sb.append('0');
                carry='0';
            }else if(A=='1'&&B=='1'||A=='1'&&carry=='1'||B=='1'&&carry=='1'){
                sb.append('0');
                carry='1';
            }else{
                sb.append('1');
                carry = '0';
            }

        }
        if(carry=='1') sb.append('1');
        sb.reverse();
        return sb.toString();
    }
}