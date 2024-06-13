public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (int x=0; x < alunos.length; x++) {
        System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
    }
    
}

/* for each
 * for(String aluno : alunos){
 * System.out.print("Nome do aluno é: " + aluno);
 * }
 */