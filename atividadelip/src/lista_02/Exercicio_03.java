package lista_02;

public class Exercicio_03 {
    /*
     * 3. Imprima todos os múltiplos de 3 entre 1 e 100.
     */
    public static void main(String[] args) {

        // laço para rodar até 100
        for (int i = 0; i < 100; i++) {

            // verifica se o i é divisivel por 3
            if (i % 3 == 0) {
                // se o numero divisivel por 3 ele executa a linha abaixo para mostra o numero multiplo de 3
                System.out.printf("Numero multiplo: %d\n", i);
            }
        }
    }
}
