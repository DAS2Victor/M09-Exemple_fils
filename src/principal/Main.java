
package principal;


public class Main {


    public static void main(String[] args) {
        
        Enter comptador = new Enter(1); // Creem un objecte comptador compartit
        final int M = 10; // Fixem el nombre de processos
        Proces processos[] = new Proces[M];  // Creem un array de processos
        
        for (int i=0; i<M; i++){
            processos[i] = new Proces(comptador);
            processos[i].start();
        }
        
        for (int i=0; i<M; i++){
            try{
                processos[i].join();
            } catch (InterruptedException ex){
                
            }
        }
        
        System.out.println("Resultat final: "+comptador.getValor());
        
    }
    
}
