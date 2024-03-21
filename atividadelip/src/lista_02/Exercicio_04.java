package lista_02;

public class Exercicio_04 {
    /*
     * 4. Imprima todos os múltiplos de 7 entre 1 e 1000.
     * */
    public static void main(String[] args) {

        // laço para rodar até 100
        for (int i = 0; i < 1000; i++) {

            // verifica se o i é divisivel por 7
            if (i % 7 == 0) {
                // se o numero divisivel por 7 ele executa a linha abaixo para mostra o numero multiplo de 3
                System.out.printf("Numero multiplo: %d\n", i);
            }
        }
    }
}
