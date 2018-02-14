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
public class Jugador {
    Color color;
    Tablero tablero;
    ArrayList<Pieza> piezas;

    public Jugador(Color color, Tablero tablero) {
        this.color = color;
        this.tablero = tablero;
    }
    
    
    
}
