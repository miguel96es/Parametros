package ClasesYObjetos;

public class Retornar {
    
    //metodos

    //metodo para sumar
    public int sumar (int numero1,int numero2){
        int suma = numero1+numero2;
        return suma;
    }

    //metodo para restar
    public int restar(int numero1,int numero2){
        int resta= numero1-numero2;
        return resta;
    }

    //metodo para multiplicar
    public int multiplicar(int numero1,int numero2){
        int multiplicacion= numero1*numero2;
        return multiplicacion;
    }

    //metodo para restar
    public int dividir(int numero1,int numero2){
        int division= numero1/numero2;
        return division;
    }

    //metodo para mostrar los resultados
    public void mostrarResultados(int suma,int resta,int multiplicacion,int division){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }
}
