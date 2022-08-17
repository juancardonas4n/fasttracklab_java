import java.util.Random;

public class Admin implements Runnable {
    private Jardin jardin;

    public Admin(Jardin jardin) {
	this.jardin = jardin;
    }

    public void run() {
	while (true) {
	    Random r = new Random();

	    try {
		int nClientes = jardin.obtenerContador();
		System.out.println("Clientes: " + nClientes);
		Thread.sleep(Math.abs(r.nextInt()) % 5000 + 1);
	    }
	    catch (InterruptedException ie) { }
	}
    }
}
