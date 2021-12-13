/*
Dados dos números enteros, determinar si uno es múltiplo del otro (Por medio del módulo).
 */
package actividades;
public class Ejercicio4 {
public static void main(String[] args) {
    int numeroUno = 6;
    int numeroDos = 5;
    int modulo = numeroUno%numeroDos;
    if (modulo == 0){
        System.out.println("El numero "+ numeroUno + " es multiplo del numero " + numeroDos);
    }else{
        System.out.println("El numero "+ numeroUno + " No es multiplo del numero " + numeroDos);
    }
}    
}
