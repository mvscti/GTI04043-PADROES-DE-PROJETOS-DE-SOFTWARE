package padroes.estruturais.adapter;

public class Main {

	public static void main(String args[]) {
		TomadaDeTresPinos t3pinos = new TomadaDeTresPinos();
		
		AdapterTomada a = new AdapterTomada(t3pinos);
		a.ligarNaTomadaDeDoisPinos();
	}

}