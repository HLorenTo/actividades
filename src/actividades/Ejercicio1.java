/*
 Desarrollar un algoritmo que genere un número aleatorio de 1 a 100 
(Math.random) y por medio de una condicional determinar sí el número 
es menor a 50 o mayor. 
 */
package actividades;
public class Ejercicio1 {
public static void main(String[] args) {
   double numeroAleatorio = Math.random()*100;
    System.out.println(numeroAleatorio);
    if (numeroAleatorio > 50){
        System.out.println("El numero aleatorio es mayor que 50");
    }else {
        System.out.println("El numero aleatorio es menor que 50");
    }    
}

}
