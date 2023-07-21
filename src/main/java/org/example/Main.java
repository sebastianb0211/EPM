package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        String numeroContrato;
        String estratoUsuario;
        String nombreUsuario;
        double totalCuenta;
        long totalEnergia;
        int totalAgua;
        short totalSanitario;
        double totalGas;
        int totalEmpresasVarias;
        double cuentaTotalDescuento;
        int estratoUsuarioDos;
        double totalCuenta1;

        System.out.print("Bienvenido a Epm por favor ingrese su nombre: ");
        nombreUsuario=teclado.nextLine();

        System.out.print("Ahora ingrese su numero de contrato: ");
        numeroContrato=teclado.nextLine();

        System.out.print("Ahora por favor ingrese su estrato de residencia : ");
        estratoUsuario=teclado.next();

        System.out.print("Ahora ingrese el valor de su Gasto de energia: ");
        totalEnergia=teclado.nextLong();

        System.out.print("Ahora ingrese el valor de su Gasto de agua: ");
        totalAgua=teclado.nextInt();

        System.out.print("Ahora ingrese el valor de su Gasto sanitario: ");
        totalSanitario=teclado.nextShort();

        System.out.print("Ahora ingrese el valor de su Gasto de gas: ");
        totalGas=teclado.nextDouble();

        System.out.print("Ahora ingrese el valor de su Gasto de energia: ");
        totalEmpresasVarias=teclado.nextInt();

        totalCuenta=totalAgua+totalSanitario+totalEnergia+totalGas+totalEmpresasVarias;
        estratoUsuarioDos=Integer.parseInt(estratoUsuario);

        if (estratoUsuarioDos==1){
            totalCuenta1=totalCuenta*0.2;
            cuentaTotalDescuento=totalCuenta-totalCuenta1;
            System.out.println("Querido usuario: "+nombreUsuario+" con numero de contrato: "+numeroContrato+" su estrato "+estratoUsuario+" le da un descuento total de: "+cuentaTotalDescuento);

        } else if (estratoUsuarioDos==2) {
            totalCuenta1=totalCuenta*0.1;
            cuentaTotalDescuento=totalCuenta-totalCuenta1;
            System.out.println("Querido usuario "+nombreUsuario+" con numero de contrato: "+numeroContrato+" su estrato "+estratoUsuario+" le da un descuento total de: "+cuentaTotalDescuento);

        } else if (estratoUsuarioDos==3) {
            totalCuenta1=totalCuenta*0.05;
            cuentaTotalDescuento=totalCuenta-totalCuenta1;
            System.out.println("Querido usuario "+nombreUsuario+" con numero de contrato: "+numeroContrato+" su estrato "+estratoUsuario+" le da un descuento total de: "+cuentaTotalDescuento);

        } else if (estratoUsuarioDos==4 || estratoUsuarioDos==5 || estratoUsuarioDos==6) {
            System.out.println("Querido usuario "+nombreUsuario+" su estrato tiene demasiados privelegios por lo tanto no hay ningun descuento y su valor por pagar seria: "+totalCuenta);

        }else {
            System.out.println("Querido usuario no podemos coninuar con el proceso por favor ingrese un estrato valido entre el 1 y el 6 gracias");
        }

    }
}
