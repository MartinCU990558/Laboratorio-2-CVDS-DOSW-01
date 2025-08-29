# Laboratorio-2-CVDS-DOSW-01
# 📝 Laboratorio 02 – SOLID, Patrones de Diseño y UML

**Integrantes:**
- Oscar Sanchez
- Julian Ramirez
- Valeria Bermudez

**Nombre de la rama:**
`feature/SanchezOscar_RamirezJulian_BermudezValeria`

✅ Retos Completados
### Reto 1: El problema de la tienda de Don Pepe
**Evidencia:**
![Captura](docs/imagenes/reto1.png)

<h4>Descripción breve de lo que hicieron:  
</h4>
Se implementó un sistema sencillo de compras para la tienda de Don Pepe aplicando principios de SOLID. Creamos clases para representar productos (Producto), ítems en el carrito (ItemCarrito) y el carrito de compras (CarritodeCompras). Se definieron tipos de clientes (ClienteNuevo, ClienteFrecuente) que aplican distintos tipos de descuentos mediante el tipo de cliente (DescuentoNu, DescuentoFe). Además, se creó la interfaz Irecibo y su implementación Imrecibo para generar un recibo con detalle de productos, subtotal, descuento aplicado y total a pagar.

### Reto 3: El Reino de los Vehículos
**Evidencia:**
![Captura](docs/imagenes/Reto3%20Entrada.png)
![Captura](docs/imagenes/Reto3%20Salida.png)
<h4>Descripción breve de lo que hicieron:  
</h4>

Nuestro grupo desarrolló un sistema en Java aplicando el patrón Factory Method para la creación de vehículos de tierra, acuáticos y aéreos.

Se implementó una clase abstracta Vehiculo y subclases como Auto, Moto, Bicicleta, Lancha, Velero, Avion, Avioneta, entre otras. La clase VehiculoFactory centraliza la creación de los objetos según las elecciones del usuario.

El sistema cuenta con un menú interactivo en consola donde el usuario selecciona el tipo, categoría y modelo de vehículo, y finalmente se genera un resumen de compra en pesos colombianos, mostrando precios, características y el total a pagar.

---
<<<<<<< HEAD
### Reto 5: La Estafa de la Casa de cambio
=======


### Reto 4: La Estafa de la Casa de cambio
>>>>>>> 1d61da7cd4b9f03834270685b6354f16b76b6ab2
**Evidencia:**


![Captura](docs/imagenes/reto6Entrada.png)
![Captura](docs/imagenes/reto6Salida.png)
![Captura](docs/imagenes/reto6Avanzado.png)
![Captura](docs/imagenes/reto6Básico.png)
![Captura](docs/imagenes/reto6Intermedio.png)
![Captura](docs/imagenes/reto6Gestor.png)
![Captura](docs/imagenes/reto6Tickets.png)
![Captura](docs/imagenes/reto6Tecnico.png)
<h4>Descripción breve de lo que hicieron:  
</h4>
- Patrón de Diseño: Chain of Responsibility
- Patrón Utilizado: Subclases con polimorfismo
- Justificación: 
  - Cada técnico decide si puede resolver un ticket según su nivel y prioridad. 
  - Si no puede resolverlo, lo pasa al siguiente técnico de la cadena. 
  - Esto evita condicionales extensos y centraliza la lógica de resolución en cada clase.
- Cómo lo apliqué: 
  - La clase abstracta SoporteTecnico define el método resolver() y mantiene referencia al siguiente técnico.
  -   Las subclases (Basico, Intermedio, Avanzado) implementan la resolución según reglas específicas.
  -   GestorTickets arma la cadena y procesa todos los tickets.
  - Reporte recibe los resultados y calcula estadísticas, mostrando quién resolvió cada ticket.
---



### Reto 7: El control remoto
**Evidencia:**
![Captura](docs/imagenes/RETO7%20ENTRADA.png)
![Captura](docs/imagenes/RETO7SALIDA.png)
<h4>Descripción breve de lo que hicieron:  
</h4>
En este reto implementamos un control remoto mágico que permite ejecutar y deshacer acciones sobre diferentes dispositivos del hogar como luces, puertas, música y volumen. 
Para la solución utilizamos el patrón de diseño Command, ya que nos permitió encapsular cada acción en una clase independiente y mantener un historial de lo que se ejecutó y quién lo hizo.

Durante el desarrollo, cada integrante del grupo aportó en diferentes partes: 
algunos trabajaron en la definición de los comandos y receptores, otros en la lógica del historial y el análisis de los usuarios, y finalmente se integró todo en el programa principal.
Al final, el sistema permite registrar acciones con parámetros, deshacerlas cuando sea necesario y mostrar un resumen completo con los responsables de cada cambio.