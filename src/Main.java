public class Main {
    public static void main(String[] args) {
        Adres adres = new Adres("türkiye","tokat");
        SatisYeri satisYeri = new SatisYeri("internet",adres);

        System.out.println("satısyeri : "+ satisYeri.getYer());
        System.out.println("Adres  : " + satisYeri.getAdres().getIl()+"/"+satisYeri.getAdres().getÜlke() );
    }
}