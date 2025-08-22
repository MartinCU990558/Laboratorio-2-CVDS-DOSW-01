PREGUNTAS INICIALES:

1. ¿Qué ventaja ofrece el polimorfismo en el diseño de clases frente al uso de múltiples condicionales para determinar el comportamiento de un objeto?
    El polimorfismo evita tener largos bloques de codigo "if" permitiendo que este sea mas legible, extensible, mantenible y menor acoplamiento.

2. ¿Por qué una clase inmutable puede mejorar la seguridad?
    Evita las manipulaciones indeseadas en el tiempo y garantiza la seguridad de los datos.

3. ¿Qué problema podría aparecer en un sistema si los atributos de las clases se mantienen públicos en lugar de privados con getters y setters controlados?
    Los atributos publicos en una clase pueden llegar a ser modificados por otras generando problemas de seguridad, mayor acoplamiento o perdida de encapsulacion.

4. ¿Según el principio de Abierto/Cerrado, como deberíamos modificar el sistema si queremos añadir una nueva funcionalidad sin alterar el código existente?
    Debemos crear nuevas clases o implementaciones  que se integren a partir de herencias, interfaces o polimorfismo.

5. ¿Por qué es importante que una clase cumpla con el Principio de única responsabilidad y que ejemplo sencillo podrías dar donde se vulnere?
    Porque nos facilita el mantemiento y testeabilidad del codigo reduciendo la complejidad del mismo.

    EJEMPLO:
    Se tiene una clase controlador que se encarga de la autenticacion del inicio de sesion. Sin embargo, esta tambien se encarga de controlar los servicios de creacion de tareas violando el principio de Responsabilidad Unica. 

6. ¿Qué es y porque usamos el pom.xml?
    Es un archivo que define la estructura del proyecto. Esta nos permite añadir diferentes dependencias para incluir nuevas funcionalidades como herramientas de compilacionj, pruebas o documentacion.


7. ¿Qué diferencia hay entre mvn compile, mvn package y mvn install?
    mvn install: COmpila, empaqueta e instala el proyecto en el repositorio local de maven.
    mvn compile: Compila el codigo fuente del proyecto.
    mvn package: Compila el codigo y lo empaqueta en un archivo .jar o .war.

8. ¿Qué diferencia existe entre una interfaz y una clase abstracta?
    Una interfaz define un contrato de funcionalidades que otras clases de cumplir, mientras que una clase abstracta proporciona una funcionalidad para clases relacionadas.
