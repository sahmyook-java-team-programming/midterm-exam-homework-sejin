package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class VariableSample {
    public void myProfile(){
        System.out.println("myProfile 호출");

        String myName = "이세진";
        int myAge = 20;
        int myNum = 2019100992;
        String myPhone = "010-6596-xxxx";

        System.out.println("제 이름은 " + myName + "입니다.");
        System.out.println("제 나이는 " + myAge + "입니다.");
        System.out.println("제 학번은 " + myNum + "입니다.");
        System.out.println("제 전화번호는 " + myPhone + "입니다.");
    }
    public void empInformation(){
        System.out.println("empInformation 호출");
        Scanner sc = new Scanner(System.in);
        System.out.print("사원의 이름을 입력하세요 : ");
        String empName = sc.nextLine();
        System.out.print("사원의 나이를 입력하세요 : ");
        int empAge = sc.nextInt();
        sc.nextLine();
        System.out.print("사원의 전화번호룰 입력하세요 : ");
        String empPhone = sc.nextLine();

        System.out.println("사원의 이름은 " + empName + "입니다.");
        System.out.println("사원의 나이는 " + empAge + "입니다.");
        System.out.println("사원의 전화번호는 " + empPhone + "입니다.");
    }
}
