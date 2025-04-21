/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Moto {
    private final String color;
    private final String marca;
    private final int velocidad;
    private final String combustible;

    public Moto(String color, String marca, int velocidad, String combustible) {
        this.color = color;
        this.marca = marca;
        this.velocidad = velocidad;
        this.combustible = combustible;
    }

    public String mostrarDatos() {
        return "Moto:\nColor: " + color + "\nMarca: " + marca +
               "\nVelocidad: " + velocidad + " km/h\nCombustible: " + combustible;
    }

    private int acelerar() {
        return velocidad + 10; // Aumenta 10 km/h por ejemplo
    }
}
