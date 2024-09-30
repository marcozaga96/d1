package esercizio3.classi;

public class ContoCorrente {
    private String titolare;
    private int nMovimenti;
    private final int maxMovimenti = 50;
    private double saldo;

    public ContoCorrente(String titolare, int nMovimenti, double saldo) {
        this.titolare = titolare;
        this.nMovimenti = nMovimenti;
        this.saldo = saldo;
    }

    public void preleva(double x) {
        if (nMovimenti < maxMovimenti) saldo = saldo - x;
        else saldo = saldo - x - 0.50;
        nMovimenti++;
    }
    public double restituisciSaldo() {
        return saldo;
    }


}
