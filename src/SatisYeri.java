public class SatisYeri {
private String yer;
private Adres adres;

    public SatisYeri() {
    }

    public SatisYeri(String yer, Adres adres) {
        this.yer = yer;
        this.adres = adres;
    }

    public String getYer() {
        return yer;
    }

    public void setYer(String yer) {
        this.yer = yer;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }
}
