public class CondicionalSimples {
    public static void main(String[] argas) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo) {
        saldo = saldo - valorSolicitado;
        System.out.println("O novo saldo é: " + saldo);   
        }
    }
}