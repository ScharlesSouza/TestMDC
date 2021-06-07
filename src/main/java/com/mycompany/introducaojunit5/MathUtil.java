/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.introducaojunit5;

import java.util.Objects;

/**
 *
 * @author SCHARLES
 */
public class MathUtil {
    
    private MathUtil(){}
    
    private static int menorValor(int a, int b){/*Propriedade 6*/
        if(a<b)
            return a;
        else
            return b;
    }
    public static int mdc(int a, int b){
        
        if(b>0 && a%b == 0){  /*propriedade 1*/          
            return Math.abs(b);            
        }else if(a>0 && b%a == 0){ /*propriedade 1*/
            return Math.abs(a);            
        }else if(b==0){ /*propriedade 3*/            
            return Math.abs(a);
        }else if(a==0){/*propriedade 3*/            
            return Math.abs(b);            
        }else if(isPrimo(a) || isPrimo(b)){
            return 1; 
        }else if(a==0 && b==0){
            return -1;            
        }else{/*Propriedade 2 e 6*/            
            int maximoDivisorComum=0;
            for(int i=1;i<=menorValor(a, b);i++){
                if(a%i==0 && b%i==0)
                    maximoDivisorComum=i;
            }
            return Math.abs(maximoDivisorComum); 
            //mdc(a-b,b);
        }
        
    }
    public static int mdc(int ...valores){
        Objects.requireNonNull(valores, "O parametro valores não pode ser nulo para calcular o mdc");
            if(valores.length==0){
                throw new IllegalArgumentException("É preciso indicar ao menos um valor para calcular o mdc");
            }
            int a=valores[0];
            for (int b : valores) {
                a=mdc(a,b);
            
            }
            return a;
    }
    
    public static boolean isPrimo(final long numero){
        if(numero <= 1){
            return false;
        }

        for(long i = 2; i < numero; i++){
            if(numero%i==0){
                return false;
            }
        }

        return true;
    }
    
}
