/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula10.exercicioobj;

/**
 *
 * @author Luiz Bastos <luizfelipebastossantana@gmail.com>
 * @date 13/03/2024
 * @brief Class Figura
 */
public abstract class Figura {

    private String cor;

    public Figura() {
    }

    public Figura(String cor) {
        super();
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Figura [cor=" + cor + "]";
    }

    public abstract double area(); 
}