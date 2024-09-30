package esercizio3.classi;

import esercizio3.exception.BancaException;

public class ContoOnLine  extends ContoCorrente{
    private double maxPrelievo;
    public ContoOnLine(String titolare, int nMovimenti, double saldo, double maxPrelievo) {
        super(titolare, nMovimenti, saldo);
        this.maxPrelievo = maxPrelievo;
    }
    public void stampaSaldo() {
        System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti
                + " - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
    }

    public void preleva(double x) throws BancaException {
        if (x > maxPrelievo) {
            throw new BancaException("Il prelievo non è disponibile");
        }
            super.preleva(x);
    }
}
