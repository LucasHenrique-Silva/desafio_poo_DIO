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
	}

}
