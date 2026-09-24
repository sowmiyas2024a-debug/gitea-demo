class p7{
    public static void main(String args[]){
        String s="madam";
        String r="";
        for(int i=s.length()-1;i>=0;i--){
            r+=s.charAt(i);
        }
        System.out.println(s.equals(r));
    }
}