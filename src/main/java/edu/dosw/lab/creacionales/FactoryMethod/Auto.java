public class Auto extends Vehiculo {
    public Auto(String categoria) {
        this.categoria = categoria;
        switch (categoria) {
            case "Económico":
                this.velocidadMax = 120;
                this.precio = 25000000;
                this.equipamientoEspecial = "Aire acondicionado básico";
                break;
            case "Lujo":
                this.velocidadMax = 180;
                this.precio = 50000000;
                this.equipamientoEspecial = "Aire acondicionado + GPS";
                break;
            case "Usado":
                this.velocidadMax = 100;
                this.precio = 15000000;
                this.equipamientoEspecial = "Aire acondicionado básico";
                break;
        }
    }

}
