/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Conversor {

    public static void Compilador() {
        int numero = pedirNum();
        String binario = Division(numero);
        binario = Completar(binario);
        System.out.print(binario);
    }

    public static int pedirNum() {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("introdusca el numero a convertir");
        try{
            numero = entrada.nextInt();
            if (numero < 0 || numero >255) {
                numero = pedirNum();
            }
        }catch(InputMismatchException e) {
            numero=pedirNum();
        }
        return numero;
    }

    public static int validadorNumero(int numero) {
        try {
            
            if (numero < 0 || numero > 255) {
                numero = pedirNum();
            }
        } catch (InputMismatchException e) {
            System.out.println("hola mundo");
        }
        return numero;
    }

    public static String Division(int numero) {
        String resto, resto1;
        resto = Integer.toString(numero % 2);
        while (numero > 1) {
            numero = numero / 2;
            resto1 = Integer.toString(numero % 2);
            resto = resto1 + resto;
        }
        return resto;
    }

    public static String Completar(String resto) {
        int dif = resto.length();
        if (resto.length() < 8) {
            for (int i = 0; i < (8 - dif); i++) {
                resto = "0" + resto;
            }
        }
        return resto;
    }
}
