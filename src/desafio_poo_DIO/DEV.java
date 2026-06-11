package desafio_poo_DIO;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class DEV {
	
	private String nome;
	private Set<Conteudo> conteudosIncrito = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	
	public void inscreverBootcamp(Bootcamp bootamp) {}

	public void progredir() {}
	
	public void calcularTotalXp() {}

	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, conteudosIncrito, nome);
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
				&& Objects.equals(conteudosIncrito, other.conteudosIncrito) && Objects.equals(nome, other.nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosIncrito() {
		return conteudosIncrito;
	}

	public void setConteudosIncrito(Set<Conteudo> conteudosIncrito) {
		this.conteudosIncrito = conteudosIncrito;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}
}
