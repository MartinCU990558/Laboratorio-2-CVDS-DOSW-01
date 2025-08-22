# Laboratorio 02 – SOLID, Patrones de Diseño y UML

**Integrantes:**  
- David Santiago Palacios Pinzón.
- Julian David Castiblanco Real.
- Robinson Nuñez.

**Nombre de la rama:**  
`feature/Apellido1_Apellido2_Apellido3_2025-2`  

---

## 1. ¿Qué ventaja ofrece el polimorfismo en el diseño de clases frente al uso de múltiples condicionales para determinar el comportamiento de un objeto?
El polimorfismo permite que las clases hijas implementen comportamientos específicos a través de la sobreescritura de métodos, evitando el uso de múltiples condicionales. Esto hace que el código sea más limpio ya que no es necesario modificar las condiciones en un solo lugar, ya que cada hijo "le dira a su padre como se comporta".

---

## 2. ¿Por qué una clase inmutable puede mejorar la seguridad?
Una clase inmutable no permite modificar sus atributos una vez creados. Esto previene modificaciones inesperadas, reduce errores y protege la integridad de los datos, haciendo que el sistema sea mas seguro.

---

## 3. ¿Que problema podria aparecer en un sistema si los atributos de las clases se mantienen públicos en lugar de privados con getters y setters controlados?
Si los atributos son públicos, cualquier parte del código puede modificarlos sin restricciones, lo que rompe el encapsulamiento, y puede traer mas errores por modificaciones.

---

## 4. ¿Según el principio de Abierto/Cerrado, cómo deberíamos modificar el sistema si queremos añadir una nueva funcionalidad sin alterar el código existente?
El principio indica que las clases deben estar abiertas para extensión pero cerradas para modificación. Para añadir una funcionalidad, se debe crear una nueva clase que extienda o implemente interfaces existentes, en lugar de modificar el código actual. Esto reduce el riesgo de introducir errores.

---

## 5. ¿Por qué es importante que una clase cumpla con el Principio de Única Responsabilidad y qué ejemplo sencillo podrías dar donde se vulnere?
Cumplir este principio facilita el mantenimiento, prueba y reutilización del código, ya que cada clase tiene una única razón para cambiar.  
**Ejemplo de violación:**  
Una clase "Futbolista" que tenga una funcion para obtener informacion(edad, goles, etc) y a su vez una para vender a un jugador, ya que un futbolista no se vende el solo.

---

## 6. ¿Qué es y por qué usamos el pom.xml?
Es el archivo de configuración de Maven que define las dependencias, configuración del proyecto y su ciclo de vida. Nos permite gestionar librerías externas y automatizar la construcción del proyecto de manera eficiente.

---

## 7. ¿Qué diferencia hay entre mvn compile, mvn package y mvn install?
- mvn compile: Compila el código fuente en bytecode.  
- mvn package: Compila y empaqueta el proyecto en un archivo (JAR/WAR).  
- mvn install: Hace lo anterior y además instala el artefacto en el repositorio local, para que otros proyectos puedan usarlo.

---

## 8. ¿Qué diferencia existe entre una interfaz y una clase abstracta?
- Una interfaz define solo métodos abstractos (y constantes), no tiene estado. Se pueden usar muchas de ellas por una sola clase.
- **Clase abstracta:** Puede tener métodos abstractos y concretos, además de atributos. Sirve para compartir comportamiento común entre clases relacionadas.