// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Cena mikeT = new Cena();
        mikeT.entranceThemeMusic();
        mikeT.combo1();
        mikeT.combo2();
        mikeT.paymentForWork(19);
        mikeT.finisher();


    }
}

abstract class Wrestler{

    public Wrestler() {
    }

    public void paymentForWork(int hours){
        System.out.println("The wrestler will make $"+hours*250.00);


    }
    public abstract void entranceThemeMusic();
    public abstract void finisher();
    public abstract void combo1();
    public abstract void combo2();

}

class Cena extends Wrestler{
    @Override
    public void entranceThemeMusic() {
        System.out.println("And his name is Mike Tyson, dododo");
    }

    @Override
    public void finisher() {
        System.out.println("K.O");

    }

    @Override
    public void combo1() {
        System.out.println("56 position move");

    }

    @Override
    public void combo2() {

        System.out.println("23 position move");

    }
}