/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula10.exercicioobj;

/**
 *
 * @author Luiz Bastos <luizfelipebastossantana@gmail.com>
 * @date 13/03/2024
 * @brief Class Circulo
 */
public class Circulo extends Figura {

    private double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    public Circulo() {
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo [raio= " + raio + ", cor= " + super.getCor() + "]";
    }

    @Override
    public double area() {
        return raio * 3.14 * 2;
    }

}
