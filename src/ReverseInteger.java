import java.util.Scanner;

public class Reverse {
    static void reverse(int n){
        int temp1,temp2=0;
        while(n!=0){
            temp1=n%10;
            n=n/10;
            temp2=temp2*10+temp1;
        }
        System.out.println(temp2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        reverse(n);
    }
}

