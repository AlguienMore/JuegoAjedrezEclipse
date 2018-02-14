/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoajedrez;

import java.util.ArrayList;

/**
 *
 * @author augustosalazar
 */
public class Tablero {

    ArrayList<Casilla> casillas;

    public Tablero() {
        casillas = new ArrayList<>();
        boolean color = true;
        for (int i = 0; i <= 63; i++) {
            Casilla c
                    = new Casilla(color == true ? Color.negro : Color.blanco, i);
            color = !color;

        }

    }

    public int obtenerCasillasOcupadas() {
        int count = 0;
        for (Casilla casilla : casillas) {
            if (casilla.estaOcupada()){
                count++;
            }
        }
        
        return count;
    }
}
