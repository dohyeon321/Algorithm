import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[20];
        int index_20 = 0;
        double bob_score =0;
        double alice_score;
        for (int i = 0; i < 20; i++) {
            score[i] = sc.nextInt();
            bob_score += score[i];
            if(score[i]==20){
                index_20 = i;
            }
        }
        bob_score = bob_score/20.0;
        if(index_20 == 0) {
            alice_score = (score[19]+score[index_20]+score[index_20+1])/3.0;

        } else if (index_20 == 19) {
            alice_score = (score[index_20-1]+score[index_20]+score[0])/3.0;

        } else {
            alice_score = (score[index_20-1]+score[index_20]+score[index_20+1])/3.0;


        }

        if(bob_score>alice_score) {

            System.out.println("Bob");
        } else if(bob_score < alice_score) {
            System.out.println("Alice");
        } else {
            System.out.println("Tie");
        }
    }
}