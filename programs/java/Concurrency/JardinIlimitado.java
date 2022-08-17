public class JardinIlimitado implements Jardin {
    private int contador;

    public JardinIlimitado() {
	contador = 0;
    }

    public synchronized void entrar() {
	contador++;
    }

    public synchronized void salir() {
	contador--;
    }

    public synchronized int obtenerContador() {
	return contador;
    }
}
