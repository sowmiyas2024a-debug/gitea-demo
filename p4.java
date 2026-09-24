class p4{
    public static void main(String args[]){
        System.out.println("prime number 1 to 100:");
        for(int i=2;i<=100;i++){
            boolean isprime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime)
            System.out.println(i+"  ");
        }
    }
}