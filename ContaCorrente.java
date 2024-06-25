public class ContaCorrente extends Conta implements ITaxas {
    public ContaCorrente(int numero, Cliente dono, double saldo, double limite) {
        super(numero, dono, saldo, limite);
    }

    @Override
    public void setLimite(double limite) {
        if (limite < -100) {
            limite = -100;
        }
        super.setLimite(limite);
    }

    @Override
    public double calculaTaxas() {
        if (getDono() instanceof PessoaFisica) {
            return 10.0;
        } else if (getDono() instanceof PessoaJuridica) {
            return 20.0;
        }
        return 0;
    }
}
