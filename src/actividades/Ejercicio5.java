/*
Por medio de una nota decimal, determinar sí el estudiante aprobó o no 
la clase (0 – 6 = Perdió – 7 – 10 = Aprobó).
 */
package actividades;
public class Ejercicio5 {
public static void main(String[] args) {
    double nota = 8;
    if (nota <= 6.9){
        System.out.println("El estudiante perdio con una nota de "+nota);
    }else if (nota >= 7 && nota <= 10){
        System.out.println("El estudiante Aprobo con una nota de "+nota);
    }
}    
}
