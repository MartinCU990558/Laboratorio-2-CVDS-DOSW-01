# PREGUNTAS INICIALES

1. **¿Qué ventaja ofrece el polimorfismo en el diseño de clases frente al uso de múltiples condicionales para determinar el comportamiento de un objeto?**  
   El polimorfismo permite que los objetos de diferentes clases respondan de manera distinta al mismo mensaje (método). Esto evita el uso de múltiples condicionales `if/else` o `switch`, lo que hace que el código sea más limpio, mantenible y escalable, ya que el comportamiento específico queda encapsulado en cada clase.

2. **¿Por qué una clase inmutable puede mejorar la seguridad?**  
   Una clase inmutable no permite que su estado interno cambie después de ser creada. Esto reduce riesgos de inconsistencias, evita errores por modificaciones inesperadas y dificulta ataques que exploten la mutación del objeto, mejorando la seguridad y confiabilidad.

3. **¿Qué problema podría aparecer en un sistema si los atributos de las clases se mantienen públicos en lugar de privados con getters y setters controlados?**
    - Pérdida de encapsulación.
    - Se rompe el principio de ocultamiento de información.
    - Cualquier parte del código podría modificar los valores sin validaciones, generando errores, datos corruptos o comportamientos inesperados.

4. **¿Según el principio de Abierto/Cerrado, como deberíamos modificar el sistema si queremos añadir una nueva funcionalidad sin alterar el código existente?**  
   Debemos **extender el sistema** mediante herencia, interfaces o composición, en lugar de modificar el código existente. De esta manera, la clase original permanece **cerrada a modificaciones**, pero **abierta a extensiones**.

5. **¿Por qué es importante que una clase cumpla con el Principio de única responsabilidad y qué ejemplo sencillo podrías dar donde se vulnere?**  
   Porque cada clase debe tener un único propósito, lo que facilita la comprensión, el mantenimiento y la reutilización del código.  
   **Ejemplo de violación:** Una clase `Usuario` que además de manejar datos del usuario (nombre, email, contraseña) también se encarga de conectarse a la base de datos y enviar correos electrónicos. Esa clase está asumiendo múltiples responsabilidades.

6. **¿Qué es y por qué usamos el pom.xml?**  
   El `pom.xml` es el archivo de configuración de Maven.  
   Se usa para:
    - Gestionar dependencias.
    - Definir configuraciones del proyecto.
    - Especificar plugins de construcción.
    - Controlar el ciclo de vida de compilación, empaquetado y despliegue.

7. **¿Qué diferencia hay entre mvn compile, mvn package y mvn install?**
    - mvn compile: Compila el código fuente.
    - mvn package: Compila y empaqueta el proyecto en un formato distribuible (por ejemplo, `.jar` o `.war`).
    - mvn install: Hace lo anterior y además instala el artefacto en el repositorio local de Maven, para que pueda ser usado por otros proyectos.

8. **¿Qué diferencia existe entre una interfaz y una clase abstracta?**
    - **Interfaz:**
        - Define un contrato (métodos sin implementación).
        - Una clase puede implementar múltiples interfaces.
        - Ideal para especificar comportamientos comunes a clases no relacionadas.
    - **Clase abstracta:**
        - Puede contener métodos abstractos (sin implementación) y métodos concretos.
        - Solo puede ser heredada por una clase (herencia simple).
        - Ideal cuando las clases comparten una base común de atributos o lógica.  
