package aa.bb;

interface AA{
    int AAA = 345;
    void doA();
}
class AAA implements AA{
//alt ENTER = 메서드 구현
    @Override
    public void doA() {
        System.out.println("AAA메서드 안에 doA메서드");
    }//1번 방법
}
//pubilc static final 이 생략된거
/*
1. class를 만들어서 상속받아 재정의
2. new AA로 객체생성과 동시에 메서드를 재정의하는 방법
 */

public class Ex01 {
    public static void main(String[] args) {

        System.out.println(AA.AAA); // java1.4버전
        //pubilc static final 이 생략된거라 바로 사용가능
        AAA a1 = new AAA();
        a1.doA();
        //객체생성을 해야 사용가능
        AA a2 = new AA() {
            @Override
            public void doA() {
                System.out.println("AA 인터페이스 안에 doA메서드");

            }
        };//2번 방법
        a2.doA();
        AA a3 = ()->{
            System.out.println("a3람다 안에 doA메서드");
        };
        a3.doA();//람다를 가장 많이 사용.
    }
}
