
package libreria;

/**
 * Crear y manejar librerías. Es una clase que nos permite crear instancias de <b>librerías</b>
 * y, gracias a sus métodos, obtener información de ellas y/o poder modificarlas.
 * 
 * @author Miguel Llorente González
 */

public class LibreriaLlorenteGonzalezMiguel2425T4 {
    private String nom;
    private int cantidad;
    private double precio;
    private double saldo;
    
    //Constructor sin argumentos
    public LibreriaLlorenteGonzalezMiguel2425T4(){}

    /**
     * Contructor <b>con parámetros</b> para inicializar todas las <b>propiedades</b> de la clase.
     * @param nom <b>Nombre</b> del libro.
     * @param cantidad <b>Cantidad</b> de ejemplares en stock.
     * @param precio <b>Precio</b> unitario del libro.
     * @param saldo <b>Saldo</b> en la cuenta de la librería.
     */    
    public LibreriaLlorenteGonzalezMiguel2425T4(String nom, int cantidad, double precio, double saldo){
        this.nom = nom;                 //Nombre del libro
        this.cantidad = cantidad;       //Cantidad de ejemplares que hay en stock
        this.precio = precio;           //Precio unitario del libro
        this.saldo = saldo;             //Saldo en la cuenta de la librería
    }
    

    /**
     * Método que devuelve el nombre del libro.
     * @return Nombre del libro.
     */
    public String obtenerNombre(){
        return getNom();
    }
    
    /**
     * Método que devuelve el precio del libro.
     * @return Precio del libro
     */
    public double obtenerPrecio(){
        return getPrecio();
    }
    
    /**
     * Método que devuelve la cantidad de libros de ese ejemplar que quedan para vender.
     * @return Cantidad en stock.
     */
    public int obtenerStock(){
        return getCantidad();
    }
    
    /**
     * Método para obtener el saldo en la cuenta.
     * @return Saldo en la cuenta
     */
    public double obtenerSaldo(){
        return getSaldo();
    }

    
    
    /**
     * Método para <b>aumentar</b> el saldo en un número indicado.
     * @param saldomas <b>Dinero</b> en que el sueldo va a <b>aumentar</b>.
     * @throws Exception 
     */
    public void aumentarSaldo(double saldomas) throws Exception{
        if (saldomas<=0)
            throw new Exception("No se puede ingresar 0 o una cantidad negativa");
        setSaldo(getSaldo() + saldomas);
    }
    
    /**
     * Método para <b>comprar un ejemplar</b> de un libro, <b>actualiza</b> el stock y el saldo.
     * @param canti <b>Cantidad</b> de libros a comprar.
     * @throws Exception 
     */
    public void comprarLibro(int canti) throws Exception{
        if (canti <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa de libros");
        if (getCantidad()>=canti){
            if (getSaldo() <= getPrecio())
                  throw new Exception ("No hay suficiente saldo para comprar");
            else{
                setCantidad(getCantidad() - canti);
                setSaldo(getSaldo() + (getPrecio() * canti));
            }
        }
        else 
            throw new Exception ("No se pueden comprar más libros de los que hay disponibles");
       
    }

    /**
     * Método que devuelve el nombre del libro.
     * @return Nombre del libro.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Método que establece un cambio en el nombre del libro.
     * @param nom Nuevo nombre.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Método que devuelve la cantidad de libros de ese ejemplar que quedan para vender.
     * @return Cantidad en stock.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Método que establece una nueva cantidad de libros de ese ejemplar que quedan para vender.
     * @param cantidad Nuevo valor de la cantidad.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Método que devuelve el precio del libro.
     * @return Precio del libro
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Método que establece un nuevo valor para el precio del libro.
     * @param precio Nuevo precio del libro
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Método para obtener el saldo en la cuenta.
     * @return Saldo en la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método para establecer un nuevo valor del saldo en la cuenta.
     * @param saldo Nuevo valor del saldo.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
