package registradores;

import java.io.Serializable;
import java.util.Vector;

/**
 * @author Pablo e Michael
 * Classe referente à coleção de objetos do tipo Bloco
 *
 */
public class ColecaoBlocos implements Serializable
{
	/**
	 * Var: private Vector<Bloco> blocos
	 */
	private static final long serialVersionUID = -5589748364330376619L;
	private Vector<Bloco> blocos;
	
	/**
	 * Construtor de ColecaoBlocos
	 */
	public ColecaoBlocos()
	{
		
		blocos = new Vector<Bloco>();
	}
	
	/**
	 * @param bloco
	 * adiciona um objeto do tipo Bloco.
	 * @return retorna verdadeiro caso o objeto seja adicionado com sucesso.
	 */
	public boolean adicionabloco(Bloco bloco)
	{
		
		for(int i = 0; i < blocos.size(); i++)
		{
			if(blocos.get(i).equals(bloco))
			{
				return false;
			}
		}
		blocos.add(bloco);
		return true;
	}
	
	public Bloco getBloco(int i)
	{
		return blocos.get(i);
	}
	
	/**
	 * Seta a coleção como null limpando-a assim.
	 */
	public void limparColecao()
	{
		
		blocos = null;
	}
	
	/**
	 * Lista todos os blocos
	 * @return retorna a posição do ultimo elemento do vector
	 */
	public int listagemblocos()
	{
		
		int i;
		System.out.println("BLOCOS");
		for(i = 0; i < blocos.size(); i++)
		{
			System.out.println(blocos.get(i).toString());
		}
		return i;
	}
	
	/**
	 * @param bloco
	 * remove o Bloco especificado.
	 * @return retorna true se conseguir remover o Bloco ou false caso não.
	 */
	public boolean removebloco(Bloco bloco)
	{
		
		for(int i = 0; i < blocos.size(); i++)
		{
			if(blocos.get(i).equals(bloco))
			{
				blocos.remove(bloco);
				return true;
			}
		}
		return false;
	}

	/**
	 * @return retorna o tamanho da coleção.
	 */
	public int size()
	{
		
		return blocos.size();
	}
	
	/**
	 * @param nome
	 * pesquisa o Bloco pelo nome.
	 * @return retorna o objeto caso ele exista ou null caso null caso não.
	 */
	public Bloco pesquisaPeloNome(String nome)
	{
		
		int i, flag = -1;
		for(i = 0; i < blocos.size(); i++)
		{
			if(blocos.get(i).getNome().equals(nome))
			{
				flag = i;
				break;
			}
		}
		if(flag != -1)
		{
			return blocos.get(flag);
		}
		else
		{
			return null;
		}
	}
}
