package registradores;

public class Maquina implements Dispositivo 
{
	
	private String nome;
	private String MAC;
	private String IP;
	private boolean status;
	
	public Maquina(String nome, String mAC, String iP, boolean status) 
	{
		super();
		this.nome = nome;
		MAC = mAC;
		IP = iP;
		this.status = status;
	}
	
	public Maquina(String mAC, String iP, boolean status) 
	{
		super();
		MAC = mAC;
		IP = iP;
		this.status = status;
	}


	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public String getMAC() 
	{
		return MAC;
	}
	public void setMAC(String mAC) 
	{
		MAC = mAC;
	}
	public String getIP() 
	{
		return IP;
	}
	public void setIP(String iP) 
	{
		IP = iP;
	}
	
	
	public boolean isStatus() 
	{
		return status;
	}
	public void setStatus(boolean status) 
	{
		this.status = status;
	}
	
	public String toString() 
	{
		return "Maquina nome: " + nome + ", MAC: " + MAC + ", IP: " + IP + ", status: " + status;
	}
	
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Maquina other = (Maquina) obj;
		if (IP == null) {
			if (other.IP != null)
				return false;
		} else if (!IP.equals(other.IP))
			return false;
		if (MAC == null) {
			if (other.MAC != null)
				return false;
		} else if (!MAC.equals(other.MAC))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (status != other.status)
			return false;
		return true;
	}
	
	

}
