package edu.dosw.lab.estructurales.reto5;

public class Topping {
    public static class Leche extends ToppingDecorator {
        public Leche(Cafe cafe) { super(cafe); }
        public String getDescripcion() { return cafe.getDescripcion() + " + Leche"; }
        public int getPrecio() { return cafe.getPrecio() + 1000; }
    }

    public static class Chocolate extends ToppingDecorator {
        public Chocolate(Cafe cafe) { super(cafe); }
        public String getDescripcion() { return cafe.getDescripcion() + " + Chocolate"; }
        public int getPrecio() { return cafe.getPrecio() + 1500; }
    }

    public static class Caramelo extends ToppingDecorator {
        public Caramelo(Cafe cafe) { super(cafe); }
        public String getDescripcion() { return cafe.getDescripcion() + " + Caramelo"; }
        public int getPrecio() { return cafe.getPrecio() + 1200; }
    }

    public static class CremaBatida extends ToppingDecorator {
        public CremaBatida(Cafe cafe) { super(cafe); }
        public String getDescripcion() { return cafe.getDescripcion() + " + Crema Batida"; }
        public int getPrecio() { return cafe.getPrecio() + 2000; }
    }

    public static class Menta extends ToppingDecorator {
        public Menta(Cafe cafe) { super(cafe); }
        public String getDescripcion() { return cafe.getDescripcion() + " + Menta"; }
        public int getPrecio() { return cafe.getPrecio() + 1300; }
    }
}