public class BuscaBinaria {

	public static void main(String[] args) {

		Arrays arr = new Arrays();
	
		int[] alvosQ1 = {415, 545, 390, 609, 296};
		int[] alvosQ2 = {824, 599, 700, 858, 269, 351, 42, 317, 525, 550, 143, 421, 422};
		
		System.out.println("- Questão 01 : \n");
        for (int alvo : alvosQ1) {
            int indice = buscaBinaria(arr.getArr(), alvo);
            if (indice != -1) {
                System.out.println("O índice de número " + alvo + " é: " + indice);
            } else {
                System.out.println("O número " + alvo + " não foi encontrado.");
            }
        }
        
        System.out.println("\n- Questão 02 : \n");
        
        for (int alvo : alvosQ2) {
            int indice = buscaBinaria(arr.getArr2(), alvo);
            if (indice != -1) {
                System.out.println("O índice de número " + alvo + " é: " + indice);
            } else {
                System.out.println("O número " + alvo + " não foi encontrado.");
            }
        }
        
        
    }

    public static int buscaBinaria(int[] arr, int alvo) {
        int b = 0;
        int a = arr.length - 1;

        while (b <= a) {
            int m = b + (a - b) / 2;

            if (arr[m] == alvo) {
                return m;
            } else if (arr[m] < alvo) {
                b = m + 1;
            } else {
                a = m - 1;
            }
        }

        return -1; // Retorna -1 se o elemento não for encontrado
    }
}