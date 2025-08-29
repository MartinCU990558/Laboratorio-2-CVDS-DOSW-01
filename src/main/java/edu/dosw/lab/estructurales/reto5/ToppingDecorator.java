package edu.dosw.lab.estructurales.reto5;

public abstract class ToppingDecorator implements Cafe {
    protected Cafe cafe;

    public ToppingDecorator(Cafe cafe) {
        this.cafe = cafe;
    }
}