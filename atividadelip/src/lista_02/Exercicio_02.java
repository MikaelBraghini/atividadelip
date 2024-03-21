package lista_02;

public class Exercicio_02 {
    /*
     * 2. Imprima a soma de 1 até 1000.
     */
    public static void main(String[] args) {
        // declarando a variavel soma para guarda o resultado da soma a cada iteração
        int soma = 0;

        // laço de repetição para somar o numero até 1000 iterações
        for (int i = 0; i < 1000; i++) {
            // pega o valor da ultima soma, e soma com a variavel i
            soma = soma + i;
        }

        // mostra o resultado da soma no console
        System.out.printf("A soma é: %d", soma);
    }
}
