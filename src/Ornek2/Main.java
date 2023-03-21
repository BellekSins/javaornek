package Ornek2;

public class Main {
    public static void main (String[] args) {
        Kopek kopek = new Kopek();
        Kedi kedi = new Kedi();
        Kus kus = new Kus();
        Object[]nesneler = new Object[] {kus,kedi,kopek};
        for (Object x:nesneler) {
            if (x instanceof Renk){
                ((Renk)x).rengi();
            }
            if (x instanceof  Boy) {
                ((Boy)x).Boyu();
            }
        }
    }
}