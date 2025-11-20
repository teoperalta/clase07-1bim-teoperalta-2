/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioclase;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Ejercicioclase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String mensajeFinal = "";
        String nombre;
        int dias;
        double costoDia;
        double valorCancelar;
        int contador = 1;

        while (contador <= 5) {
            System.out.println("Ingrese el nombre del empleado");
            nombre = entrada.nextLine();
            System.out.println("Ingrese días trabajados");
            dias = entrada.nextInt();
            System.out.println("Ingrese valor de costo por día");
            costoDia = entrada.nextDouble();
            valorCancelar = dias * costoDia;
            entrada.nextLine();
            mensajeFinal = String.format("%sNombre %s:Dias trabajados: %s"
                    + "Costo por día:%.2ftotal $%.2f\n", mensajeFinal, nombre, dias
            , costoDia, valorCancelar);
            contador = contador + 1;
        }
        System.out.printf("%s", mensajeFinal);
    }
}
