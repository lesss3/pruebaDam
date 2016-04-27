/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizame;

import static refactorizame.Refactorizame.mostrarResultado;

/**
 *
 * @author alumnado
 */
public class Calculos {
     static double doblePi(final double PI)
    {
        double resu;
        resu = PI + PI;
        return resu;
    }

    static int Operaciones(int numero)
    {
        if (numero < 8){
            for (int i = 0; i < 5; i++)
            numero = numero - i;
        }else
            numero = numero * 2;
        return numero;
    }
        public static void CalculosPI(final double PI) {
        double resultado;
        for (int i = 2; i < 5; i++) {
            resultado = (PI * i - 1) / PI;
            mostrarResultado(resultado);
        }
    }
}
