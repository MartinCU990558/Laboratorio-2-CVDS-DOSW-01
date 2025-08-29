public class Velero extends Vehiculo {
    public Velero(String categoria) {
        this.categoria = categoria;
        switch (categoria) {
            case "Económico":
                this.velocidadMax = 15;
                this.precio = 30000000;
                this.equipamientoEspecial = "Chaleco salvavidas incluido";
                break;
            case "Lujo":
                this.velocidadMax = 25;
                this.precio = 60000000;
                this.equipamientoEspecial = "Chaleco salvavidas + GPS";
                break;
            case "Usado":
                this.velocidadMax = 35;
                this.precio = 120000000;
                this.equipamientoEspecial = "Chaleco salvavidas + GPS + Sistema de sonido";
                break;
        }
    }
}
