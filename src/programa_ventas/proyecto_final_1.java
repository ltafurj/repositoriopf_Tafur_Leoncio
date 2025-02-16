package programa_ventas;
import java.util.Scanner;
//Clase principal
public class proyecto_final_1 {
 //metodo principal
 public static void main (String args[]){
 //Declaración de variables
 int vt1,vt2,vt3;
 double sm,pt,c;
 String vendedor;
 Scanner lectura=new Scanner(System.in);
 //Entrada de datos
 System.out.print("Nombre de vendedor;");
 vendedor=lectura.next();
 System.out.print("Sueldo Mensual;");
 sm=lectura.nextDouble();
 System.out.print("Venta 1:");
 vt1=lectura.nextInt();
 System.out.print("Venta 2:");
 vt2=lectura.nextInt();
 System.out.print("Venta 3:");
 vt3=lectura.nextInt();
 //Proceso de datos
 c=(vt1+vt2+vt3)*0.10;
 pt=sm+c;
 //Salida de datos
 System.out.println("La comisión de la venta es :"+c);
 System.out.println("El sueldo mensual del vendedor es :"+pt);
 }//Fin del metodo
}//Fin de la clase
