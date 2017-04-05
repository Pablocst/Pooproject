package registradores;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Vector;

/**
 * @author Pablo e Michael.
 * Classe referente ‡ coleÁ„o de objetos do tipo Instituicoes.
 *
 */
public class ColecaoInstituicoes implements Serializable 
{
	/**
	 * Var: private Vector,Instituicao> instituicoes.
	 */
	private static final long serialVersionUID = 7663710807871190013L;
	private Vector<Instituicao> instituicoes;
	
	/**
	 * Construtor de ColecaoInstituicoes.
	 */
	public ColecaoInstituicoes()
	{
		
		instituicoes = new Vector<Instituicao>();
	}
	
	/**
	 * @param inst
	 * adiciona um objeto do tipo Instituicao.
	 * @return retorna verdadeiro caso o objeto seja adicionado com sucesso.
	 */
	public boolean adicionaInstituicao(Instituicao inst)
	{
		
		for(int i = 0; i < instituicoes.size(); i++)
		{
			if(instituicoes.get(i).equals(inst))
			{
				return false;
			}
		}
		instituicoes.add(inst);
		return true;
	}
	
	public Instituicao getInst(int i)
	{
		return instituicoes.get(i);
	}
	
	/**
	 * Seta a coleÁ„o como null limpando-a assim.
	 */
	public void limparColecao()
	{
		
		instituicoes = null;
	}
	
	/**
	 * Lista todas as Instituioes.
	 * @return retorna a posiÁ„o do ultimo elemento do vector.
	 */
	public int listageminstituicoes()
	{
		
		int i;
		System.out.println("INSTITUI√á√ïES");
		for(i = 0; i < instituicoes.size(); i++)
		{
			System.out.println(instituicoes.get(i).toString());
		}
		return i;
	}
	
	/**
	 * @param inst
	 * remove a Instituicao especificado.
	 * @return retorna true se conseguir remover ou false caso n„o.
	 */
	public boolean removeInstituicao(Instituicao inst)
	{
		
		for(int i = 0; i < instituicoes.size(); i++)
		{
			if(instituicoes.get(i).equals(inst))
			{
				instituicoes.remove(inst);
				return true;
			}
		}
		return false;
	}
	
	/**
	 * @return retorna o tamanho da coleÁ„o.
	 */
	public int size()
	{
		
		return instituicoes.size();
	}
	
	/**
	 * @param inst
	 * Pesquisa a InstituiÁ„o especificada.
	 * @return retorna o objeto caso ele exista ou null caso null caso n„o.
	 */
	public Instituicao procuraInst(Instituicao inst)
	{
		
		for(int i = 0; i < instituicoes.size(); i++)
		{
			if(instituicoes.get(i).equals(inst))
			{
				return instituicoes.get(i);
			}
		}
		return null;
	}
	
	/**
	 * @throws Exception
	 * MÈtodo que acessa o arquivo e atribui a coleÁ„o instituicoes a coleÁ„o presente no arquivo.
	 */
	@SuppressWarnings({ "unchecked" })
	public void recuperaArquivo() throws Exception
	
	{
		File file;
		FileInputStream fin;
		ObjectInputStream oin;
		try
		{
			file = new File("D:/Pen-Card Amway/IFPB/Projeto Automa√ß√£o das Salas/AutomacaoSalasIF/Exemplo Dados Salvos em Texto/conteudo.dat");
			if(file.exists())
			{
				fin = new FileInputStream(file);
				oin = new ObjectInputStream(fin);
				if(oin.readObject() != null)
				{
					instituicoes = (Vector<Instituicao>) oin.readObject();
				}
				else
				{
					instituicoes = new Vector<Instituicao>();
				}
				oin.close();
				fin.close();
			}
		}
		catch(Exception e)
		{
			throw new Exception(e.getMessage());
		}
	}
	
	/**
	 * @throws Exception
	 * MÈtodo que escreve os objetos no arquivo.
	 */
	public void gravaArquivo() throws Exception
	{
		
		File file;
		FileOutputStream fout;
		ObjectOutputStream oout;
		try
		{
			file = new File("D:/Pen-Card Amway/IFPB/Projeto Automa√ß√£o das Salas/AutomacaoSalasIF/Exemplo Dados Salvos em Texto/conteudo.dat");
			fout = new FileOutputStream(file);
			oout = new ObjectOutputStream(fout);
			file.createNewFile();
			oout.writeObject(instituicoes);
			oout.close();
			fout.close();
		}
		catch(Exception e)
		{
			throw new Exception(e.getMessage());
		}
	}
}
