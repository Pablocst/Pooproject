package registradores;

import java.io.Serializable;

/**
 * @author Pablo e Michael
 * Classe que faz a abstração do arcondicionado
 */
public class Arcondicionado implements Dispositivo, Serializable
{
	/**
	 * Var: String nome, boolean status e private static final long serialVersionUID.
	 */
	private static final long serialVersionUID = -597941876618328951L;
	private String nome;
	private boolean status;
	
	/**
	 * @param nome
	 * @param status
	 * construtor de Arcondicionado
	 */
	public Arcondicionado(String nome, boolean status) 
	{
		this.nome = nome;
		this.status = status;
	}

	/* (non-Javadoc)
	 * @see registradores.Dispositivo#getNome()
	 */
	public String getNome()
	{
		
		return this.nome;
	}
	
	/* (non-Javadoc)
	 * @see registradores.Dispositivo#setNome(java.lang.String)
	 */
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	/* (non-Javadoc)
	 * @see registradores.Dispositivo#getStatus()
	 */
	public boolean getStatus()
	{
		
		return this.status;
	}

	/* (non-Javadoc)
	 * @see registradores.Dispositivo#setStatus(boolean)
	 */
	public void setStatus(boolean status) 
	{
		
		this.status = status;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() 
	{
		
		return "Arcondicionado\nStatus: " + status;
	}
	
	/* (non-Javadoc)
	 * @see registradores.Dispositivo#equals(registradores.Dispositivo)
	 */
	public boolean equals(Dispositivo arc)
	{
		
		if(this.nome.equals(arc.getNome()))
		{
			return true;
		}
		return false;
	}
}
