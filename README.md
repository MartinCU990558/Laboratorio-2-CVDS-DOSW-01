# 🧪 Laboratorio 02 - SOLID, Patrones de Diseño y UML

**Integrantes:**
- Sebastian Albarracin Silva
- Sergio Idarraga
- Carlos Astudillo

**Nombre de la rama:**
`feature/IndagarraSergio_AstudilloCarlos_SilvaSebastian_2025-2`


---

## ✅ Retos Completados

**RETO 1 COMPLETADO**

**SOLID**
- S: Cada clase tiene una unica responsabilidad (producto maneja datos, carrito gestino productos, cliente aplica descuentos, recibo imprime, tiendoDonPepe ejecuta la compra).
- O: Se pueden agregar nuevos tipos de clientes con descuentos distintos sin modificar las clases existentes.
- L: Cualquier subclase de Cliente puede usarse sin afectar el programa.
- I: Cliente define solo lo esencial (el calculo de desecuento), sin obligar a implementar metodos innecesarios.
- D: El sistema depende de la abstraccion Cliente y no de sus implementaciones concretas.

**POLIMORFISMO**
Se aplica en la jerarquia de Cliente. El metodo calcularDescuento es invocado desde una referencia generica Cliente, pero en tiempo de ejecucion se ejecuta la version especifica segun el tipo de cliente (Nuevo,Frecuente,etc)
    ![img_1.png](docs/Imagenes/img_1.png)
    ![img_2.png](docs/Imagenes/img_2.png)
    ![img_3.png](docs/Imagenes/img_3.png)
    ![img_4.png](docs/Imagenes/img_4.png)
    ![img_5.png](docs/Imagenes/img_5.png)
    ![img_6.png](docs/Imagenes/img_6.png)
    ![img_7.png](docs/Imagenes/img_7.png)
    ![img.png](docs/Imagenes/image.png)

**RETO 2 COMPLETADO**

**Patrón de Diseño Utilizado**

- Patrón de Diseño: Creacional
- Patrón Utilizado: Builder
- Justificación:  
  El patrón Builder permite construir objetos complejos paso a paso, separando la creación del objeto de su representación final. En este caso, una Hamburguesa puede tener diferentes combinaciones de ingredientes, y el Builder facilita ir agregándolos dinámicamente sin necesidad de múltiples constructores ni de una lógica compleja dentro de la clase `Hamburguesa`.

- Cómo lo aplico:  
  Se implementó la clase `HamburguesaBuilder` que permite añadir ingredientes de forma encadenada y finalmente construir una `Hamburguesa` personalizada mediante el método `build()`.  
  El cliente (`ChefDeCincoEstrellas`) usa el builder para ir agregando ingredientes seleccionados por el usuario y luego genera la hamburguesa final, que encapsula la lista de ingredientes y el cálculo del precio total.
    
    ![img.png](docs/Imagenes/img_8.png)
    ![img_1.png](docs/Imagenes/img_9.png)
    ![img_2.png](docs/Imagenes/img_10.png)
    ![img_3.png](docs/Imagenes/img_11.png)
    ![img_4.png](docs/Imagenes/img_12.png)
    ![img_5.png](docs/Imagenes/img_13.png)


**RETO 3 COMPLETADO**

**Patrón de Diseño Utilizado**

- Patrón de Diseño: Creacional
- Patrón Utilizado: Factory Method
- Justificación:
  El sistema requiere crear distintos tipos de vehículos (`Auto`, `Moto`, `Bicicleta`, `Lancha`, `Avioneta`, `Helicoptero`) en función del tipo de transporte (Tierra, Acuático, Aéreo) y de la categoría (Económico, Lujo, Usado).  
  Para evitar que el cliente deba conocer los detalles de construcción de cada clase, se aplica el patrón Factory Method, delegando la lógica de creación y configuración a las subclases de `Vehiculo`.  
  De esta manera, la creación de objetos queda centralizada, encapsulada y es fácilmente extensible.

- Cómo lo aplico:
  La clase abstracta `Vehiculo` actúa como producto base, mientras que cada subclase (`Auto`, `Moto`, `Bicicleta`, `Lancha`, `Avioneta`, `Helicoptero`) implementa el método `configurar()` para definir sus características según la categoría. En la clase `ReinoDeLosVehiculos`, el cliente únicamente selecciona el tipo, modelo y categoría, pero no conoce los detalles de construcción, lo que permite encapsular la creación de objetos, reducir dependencias directas en el cliente y extender el sistema fácilmente al agregar nuevos modelos de vehículos.
    ![img.png](docs/Imagenes/img_14.png)
    ![img_1.png](docs/Imagenes/img_15.png)
    ![img_2.png](docs/Imagenes/img_16.png)
    ![img_3.png](docs/Imagenes/img_17.png)
    ![img_4.png](docs/Imagenes/img_18.png)
    ![img_5.png](docs/Imagenes/img_19.png)
    ![img_6.png](docs/Imagenes/img_20.png)
    ![img_7.png](docs/Imagenes/img_21.png)
    ![img_8.png](docs/Imagenes/img_22.png)
    ![img_9.png](docs/Imagenes/img_23.png)
    ![img_10.png](docs/Imagenes/img_24.png)
    ![img_11.png](docs/Imagenes/img_25.png)
    ![img_12.png](docs/Imagenes/img_26.png)
    ![img_13.png](docs/Imagenes/img_27.png)
    ![img_14.png](docs/Imagenes/img_28.png)


**RETO 4 COMPLETADO**

**Patrón de Diseño Utilizado**

- Patrón de Diseño: Comportamiento
- Patrón Utilizado: Strategy
- Justificación:
  La lógica de conversión de monedas está encapsulada en una estrategia dentro de TransaccionService. Esto permite cambiar la forma de conversión (por ejemplo, nuevas tasas o conexión a una API) sin modificar el flujo principal de la aplicación.

- Cómo lo aplico:
    convertir() define la estrategia: primero pasa todo a USD y luego convierte a la moneda destino. El resto de la aplicación (CasaDeCambio, Transaccion) solo usa la estrategia sin conocer los detalles de su implementación.
    ![img.png](docs/Imagenes/img_29.png)
    ![img_1.png](docs/Imagenes/img_30.png)
    ![img_2.png](docs/Imagenes/img_31.png)
    ![img_3.png](docs/Imagenes/img_32.png)
    ![img_4.png](docs/Imagenes/img_33.png)

**RETO 5 COMPLETADO**

**Patrón de Diseño Utilizado**

- Patrón de Diseño:Estructurales
- Patrón Utilizado:Decorator
- Justificación:
  El patrón Decorator permite añadir dinámicamente responsabilidades u opciones adicionales a un objeto sin modificar su estructura base. En este caso, el objeto principal es el Café base, y los toppings actúan como decoradores que se agregan para extender su comportamiento (descripción y precio) sin necesidad de crear múltiples clases hijas para cada combinación posible.

- Cómo lo aplico:
    - La clase CafeBase representa el objeto principal con un precio y descripción inicial.
    - La clase Topping funciona como complemento que se añade dinámicamente al café.
    - La clase Cafe gestiona la composición: comienza con un café base y permite agregar uno o varios toppings, construyendo así cafés personalizados.
    - En CafePersonalizadoClase, el cliente selecciona toppings y estos se agregan sin modificar el código del café base, cumpliendo la idea del patrón Decorator.

    ![img.png](docs/Imagenes/img_34.png)
    ![img_1.png](docs/Imagenes/img_35.png)
    ![img_2.png](docs/Imagenes/img_36.png)
    ![img_3.png](docs/Imagenes/img_37.png)
    ![img_4.png](docs/Imagenes/img_38.png)
    ![img_5.png](docs/Imagenes/img_39.png)
    ![img_6.png](docs/Imagenes/img_40.png)

**RETO 6 COMPLETADO**

**Patrón de Diseño Utilizado**

- Patrón de Diseño: Comportamiento
- Patrón Utilizado: Chain of Responsibility (Cadena de Responsabilidad)
- Justificación:
  El sistema de soporte técnico implementa un flujo en el que un ticket pasa a través de una cadena de técnicos (básico → intermedio → avanzado).
  Cada técnico decide si puede resolverlo o lo escala al siguiente en la cadena.
  Este patrón permite desacoplar al cliente (SoporteTecnico) de la lógica de asignación y facilita añadir nuevos técnicos sin modificar el código existente. 

- Cómo lo aplico:
    - Se creó una clase abstracta Tecnico que define el contrato para manejar un ticket y referencia al siguiente técnico en la cadena.
    - TecnicoBasico, TecnicoIntermedio y TecnicoAvanzado implementan la lógica concreta de acuerdo a su nivel.
    - En la clase SoporteTecnico, se arma la cadena basico → intermedio → avanzado.
    - Cuando llega un Ticket, el técnico actual decide si lo maneja o lo pasa al siguiente.
    - Si ningún técnico lo resuelve, el ticket queda en pendientes.

    ![img.png](docs/Imagenes/img_41.png)
    ![img_1.png](docs/Imagenes/img_42.png)
    ![img_2.png](docs/Imagenes/img_43.png)
    ![img_3.png](docs/Imagenes/img_44.png)
    ![img_4.png](docs/Imagenes/img_45.png)
    ![img_5.png](docs/Imagenes/img_46.png)
    ![img_6.png](docs/Imagenes/img_47.png)
    ![img_7.png](docs/Imagenes/img_48.png)
    ![img_8.png](docs/Imagenes/img_49.png)

**RETO 7 COMPLETADO**

**Patrón de Diseño Utilizado**

- Patrón de Diseño:Comportamiento
- Patrón Utilizado:Command
- Justificación:
  El patrón Command se utiliza cuando se quiere encapsular una acción como un objeto, permitiendo ejecutar, deshacer o almacenar las operaciones de manera independiente del emisor que las invoca.
  En este caso, cada acción (AccionEncenderLuz, AccionAbrirPuerta, AccionReproducirMusica, AccionAjustarVolumen) es un comando que encapsula el comportamiento específico y puede ser ejecutado o deshecho sin que el ControlRemoto conozca los detalles de su implementación.

  - Cómo lo aplico:
      - Se definió la clase abstracta Accion como la interfaz base del comando, con los métodos ejecutar() y deshacer().
      - Cada acción concreta (como AccionEncenderLuz, AccionAbrirPuerta, etc.) implementa el comportamiento específico de esos métodos.
      - La clase ControlRemoto actúa como invocador, ejecutando los comandos y almacenándolos en un historial.
      - El cliente (ControlRemotoMagico) solicita al usuario qué comando quiere ejecutar y delega la acción al ControlRemoto.

      ![img_1.png](docs/Imagenes/img_50.png)
      ![img_2.png](docs/Imagenes/img_51.png)
      ![img_3.png](docs/Imagenes/img_52.png)
      ![img_4.png](docs/Imagenes/img_53.png)
      ![img_5.png](docs/Imagenes/img_54.png)
      ![img_6.png](docs/Imagenes/img_55.png)
      ![img_7.png](docs/Imagenes/img_56.png)
      ![img.png](docs/Imagenes/img_57.png)
    

**RETO 8 COMPLETADO**
    ![img.png](uml/Reto 8.png)

  Principios SOLID
- S: Cada clase tiene una responsabilidad única.
- O: El sistema está abierto a extensión con nuevas especies de animales.
- L: Las subclases de Animal pueden sustituir la clase base.
- I: Se podrían definir interfaces para interacción diferenciada.
- D: Visitantes y Cuidadores dependen de la abstracción `Animal`, no de especies concretas.

  Patrones de diseño
- Strategy: Estrategias de alimentación.
- Decorator: Atributos dinámicos de animales.
- Observer (extensible): Para notificaciones de cambios.

  Clases principales
- `Animal` (abstracta) con subclases `Mamifero`, `Reptil`, `Ave`.
- `Cuidador` con asociación a múltiples animales.
- `Visitante` con asociación a animales y cuidadores.



# PREGUNTAS INICIALES:
#
**1. ¿Qué ventaja ofrece el polimorfismo en el diseño de clases frente al uso de        múltiples condicionales para determinar el comportamiento de un objeto?**

Las ventajas que ofrece el polimorfismo es que permite que un onjeto sse comporte de manera diferente según se requiera. Esto hace que el código que se este desarrollando se vea más limpio y legible además que sea más fácil de mantener ya que si se implementan nuevas clases, se pueden añadir sin problemas sin tener que modificar el código que utiliza los objetos. 

**2. ¿Por qué una clase inmutable puede mejorar la seguridad?**

Cuando se crea una clase "inmutale" es para que los objetos que sean instanciados a partir de la misma, no puedan ser modificados después de la instancia. Esto ayuda a que no exista el riego de que otra parte del código altetre dicho objeto de una fomra inesperada, lo cual también ayuda a evitar los errores de concurrecia.

**3. ¿Qué problema podría aparecer si los atributos de las clases se mantienen públicos en lugar de privados con getters y setters?**

Si los atributos de una clase son públicos, se rompe el principio de encapsulamiento. Esto permite que cualquier parte del código acceda y modifique directamente el estado interno del objeto. El problema rincipal es la pérdida en el control y la validación y no pueda ser mantenido la integridad de los datos. 

**4. ¿Según el principio de Abierto/Cerrado, como deberíamos modificar el sistema si queremos añadir una nueva funcionalidad sin alterar el código existente?**

Según el principio de Abierto/Cerrado, las entidades de software deben estar abiertas para la extensión, pero cerradas para la modificación. Para añadir una nueva funcionalidad, no se debe alterar el código existente. Cuando se desee extender el código mediante la creación de nuevas clases que hereden de las clases existentes o que implementen una interfaz en común. 

**5. ¿Por qué es importante que una clase cumpla con el Principio de única responsabilidad y que ejemplo sencillo podrías dar donde se vulnere?**

El Principio de Única Responsabilidad establece que una clase debe tener una sola razón para cambiar, es decir, debe tener una sola responsabilidad bien definida. Este principio es bastante importante para que el diseño de un proyecto sea modular y mantenible a largo plazo. Si una clase tiene múltiples responsabilidades, se vuelve más compleja de mantener y se expone a que se cometan más errores. 

**6. ¿Qué es y por qué usamos el pom.xml?**

El archivo pom.xml (Project Object Model) es el archivo de configuración central para proyectos de Maven. Describe el proyecto y sus dependencias (bibliotecas externas) para que Maven pueda gestionar su construcción, empaquetado y despliegue.

**7. ¿Qué diferencia hay entre mvn compile, mvn package y mvn install?**

- **mvn compile:** Compila el código fuente del proyecto, generando los archivos .class en el directorio target/classes.

- **mvn package:** Ejecuta la fase de compile y luego empaqueta los archivos compilados en un formato distribuible, como un archivo JAR o WAR, en el directorio target.

- **mvn install:** Ejecuta la fase de package y luego copia el artefacto (JAR o WAR) empaquetado al repositorio local de Maven. Esto hace que el artefacto esté disponible para otros proyectos locales que lo declaren como una dependencia.

**8. ¿Qué diferencia existe entre una interfaz y una clase abstracta?**

- Herencia: Una clase puede implementar múltiples interfaces, pero solo puede heredar de una única clase abstracta.

- Métodos: Una interfaz define un contrato con métodos sin implementación (a excepción de los métodos default y static en Java 8 y posteriores), mientras que una clase abstracta puede tener una mezcla de métodos abstractos (sin implementación) y métodos concretos (con implementación).

- Atributos: Las interfaces solo pueden tener atributos que son constantes (public static final). Las clases abstractas pueden tener cualquier tipo de atributo (privado, público, etc.).

- Constructores: Una interfaz no puede tener constructores. Una clase abstracta sí puede tenerlos.

- Uso: Las interfaces son ideales para definir un comportamiento común en clases no relacionadas (como una interfaz Volador implementada por un Avion y un Pajaro). Las clases abstractas son mejores para compartir código entre clases que están estrechamente relacionadas en una jerarquía de herencia (como una clase Vehiculo de la que heredan Coche y Moto).



## 🧾 Evidencias por reto
Para cada reto se sube:
- **Evidencia del código solución implementado**
- **Evidencia de la respuesta ejecutada** (captura de consola o imagen)
- **Lo solicitado en cada reto**
