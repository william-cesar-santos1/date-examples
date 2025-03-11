package br.com.ada.desenvolva.solid.impl;

import br.com.ada.desenvolva.solid.behaviour.*;

public class Duck implements Floatable, Flyable, Moveable, Speed, Walkable {

    @Override
    public void floatz() {
        System.out.println("Pato flutuando");
    }

    @Override
    public void fly() {
        System.out.println("Pato voando");
    }

    @Override
    public void move() {
        System.out.println("Pato em movimento");
    }

    @Override
    public void increase(float value) {
        System.out.println("Pato aumento a velocidade");
    }

    @Override
    public void decrease(float value) {
        System.out.println("Pato diminuiu a velocidade");
    }

    @Override
    public void walk() {
        System.out.println("Pato esta caminhando");
    }

}
