import java.util.ArrayList;
import java.util.List;

public class OfertaDisciplina {
	private int semestre;
	private String turno;
	private int ano;
	private List<Aluno> alunos = new ArrayList();

	public OfertaDisciplina(int semestre, String turno, int ano) {
		super();
		this.semestre = semestre;
		this.turno = turno;
		this.ano = ano;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}
	
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public void addAluno(Aluno alunos) {
		this.alunos.add(alunos);
	}

	public void removeAluno(Aluno alunos) {
		this.alunos.remove(alunos);
	}

//contar quantidade de Alunos	
	public int qtdAluno() {
		return this.alunos.size();
}
}
