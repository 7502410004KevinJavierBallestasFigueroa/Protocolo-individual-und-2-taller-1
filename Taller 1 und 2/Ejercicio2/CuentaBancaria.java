package Ejercicio2;

public class CuentaBancaria {
    
    private String numeroCuenta;
    private String tipoCuenta;
    private int saldo;

    public CuentaBancaria(){
        this.numeroCuenta = "0123456789";
        this.tipoCuenta = "Ahorros";
        
    }
    public CuentaBancaria(String numeroCuenta, String tipoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
    }
    public CuentaBancaria(String numeroCuenta, String tipoCuenta, int saldo){
        this(numeroCuenta, tipoCuenta);
        this.saldo = saldo;
        
    }
    @Override
    public String toString() {
        return "CuentaBancaria [numeroCuenta=" + numeroCuenta + ", tipoCuenta=" + tipoCuenta + ", saldo=" + saldo + "]";
    }
}
