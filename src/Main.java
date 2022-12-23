//Primera parte:
//Crear una función con tres parámetros que sean números que se suman entre sí.
//Llamar a la función en el main y darle valores.

//Segunda parte:
//Crear una clase coche.
//Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
//Una función que incremente el número de puertas que tiene el coche.
//Crear un objeto miCoche en el main y añadirle una puerta.
//Mostrar el número de puertas que tiene el objeto.

public class Main {
    public static void main(String[] args) {
        int num1=10;
        int num2=20;
        int num3=30;
        System.out.println(suma(num1, num2, num3));

        Coche miCoche=new Coche();
        miCoche.incPuertas();
    }
    public static int suma(int num1, int num2, int num3) {
        return num1+num2+num3;
    }
}
class Coche {
    int numeroPuertas=4;
    public void incPuertas(){
        System.out.println(++numeroPuertas);
    }
}
