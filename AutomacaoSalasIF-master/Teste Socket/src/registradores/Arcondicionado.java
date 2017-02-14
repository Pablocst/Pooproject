package registradores;

public class Arcondicionado implements Dispositivo
{
	private boolean status;

	public Arcondicionado(boolean status) 
	{
		super();
		this.status = status;
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
		return "Arcondicionado status: " + status;
	}

	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arcondicionado other = (Arcondicionado) obj;
		if (status != other.status)
			return false;
		return true;
	}

}
