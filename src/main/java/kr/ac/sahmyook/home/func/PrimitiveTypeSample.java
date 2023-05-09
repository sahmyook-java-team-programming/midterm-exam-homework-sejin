package kr.ac.sahmyook.home.func;

public class PrimitiveTypeSample {
    public void typeSize(){
        System.out.println("typeSize 호출");
        System.out.println("======== 기본 자료형의 크기 ========");
        System.out.println("byte 자료형의 크기 : " + Byte.SIZE);
        System.out.println("short 자료형의 크기 : " + Short.SIZE);
        System.out.println("int 자료형의 크기 : " + Integer.SIZE);
        System.out.println("long 자료형의 크기 : " + Long.SIZE);
        System.out.println("======== 실수형의 크기 ========");
        System.out.println("float 자료형의 크기 : " + Float.SIZE);
        System.out.println("double 자료형의 크기 : " + Double.SIZE);
        System.out.println("======== 문자형의 크기 ========");
        System.out.println("char 자료형의 크기 : " + Character.SIZE);
        System.out.println("======== 논리형의 크기 ========");
        System.out.println("boolean 자료형의 크기 : 1");
    }
}
