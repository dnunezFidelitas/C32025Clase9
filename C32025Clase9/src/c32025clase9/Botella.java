/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c32025clase9;

/**
 *
 * @author viti
 */
public class Botella {
    private String marca;
    private String material;
    private String tapa;
    private String color;
    private int altura;
    private double capacidad;

    public Botella(String botella, String material, String tapa, String color, int altura, double capacidad) {
        this.marca = botella;
        this.material = material;
        this.tapa = tapa;
        this.color = color;
        this.altura = (int)(Math.random() * 100);
        this.capacidad = capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTapa() {
        return tapa;
    }

    public void setTapa(String tapa) {
        this.tapa = tapa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Botella{" + "marca=" + marca + ", material=" + material + ", tapa=" + tapa + ", color=" + color + ", altura=" + altura + ", capacidad=" + capacidad + '}';
    }
    
    
}
