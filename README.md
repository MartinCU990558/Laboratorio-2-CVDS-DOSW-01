# Laboratorio - 2 - SOLID, Patrones de diseño y UML

**_Integrantes_**

- Santiago Carmona Pineda
- Diego Chavarro Castilo
- Juan Carlos Leal

**_Nombre de la rama_**
feature/CarmonaSantiago_ChavarroDiego_LealJuan_2025-2

---

## Retos Completados

### Reto #2 - El chef de 5 estrellas

- **Patrón de Diseño:** Se utilizó el patrón de diseño _creacional_
- **Patrón utilizado:** Se utilizó el patrón _Builder_
- **Justificación:** Se usó el patrón _Builder_ ya que la hamburguesa podría tener bastantes ingredientes, lo cual podría generar un constructor bastante largo.Además, no se sabe con certeza que ingredientes lleva la hamburguesa debido a que eso lo decide el cliente, por lo que los parámetros son variables según el tipo de hamburguesa. Es por esta razón que _Builder_ es el patrón indicado para manejar el constructor de una mejor forma.
- **Como Lo aplico:** En la clase _Hamburguesa.java_ se creó una clase estática llamada _Builder_. El objetivo de esta clase es separar la implementación del constructor de la clase principal, haciendo mucho más fácil su implementación y un poco más legible. En la clase _Compra.java_ se implementa el método main y se hace uso del _Builder_ para poder crear la hamburguesa según los ingredientes que el cliente solicite.

**Evidencia:**
![Captura](/docs/imagenes/reto2.jpg)
