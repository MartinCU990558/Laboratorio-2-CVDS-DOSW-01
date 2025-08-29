# Laboratorio 02 -SOLID, Patrones de diseño y UML

**Integrantes**
- Daniel Patiño Mejia
- Juan Felipe Rangel
- Ana Gabrile Fiquitiva

**feature/PatiñoDaniel_FiquitivaAna_RangelJuan_2025-2**

---

##Retos Completados

###Reto 1:
- **Tipo de patron:** Comportamiento
- **Patron:** Patron Strategy
- **Justificacion**:
El código cumple con los requisitos del reto, implementando correctamente el uso de **streams** en la clase `CarritoCompras.java` para calcular el subtotal utilizando `mapToDouble` y `sum()`. Además, se aplica el principio de **Responsabilidad Única**, ya que la clase `CarritoCompras` se encarga exclusivamente de gestionar los productos en el carrito y aplicar descuentos, mientras que las estrategias de descuento se delegan a la interfaz `EstrategiaDescuento`. Se observa un uso de **polimorfismo** al cambiar entre diferentes tipos de descuentos sin modificar la clase `CarritoCompras`, y el principio de **Abierto/Cerrado** se cumple al permitir la extensión de nuevas estrategias sin modificar el código existente.

En cuanto a los principios de **encapsulamiento**, los atributos como `cliente` y `items` son `private final`, lo que garantiza su protección y evita modificaciones externas. El precio unitario de los productos está declarado como `final` en la clase `Producto.java`, asegurando que no pueda ser alterado una vez asignado. Por último, se cumple con el requisito de descuentos al aplicar un 5% para clientes nuevos y un 10% para clientes antiguos, utilizando las clases `DescuentoClienteFrecuente.java` y `DescuentoClienteNuevo.java`, lo que hace que el sistema sea flexible y fácilmente extensible.

Adicionalmente el patrón de diseño utilizado en este reto es el **Patrón Estrategia**. Este patrón se emplea para definir una familia de algoritmos (en este caso, las estrategias de descuento) y hacerlas intercambiables. En la implementación, la interfaz `EstrategiaDescuento` permite que las clases `DescuentoClienteFrecuente` y `DescuentoClienteNuevo` proporcionen su propio cálculo de descuento. La clase `CarritoCompras` utiliza una instancia de `EstrategiaDescuento` para aplicar el descuento adecuado al total de la compra, lo que permite cambiar la estrategia de descuento de manera dinámica sin modificar la clase `CarritoCompras`. Este patrón facilita la extensión del sistema, ya que se pueden agregar nuevas estrategias de descuento sin alterar el código existente.

- **Imagen:** ![Caso de prueba](docs/imagenes/reto1.png)

###Reto 2:
- **Tipo de patron:** Creacional
- **Patron:** Builder
- **Justificacion**: 
- **Imagen:** 
![Caso de prueba](docs/imagenes/reto2.png)

###Reto 3:
- **Tipo de patron:**  Creacional
- **Patron:** FactoryMethod
- **Justificacion**:
El patrón Factory se utiliza para delegar la creación de objetos a una clase especializada (en este caso, VehiculoFactory), permitiendo que se instancien diferentes tipos de vehículos sin que el código cliente tenga que preocuparse por los detalles de su creación. Esto mejora la flexibilidad y el mantenimiento del código. El método crearPorModelo en la clase VehiculoFactory crea instancias de diferentes tipos de vehículos según el modelo que se pase como parámetro. Este enfoque asegura que el código cliente solo tenga que llamar al método de la fábrica y no tenga que gestionar la creación de objetos de manera directa.

- **Imagen:** ![Caso de prueba](docs/imagenes/reto3_1.png)
![Caso de prueba](docs/imagenes/reto3_2.png)

###Reto 4:
- **Tipo de patron:** 
- **Patron:** 
- **Imagen:** ![Caso de prueba]()

###Reto 5:
- **Tipo de patron:** 
- **Patron:** 
- **Imagen:** ![Caso de prueba]()

###Reto 6:
- **Tipo de patron:** 
- **Patron:** 
- **Imagen:** ![Caso de prueba]()

###Reto 7:
- **Tipo de patron:** Comportamiento 
- **Patron:** Command
- **Explicacion:**
El Patrón Command permite encapsular una solicitud como un objeto, lo que nos permite parametrizar los objetos con solicitudes, hacer cola o registrar solicitudes, y deshacer operaciones. En este reto, las clases como EncenderLuz, AbrirPuerta, AjustarVolumen, etc., representan comandos concretos que encapsulan una acción sobre objetos como Luz, Puerta, Musica, y Persiana. Esto permite ejecutar las acciones sin tener que conocer los detalles de cómo se llevan a cabo esas operaciones.

En este caso, se aplico en las clases como EncenderLuz o AbrirPuerta implementan el patrón Command al ser responsables de ejecutar una acción específica sobre un objeto. El ComandoFactory es utilizado para crear las instancias de los diferentes comandos basados en la opción seleccionada por el usuario. Esto delega la responsabilidad de ejecutar acciones a los objetos comando, separando las solicitudes de las acciones ejecutadas, lo que mejora la flexibilidad y escalabilidad del sistema.
- **Imagen:** ![Caso de prueba](docs/imagenes/reto7_1.png)
![Caso de prueba](docs/imagenes/reto7_2.png)

###Reto 8:
 En el diseño del diagrama se consolidaron los principos SOLID destacando la S (Single Responsability), la O(open/close) la I(Interface Segregation), en primera instancia cada clase, componente y servicio planteado en el diagrama tiene solo una unica responsabilidad evitando el acoplamiento y que el codigo sea mas facil de mantener evitando problemas si es que se requiere una extension en un futuro. Como siguiente principio está la O ya que con la creacion de clases con enumeraciones y herencias el codigo estaria abierto a la extension evitando problemas a futuro si es que se quiere agregar un nuevo habitat o un nuevo tipo de comida, el diagrama se puede modificar y extender sin necesidad de cambiar el codigo existente. Seguimos con la I y esta la implementamos en el caso de las funciones que tiene que hacer el cuidador y las del visitante, como se enunció en la guia, los animales pueden ser alimentados por cuidadores y por visitantes por lo que tener una interfaz con las funciones todas las funciones no fue lo ideal, por lo que se crea una interfaz de alimentacion para que ambos puedan alimentar a los animales segun sus aptitudes separado de las funciones de un trabajador. 

Con respecto a el patron utilizado, el mas conveniente fue singleton, ya que con eso nos aseguramos que ECIZoo tenga una unica instacia, evitando crearla muchas veces para asi tambien poder acceder de manera global en el codigo.
- **Imagen:** ![Caso de prueba](docs/imagenes/reto8.png)