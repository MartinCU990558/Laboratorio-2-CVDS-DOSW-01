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

---
### Reto 5: La Estafa de la Casa de cambio
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
