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
    }
}
/*Usando condição ternária
String  resultado = nota>=7 ? "Aprovado" : "Reprovado"
System.out.print(resultado);
*/ 