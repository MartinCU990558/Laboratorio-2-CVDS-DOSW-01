# PREGUNTAS INICIALES

1. **¿Qué ventaja ofrece el polimorfismo en el diseño de clases frente al uso de múltiples condicionales para determinar el comportamiento de un objeto?**  

El polimorfismo permite que un mismo método pueda tener diferentes comportamientos según el tipo real del objeto.
Ventajas frente a condicionales:

-Código más limpio y legible (se evita llenar el programa de if o switch).

-Facilita la extensibilidad: se añaden nuevas subclases sin modificar el código existente.

-Favorece la aplicación del principio de abierto/cerrado.

2. **¿Por qué una clase inmutable puede mejorar la seguridad?**  

Una clase inmutable no permite que sus atributos cambien después de su creación.

- Aporta seguridad en concurrencia (no hay riesgo de que múltiples hilos modifiquen el mismo objeto).

- Evita efectos colaterales, ya que los objetos no cambian inesperadamente.

- Refuerza la encapsulación al no exponer estados modificables.


3. **¿Qué problema podría aparecer en un sistema si los atributos de las clases se mantienen públicos en lugar de privados con getters y setters controlados?**

- Se rompe la encapsulación.

- Cualquier parte del código puede modificar los atributos libremente.

- Riesgo de inconsistencias y errores lógicos.

- Dificulta la validación y el control de acceso.


4. **¿Según el principio de Abierto/Cerrado, como deberíamos modificar el sistema si queremos añadir una nueva funcionalidad sin alterar el código existente?**  

- No se debe modificar el código ya probado, sino extenderlo.

- Esto se logra con herencia, polimorfismo o inyección de dependencias.

- Ejemplo: en lugar de modificar un switch con más casos, crear una nueva clase que implemente la interfaz o extienda una clase abstracta.
   

5. **¿Por qué es importante que una clase cumpla con el Principio de única responsabilidad y qué ejemplo sencillo podrías dar donde se vulnere?** 

Una clase debe tener solo una razón para cambiar, es decir, una única responsabilidad.

 Importancia:

 - Facilita mantenimiento y pruebas.

 - Hace el código más claro y reutilizable.

 Ejemplo de violación:

 Una clase Usuario que además de gestionar datos del usuario también maneja la conexión a base  de datos.

 Debería separarse en Usuario (datos) y UsuarioDAO (persistencia).


6. **¿Qué es y por qué usamos el pom.xml?**  

 - Es el archivo de configuración de Maven.

 - Contiene: dependencias, plugins, configuraciones de compilación, empaquetado y versiones.

En pocas palabras es la guía que le dice a Maven cómo construir y manejar el proyecto. 
 
 Usos:

 - Manejo centralizado de librerías.

 - Automatización del ciclo de vida del proyecto (build, test, deploy).

 - Facilita la portabilidad y consistencia del proyecto.
  

7. **¿Qué diferencia hay entre mvn compile, mvn package y mvn install?**

mvn compile: Compila el código fuente y genera los .class.

mvn package: Empaqueta el proyecto compilado en un formato distribuible (ej: .jar o .war).

mvn install: Instala el artefacto en el repositorio local de Maven para que otros proyectos lo puedan usar como dependencia.

8. **¿Qué diferencia existe entre una interfaz y una clase abstracta?**

Interfaz:

 Solo define contratos (métodos abstractos, métodos por defecto y constantes).

 Una clase puede implementar varias interfaces.

 Representa un "qué hace" un objeto.

Clase abstracta:

 Puede tener métodos abstractos y métodos con implementación.

 Solo se puede heredar de una.

 Representa un "qué es" un objeto.