/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2p1_mario_ocampo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author mario
 */
public class calculadoraP {
     public static double evaluar(String expresion) {
        Stack<Double> mnt;
         mnt = new Stack<>();
        List<String> elementos = convertir(expresion);

        for (String elemento : elementos) {
            if (numero(elemento)) {
                mnt.push(Double.valueOf(elemento));
            } else {
                double segundoOperando = mnt.pop();
                double primerOperando = mnt.pop();
                double resultado = calcular(primerOperando, segundoOperando, elemento);
                mnt.push(resultado);
            }
        }

        return mnt.pop();
    }

    private static List<String> convertir(String expresion) {
        String[] elementos = expresion.split(" ");
        List<String> Elementos = new ArrayList<>();

        Elementos.addAll(Arrays.asList(elementos));

        return Elementos;
    }

    private static boolean numero(String elemento) {
        try{
            double valor;
            valor = Double.parseDouble(elemento);
            return true;
        }
        catch (NumberFormatException e){
            
        }
         return false;
         
        
    }

    private static double calcular(double primerOperando, double segundoOperando, String operador) {
        switch (operador) {
            case "+" -> {
                return primerOperando + segundoOperando;
             }
            case "-" -> {
                return primerOperando - segundoOperando;
             }
            case "*" -> {
                return primerOperando * segundoOperando;
             }
            case "/" -> {
                return primerOperando / segundoOperando;
             }

        }
         return 0;
    }
}


            
            
        
        
    
    

