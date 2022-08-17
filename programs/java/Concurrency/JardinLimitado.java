public class JardinLimitado implements Jardin {
    private int contador;
    private int maximo;

    public JardinLimitado(int maximo) {
	contador = 0;
	this.maximo = maximo;
    }

    public synchronized void entrar() {
	try {
	    while (maximo == contador) wait();
	}
	catch (InterruptedException ie) { }
	contador++;
    }

    public synchronized void salir() {
	if (maximo == contador) notify();
	contador--;
    }

    public synchronized int obtenerContador() {
	return contador;
    }
}
