import java.util.*;
class armstrongnumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 digit number")

        int num = sc.nextInt();

        int onum = num;
        int rem;
        int result =0;

        while(onum !=0){
            rem = onum % 10;
            result += Math.pow(rem,3);
            onum /= 10;
        }

        if(result == num){
            System.out.println(num+ "is Armstrong number");
        }
        else{
            System.out.println(num+ "is not Armstrong number");
        }

    }
}