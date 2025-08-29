# Laboratorio - 2 - SOLID, Patrones de diseño y UML

**_Integrantes_**

- Santiago Carmona Pineda
- Diego Chavarro Castilo
- Juan Carlos Leal

**_Nombre de la rama_**
feature/CarmonaSantiago_ChavarroDiego_LealJuan_2025-2

---

## Retos Completados

### Reto 1 - El problema de la tienda de Don Pepe

- **Patrón de Diseño:** Principios SOLID (especialmente Responsabilidad Única, Abierto/Cerrado y Polimorfismo por interfaz).
- **Patrón utilizado:** S: Responsabilidad Única (SRP)
  O: Abierto/Cerrado (OCP)
  L: Sustitución de Liskov (LSP)
  D: Inversión de Dependencias (DIP)
- **Justificación:** Se busca que cada clase tenga una única responsabilidad, que el sistema sea fácil de extender sin modificar código existente, que las clases puedan ser intercambiables sin romper el sistema y que el código dependa de abstracciones y no de implementaciones concretas.
- **Como Lo aplico:** Defino la interfaz Descuento como abstracción para el cálculo de descuentos. Cada tipo de cliente (ClienteNuevo, ClienteFrecuente) implementa la interfaz y define su propia lógica de descuento. En la clase principal (TiendaDonPepe), uso la interfaz para aplicar el descuento, permitiendo cambiar el tipo de cliente sin modificar el resto del sistema. Si quiero agregar otro tipo de cliente, solo creo una nueva clase que implemente Descuento, sin modificar el resto del sistema.

**Evidencia:**

![Captura](/docs/imagenes/reto1.jpg)

### Reto #2 - El chef de 5 estrellas

- **Patrón de Diseño:** Se utilizó el patrón de diseño _creacional_
- **Patrón utilizado:** Se utilizó el patrón _Builder_
- **Justificación:** Se usó el patrón _Builder_ ya que la hamburguesa podría tener bastantes ingredientes, lo cual podría generar un constructor bastante largo.Además, no se sabe con certeza que ingredientes lleva la hamburguesa debido a que eso lo decide el cliente, por lo que los parámetros son variables según el tipo de hamburguesa. Es por esta razón que _Builder_ es el patrón indicado para manejar el constructor de una mejor forma.
- **Como Lo aplico:** En la clase _Hamburguesa.java_ se creó una clase estática llamada _Builder_. El objetivo de esta clase es separar la implementación del constructor de la clase principal, haciendo mucho más fácil su implementación y un poco más legible. En la clase _Compra.java_ se implementa el método main y se hace uso del _Builder_ para poder crear la hamburguesa según los ingredientes que el cliente solicite.

**Evidencia:**

![Captura](/docs/imagenes/reto2.jpg)

### Reto 3 - El Reino de los Vehículos

- **Patrón de Diseño:** Se utilizó el patrón de diseño creacional
- **Patrón utilizado:** Factory Method.
- **Justificación:** Se usa Factory Method para crear diferentes tipos de vehículos (Moto, Auto, Bicicleta, Avión, Lancha, etc.) sin que el código cliente dependa de las clases concretas. Esto permite que el sistema sea fácil de extender y mantener.
- **Como Lo aplico:** Defino la interfaz VehiculoFactory y creo fábricas concretas (TierraFactory, AereoFactory, AcuaticoFactory) que implementan esa interfaz. Cada fábrica sabe cómo crear los vehículos de su tipo. El cliente solo usa la fábrica adecuada para obtener el vehículo que necesita, sin preocuparse por los detalles de implementación.

**Evidencia:**

![Captura](/docs/imagenes/reto3.jpg)

### Reto 4 - La Estafa de la Casa de Cambio

Este reto usa un patrón de diseño estructural, el cual es: Adapter (Adaptador), aplicado en el sistema de conversión de divisas.

**Justifiación**

El patrón Adapter utiliza cuando dos clases o sistemas tienen interfaces incompatibles y necesitan comunicarse.  
En este caso:

- **Compatibilidad:** Permite que la clase cliente (`CasaCambio`) pueda comunicarse con el servicio de conversión (`ServicioConversion`) sin necesidad de modificar su código.
- **Reutilización del código:** Aprovechamos el `ServicioConversion` ya implementado sin cambiar su lógica interna.
- **Flexibilidad:** Si en el futuro cambia la lógica de conversión solo se deberá modificar o crear un nuevo adaptador.
- **Aislamiento de cambios:** El cliente no se ve afectado por las modificaciones internas del servicio.

**¿Cómo lo aplico?**

1. **Clase `ServicioConversion`**

   - Contiene la lógica de conversión de monedas.
   - Expone un método con su propia interfaz para calcular conversiones.

2. **Clase `AdaptadorConversion`**

   - Implementa una interfaz compatible con lo que espera el cliente (`CasaCambio`).
   - Traduce las solicitudes de conversión a la forma que entiende `ServicioConversion`.

3. **Clase Cliente (`CasaCambio`)**
   - Solicita operaciones de conversión de forma transparente, sin conocer los detalles internos del servicio.

**Evidencia**

![Captura](/docs/imagenes/reto4.png)

### Reto 5 - El Café Personalizado

Este reto usa un patrón de diseño estructural, el cual es: Decorator (Decorador) aplicado en una tienda de café con toppings dinámicos.

**Justificación**

El patrón Decorator permite añadir responsabilidades adicionales a un objeto de forma dinámica, sin modificar su clase base.  
En este caso:

- **Extensibilidad dinámica:** Se pueden agregar diferentes toppings (leche, azúcar, chocolate, etc.) a un café sin necesidad de crear varias subclases.
- **Evitamos la explosión de clases:** No se necesita la implementación de todas las combinaciones posibles de cafés y toppings.
- **Reutilización:** Cada topping puede aplicarse a cualquier café.
- **Mantenibilidad:** Es fácil agregar nuevos toppings sin alterar las clases existentes.

**¿Cómo lo aplicó?**

1. **Interfaz `Cafe`**

   - Define métodos comunes (`getDescripcion()` y `getCosto()`).

2. **Clase concreta `CafeBase`**

   - Representa un café simple, sin complementos.

3. **Clase abstracta `ToppingDecorator`**

   - Extiende `Cafe` y mantiene una referencia a otro objeto `Cafe`.
   - Permite envolver al café para agregar responsabilidades adicionales.

4. **Clases concretas de toppings (`Topping`)**

   - Cada topping agrega su propio costo y descripción.

5. **Clase Cliente (`TiendaCafe`)**
   - Permite al usuario crear combinaciones dinámicas de café con múltiples toppings.

**Evidencia**

![Captura](/docs/imagenes/reto5.png)

### Reto 6 - Habla con Soporte Técnico

Este reto usa un patrón de diseño estructural, el cual es: Chain Responsability (Cadena de responsabilidad) aplicado en un sistema de tickets.

**Justifiación**

El patrón Chain of Responsibility es ideal para este sistema de soporte técnico porque:

- **Desacoplamiento:** Separa el emisor de una solicitud (ticket) de sus receptores (técnicos), permitiendo que múltiples objetos tengan la oportunidad de manejar la solicitud sin que el cliente conozca cuál objeto específico la procesará.
- **Flexibilidad:** Permite agregar o quitar técnicos de la cadena dinámicamente sin modificar el código cliente, facilitando el mantenimiento y la escalabilidad del sistema.
- **Responsabilidad única:** Cada técnico tiene una responsabilidad específica y bien definida, decidiendo únicamente si puede resolver un ticket de acuerdo a su nivel de especialización.
- **Jerarquía natural:** El sistema de soporte técnico tiene una jerarquía natural (básico → intermedio → avanzado) que se mapea perfectamente con la estructura del patrón.

**¿Cómo lo aplicó?**

1. **Clase Handler abstracta (`Tecnico`)**:

   - Define la interfaz común para todos los técnicos
   - Mantiene la referencia al siguiente técnico en la cadena
   - Implementa el método `resolver()` que maneja la lógica de la cadena
   - Define el método abstracto `puedeResolver()` que cada técnico concreto debe implementar

2. **Handlers concretos (`TecnicoBasico`, `TecnicoIntermedio`, `TecnicoAvanzado`)**:

   - Cada uno implementa `puedeResolver()` con su lógica específica
   - `TecnicoBasico`: Resuelve tickets básicos con prioridad baja/media
   - `TecnicoIntermedio`: Resuelve tickets básicos e intermedios
   - `TecnicoAvanzado`: Resuelve cualquier tipo de ticket

3. **Configuración de la cadena**:

   ```java
   Tecnico basico = new TecnicoBasico("Técnico Básico");
   Tecnico intermedio = new TecnicoIntermedio("Técnico Intermedio");
   Tecnico avanzado = new TecnicoAvanzado("Técnico Avanzado");
   basico.setSiguiente(intermedio);
   intermedio.setSiguiente(avanzado);
   ```

4. **Para el procesamiento de solicitudes iniciamos desde el primer eslabon**:
   ```java
   String resultado = basico.resolver(ticket);
   ```
   **Evidencia**

![Captura](/docs/imagenes/reto6.jpg)

### Reto 7 - El control remoto Mágico

### Reto 8 - El Zoológico de los UML
