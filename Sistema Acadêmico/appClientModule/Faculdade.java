import java.util.ArrayList;
import java.util.List;

public class Faculdade {
	String nome;
	private List<Cursos> cursos = new ArrayList();
	
	public Faculdade(String nome) {
		super();
		this.nome = nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public List<Cursos> getCursos() {
		return cursos;
	}
	public void addCursos(Cursos cursos) {
		this.cursos.add(cursos);
	}
	
	public void removeCursos(Cursos cursos) {
		this.cursos.remove(cursos);
	}
//contar quantidade de Cursos	
	public int qtdCursos() {
		return this.cursos.size();
	}
	 public int qtdAlunos() {
		    int alunos = 0;
		    for (Cursos curso : this.cursos) {
		      alunos += curso.qtdAluno();
		    }
		    return alunos;
		  }
}
