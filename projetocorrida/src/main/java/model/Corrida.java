/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */

import java.util.ArrayList;
import java.util.Date;

public class Corrida {
    public Date inicio;
    Pista pistaEscolhida;
    private ArrayList<Automovel> automoveis = new ArrayList<>();
    
    public void adicionarAutomovel(Automovel a) {
        this.automoveis.add(a);
    }
    public void pistaEscolhida(Pista p) {
        this.pistaEscolhida = p;
    }
    
    private void LiguemSeusmotores() {
        for (Automovel a : this.automoveis) {
            System.out.println(a.acelerar());
        }
    }
    
    public void iniciarCorrida() {
        this.LiguemSeusmotores();
    }
}
