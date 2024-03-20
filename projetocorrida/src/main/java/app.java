
import model.Carro;
import model.Corrida;
import model.Moto;
import model.Pista;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class app {
    
    public static void main (String[] args) {
        
       Pista p = new Pista();
        
       Carro carro1 = new Carro();
       Carro carro2 = new Carro();
       Carro carro3 = new Carro();
       
       Moto moto1 = new Moto();
       
       Corrida corrida = new Corrida();
       corrida.pistaEscolhida(p);
       corrida.adicionarAutomovel(carro1);
       corrida.adicionarAutomovel(carro2);
       corrida.adicionarAutomovel(carro3);
       
       corrida.adicionarAutomovel(moto1);
       corrida.iniciarCorrida();
    }
       
}
