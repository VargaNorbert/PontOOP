package hu.petrik.koroop.kor;

public class Kor {
    private int x;
    private int y;
    private int r;

    public Kor(int r) {
        this.x = 0;
        this.y = 0;
        this.r = r;
    }

    public Kor(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public Kor() {

        int n = (int) (Math.random() * 10) + 1;

        this.x = rand(n);
        this.y = rand(n);
        this.r = (int) Math.random() * n;
    }

    private int rand(int n) {
        return (int) (Math.random() * (2 * n) + 1) - n;
    }

    @Override
    public String toString() {
        return "{" + "x=" + x + " y=" + y +
                ", r=" + r +
                '}';
    }

    public double kerulet() {
        return 2 * this.r * Math.PI;
    }

    public double terulet() {
        return Math.pow(this.r,2)*Math.PI;
    }

    public void nagyit(int r){
        this.r=r;
    }
}
