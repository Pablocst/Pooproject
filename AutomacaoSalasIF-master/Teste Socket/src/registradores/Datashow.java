package registradores;

public class Datashow implements Dispositivo
{
	private boolean status;

	public Datashow(boolean status) 
	{
		super();
		this.status = status;
	}

	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Datashow other = (Datashow) obj;
		if (status != other.status)
			return false;
		return true;
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
		return "Datashow status: " + status;
	}

}
