package registradores;

import java.io.Serializable;
import java.util.Vector;

/**
 * @author Pablo e Michael
 * Classe referente à coleção de objetos do tipo Dispositivos que é uma interface.
 */
public class ColecaoDispositivos implements Serializable 
{
	/**
	 * Var: private Vector<Dispositivo> dispositivos.
	 */
	private static final long serialVersionUID = -2213523052812618945L;
	private Vector<Dispositivo> dispositivos;
	
	/**
	 * Construtor de ColecaoDispositivos
	 */
	public ColecaoDispositivos()
	{
		
		dispositivos = new Vector<Dispositivo> ();
	}
	
	/**
	 * @param dispositivo
	 * adiciona um objeto do tipo Dispositivo.
	 * @return retorna verdadeiro caso o objeto seja adicionado com sucesso.
	 */
	public boolean adicionaDispositivo(Dispositivo dispositivo)
	{
		for(int i = 0; i < dispositivos.size(); i++)
		{
			if(dispositivos.get(i).equals(dispositivo))
			{
				dispositivos.remove(i);
				break;
			}
		}
		dispositivos.add(dispositivo);
		return true;
	}
	
	public Dispositivo getDispositivo(int i)
	{
		return dispositivos.get(i);
	}
	
	/**
	 * Seta a coleção como null limpando-a assim.
	 */
	public void limparColecao()
	{
		
		dispositivos = null;
	}
	
	/**
	 * Remove um Dispositivo do tipo Maquina.
	 */
	public void excluirMaquinas()
	{
		for(int i = dispositivos.size() - 1; i >= 0; i--)
		{
			if(dispositivos.get(i) instanceof Maquina)
			{
				removeDispositivo(dispositivos.get(i));
			}
		}
	}
	
	/** 
	 * Remove um Dispositivo do tipo Arcondicionado 
	 */
	public void excluirArcondicionados()
	{
		for(int i = dispositivos.size() - 1; i >= 0; i--)
		{
			if(dispositivos.get(i) instanceof Arcondicionado)
			{
				removeDispositivo(dispositivos.get(i));
			}
		}
	}
	
	/**
	 * Remove um Dispositivo do Tipo Datashow.
	 */
	public void excluirDatashows()
	{
		
		for(int i = dispositivos.size() - 1; i >= 0; i--)
		{
			if(dispositivos.get(i) instanceof Datashow)
			{
				removeDispositivo(dispositivos.get(i));
			}
		}
	}
	
	/**
	 * Lista todos os dispositivos.
	 * @return retorna a posição do ultimo elemento do vector.
	 */
	public int listagemDispositivos()
	{
		int i;
		for(i = 0; i < dispositivos.size(); i++)
		{
			System.out.println(dispositivos.get(i).toString());
		}
		return i;
	}
	
	/**
	 * @param dispositivo
	 * remove o Dispositivo especificado.
	 * @return retorna true se conseguir remover ou false caso não.
	 */
	public boolean removeDispositivo(Dispositivo dispositivo)
	{
		for(int i = 0; i < dispositivos.size(); i++)
		{
			if(dispositivos.get(i).equals(dispositivo))
			{
				dispositivos.remove(dispositivo);
				return true;
			}
		}
		return false;
	}
	
	/**
	 * @param MAC
	 * pesquisa Maquina pelo MAC
	 * @return retorna a Maquina referente ao MAC especificado.
	 */
	public Maquina pesquisaMaquina(String MAC)
	{
		
		for(int i = 0; i < dispositivos.size(); i++)
		{
			if(dispositivos.get(i) instanceof Maquina)
			{
				Maquina dispTemp = (Maquina)dispositivos.get(i);
				if(dispTemp.getMAC().equals(MAC))
				{
					return dispTemp;
				}
			}
		}
		return null;
	}
	
	/**
	 * @return retorna o tamanho da coleção.
	 */
	public int size()
	{
		
		return dispositivos.size();
	}
	
	/**
	 * @param i
	 * Verifica se o Dispositivo é Maquina.
	 * @return retorna true se o Dispositivo for Maquina e false caso não.
	 */
	public boolean isMaquina(int i)
	{
		
		if(dispositivos.get(i) instanceof Maquina)
		{
			return true;
		}
		return false;
	}
	
	/**
	 * @return retorna a quantidade de Dispositivos do tipo Maquina.
	 */
	public int sizeMaquina()
	{
		
		int j = 0;
		for(int i = 0; i < dispositivos.size(); i++)
		{
			if(isMaquina(i))
			{
				j++;
			}
		}
		return j;
	}
	
	/**
	 * @return retorna a coleção de Dispositivos referente somente as Maquinas.
	 */
	public ColecaoDispositivos getColMaq()
	{
		
		ColecaoDispositivos colmaq = new ColecaoDispositivos();
		for(int i = 0; i < dispositivos.size(); i++)
		{
			if(isMaquina(i))
			{
				colmaq.adicionaDispositivo(dispositivos.get(i));
			}
		}
		if(colmaq.size() == 0)
		{
			return null;
		}
		return colmaq;
	}
	
	/**
	 * @param nome
	 * Pesquisa o Dispositivo pelo nome.
	 * @return retorna o objeto caso ele exista ou null caso null caso não.
	 */
	public Dispositivo pesquisaPeloNome(String nome)
	{
		
		for(int i = 0; i < dispositivos.size(); i++)
		{
			if(dispositivos.get(i).getNome().equals(nome))
			{
				return dispositivos.get(i);
			}
		}
		return null;
	}
}
