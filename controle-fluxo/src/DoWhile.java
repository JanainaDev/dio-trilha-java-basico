import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");
        do {
            //executando repetidas vezes até atender
            System.out.println(("Telefone tocando"));
        } while(tocando()); // camou o método tocando
        System.out.println("Alô!!!");
    }
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1; // valor aleatorio entre 1 e 3 e se for 1 é porque atendeu
        System.out.println("Atendeu? " + atendeu);
        // negando ato de continuar tocando
        return ! atendeu; // false vira verdadeiro para continuar o looping
    }
}
