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
        int numero = validadorNumero(pedirNum());
        String binario = Division(numero);
        binario = Completar(binario);
        System.out.print(binario);
    }

    public static int pedirNum() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("introdusca el numero a convertir");
        int numero = entrada.nextInt();
        return numero;
    }

    public static int validadorNumero(int numero) {
        try {
            if (numero < 0 || numero > 255) {
                numero = pedirNum();
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
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
