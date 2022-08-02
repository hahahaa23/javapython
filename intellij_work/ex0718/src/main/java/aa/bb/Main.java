package aa.bb;

class PA{
    public void showInfo(){
        System.out.println("PA 메서드 입니다.");
    }
}
class CA1 extends PA{
    @Override
    public String toString() {
        return "CA1{}";
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("C1 메서드입니다.\n");
        }
    }

class CA2 extends PA{
    @Override
    public String toString() {
        return "CA2{}";
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("C2 메서드입니다.\n");
    }
}

public class Main {
    public static void main(String[] args) {
        PA pa[] = new PA[5];
        System.out.println("pa[0] = "+pa[0]);

        pa[0] = new CA1();
        System.out.println("pa[0] = "+pa[0]);
        pa[1] = new CA2();
        System.out.println("pa[1] = "+pa[1]);

        System.out.println();
        pa[0].showInfo();
        pa[1].showInfo();

        pa[2] = new CA1();

        try{
            CA1 ca1 = (CA1) pa[2];
            CA2 ca2 = (CA2) pa[2];

            System.out.println("여기까지 정상실행");

            System.out.println(ca2);
        }catch (Exception e){
            System.out.println("에러발생 무시"+e);
        }



        System.out.println("프로그램을 종료합니다.");





    }
}