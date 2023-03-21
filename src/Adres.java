public class Adres {
    private String ülke;
    private String il;

    public Adres() {
    }

    public Adres(String ülke, String il) {
        this.ülke = ülke;
        this.il = il;
    }

    public String getÜlke() {
        return ülke;
    }

    public void setÜlke(String ülke) {
        this.ülke = ülke;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }
}
