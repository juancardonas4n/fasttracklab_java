import java.util.Random;

public class Gente implements Runnable {
    private Jardin jardin;

    public Gente(Jardin jardin) {
	this.jardin = jardin;
    }

    public void run() {
	while (true) {
	    Random r = new Random();

	    try {
		jardin.entrar();
		Thread.sleep(Math.abs(r.nextInt()) % 3000 + 1000);
		jardin.salir();
		Thread.sleep(Math.abs(r.nextInt()) % 3000 + 1000);
	    }
	    catch (InterruptedException ie) { }
	}
    }
}
