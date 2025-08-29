<h4>1. ¿Qué ventaja ofrece el polimorfismo en el diseño de clases frente al uso de múltiples condicionales para determinar el comportamiento de un objeto?</h4>
Al usar polimorfismo podemos obtener mejoras en la mantenibilidad del codigo, el polimorfismo tambien nos ayuda a cumplir el principio open/close, reduce los errores y facilita la extension del proyecto

<h4>2. ¿Por qué una clase inmutable puede mejorar la seguridad?</h4>
Una clase inmutable ayuda ya que evita la modificación no autorizada de datos haciendo que ningun codigo externo pueda afectar sus atributos, reduciendo tambien las vulnerabilidades por referencias compartidas  y tambien mejora la integridad de los datos

<h4>3. ¿Qué problema podría aparecer en un sistema si los atributos de las clases se mantienen públicos en lugar de privados con getters y setters controlados?</h4>
Uno de los principales problemas que podremos evidenciar es que los datos pueden ser inconsistentes o invalidos esto por que cualquier parte del sistema va poder modificarlos perdiendo el control y la validez
<h4>4. ¿Según el principio de Abierto/Cerrado, cómo deberíamos modificar el sistema si queremos añadir una nueva funcionalidad sin alterar el código existente?</h4>
Según el principio de Abierto/Cerrado (OCP), si queremos añadir una nueva funcionalidad al sistema, no debemos modificar el código existente, sino extenderlo. Esto se logra utilizando herencia, interfaces o polimorfismo, de forma que el sistema acepte nuevas clases o comportamientos sin alterar los ya implementados. Así, evitamos introducir errores, mejoramos la mantenibilidad y hacemos que el sistema sea más flexible y escalable.

<h4>5. ¿Por qué es importante que una clase cumpla con el Principio de única responsabilidad y qué ejemplo sencillo podrías dar donde se vulnere?</h4>
Es importante que una clase cumpla con el Principio de Única Responsabilidad (SRP) porque así cada clase tiene un solo propósito y cambiarla será necesario por una única razón. Si una clase hace demasiadas cosas, se vuelve difícil de mantener, probar y modificar, ya que un cambio en una funcionalidad puede afectar a otras.

<h4>6. ¿Qué es y por qué usamos el pom.xml?</h4>
El pom.xml (Project Object Model) es el archivo de configuración principal en un proyecto que utiliza Apache Maven como herramienta de gestión y construcción.

<h4>7. ¿Qué diferencia hay entre mvn compile, mvn package y mvn install?</h4>
En Maven, mvn compile solo compila el código fuente y genera los archivos .class, mvn package compila y empaqueta el proyecto en un artefacto (por ejemplo, un .jar o .war), y mvn install además de compilar y empaquetar, instala el artefacto en el repositorio local para que pueda ser utilizado como dependencia en otros proyectos.

<h4>8. ¿Qué diferencia existe entre una interfaz y una clase abstracta?</h4>
La principal diferencia es que una interfaz define un contrato con métodos que deben implementarse, mientras que una clase abstracta puede definir tanto métodos abstractos como métodos con implementación. Además, una clase puede implementar múltiples interfaces, pero solo puede heredar de una clase abstracta. Usamos interfaces cuando queremos definir comportamientos comunes sin imponer una jerarquía, y clases abstractas cuando varias clases comparten atributos o lógica base además de métodos a implementar.