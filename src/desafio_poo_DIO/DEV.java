package desafio_poo_DIO;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.Optional;

public class DEV {
	
	private String nome;
	private Set<Conteudo> conteudosInscrito = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	
	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudosInscrito.addAll(bootcamp.getConteudos());
		bootcamp.getDevsIncritos().add(this);
	}

	public void progredir() {
		Optional<Conteudo> conteudo = this.conteudosInscrito.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosInscrito.remove(conteudo.get());
		}else {
			System.err.println("Voce não esta matriculado em nenhum conteudo");
		}
	} 
	
	public double calcularTotalXp() {
		return this.conteudosConcluidos
				.stream()
				.mapToDouble(conteudo -> conteudo.calcularXP())
				.sum();
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, conteudosInscrito, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DEV other = (DEV) obj;
		return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
				&& Objects.equals(conteudosInscrito, other.conteudosInscrito) && Objects.equals(nome, other.nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosIncrito() {
		return conteudosInscrito;
	}

	public void setConteudosIncrito(Set<Conteudo> conteudosIncrito) {
		this.conteudosInscrito = conteudosIncrito;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}
}
