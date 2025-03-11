package br.com.ada.desenvolva.solid.impl;

import br.com.ada.desenvolva.solid.behaviour.Floatable;
import br.com.ada.desenvolva.solid.behaviour.Moveable;
import br.com.ada.desenvolva.solid.behaviour.Speed;

public class Boat extends Automotive implements Moveable, Floatable, Speed {

    public Boat() {
        super(new Motor[]{
                new Motor("Yamaha Y1")
        });
    }

    @Override
    public void floatz() {
        System.out.println("Barco flutuando");
    }

    @Override
    public void move() {
        System.out.println("Barco em movimento");
    }

    @Override
    public void increase(float value) {
        System.out.println("Barco aumentou a velocidade");
    }

    @Override
    public void decrease(float value) {
        System.out.println("Barco diminuiu a velocidade");
    }

}
