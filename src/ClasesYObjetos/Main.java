package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));

        //ESTO SIRVE CON LA CLASE OPERACION, CON METODOS SIN RETORNO
        //Operacion op = new Operacion();
        // op.sumar(n1, n2);
        // op.restar(n1,n2);
        // op.multiplicar(n1, n2);
        // op.dividir(n1, n2);
        // op.mostrarResultados();

        Retornar op = new Retornar();

        int suma= op.sumar(n1, n2);  
        int resta= op.restar(n1,n2);
        int mult= op.multiplicar(n1, n2);
        int div= op.dividir(n1, n2);
        
        op.mostrarResultados(suma, resta, mult, div);
    }
    
}
