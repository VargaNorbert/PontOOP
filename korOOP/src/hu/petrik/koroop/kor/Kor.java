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

        int n = (int) Math.random()*10+1;

        this.x =(int) (Math.random()*(n*2)+1-n);
        this.y = (int) (Math.random()*(n*2)+1-n);
        this.r = (int) Math.random()*n;
    }
}
