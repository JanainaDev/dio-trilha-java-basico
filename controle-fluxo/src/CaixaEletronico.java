public class CaixaEletronico {
    public static void main(String[] argas) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo) {
        saldo = saldo - valorSolicitado;
        System.out.println("O novo saldo é: " + saldo);
        }  else {
        System.out.println("O saque não pode ser realizado ");
        System.out.println("O saldo atual é: " + saldo);
        }

}
}
