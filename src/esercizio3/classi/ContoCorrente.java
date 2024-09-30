package esercizio3.classi;

import esercizio3.exception.BancaException;

public class ContoCorrente {
    protected String titolare;
    protected  int nMovimenti;
    protected  final int maxMovimenti = 3;
    protected  double saldo;

    public ContoCorrente(String titolare, int nMovimenti, double saldo) {
        this.titolare = titolare;
        this.nMovimenti = nMovimenti;
        this.saldo = saldo;
    }

    public void preleva(double x) throws BancaException {
        if (nMovimenti >= maxMovimenti) {
            throw new BancaException("Numero massimo di movimenti superato");
        }
        if (nMovimenti < maxMovimenti) saldo = saldo - x;
        else saldo = saldo - x - 0.50;
        nMovimenti++;
        if (saldo < 0) {
            throw new BancaException("Il conto è in rosso");
        }
    }
    public double restituisciSaldo() {
        return saldo;
    }


}
