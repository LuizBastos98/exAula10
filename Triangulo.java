/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula10.exercicioobj;

/**
 *
 * @author Luiz Bastos <luizfelipebastossantana@gmail.com>
 * @date 13/03/2024
 * @brief Class Triangulo
 */
public class Triangulo extends Figura {

    private double base;
    private double altura;

    public Triangulo() {
    }

    public Triangulo(String cor, double base, double altura) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setbase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setaltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Triangulo [base= " + base + ", altura= " + altura + ", cor= " + super.getCor() + "]";
    }

}