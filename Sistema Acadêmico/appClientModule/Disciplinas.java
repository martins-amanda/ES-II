import java.util.ArrayList;
import java.util.List;

public class Disciplinas {
	private String sigla;
	private String nome;
	private String codigo;
	private List<OfertaDisciplina> ofertaDisciplina = new ArrayList<>();

	public Disciplinas(String codigo, String sigla, String nome) {
		super();
	    this.codigo = codigo;
		this.sigla = sigla;
		this.nome = nome;
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

	public void setNomeDisciplina(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void addOfertaDisciplina(OfertaDisciplina ofertaDisciplina) {
		this.ofertaDisciplina.add(ofertaDisciplina);
	}

	public void removeOfertaDisciplina(OfertaDisciplina ofertaDisciplina) {
		this.ofertaDisciplina.remove(ofertaDisciplina);
	}

//contar quantidade de OfertaDisciplina	
	public int qtdOfertaDisciplina() {
		return this.ofertaDisciplina.size();
	}

	public void removeAluno(Aluno aluno) {
		for (OfertaDisciplina ofertaDisciplina : this.ofertaDisciplina) {
			ofertaDisciplina.removeAluno(aluno);
		}
	}

}
