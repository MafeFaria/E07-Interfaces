public class ContaPoupanca extends Conta implements ITaxas {
    public ContaPoupanca(int numero, Cliente dono, double saldo, double limite) {
        super(numero, dono, saldo, limite);
    }

    @Override
    public void setLimite(double limite) {
        if (limite < 100) {
            limite = 100;
        } else if (limite > 1000) {
            limite = 1000;
        }
        super.setLimite(limite);
    }

    @Override
    public double calculaTaxas() {
        return 0;
    }
}
