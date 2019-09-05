package caric.mydice1a;

public class Die {

   private int number = 1;



    public Die() {

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void roll(){
        number = (int)(1 + 6*Math.random());
    }
}
