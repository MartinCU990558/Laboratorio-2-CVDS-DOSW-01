### Preguntas iniciales

---

### 1. ¿Qué ventaja ofrece el polimorfismo en el diseño de clases frente al uso de múltiples condicionales para determinar el comportamiento de un objeto?

- El polimorfismo es la habilidad que tienen los objetos de responder al mismo llamado de un método de diferentes maneras, nos ayuda en el apartado del diseño porque solamente necesitariamos hacer un solo llamado del método y cada clase va a responder de la manera correspondiente sin ncesidad de utilizar múltiples condicionales.

---

### 2. ¿Por qué una clase inmutable puede mejorar la seguridad?

- Genera seguridad en multiples hilos de ejecución, evita modificaciones en el tiempo.

---

### 3. ¿Qué problema podría aparecer en un sistema si los atributos de las clases se mantienen públicos en lugar de privados con getters y setters controlados?

- Si una clase tiene los atributos publicos estos pueden ser accedidos mediante otras clases con el fin de modificarlos por los que podría llegar a haber conflictos entre clases.

---

### 4. ¿Según el principio de Abierto/Cerrado, como deberíamos modificar el sistema si queremos añadir una nueva funcionalidad sin alterar el código existente?

- Si tenemos una superclase (abstracta) podríamos generalizar un método que tenga cada clase con su correspondiente lógica sin tener que alterar código existente logrando llevar a cabo nuevas funcionalidades.

---

### 5. ¿Por qué es importante que una clase cumpla con el Principio de única responsabilidad y que ejemplo sencillo podrías dar donde se vulnere?

- Principalmente porque una clase no debería estar recargada de responsabilidades que no necesariamente sean de su autoria

### Ej:

- Una clase usuario que tenga metodos relacionados con la persistencia esta asumiendo más de una responsabilidad

---

### 6. ¿Qué es y porque usamos el pom.xml?

- En este archivo se encuentra definida toda la estructura del proyecto, de la misma manera podemos agregar,modificar como dependencias permitiendonos tener acceso a nuevas funcionalidades que nos ayudan en el proyecto, también se definen aspectos como la clase que corre como principal y la versión de las aplicaciones, también define los plugins que permiten compilar y empaquetar el proyecto.

---

### 7. ¿Qué diferencia hay entre mvn compile, mvn package y mvn install?

- mvn install: te genera todos los archivos como e instala en tu repositorio local de maven
- mvn package: en el directorio target te generá todos los archivos .jar
- mvn compile: compila el código fuente del proyecto

---

### 8. ¿Qué diferencia existe entre una interfaz y una clase abstracta?

- Una interfaz es un contrato entre clases por lo que cuando una clase implementa una de estas esta obligada a sobreescribir sus métodos mientras que una clase abstracta puede o no tener lógica respectiva en sus métodos.
