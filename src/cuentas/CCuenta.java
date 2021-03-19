
package cuentas;

/**
 * Esta clase evalua si el dinero que sacamos es inferior al saldo en cuenta 
 * @author Tomás Jesus Alvarez Torres 
 * @version 10/02/2021
 * @see <a href="https://github.com/Ttomyy/tarea04>github.com</a>
 *
 */

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }
    /**parametros 
     * @param nom referencia al nombre
     * @param cue refiere a la cuenta 
     * @param sal refiere al saldo 
     *  */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
    	setNombre(nom);
		setCuenta(cue);
		setSaldo(sal);
    }

    public double estado()
    {
        return getSaldo();
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
