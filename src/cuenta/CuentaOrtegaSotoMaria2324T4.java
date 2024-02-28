package cuenta;

/**
 * Clase CuentaOrtegaSotoMaria2324T4.
 * 
 * @author María Ortega Soto
 */

public class CuentaOrtegaSotoMaria2324T4 {

    // ATRIBUTOS 
    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

   
    // CONSTRUCTORES
    
    /**
     * Constructor sin argumentos.
     * 
     */
    public CuentaOrtegaSotoMaria2324T4 ()
    {
    }
   
    /**
     * Constructor e inicializador.
     * <p>
     * @param nom   Nombre del propietario de la cuenta
     * @param cue   Digitos de la cuenta
     * @param sal   Importe actual en la cuenta
     * @param tipo  Tipo de interés de la cuenta
     */
    public CuentaOrtegaSotoMaria2324T4 (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres=tipo;
    }
   
    /**
     * Método para asignar el nombre del propietario de la cuenta.
     * <p>
     * @param nom   Nombre del propietario de la cuenta
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
   
    /**
     * Método para obtener el nombre del propietario la cuenta.
     * <p>
     * @return      Nombre del propietario de la cuenta
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * Método para obtener el saldo de la cuenta.
     * <p>
     * @return      Saldo de la cuenta
     */
     public double estado ()
    {
        return getSaldo();
    }

    /**
     * Método para aumentar el saldo de la cuenta.
     * <p>
     * @param cantidad      Importe a ingresar
     * @param concepto      Justificación del ingreso
     * @throws Exception    Caso de ser negativa la cantidad a ingresar
     */
    public void ingresar(double cantidad, String concepto) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retirar dinero de la cuenta.
     * <p>
     * @param cantidad      Importe a extraer
     * @throws Exception    Caso de no tener saldo
     *                      Caso de extraer cantidad igual al saldo disponible
     *                      Caso de extraer cantidad negativa o igual a 0
     */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()<= cantidad)
            throw new Exception ("No hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Método para obtener el número de la cuenta.
     * <p>
     * @return      Número de la cuenta
     */
    public String obtenerCuenta ()
    {
        return getCuenta();
    }

    /**
     * Método para obtener el nombre del propietario de la cuenta.
     * <p>
     * @return      Nombre del propietario de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para modificar el nombre del propietario de la cuenta.
     * <p>
     * @param nombre    Nuevo nombre del propietario de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el número de la cuenta.
     * <p>
     * @return      Número de la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método para modificar número de la cuenta.
     * <p>
     * @param cuenta    Nuevo número de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método para obtener el saldo de la cuenta.
     * <p>
     * 
     * @return      Valor del saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método para modificar el saldo de la cuenta.
     * <p>
     * @param saldo     Nuevo valor para el saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método para obtener el tipo de interés de la cuenta.
     * <p>
     * 
     * @return      Tipo de interés de la cuenta
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Método para modificar el tipo de interés de la cuenta.
     * <p>
     * 
     * @param tipoInteres   Nuevo tipo de interés para la cuenta
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
