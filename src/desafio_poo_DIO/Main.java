package desafio_poo_DIO;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Curso para Java");
		curso1.setCargaHoraria(50);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso HTML");
		curso2.setDescricao("Curso para HTML");
		curso2.setCargaHoraria(12);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("Mentoria do curso de Java");
		mentoria1.setDate(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp progame");
		bootcamp.setDescricao("O bootcamp para saber tudo sobre programar");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		// ========== CRIAÇÃO E CONFIGURAÇÃO INICIAL ==========
		DEV dev1 = new DEV();
		dev1.setNome("Carl");

		DEV dev2 = new DEV();
		dev2.setNome("Lucas");

		// ========== STATUS INICIAL (antes do bootcamp) ==========
		System.out.println("=== ANTES DO BOOTCAMP ===");
		System.out.println("Conteúdos Inscritos " + dev1.getNome() + ": " + dev1.getConteudosIncrito());
		System.out.println("Conteúdos Inscritos " + dev2.getNome() + ": " + dev2.getConteudosIncrito());
		System.out.println();

		// ========== INSCRIÇÃO NO BOOTCAMP ==========
		System.out.println("=== INSCRIÇÕES ===");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println(dev2.getNome() + " se inscreveu no bootcamp");

		dev1.inscreverBootcamp(bootcamp);
		System.out.println(dev1.getNome() + " se inscreveu no bootcamp");
		System.out.println();

		// ========== STATUS APÓS INSCRIÇÃO ==========
		System.out.println("=== APÓS INSCRIÇÃO ===");
		System.out.println("Conteúdos Inscritos " + dev1.getNome() + ": " + dev1.getConteudosIncrito());
		System.out.println("Conteúdos Inscritos " + dev2.getNome() + ": " + dev2.getConteudosIncrito());
		System.out.println();

		// ========== AÇÕES DO DEV2 (LUCAS) ==========
		System.out.println("=== AÇÕES DO " + dev2.getNome().toUpperCase() + " ===");
		System.out.println("Conteúdos Concluídos: " + dev2.getConteudosConcluidos());
		System.out.println("Total XP antes de progredir: " + dev2.calcularTotalXp());

		dev2.progredir();
		System.out.println("\nApós progredir:");
		System.out.println("Conteúdos Inscritos: " + dev2.getConteudosIncrito());
		System.out.println("Conteúdos Concluídos: " + dev2.getConteudosConcluidos());
		System.out.println("Total XP: " + dev2.calcularTotalXp());


		
	}

}
