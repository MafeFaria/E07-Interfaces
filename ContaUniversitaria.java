public class ContaUniversitaria extends Conta implements ITaxas {
    public ContaUniversitaria(int numero, Cliente dono, double saldo, double limite) {
        super(numero, dono, saldo, limite);
    }

    @Override
    public void setLimite(double limite) {
        if (limite < 0) {
            limite = 0;
        } else if (limite > 500) {
            limite = 500;
        }
        super.setLimite(limite);
    }

    @Override
    public double calculaTaxas() {
        return 0;
    }
}
