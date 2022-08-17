class EjemploHilo8 implements Runnable {

    public EjemploHilo8() {
    }

    public void run() {
	Thread t = Thread.currentThread();

	while (true) {
	    System.out.println("Esto es otro hilo: " + t);
	    
	    if (Thread.interrupted()) {
		System.out.println("Ya voy");
	    }
	   
	}
	//System.out.println("Good bye, cruel world!");
    }

    public static void main(String []args) {
	ThreadGroup tg = new ThreadGroup("fumador");
	Thread eh7_1 = new Thread(tg, new EjemploHilo8(), "Ejemplo hilo 8 1");

	eh7_1.start();
	try {
	    
	    while (true) {
		Thread.currentThread().sleep(2000);
		eh7_1.interrupt();
	    }

	}
	catch (InterruptedException ie) {
	}
    }
}
