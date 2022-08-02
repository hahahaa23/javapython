package org.example;

class A{
    public void doA(){
        System.out.println("doA");
    }//인스턴스 메소드
    public static void doB(){
        System.out.println("doB");
    }//스태틱 메소드
}
//변수는 괄호 열고닫기 없음.함수는 괄호열고닫기 있음.

public class ex02 {
    public static void main(String[] args) {
        //이 밑으로 정의된건 다 스태틱이라 바로 사용가능
        Integer i1 = Integer.valueOf(3);
        Integer i2 = Integer.valueOf(10);

        int maxvalue = Integer.max(i1,i2);
        System.out.println(maxvalue);
        int minvalue = Integer.min(i1,i2);
        System.out.println(minvalue);
        int sumvalue = Integer.sum(i1,i2);
        System.out.println(sumvalue);

        System.out.println("2진수"+Integer.toBinaryString(i1));
        System.out.println("8진수"+Integer.toOctalString(i2));
        System.out.println(Integer.toHexString(i2));

        A a = new A();
        a.doA();
        //힙영역에 저장, 객체 생성후 사용가능

        A.doB();
        //메서드 영역안에 존재, 프로그램 종료시까지 존재해서 바로 호출가능
    }
}
