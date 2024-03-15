/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula10.exercicioobj;

/**
 *
 * @author Luiz Bastos <luizfelipebastossantana@gmail.com>
 * @date 13/03/2024
 * @brief Class Test
 */
import java.util.*;

public class Test {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String color;
        double lado1, lado2, raioC, alturaT, baseT;
        int opcao;
        opcao = 0;
        while (opcao != 5) {
            System.out.println("");
            System.out.println("");
            System.out.println("Escolha uma Figura geométrica: \n"
                    + "1  ­Triângulo; \n"
                    + "2 ­ Retângulo; \n"
                    + "3 ­ Quadrado; \n"
                    + "4 ­ Circulo; \n"
                    + "5 ­ sair;");

            opcao = ler.nextInt();
            System.out.println("");
            System.out.println("");
            if (opcao == 1) {
                System.out.println("Informe a base do triângulo: ");
                baseT = ler.nextDouble();

                System.out.println("Informe a altura do triângulo: ");
                alturaT = ler.nextDouble();

                System.out.println("Informe a cor do triângulo: ");
                color = ler.next();

                Triangulo triangulo = new Triangulo(color, baseT, alturaT);
                System.out.println(triangulo);

            } else if (opcao == 2) {
                System.out.println("Informe o lado1 do retângulo: ");
                lado1 = ler.nextDouble();

                System.out.println("Informe o lado2 do retângulo: ");
                lado2 = ler.nextDouble();

                System.out.println("Informe a cor do retângulo: ");
                color = ler.next();

                Retangulo retangulo = new Retangulo(color, lado1, lado2);
                System.out.println(retangulo);

            } else if (opcao == 3) {
                System.out.println("Informe o lado do quadrado: ");
                lado1 = ler.nextDouble();

                System.out.println("Informe a cor do quadrado: ");
                color = ler.next();

                lado2 = lado1;

                Quadrado quadrado = new Quadrado(color, lado1, lado2);
                System.out.println(quadrado);

            } else if (opcao == 4) {
                System.out.println("Informe o raio do círculo: ");
                raioC = ler.nextDouble();

                System.out.println("Informe a cor do círculo: ");
                color = ler.next();

                Circulo circulo = new Circulo(color, raioC);
                System.out.println(circulo);

            } else if (opcao == 5) {
                break;
            } else {
                System.out.println("Opção invalida!");

            }
        }
    }
}