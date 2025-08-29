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



**RETO 3 COMPLETADO**



**RETO 4 COMPLETADO**



**RETO 5 COMPLETADO**



**RETO 6 COMPLETADO**



**RETO 7 COMPLETADO**



**RETO 8 COMPLETADO**



---

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
