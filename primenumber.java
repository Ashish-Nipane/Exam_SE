class primenumber{
    public static void main(String[] args){
        System.out.println("Print prime number");

        int num =20;
        int count;
        for(int i =1;i<=num;i++){
            count =0;
            for(int j=2; j<=i/2; j++){
                if(i%j ==0){
                    count++
                    break;
                }
            }
            if(count ==0){
                System.out.println(i);
            }
        }

    }
}