public class Persona {
	protected cognone,nome;

	public Persona() {
		}
	public Persona(String cognome, String none) {
 		this.cognome = cognome;
		this.nome = nome;
	}
	void visualizza() {
		System.out.println("Cognome: " + cognome);
		System.out.println("Nome: " + nome);
	}
}

public class Dipendente implements Persona {
	protected int livello;
	public Dipendente()
	public Dipendente (String cognome, String none, Int livello) {
		super(cognome, nome);
		this.livello = livello;
	}
	public int visualizza() {
	 super.visualizza();
           System.out.println("Livello: " + livello);
	}
}

public class Docente extends Dipendente, Persona {
	protected String classeConcorso;
	public Docente() {
	}
	public Docente(String cognome, String nome, int livello, String classeConcorso) {
		super(livello);
		this.classeConcorso = classeConcorso;
	}

	public void visualizza() {
		super.visualizza();
		System.out.println("ClasseConcorso: “ + classeConcorso);
	}
}
