package org.example;

import java.util.Objects;

class INum{


    int num;

    public INum(int num) {
        this.num = num;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    @Override
    public boolean equals(Object o) {
        INum iNum = (INum) o;
        return num == iNum.num;
    }
}

public class ex01 {
    public static void main(String[] args) {
        INum iNum1 = new INum(10);
        INum iNum2 = new INum(10);
        INum iNum3 = new INum(11);
        System.out.println(iNum1==iNum2);
        System.out.println(iNum1);
        System.out.println(iNum2);
        //힙영역에 올라가있는데 이 둘이 다름. 같은 공간에 있는게 아님.

        System.out.println(iNum1.equals(iNum2));
        System.out.println(iNum1.equals(iNum3));
    }
}
