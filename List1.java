import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class List1 {
    public static void main(String[] args) {
        System.out.println("hw11_1: 인상진");
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList();

        Consumer<Integer> showUsersGrade = (num) -> {
          if(num>80){
              System.out.print("A");
          }else if(num>70){
              System.out.print("B");
          }else if(num>60){
              System.out.print("C");
          }else {
              System.out.print("F");
          }
        };

        while (true){

            System.out.print("점수를 입력하세요 : ");
            int num = sc.nextInt();
            if (num<0){
                break;
            }
            list.add(num);
        }

        System.out.println("전체 학생은 "+ list.size() +"명이다.");
        System.out.print("학생들의 성적 : ");
        for (int score : list) {
            System.out.print(score+" ");
        }

        System.out.println("");
        for (int score : list) {
            System.out.print(list.indexOf(score)+"번 학생의 성적은 "+ score+"이며 등급은 ");
            showUsersGrade.accept(score);
            System.out.println("이다");
        }

    }


}