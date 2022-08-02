package org.example;
class Pointt {
    private int xPos;
    private int yPos;

    public Pointt(int x, int y) {
        xPos = x;
        yPos = y;
    }
}
public class Retangle{

    private Pointt upperLeft;
    private Pointt lowerLeft;

    public Retangle(int x1, int y1, int x2, int y2) {
        upperLeft = new Pointt(x1,y1);
        lowerLeft = new Pointt(x2,y2);
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    public static void main(String[] args) {
        int x1 = 10;
        int x2 = 20;
        int y1 = 10;
        int y2 = 20;


    }
}
