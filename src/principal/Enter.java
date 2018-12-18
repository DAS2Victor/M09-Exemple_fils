
package principal;


public class Enter {
    
    private int valor;

    public Enter() {
        this.valor = 0;
    }

    public Enter(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public synchronized void operacio(int n){
        while(valor+n<0){
            try{
                System.out.println("Sense saldo " + n);
                wait();
            } catch (InterruptedException ex){
            }
        }
        valor = valor + n;
        System.out.println("Operació: "+ n + "\t Total: "+ valor);
        notify();
    }
    
}
