/**
 * Clase para manejar las entradas de un blog.
 * La clase se creó el 03/02/2020.
 * @author Laura Malaga
 * Esta es la versión 2.4
 *
 */
public class EntradaBlogLMB {
	/**
	 * separador es el ccarácter que separa ENTRADA DE del
	 * nombre del autor
	 */
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;

	/**
	 * Constructor de la clase
	 * @param id el número de entrada
	 * @param autor el nombre del autor de la entrada
	 * @param texto el texto que contiene la entrada
	 * @throws IllegalArgumentException Si el número de entrada es negativo, lanza una excepción.
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
	 * @return Devuelve el número de la entrada
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
	 * @return devuelve el nombre del autor de la entrada en mayúsculas
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
	 * @param args No tiene porqué tener argumentos.
	 */
	public static void main(String[] args) {
		EntradaBlogLMB e1=new EntradaBlogLMB (-3,"Laura","Últimas noticias, está disponible BixBy 4.0");
		System.out.println(e1);
	}
}