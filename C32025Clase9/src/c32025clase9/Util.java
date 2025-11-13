/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c32025clase9;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class Util {
    
    
    public Botella[] creaVectorDeBotellas(int cantidad){
        Botella botellas[] = new Botella[cantidad];
        for (int i = 0; i < cantidad; i++) {
            String marca = JOptionPane.showInputDialog("Digite la marca");
            botellas[i]= new Botella(marca, "", "", "", 0, 0);
        }
        
        botellas[0].setAltura(25);
        botellas[0].setMarca("Patito");
        botellas[0].setColor("Azul");
        botellas[0].setMaterial("1");
        botellas[0].setTapa("nose");
        imprimeBotellas(botellas);
        return null;
    }
    
    public void imprimeBotellas (Botella [] vector){
        String resultado ="";
        for (int i = 0; i < vector.length; i++) {
            resultado+= " - " + vector[i].toString() + "\n";
        }
        
        JOptionPane.showMessageDialog(null, resultado);
    }
    
}
