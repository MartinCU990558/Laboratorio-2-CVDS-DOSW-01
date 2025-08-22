## PREGUNTAS INICIALES
1. ¿Qué ventaja ofrece el polimorfismo en el diseño de clases frente al uso de múltiples condicionales para determinar el comportamiento de un objeto? <br />
R) El polimorfismo permite simplificar el diseño y mantenimiento del código porque permite que diferentes clases respondan a un mismo método de formas distintas, sin la necesidad de usar múltiples estructuras condicionales.
Esto hace que el código sea más extensible y fácil de entender, ya que el comportamiento específico se delega a cada clase. Así cuando se quiera añadir un nuevo tipo de objeto,
basta con crear una nueva clase que implemente el método, sin necesidad de modificar el código existente

2. ¿Por qué una clase inmutable puede mejorar la seguridad? <br />
R) Una clase inmutable mejora la seguridad porque sus atributos no pueden cambiar después de ser creados, evitando que otros métodos o hilos modifiquen el estado de un objeto de alguna manera
Esto protege la integridad de los datos y previene problemas en entornos concurrentes

3. ¿Qué problema podría aparecer en un sistema si los atributos de las clases se mantienen públicos en lugar de privados con getters y setters controlados? <br />
R) Si los atributos de las clases se mantienen públicos en lugar de privados, cualquier parte del programa puede modificarlos sin control lo que genera inconsistencias, pérdida de encapsulamiento y  errores de seguridad,
Los getters y setters permiten restringir y proteger el acceso a los datos, garantizando que el objeto se mantenga en un estado adecuado

4. ¿Según el principio de Abierto/Cerrado, como deberíamos modificar el sistema si queremos añadir una nueva funcionalidad sin alterar el código existente? <br />
R) Según el principio de Abierto/Cerrado, para añadir una nueva funcionalidad no se debe modificar el código existente, sino extenderlo.
Esto se logra creando nuevas clases, interfaces o implementaciones que usen herencia, lo que evita romper funcionalidades previas y mantiene el sistema flexible a cambios

5. ¿Por qué es importante que una clase cumpla con el Principio de única responsabilidad y que ejemplo sencillo podrías dar donde se vulnere? <br />
R) El Principio de Única Responsabilidad asegura que cada clase tenga un solo propósito, facilitando su mantenimiento y prueba, Si una clase se encarga de múltiples tareas, un cambio en una de ellas puede afectar negativamente a las demás.
Por ejemplo, una clase que maneja tanto la contaduria de negocio y el registro de empleados  viola este principio, ya que combina dos responsabilidades distintas

6. ¿Qué es y porque usamos el pom.xml? <br />
R) El archivo pom.xml es el principal de un proyecto Maven y sirve para gestionar dependencias, configuraciones y plugins necesarios en la construcción del proyecto,
al sarlo garantiza que el proyecto sea replicable, portable y que todas las librerías externas se descarguen automáticamente sin necesidad de gestionarlas manualmente.

7. ¿Qué diferencia hay entre mvn compile, mvn package y mvn install? <br />
R) El comando mvn compile compila el código fuente del proyecto, mvn package además de compilar genera un archivo ejecutable, mientras que mvn install compila,
empaqueta y  instala  en el repositorio local de Maven, de modo que otros proyectos en la misma máquina puedan usarlo como dependencia.

8. ¿Qué diferencia existe entre una interfaz y una clase abstracta? <br />
R) Una interfaz define un "comportamiento" que las clases que lo implementen deben cumplir, mientras que una clase abstracta puede contener tanto métodos abstractos como métodos ya implementados, además de atributos
la principal diferencia es que la interfaz se usa para darle un metodo en comun a dos o mas objetos que no comparten caracteristicas en comun, mientras que la clase abstracta se implementa para objetos que hacen parte de un grupo que comparta caracteristicas similares
ej un auto y un animal no tienen nada en comun pero ambos hacen un sonido (interfaz), un pato y un gato chacen parte del grupo animales (clase abstracta).
