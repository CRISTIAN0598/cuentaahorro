
package ejercicio;

import java.util.Date;

 
public abstract class CuentaBancaria  
{
    private String cedula;
    private String nombre;
    private Date fechaApertura;
    private double saldo;
    
    public CuentaBancaria (String cedula,String nombre,double saldo)
    {
        this.cedula = cedula;
        this.nombre = nombre;
       this.saldo = saldo;
    }

    
    public String getCedula() 
    {
        return cedula;
    }

    
    public String getNombre() 
    {
        return nombre;
    }

  
    public Date getFechaApertura() {
        return fechaApertura;
    }

    
    public double getSaldo()
    {
        return saldo;
    }
     
    public abstract double deposito(double saldo,double aumenta);
    public abstract double retiro(double saldo,double incrementa);
}




