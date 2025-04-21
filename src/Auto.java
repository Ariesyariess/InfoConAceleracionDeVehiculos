/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 37119397
 */
public class Auto {
    private final String color;
    private final String marca;
    private final int velocidad;
    private final String combustible;
    private final int puertas;

    public Auto(String color, String marca, int velocidad, String combustible, int puertas) {
        this.color = color;
        this.marca = marca;
        this.velocidad = velocidad;
        this.combustible = combustible;
        this.puertas = puertas;
    }

    public String mostrarDatos() {
        return "Auto:\nColor: " + color + "\nMarca: " + marca +
               "\nVelocidad: " + velocidad + " km/h\nCombustible: " + combustible +
               "\nPuertas: " + puertas;
    }

    private int acelerar() {
        return velocidad + 15; // Aumenta 15 km/h por ejemplo
    }
}