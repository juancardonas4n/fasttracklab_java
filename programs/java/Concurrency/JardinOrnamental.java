public class JardinOrnamental {

    public static void main(String args[]) {
	Jardin jardin = args.length == 0 ? new JardinIlimitado() : new JardinLimitado(25);
	
	Thread tAdmin = new Thread(new Admin(jardin));

	for (int i = 0; i < 100; ++i) {
	    Thread t = new Thread(new Gente(jardin));
	    t.start();
	}
	tAdmin.start();
	try {
	    tAdmin.join();
	}
	catch (InterruptedException ie) { }
    }
}
