/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

public class CuentaAhorros extends CuentaBancaria
        
{
    public CuentaAhorros (String cedula,String nombre,double saldo)
    {
        super(cedula,nombre,saldo);
        
    }

    @Override
    public double deposito(double saldo,double aumenta) 
    {
        double saldod = saldo+=aumenta;
        return saldod;
    }

    @Override
    public double retiro(double saldo,double incrementa) 
    {
         double saldor = saldo-incrementa;
                 return saldor;
                
    }
    
    
}



