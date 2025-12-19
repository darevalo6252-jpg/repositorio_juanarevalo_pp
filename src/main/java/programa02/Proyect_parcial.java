/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package programa02;
import java.util.Scanner;
/**
 *
 * @author DIEGO
 */
public class Proyect_parcial {

    public static void main(String args[]) {
        String empleado;
        double ht,th,sb,d,sn;
        //creando objeto de lectura
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Nombre de empleado: ");
        empleado=lectura.next();
        System.out.print("Horas trabajadas: ");
        ht=lectura.nextDouble();
        System.out.print("Tarifa por hora: ");
        th=lectura.nextDouble();
        //proceso de datos
        sb=ht*th;
        d=sb*0.13;
        sn=sb-d;
        //salida de datos
        System.out.println("Sueldo bruto: "+sb);
        System.out.println("Descuento: "+d);
        System.out.println("Sueldo neto: "+sn);
        System.out.print("Codigo modificado");
    }//fin del metodo
}//fin del programa
