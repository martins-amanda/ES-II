
public class Aluno {
	private String ra;
	private String nome;
	private Cursos curso;

	public Aluno(String ra, String nome,Cursos curso) {
		this.ra = ra;
		this.nome = nome;
		curso.addAluno(this);
	}

	public String getRa() {
		return ra;
	}

	public  String getNome() {
		return nome;
	}

	public Cursos getCurso() {
		return curso;
	}

	public void setCurso(Cursos curso) {
		this.curso = curso;
	}
}