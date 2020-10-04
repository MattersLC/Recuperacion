package Recuperacion;

import java.util.Scanner;

public class Recuperacion {
    
    public static Scanner sc = new Scanner (System.in);
    public static String str;
    public static int contador=0; 
    public static int aux;
    public static char pila[];
    
    public static void pedirDatos() {
        System.out.print("Ingresa los datos: ");
        str = sc.next();
    }
    
    public static void analizar() {
        aux=str.length();
        pila = new char[aux];
        
        for (int i=0; i<str.length(); i++) {
            
            // Contar los paréntesis ( ).
            if (str.charAt(i) == '('){
                pila[contador] = '(';
                contador++;
            } else if (str.charAt(i) == ')'){
                if (contador == 0) {
                    break;
                } else {
                    contador--;
                }
            }
            
            // Contar las llaves { }.
            if (str.charAt(i) == '{'){
                pila[contador] = '{';
                contador++;
            } else if (str.charAt(i) == '}'){
                if (contador == 0) {
                    break;
                } else {
                    contador--;
                    //break;
                }
            }
            
            // Contar las llaves [ ].
            if (str.charAt(i) == '['){
                pila[contador] = '[';
                contador++;
            } else if (str.charAt(i) == ']'){
                if (contador == 0) {
                    break;
                } else {
                    contador--;
                }
            }
        }
    }
    
    public static void mostrar() {
        if(contador == 0){
            System.out.println("Correcto");
        } else{
            System.out.println("Incorrecto");
        }
    }
    
    public static void main(String[] args) {
        pedirDatos();
        analizar();
        mostrar();
        System.out.println("Contador: "+contador);
    }
}
