/**
 * Clase para manejar las entradas de un blog.
 * La clase se cre� el 03/02/2020.
 * @author Laura Malaga
 * Esta es la versi�n 2.4
 *
 */
public class EntradaBlogLMB {
	/**
	 * separador es el ccar�cter que separa ENTRADA DE del
	 * nombre del autor
	 */
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;

	/**
	 * Constructor de la clase
	 * @param id el n�mero de entrada
	 * @param autor el nombre del autor de la entrada
	 * @param texto el texto que contiene la entrada
	 * @throws IllegalArgumentException Si el n�mero de entrada es negativo, lanza una excepci�n.
	 */
	
	public EntradaBlogLMB(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	/**
	 * 
	 * @return Devuelve el n�mero de la entrada
	 */
	public int getId(){
		return this.id;
	}
	
	/**
	 * 
	 * @return devuelve el texto completo de la entrada
	 */
	public String getTexto(){
		return this.texto;
	}
	
	/**
	 *  
	 * @return devuelve el nombre del autor de la entrada en may�sculas
	 */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	/**
	 * devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
	 * @return el nombre del autor
	 */
	public String devuelveAutor(){
		return this.autor;
	}
	
	/**
	 * 
	 * @param args No tiene porqu� tener argumentos.
	 */
	public static void main(String[] args) {
		EntradaBlogLMB e1=new EntradaBlogLMB (-3,"Laura","�ltimas noticias, est� disponible BixBy 4.0");
		System.out.println(e1);
	}
}