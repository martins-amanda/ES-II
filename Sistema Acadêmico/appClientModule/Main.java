
public class Main {
	public static void main(String[] args) {

		Faculdade fatec = new Faculdade("Fatec Mogi das Cruzes");

		Cursos ads = new Cursos("ADS", "Análise e Desenvolvimento de Sistemas", false, true, true);
		Cursos agro = new Cursos("AGRO", "Agronegócio", false, true, true);
		Cursos rh = new Cursos("RH", "Recursos Humanos", true, false, false);

		fatec.addCursos(ads); // add curso na faculdade
		fatec.addCursos(agro);
		fatec.addCursos(rh);
		//disciplinas ADS 
		Disciplinas discAds1 = new Disciplinas("A001", "ESII", "Engenharia de Software II");
		Disciplinas discAds2 = new Disciplinas("A002", "ED", "Estrutura de Dados");
		Disciplinas discAds3 = new Disciplinas("A003", "MD", "Matematica Discreta");

		ads.addDisciplinas(discAds1); // add disciplina no curso
		ads.addDisciplinas(discAds2);
		ads.addDisciplinas(discAds3);
		
		//disciplinas RH 
		Disciplinas discRh1 = new Disciplinas("B001", "ES", "Estatistica");
		Disciplinas discRh2 = new Disciplinas("B002", "CE", "Comunicação e Expressão");
		Disciplinas discRh3 = new Disciplinas("B003", "AG", "Administração Geral");

		rh.addDisciplinas(discRh1);
		rh.addDisciplinas(discRh2);
		rh.addDisciplinas(discRh3);
		
		// Oferta disciplinas ADS 
		OfertaDisciplina ofertaAds1 = new OfertaDisciplina(2, "Noturno", 2021);
		OfertaDisciplina ofertaAds2 = new OfertaDisciplina(2, "Noturno", 2021);
		OfertaDisciplina ofertaAds3 = new OfertaDisciplina(1, "Vespertino", 2020);

		discAds1.addOfertaDisciplina(ofertaAds1); // add disponibilidade disciplina
		discAds2.addOfertaDisciplina(ofertaAds2);
		discAds3.addOfertaDisciplina(ofertaAds3);
		
		// Oferta disciplinas RH 
		OfertaDisciplina ofertaRh1 = new OfertaDisciplina(2, "Matutino", 2021);
		OfertaDisciplina ofertaRh2 = new OfertaDisciplina(2, "Matutino", 2021);
		OfertaDisciplina ofertaRh3 = new OfertaDisciplina(1, "Matutino", 2020);

		discAds1.addOfertaDisciplina(ofertaAds1); 
		discAds2.addOfertaDisciplina(ofertaAds2);
		discAds3.addOfertaDisciplina(ofertaAds3);
		// Alunos ADS 
		Aluno ads01 = new Aluno("121221", "João da Silva", ads);
		Aluno ads02 = new Aluno("212121", "Amanda Martins", ads);
		Aluno ads03 = new Aluno("212121", "Lucas Neco", ads);
		Aluno ads04 = new Aluno("212121", "Sthefany Brito", ads);

		ofertaAds1.addAluno(ads01);
		ofertaAds1.addAluno(ads02);
		ofertaAds1.addAluno(ads03);
		ofertaAds1.addAluno(ads04);

		ofertaAds2.addAluno(ads01);
		ofertaAds2.addAluno(ads02);
		ofertaAds2.addAluno(ads03);

		ofertaAds3.addAluno(ads03);
		ofertaAds3.addAluno(ads04);
		// Alunos RH
		Aluno rh01 = new Aluno("121221", "Pedro da Silva", rh);
		Aluno rh02 = new Aluno("212121", "Juliana Martins", rh);
		Aluno rh03 = new Aluno("212121", "Gustavo Neco", rh);
		Aluno rh04 = new Aluno("212121", "Jessica Brito", rh);
		
		ofertaRh1.addAluno(rh01);
		ofertaRh1.addAluno(rh02);
		ofertaRh1.addAluno(rh03);
		ofertaRh1.addAluno(rh04);

		ofertaRh2.addAluno(rh01);
		ofertaRh2.addAluno(rh02);
		ofertaRh2.addAluno(rh03);

		ofertaRh3.addAluno(rh03);
		ofertaRh3.addAluno(rh04);
		
		System.out.printf("Faculdade: %s  \nTotal de cursos: %d\n", fatec.getNome(), fatec.qtdCursos());
		System.out.printf("Total de alunos %d \n",fatec.qtdAlunos());

		ads.removeAluno(ads01);
		System.out.printf("Atualização de Alunos: Total de alunos %d  \n",
				fatec.qtdAlunos());

		 fatec.removeCursos(agro); System.out.printf(
				 "Atualização: Total de cursos: %d\n",
				 fatec.qtdCursos() );
				
		 
		System.out.printf("\n---Curso %s --- \nTotal de %d disciplinas\n", ads.getNome(), ads.qtdDisciplinas());
		System.out.printf("Total de alunos: %d  \n", ads.qtdAluno());

		System.out.printf("\nDisciplina: %s - %s\nTurno: %s \nSemestre: %d\nAno:%d\nTotal de alunos:%d\n", discAds1.getSigla(),
				discAds1.getNome(),ofertaAds1.getTurno(), ofertaAds1.getSemestre(), ofertaAds1.getAno(),ofertaAds1.qtdAluno());
		
		System.out.printf("\nDisciplina: %s - %s\nTurno: %s \nSemestre: %d\nAno:%d\nTotal de alunos:%d\n", discAds2.getSigla(),
				discAds2.getNome(),ofertaAds2.getTurno(), ofertaAds2.getSemestre(), ofertaAds2.getAno(),ofertaAds2.qtdAluno());
		
		System.out.printf("\nDisciplina: %s - %s\nTurno: %s \nSemestre: %d\nAno:%d\nTotal de alunos:%d\n", discAds3.getSigla(),
				discAds3.getNome(),ofertaAds3.getTurno(), ofertaAds3.getSemestre(), ofertaAds3.getAno(),ofertaAds3.qtdAluno());
		
		 
		System.out.printf("\n---Curso %s --- \nTotal de %d disciplinas\n", rh.getNome(), rh.qtdDisciplinas());
		System.out.printf("Total de alunos: %d  \n", rh.qtdAluno());

		System.out.printf("\nDisciplina: %s - %s\nTurno: %s \nSemestre: %d\nAno:%d\nTotal de alunos:%d\n", discRh1.getSigla(),
				discRh1.getNome(),ofertaRh1.getTurno(), ofertaRh1.getSemestre(), ofertaRh1.getAno(),ofertaRh1.qtdAluno());
		
		System.out.printf("\nDisciplina: %s - %s\nTurno: %s \nSemestre: %d\nAno:%d\nTotal de alunos:%d\n", discRh2.getSigla(),
				discRh2.getNome(),ofertaRh2.getTurno(), ofertaRh2.getSemestre(), ofertaRh2.getAno(),ofertaRh2.qtdAluno());
		
		System.out.printf("\nDisciplina: %s - %s\nTurno: %s \nSemestre: %d\nAno:%d\nTotal de alunos:%d\n", discRh3.getSigla(),
				discRh3.getNome(),ofertaRh3.getTurno(), ofertaRh3.getSemestre(), ofertaRh3.getAno(),ofertaRh3.qtdAluno());
		

		

	}
}