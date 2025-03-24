
package libreria;
/**
 * Clase que hace uso de la clase LibreríaLlorenteGonzalezMiguel2425T4. Consta de:
 * <ol>
  <li>Un método <b>main</b> que usa los métodos de la clase <b>Libreria</b>.</li>
  <li>Dos <b>nuevos métodos</b>.</li>
</ol>
 * @author Miguel Llorente González
 * 
 */
public class Main {
  
    /**
     * Método <b>main</b> que realiza operaciones con la clase Libreria y con los métodos
     * <b>creados en esta misma clase</b>.
     * @param args 
     */
    public static void main(String[] args) {
        LibreriaLlorenteGonzalezMiguel2425T4 miLibreriaLlorenteGonzalezMiguel2425T4;
        String x;
        int stock;
        int num;
        double dinero;
        double saldoActual;
        double ingreso;
        
        miLibreriaLlorenteGonzalezMiguel2425T4 = new LibreriaLlorenteGonzalezMiguel2425T4("Don Quijote de la Mancha", 10, 45, 120);

        compraQuijoteLlorenteGonzalezMiguel2425T4(miLibreriaLlorenteGonzalezMiguel2425T4);
        
        saldoActual = miLibreriaLlorenteGonzalezMiguel2425T4.obtenerSaldo();
        System.out.println("El saldo al comprar el libro es de "+ saldoActual );        
        x = miLibreriaLlorenteGonzalezMiguel2425T4.obtenerNombre();
        stock = miLibreriaLlorenteGonzalezMiguel2425T4.obtenerStock();
        System.out.println("El libro "+x+" tiene un stock de "+stock+" unidades ahora");
        
        añadeIngresoLlorenteGonzalezMiguel2425T4(miLibreriaLlorenteGonzalezMiguel2425T4, "Libro vendido");
    }

    /**
     * Añade <b>30.5€</b> a a un objeto de la clase LibreriaLlorenteGonzalezMiguel2425T4 que
     * introduciremos como parámetro. También tendremos un parámetro <b>concepto</b>.
     * @param miLibreriaLlorenteGonzalezMiguel2425T4
     * @param concepto 
     *  
     */
    public static void añadeIngresoLlorenteGonzalezMiguel2425T4(LibreriaLlorenteGonzalezMiguel2425T4 miLibreriaLlorenteGonzalezMiguel2425T4, String concepto) {
        double ingreso;
        double saldoActual;
        try
        {
            ingreso = 30.5; //Ingreso que se va a realizar en el saldo de la librería
            miLibreriaLlorenteGonzalezMiguel2425T4.aumentarSaldo(ingreso);
            saldoActual = miLibreriaLlorenteGonzalezMiguel2425T4.obtenerSaldo();
            System.out.println("Tu saldo actual después de ingresar es de "+saldoActual+"€");
        } catch (Exception e)
        {
            System.out.println("Fallo al obtener el saldo al ingresar");
        }
    }

    /**
     * Realiza la <b>compra</b> de <b>dos</b> libros a un objeto de la clase LibreriaLlorenteGonzalezMiguel2425T4.
     * Se debería usar en una instancia de objeto que tenga como valor 'nom' un String <b>"Don Quijote de la Mancha"</b>.
     * 
     * @param miLibreriaLlorenteGonzalezMiguel2425T4 
     */
    public static void compraQuijoteLlorenteGonzalezMiguel2425T4(LibreriaLlorenteGonzalezMiguel2425T4 miLibreriaLlorenteGonzalezMiguel2425T4) {
        String x;
        int num;
        double dinero;
        double saldoActual;
        try
        {
            x = "Don Quijote de la Mancha";
            num = 2;    //Número de ejemplares a comprar
            dinero = miLibreriaLlorenteGonzalezMiguel2425T4.obtenerPrecio();
            saldoActual = miLibreriaLlorenteGonzalezMiguel2425T4.obtenerSaldo();
            System.out.println("El libro "+x+" vale "+dinero+"€");
            System.out.println("El saldo actual de la librería es de "+saldoActual+"€");
            miLibreriaLlorenteGonzalezMiguel2425T4.comprarLibro(num);
        } catch (Exception e)
        {
            System.out.println("Error en la compra del libro");
        }
    }
}
