public class Operadores {
    public static void main(String[] args) throws Exception {
        double soma = 10.5 + 15.7;
        int modulo = 18 % 4; // resto da divisão
        System.out.println(soma);
        System.out.println(modulo);

        int numero = 5;
        numero = - numero; // número fica negativo
        System.out.println(numero); 

        numero = numero * -1; // número fica positivo novamente 
        System.out.println(numero);

        int num = 5;
        num++; // mesmo que 'num = num +1'
        System.out.println(num);

        int numdecremento = 5;
        numdecremento--; // mesmo que 'numdecremento = numdecremento -1'
        System.out.println(numdecremento);

        //negar expressão booleana
        boolean variavel = true;
        //variavel = !variavel; // desta forma muda o conteúdo da variável
        System.out.println(!variavel); // assim muda temporariamente, apenas na impressão
        String nome1 = "Jana";
        String nome2 = "Jana";
        int a, b;
        a = 5;
        b = 4;
        String resultado = a==b ?  "verdadeiro": "falso";
        System.out.println(resultado);

        //Operador Relacional
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("Os 2 números são iguais? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("Os 2 números são diferente? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numero1 é maior que numero2? " + simNao);

        System.out.println("nome1 é igual a nome2? " + (nome1 == nome2)) ; // compara String
        System.out.println((nome1.equals(nome2)));

        //Operador Lógico
        boolean cond1 = true;
        boolean cond2 = false;

        if(cond1 && cond2) {
            System.out.println("as duas condições são verdadeiras");
        }
        if(cond1 || cond2) {
            System.out.println("uma das condições é verdadeira");
        }
        System.out.println("fim");
    }
}
/* Operador de atribuição '=' símbolo de igual 
 * Operador aritméticos: '+ - / *' adição, subtração, multiplicação e divisão
 * Operador lógico: true ou false
 * Operador unário: aplicado junto com operador aritmético (incrementar ++, decrementar --, 
 * lógico de negação'!'')
 * Operador ternário: ?:
 * Operador relacional: == igual dade entre dois valores, != se 2 valores são diferentes,
 * < menor, > maior
*/