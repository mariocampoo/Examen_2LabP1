/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2p1_mario_ocampo;

import static ex2p1_mario_ocampo.calculadoraP.evaluar;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Ex2P1_Mario_Ocampo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("");
            System.out.println("1) Hang man game");
            System.out.println("2) Calculadora Polaca");
            System.out.println("3) Salir");
            opcion = scanner.nextInt();
            System.out.println("");
            
                if (opcion == 1) {
                    Scanner sc = new Scanner(System.in);
                    int iniciar = 0;
                    ArrayList<String> palabrasA = new ArrayList();
                    ArrayList<String> linea = new ArrayList();

                    palabrasA.add("Hola");
                    palabrasA.add("Programacion");
                    palabrasA.add("Laboratorio");

                    System.out.println("Bienvenido a Hang Man");
                    System.out.println("");

                    System.out.println("Iniciar -> 1");
                    iniciar = sc.nextInt();

                    if (iniciar == 1) {
                        Scanner inte = new Scanner(System.in);
                        System.out.println("El banco de palabras contiene -> ");
                        System.out.print(palabrasA);
                        System.out.println("");
                        System.out.println("Ingrese la cantidad de intentos: ");
                        int intentos = inte.nextInt();
                        System.out.println("Desea mantener registro de letras (SI-1/NO-2)");
                        int desicion = inte.nextInt();

                        if (desicion == 1) {
                            if (intentos>1) {
                                for (int i = 0; i < intentos; i++) {
                                    System.out.println("eligiendo palabra aleatorea");
                                    String elemnto1 = palabrasA.get(0);
                                    System.out.println(elemnto1);
                                    
                                    System.out.println("comienze");
                                    String com=inte.nextLine();
                                }
                                

                            }

                        } else {
                            if (desicion == 2) {
                                Scanner bj = new Scanner(System.in);
                                System.out.println("Agrege una palabra");
                                String plb = bj.nextLine();

                                palabrasA.add(plb);

                                System.out.print(palabrasA);
                            }

                        }

                    }
                } else {
                    if (opcion == 2) {

                        Scanner calcu = new Scanner(System.in);
                        System.out.print("Ingrese la expresion: ");
                        String expresion = calcu.nextLine();
                        double resultado = evaluar(expresion);
                        System.out.println("El resultado es: " + resultado);
                    }
                }
            }
        }
    }

   