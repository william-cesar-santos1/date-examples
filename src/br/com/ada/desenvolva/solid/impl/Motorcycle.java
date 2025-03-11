package br.com.ada.desenvolva.solid.impl;

import br.com.ada.desenvolva.solid.behaviour.Moveable;
import br.com.ada.desenvolva.solid.behaviour.Speed;

public class Motorcycle extends Automotive implements Moveable, Speed {

    public Motorcycle() {
        super(new Motor[]{
                new Motor("Kawasawi one")
        });
    }

    @Override
    public void move() {
        super.speed += 1;
        System.out.println("Moto se movendo a "+speed+" km/h");
    }

    @Override
    public void increase(float value) {
        super.increase(value);
        System.out.println("Moto aumentou a velocidade para "+speed+" km/h");
    }

    @Override
    public void decrease(float value) {
        super.decrease(value);
        System.out.println("Moto diminuiu a velocidade para "+speed+" km/h");
    }
}
