package it.polito.tdp.corsi.model;

public class Corso {

	private String codins; 			// come le colonne del database
	private Integer crediti; 		//Utile usare Integer, int ha già hashCode e equals, 
									//obbligatorio usare Integer se chiave primaria	
									// come le colonne del database
	private String nome; 			// come le colonne del database
	private Integer pd; 			// come le colonne del database
	
	
	
	public Corso(String codins, Integer crediti, String nome, Integer pd) {
		super();
		this.codins = codins;
		this.crediti = crediti;
		this.nome = nome;
		this.pd = pd;
	}

	public String getCodins() {
		return codins;
	}

	public Integer getCrediti() {
		return crediti;
	}

	public String getNome() {
		return nome;
	}

	public Integer getPd() {
		return pd;
	}

	public void setCodins(String codins) {
		this.codins = codins;
	}

	public void setCrediti(Integer crediti) {
		this.crediti = crediti;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPd(Integer pd) {
		this.pd = pd;
	}

	@Override						//Solo per chiave primaria
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codins == null) ? 0 : codins.hashCode());
		return result;
	}

	@Override						//Solo per chiave primaria
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Corso other = (Corso) obj;
		if (codins == null) {
			if (other.codins != null)
				return false;
		} else if (!codins.equals(other.codins))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Corso [codins=" + codins + ", crediti=" + crediti + ", nome=" + nome + ", pd=" + pd + "]";
	}
	
	
	
	
	
}
