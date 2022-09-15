package hu.petrik.pontoop.pont;

public class Pont {
    private int x;
    private int y;

    public Pont() {
        x = 0;
        y = 0;
    }

    public Pont(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        //return "{" + x +", "+ y + '}';
        return String.format("(%d, %d)", this.x, this.y);
    }

    public Pont(int n) {
        this.x = koordinataGeneralasa(n);
        this.y = koordinataGeneralasa(n);
    }

    private int koordinataGeneralasa(int n) {
        return (int) (Math.random() * (2 * n) + 1) - n;
    }

    public double getOrigotolMertTavolsag() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public double getKetPontTavolsaga(Pont a) {
        int egyik = a.x - this.x;
        int masik = a.y - this.y;

        return Math.sqrt(Math.pow(egyik, 2) + Math.pow(masik, 2));
    }

    public int holTalalhato() {
        if (this.x < 0 && this.y < 1) {
            return 2;
        } else if (this.x < 0 && this.y > 0) {
            return 1;
        } else if (this.x > 0 && this.y < 0) {
            return 3;
        } else {
            return 4;
        }

    }
}
