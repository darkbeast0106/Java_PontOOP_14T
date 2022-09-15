package hu.petrik.pontoop.pont;

public class Pont {
    private int x;
    private int y;

    public Pont() {
        this.x = 0;
        this.y = 0;
    }

    public Pont(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Pont(int n) {
        this.x = koordinataGeneralasa(n);
        this.y = koordinataGeneralasa(n);
    }

    private int koordinataGeneralasa(int n) {
        return (int) (Math.random() * ((2 * n) + 1)) - n;
    }

    public double getOrigotolMertTavolsag() {
        // négyzetgyök - SQuareRooT || hatványozás - POWer
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
        //return this.getTavolsag(new Pont());
    }

    public double getTavolsag(Pont masikPont) {
        return Math.sqrt(Math.pow(this.x - masikPont.x, 2) + Math.pow(this.y - masikPont.y, 2));
    }

    public int getSiknegyed() {
        int siknegyed = 0;
        if (this.x < 0 && this.y > 0) {
            siknegyed = 1;
        } else if (this.x < 0 && this.y < 0){
            siknegyed = 2;
        } else if (this.x > 0 && this.y < 0){
            siknegyed = 3;
        } else if (this.x > 0 && this.y > 0){
            siknegyed = 4;
        } else if (this.x == 0 && this.y != 0) {
            siknegyed = 5;
        } else if (this.x != 0 && this.y == 0) {
            siknegyed = 6;
        }
        return siknegyed;
    }

    public String getSiknegyedSzoveges(){
        int siknegyed = this.getSiknegyed();
        String siknegyedSzoveges = "";
        switch (siknegyed){
            case 0:
                siknegyedSzoveges = "origo";
                break;
            case 1:
                siknegyedSzoveges = "bal felső síknegyed";
                break;
            case 2:
                siknegyedSzoveges = "bal alsó síknegyed";
                break;
            case 3:
                siknegyedSzoveges = "jobb alsó síknegyed";
                break;
            case 4:
                siknegyedSzoveges = "jobb felső síknegyed";
                break;
            case 5:
                siknegyedSzoveges = "függőleges tengely";
                break;
            case 6:
                siknegyedSzoveges = "vízszintes tengely";
                break;
        }
        return siknegyedSzoveges;
    }

    @Override
    public String toString() {
        //return "(" + x +", " + y + ')';
        return String.format("(%d, %d)", this.x, this.y);
    }
}
