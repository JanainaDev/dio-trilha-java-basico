public class ResultadoAluno {
    public static void main(String[] args) {
        int nota = 10;

        if(nota >=7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7){ // true ou false
            System.out.println("Prova de recuperação");
        } else {
            System.out.println("Reprovado");
        }
        // Condição ternária
        String  resultado = nota>=7 ? "Aprovado" : nota>=5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.print(resultado); // else if usando estrutura ternária
    }
}
/*Usando condição ternária
String  resultado = nota>=7 ? "Aprovado" : nota>=5 && nota <7 ? "Recuperação" : "Reprovado";
System.out.print(resultado);
*/ 