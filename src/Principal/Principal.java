/**
 * 
 */

package Principal;
import java.util.*;
import Clases.*;

/**
 * @author ANGEL-MANTILLA
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Usuario> personas = new ArrayList<Usuario>(); 
		
		personas.add(new Usuario("Pedro"));
		personas.add(new Usuario("Maria"));
		
		for(Usuario A: personas) {
			System.out.println(A);
		}
	}
}
