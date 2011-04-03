package scheduler;

import scheduler.view.Janela;

public class Exec {
	
	public static void main(String[] args) throws InterruptedException {
		
		Janela janela = new Janela();
		
		janela.setProcess();
		
		synchronized (janela) {
			janela.wait();
		}
		
	}

}
