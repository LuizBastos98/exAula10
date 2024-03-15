/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula10.exercicioobj;

/**
 *
 * @author Luiz Bastos <luizfelipebastossantana@gmail.com>
 * @date 13/03/2024
 * @brief Class Quadrado
 */
public class Quadrado extends Retangulo {
    
    public Quadrado(){
    }
    
    public Quadrado(String cor, double lado1, double lado2){
        super(cor, lado1, lado2);
    }

    public Quadrado(String cor, double lado){
        lado = super.getLado1();
    }
    
    @Override
    public double area(){
        return this.getLado1() * this.getLado1();
}
    @Override
    public String toString(){
        return "Quadrado [area()= " + area() + ", cor= " + super.getCor() + "]";
    }
}