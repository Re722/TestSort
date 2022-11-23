public class App {
    public static void main(String[] args) throws Exception {        

        int[] vetor = new int[10];
        
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) Math.floor(Math.random() * vetor.length);
        }

        System.out.println("Vetor Desordenado");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
        
        quicksort(vetor, 0, vetor.length - 1);
        
        System.out.println("\n\nVetor Ordenado");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
    }
    
    static void quicksort(int[] vetor, int left, int right){
        if (left < right){
            int p = particao(vetor, left, right);
            quicksort(vetor, left, p);
            quicksort(vetor, p + 1, right);
        }
    }
    
    static int particao(int[] vetor, int left, int right){
        int meio = (int) (left + right) / 2;
        int pivot = vetor[meio];
        int i = left - 1;
        int j = right + 1;
        while(true){
            do{
                i++;
            }while(vetor[i] < pivot);
            do{
                j--;
            }while(vetor[j] > pivot);
            if (i >= j){
                return j;
            }
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }
    
}


    }

