# 🧪 Laboratorio 02 - SOLID, Patrones de Diseño y UML

**Integrantes:**
- Julian Camilo Lopez Barrero
- Juan Pablo Caballero Castellanos
- Juan Andres Suarez Fonseca

**Nombre De la Rama:**
`feature/CaballeroJuan_SuarezAndres_LopezJulian_2025-2`

---
## ✅ Retos Completados
---
# Preguntas Iniciales

**1. ¿Qué ventaja ofrece el polimorfismo en el diseño de clases frente al uso de múltiples condicionales?**
   
   Permite que el comportamiento de un objeto se determine dinámicamente según su tipo, sin necesidad de usar múltiples if o switch,esto   hace el código más limpio, fácil de mantener y de extender.

**2. ¿Por qué una clase inmutable puede mejorar la seguridad?**

Porque una vez creado el objeto, su estado no puede ser modificado. Esto evita cambios inesperados, reduce errores y problemas de concurrencia.

**3. ¿Qué problema podría aparecer en un sistema si los atributos de las clases se mantienen públicos en lugar de privados con getters y setters controlados?**

Se rompe la encapsulación, lo que permite que cualquier parte del código modifique los atributos sin control, pudiendo generar inconsistencias, errores y vulnerabilidades de seguridad.

**4. Según el principio de Abierto/Cerrado, ¿cómo deberíamos modificar el sistema si queremos añadir una nueva funcionalidad sin alterar el código existente?**

Deberíamos extender el comportamiento mediante herencia o composición, en lugar de modificar las clases ya implementadas. Por ejemplo, añadiendo nuevas clases que amplíen las existentes mediante interfaces o clases abstractas.

**5. ¿Por qué es importante que una clase cumpla con el Principio de Única Responsabilidad y qué ejemplo sencillo podrías dar donde se vulnere?**

Porque asegura que una clase solo tenga un motivo para cambiar, facilitando su mantenimiento y pruebas.
Ejemplo de vulneración: Una clase Usuario que maneja tanto los datos del usuario como la lógica para guardar la información en la base de datos donde debería separarse en una clase Usuario y otra UsuarioRepositorio.

**6. ¿Qué es y por qué usamos el pom.xml?**

Es un archivo de configuración de Maven que define las dependencias, plugins, información del proyecto y configuraciones de compilación donde permite la construcción y gestión automática del proyecto.

**7. ¿Qué diferencia hay entre mvn compile, mvn package y mvn install?**

- **mvn compile:** Compila el código fuente.

- **mvn package:** Compila y empaqueta (por ejemplo, en un .jar o .war).

- **mvn install:** Compila, empaqueta e instala el artefacto en el repositorio local para que pueda ser usado por otros proyectos.

**8. ¿Qué diferencia existe entre una interfaz y una clase abstracta?**

- **Interfaz:** Define solo métodos abstractos (en Java 8+ puede incluir métodos por defecto y estáticos). No tiene estado.

- **Clase abstracta:** Puede contener métodos abstractos y concretos, así como atributos. Sirve como base parcial para otras clases.


   
   
