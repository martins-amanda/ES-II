import java.util.ArrayList;
import java.util.List;
public class Cursos {

	private String sigla;
	private String nome;
	private List<Aluno> alunos = new ArrayList<>();
	private List<Disciplinas>disciplinas = new ArrayList<>();
	private boolean matutino;
	private boolean vespertino;
	private boolean noturno;
	
	
	public Cursos(String sigla, String nome, boolean matutino, boolean vespertino, boolean noturno) {
		super();
		this.sigla = sigla;
		this.nome = nome;
		this.matutino = matutino;
		this.vespertino = vespertino;
		this.noturno = noturno;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public boolean isMatutino() {
		return matutino;
	}

	public void setMatutino(boolean matutino) {
		this.matutino = matutino;
	}

	public boolean isVespertino() {
		return vespertino;
	}

	public void setVespertino(boolean vespertino) {
		this.vespertino = vespertino;
	}

	public boolean isNoturno() {
		return noturno;
	}

	public void setNoturno(boolean noturno) {
		this.noturno = noturno;
	}

	public void addAluno(Aluno alunos) {
		this.alunos.add(alunos);
	}
	
	public void removeAluno(Aluno alunos) {
		this.alunos.remove(alunos);
	}
	//contar quantidade de alunos	
	public int qtdAluno() {
		return this.alunos.size();
	}
	
	public void addDisciplinas(Disciplinas disciplinas) {
		this.disciplinas.add(disciplinas);
	}
	
	public void removeDisciplinas(Disciplinas disciplinas) {
		this.disciplinas.remove(disciplinas);
	}
	//contar quantidade de disciplinas	
	public int qtdDisciplinas() {
		return this.disciplinas.size();
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> aluno) {
		this.alunos = aluno;
	}

}
