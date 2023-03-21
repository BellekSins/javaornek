public class Bileşenler {
    private int ssd;
    private int ram;
    private int psu;
    private int cpu;

    public Bileşenler() {
    }

    public Bileşenler(int ssd, int ram, int psu, int cpu) {
        this.ssd = ssd;
        this.ram = ram;
        this.psu = psu;
        this.cpu = cpu;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPsu() {
        return psu;
    }

    public void setPsu(int psu) {
        this.psu = psu;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }
}

