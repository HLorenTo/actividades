/*
Dados dos números enteros, determinar cuál es el mayor por medio de 
una condicional y realizar una potencia con el número menor como 
exponente (Math.pow).
 */
package actividades;
public class Ejercicio2 {
public static void main(String[] args) {
    int numeroUno = 2;
    int numeroDos = 3;
    if (numeroUno < numeroDos){
        double potencia = Math.pow(numeroUno, numeroDos);
        System.out.println("La potencia del numero menor es: "+ potencia);
    }
    else {
        double potencia = Math.pow(numeroDos, numeroUno);
        System.out.println("La potencia del numero menor es: "+ potencia);
    }
    
}    
}
