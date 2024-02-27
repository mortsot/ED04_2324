package cuenta;


public class Main {

    
    public static void main(String[] args) {
        CuentaOrtegaSotoMaria2324T4 miCuentaOrtegaSotoMaria2324T4;
        double saldoActual;
        int x;
        
        miCuentaOrtegaSotoMaria2324T4 = new CuentaOrtegaSotoMaria2324T4("Antonio Sánchez","ES55-3058-2365-8522-1234-5678",2500,0);
        System.out.println("Saldo inicial de la cuenta: "+miCuentaOrtegaSotoMaria2324T4.estado()+"€");
        retiraDineroOrtegaSotoMaria(miCuentaOrtegaSotoMaria2324T4);        
        ingresaDineroOrtegaSotoMaria(miCuentaOrtegaSotoMaria2324T4);
        saldoActual = miCuentaOrtegaSotoMaria2324T4.estado();
        System.out.println("El saldo actual es "+ saldoActual );
    }

    public static void ingresaDineroOrtegaSotoMaria(CuentaOrtegaSotoMaria2324T4 miCuentaOrtegaSotoMaria2324T4) {
        int x;
        try
        {
            x=100;
            System.out.println("Ingreso en cuenta de "+x+"€");
            miCuentaOrtegaSotoMaria2324T4.ingresar(x, Ingreso);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar");
        }
    }

    public static void retiraDineroOrtegaSotoMaria(CuentaOrtegaSotoMaria2324T4 miCuentaOrtegaSotoMaria2324T4) {
        int x;
        try
        {
            x=1500;
            System.out.println("Retirada en cuenta de "+x+"€");
            miCuentaOrtegaSotoMaria2324T4.retirar(x);
        } catch (Exception e)
        {
            System.out.print("Fallo al retirar");
        }
    }

}
