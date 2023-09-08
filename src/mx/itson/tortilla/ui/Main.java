/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.tortilla.ui;

import java.util.Scanner;
import mx.itson.tortilla.negocio.Operacion;

/**
 *
 * @author alumnog
 */
public class Main {

    
    public static void main(String[] args) {


     System.out.println("Escriba el enunciado a separar:");

     Scanner scanner = new Scanner (System.in);

String enunciado = scanner.nextLine();

String [] resultado = new Operacion ().separar(enunciado);

for (String s : resultado){
    System.out.println(s);
}

    }
    
}
