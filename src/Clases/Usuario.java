/**
 * 
 */

package Clases;

/**
 * @author ANGEL-MANTILLA
 *
 */
public class Usuario {
	
	/**
	 * 
	 */
	private String nombre;
	
	/**
	 * 
	 */
	public Usuario() {
		// TODO Auto-generated constructor stub
		this.nombre = " ";
	}
	
	/**
	 * @param nombre
	 */
	public Usuario(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the this.nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the this.nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + "]";
	}

	
}
