# Laboratorio-2-CVDS-DOSW-01

## Preguntas Iniciales

### 1. ¿Qué ventaja ofrece el polimorfismo en el diseño de clases frente al uso de múltiples condicionales para determinar el comportamiento de un objeto?
El polimorfismo permite que diferentes clases que comparten una misma interfaz o herencia definan sus propios comportamientos. Esto evita la necesidad de múltiples condicionales `if/else` o `switch`, haciendo el código más legible, extensible y fácil de mantener. Así, añadir nuevos comportamientos solo requiere crear nuevas clases sin modificar las existentes.

---

### 2. ¿Por qué una clase inmutable puede mejorar la seguridad?
Una clase inmutable garantiza que, una vez creado un objeto, su estado no puede cambiar. Esto evita modificaciones inesperadas o maliciosas en el objeto, facilita el uso seguro en entornos concurrentes y previene errores relacionados con cambios no controlados en los atributos.

---

### 3. ¿Qué problema podría aparecer en un sistema si los atributos de las clases se mantienen públicos en lugar de privados con getters y setters controlados?
Si los atributos son públicos, cualquier parte del sistema puede acceder y modificarlos directamente, lo que rompe la encapsulación. Esto puede llevar a inconsistencias en el estado del objeto, pérdida de control sobre la validación de datos y mayor dificultad para mantener y evolucionar el código.

---

### 4. ¿Según el principio de Abierto/Cerrado, cómo deberíamos modificar el sistema si queremos añadir una nueva funcionalidad sin alterar el código existente?
El principio establece que las clases deben estar **abiertas para extensión pero cerradas para modificación**. Para añadir una nueva funcionalidad, debemos extender el sistema creando nuevas clases o implementaciones (por ejemplo, aplicando herencia o interfaces), sin modificar las clases ya existentes. Esto evita romper funcionalidades previas y facilita la escalabilidad.

---

### 5. ¿Por qué es importante que una clase cumpla con el Principio de Única Responsabilidad y qué ejemplo sencillo podrías dar donde se vulnere?
Cada clase debe tener una única responsabilidad o motivo de cambio. Si una clase asume múltiples responsabilidades, aumenta la complejidad y el acoplamiento, dificultando su mantenimiento.  
**Ejemplo de violación:** Una clase `Reporte` que además de generar reportes también se encarga de conectarse a la base de datos. Aquí se mezclan responsabilidades de persistencia y de presentación.

---

### 6. ¿Qué es y por qué usamos el pom.xml?
Es el archivo de configuración principal de un proyecto Maven. Define dependencias, versiones de Java, plugins, empaquetado y demás configuraciones necesarias para compilar, probar y ejecutar el proyecto. Lo usamos para automatizar la gestión del ciclo de vida del software y asegurar la consistencia del entorno de desarrollo.

---

### 7. ¿Qué diferencia hay entre `mvn compile`, `mvn package` y `mvn install`?
- **mvn compile**: Compila el código fuente del proyecto.  
- **mvn package**: Compila y empaqueta el proyecto en un formato distribuible (ejemplo: `.jar`).  
- **mvn install**: Hace lo mismo que `package` y además instala el artefacto en el repositorio local de Maven, para que pueda ser usado como dependencia en otros proyectos.

---

### 8. ¿Qué diferencia existe entre una interfaz y una clase abstracta?
- **Interfaz**: Define un contrato que las clases deben implementar. No contiene implementación (hasta Java 8, donde se añadieron métodos `default`). Una clase puede implementar múltiples interfaces.  
- **Clase abstracta**: Puede definir tanto métodos abstractos (sin implementación) como métodos concretos (con implementación). Una clase solo puede heredar de una clase abstracta debido a la limitación de la herencia simple en Java.

---
