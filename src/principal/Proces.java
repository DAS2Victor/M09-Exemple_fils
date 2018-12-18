
package principal;


public class Proces extends Thread {
    
    private Enter comptador;

    public Proces(Enter comptador) {
        this.comptador = comptador;
    }
    
    public void run(){
        int x = (int)(Math.random()*10 - 4);
        
        try {
            sleep((int)(Math.random()*10000));
        } catch (InterruptedException ex) {
            
        }
        
        comptador.operacio(x);
        
    }
}
