package cuentas;

/**
 * Clase que representa cuenta bancaria con un saldo y un tipo de interés
 * Se pueden realizar operaciones ingresar y retirar
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    /**
     * Constructor que inicializa los valores de la cuenta con los parámetros proporcionados
     * @param nom El nombre del titular de la cuenta
     * @param cue El número de cuenta
     * @param sal El saldo inicial de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Obtiene el nombre del titular de la cuenta
     * @return El nombre del titular de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta
     * @param nombre El nuevo nombre del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInterés() {
        return tipoInterés;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Devuelve el estado actual de la cuenta
     * @return El saldo de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Ingresa una cantidad de dinero en la cuenta. Cantidad negativa - lanza excepción
     * @param cantidad La cantidad a ingresar en la cuenta
     * @throws Exception Si la cantidad es negativa, se lanza una excepción
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

     /**
     * Retira una cantidad de dinero de la cuenta. Si la cantidad es negativa o el saldo es insuficiente, lanza una excepción
     * @param cantidad La cantidad a retirar de la cuenta
     * @throws Exception Si la cantidad es negativa o el saldo es insuficiente, se lanza una excepción
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
