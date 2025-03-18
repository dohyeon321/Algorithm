import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c0 = s.charAt(0);
        char c1 = s.charAt(1);

        if(c0=='1') {
            System.out.println(1);
        } else if (c0=='(') {
            if(c1=='1'){
                System.out.println(0);
            }else {
                System.out.println(1);
            }
        } else {
            if(c1=='1'){
                System.out.println(2);
            }else {
                System.out.println(1);
            }
        }


        // 1)(=1 , 1()=1 , (1)=0 , ()1=1, )1(=2, )(1=1



    }
}