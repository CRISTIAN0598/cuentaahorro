
package ejercicio;

public class CuentaCorriente extends CuentaBancaria
        
{
     public CuentaCorriente (String cedula,String nombre,double saldo)
    {
        super(cedula,nombre,saldo);
        
    }

    @Override
    public double deposito(double saldo) 
    {
        double saldod = saldo;
        return saldod;
    }

    @Override
    public double retiro(double saldo) 
    {
         double saldor = saldo;
                 return saldor;
                
    }
    
    
}



