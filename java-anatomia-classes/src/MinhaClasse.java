public class MinhaClasse {
    public static void main(String[] args) {

        System.out.println("Olá turma, sejam bem-vindos");
        String primeiroNome = "Janaina";
    String segundoNome = "Pereira";

    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
    System.out.println(nomeCompleto); // chama a variavel, que por sua vez chamou o método


}
public static String nomeCompleto(String primeiroNome, String segundoNome){
    return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    //return "Resultado do método ".concat(primeiroNome).concat(" ").concat(segundoNome); é uma outra opção de concatenar
    
    /*  da pra concatenar com símbolo de + ou usando concat, na linha acima
    foi usado as 2 formas */
    }
}
