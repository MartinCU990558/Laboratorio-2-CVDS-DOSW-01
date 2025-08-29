# Laboratorio 02 - SOLID, Patrones de Diseño y UML

**Integrantes**
- Julián David Castiblanco Real
- David Santiago Palacios Pinzón
- Robinson Steven Nuñez

**feature/PalaciosDavid_CastiblancoJulian_NuñezRobinson_2025-2**

---

## ✅ Retos Completados

### RETO #1: El problema de la tienda de Don Pepe

Evidencia:
![Captura](docs/imagenes/reto1_final.png)


Descripción:
Debemos ayudar a Don Pepe ya que no tiene un sistema organizado para manejar sus ventas,
asi que se creo un sistema con los pricipios de solid, como s para que cada clase tuviera
su única responsabilidad, tambien la d para los clientes.

### RETO #2: El chef de 5 estrellas.
Evidencia:
![Captura](docs/imagenes/reto2_1.png)
![Captura](docs/imagenes/reto2_2.png)
![Captura](docs/imagenes/reto2_3.png)
![Captura](docs/imagenes/reto2_4.png)
![Captura](docs/imagenes/reto2_salida.png)

Descripción:
Un Chef quiere preparar hamburguesas personalizadas para sus clientes, cada hamburguesa puede tener pan, carne, queso, vegetales y salsas, pero no todos los ingredientes son obligatorios.

**Patrón de Diseño**

- **Categoría:** Creacional  
- **Patrón Utilizado:** Builder  

### 🔹 Justificación
El patrón builder es ideal cuando necesitamos construir objetos 'complejos' paso a paso, permitiendo distintas representaciones del mismo producto.  
En este caso, una hamburguesa puede estar compuesta de diferentes ingredientes (pan, carne, queso, vegetales, salsas, etc.), y el proceso de creación debe ser flexible para soportar múltiples variaciones sin alterar la lógica principal.

### 🔹 Cómo lo aplicamos
- La clase `BurgerBuilder` actúa como el Builder, cuenta con los métodos para agregar ingredientes específicos. 
- La clase `Burger` representa el producto, que contiene la lista de ingredientes y el precio total.  
- La clase `BurgerApplication` funciona como el cliente, donde el usuario selecciona los ingredientes y se construye la hamburguesa final.  
- La clase `BurgerReceipt` se encarga de mostrar el resultado final (ingredientes seleccionados y precio total).  
- Para el calculo del precio se usan streams que calculan dinamicamente el precio total.

---

### RETO #3: El Reino de los Vehículos
Evidencia:

<img width="537" height="203" alt="image" src="https://github.com/user-attachments/assets/9fe3d10e-c730-468a-b86b-cebb451de28e" />
<img width="697" height="471" alt="image" src="https://github.com/user-attachments/assets/1ac1e6b8-bfed-44e7-ba7d-9b749b3cd2ea" />
<img width="879" height="471" alt="image" src="https://github.com/user-attachments/assets/3730f0d3-ded7-429a-976c-470d46e41ec7" />
<img width="714" height="466" alt="image" src="https://github.com/user-attachments/assets/73b3af20-624f-440e-b484-b278cd334241" />
<img width="772" height="466" alt="image" src="https://github.com/user-attachments/assets/0f2047d3-e1f0-46f1-a672-08506549b0d2" />
<img width="754" height="459" alt="image" src="https://github.com/user-attachments/assets/8bc53ab6-cbdf-443b-b455-2de063595670" />
<img width="844" height="480" alt="image" src="https://github.com/user-attachments/assets/32af3a39-1ae5-48fb-9a2a-547238797ace" />
<img width="768" height="474" alt="image" src="https://github.com/user-attachments/assets/7b1a3acf-b3dc-4032-b67a-7bc17b41d501" />
<img width="771" height="463" alt="image" src="https://github.com/user-attachments/assets/1a782758-e7ab-4847-8784-f5c8980ed0ba" />
<img width="792" height="462" alt="image" src="https://github.com/user-attachments/assets/02b36a1f-6958-4dd8-bfe8-a7c5ac3be11c" />
<img width="1017" height="592" alt="image" src="https://github.com/user-attachments/assets/085252a4-6c7b-4c58-bc87-4bd4d322a412" />
<img width="768" height="577" alt="image" src="https://github.com/user-attachments/assets/b04bea5c-8873-44ca-84e4-7935f43f7360" />
<img width="745" height="1100" alt="image" src="https://github.com/user-attachments/assets/ec2a49e1-398b-44f4-bb2d-592d0a75e0d9" />

📝 Entrada:

<img width="451" height="337" alt="image" src="https://github.com/user-attachments/assets/5516a56b-26fe-48c0-9e40-16861ce2e8af" />

📢 Salida:

<img width="459" height="314" alt="image" src="https://github.com/user-attachments/assets/d1ce9361-9710-409d-8129-17ee0e932058" />

Descripción:
Una concesionaria llamada el Reino de los vehículos vende todos los medios de transporte que se imaginen, desde vehículos de tierra , vehículos acuáticos y vehículos aéreos, cada uno con categorías como Económico, Lujo y Usado.
Cada categoría afecta las características de los vehículos como su velocidad máxima, comodidad, precio y equipamiento.
Los vehículos disponibles para los compradores son Autos, Bicicletas, Motos, Lanchas, Veleros, Jet Skis, Aviones, Avionetas y Helicópteros.

**Patrón de diseño:**

- ***Patrón de diseño:*** Creacional
- ***Patrón utilizado:*** Abstract Factory
- ***Justificación:*** Implementamos un patrón de fábrica abstracta para la creación de vehículos.
Esto nos permite instanciar diferentes tipos de vehículos (autos, motos, bicicletas, lanchas, veleros, jet skis, aviones, avionetas y helicópteros) de forma desacoplada y extensible.
Gracias a este patrón, se pueden agregar nuevos vehículos o categorías sin necesidad de modificar la lógica central del sistema, cumpliendo con el principio abierto/cerrado (OCP) de SOLID.

- ***Cómo lo aplicamos:*** Definimos una interfaz común Vehicle con métodos para obtener tipo, categoría, velocidad máxima, precio y equipamiento.
Cada vehículo (ej. Car, Bike, Boat, Plane) implementa esa interfaz.
Mediante la clase GeneralFactory, el sistema crea los objetos de manera dinámica dependiendo de la elección del usuario (tipo y categoría), y al final se generan los recibos usando streams para calcular el total.

### RETO #4: La Estafa de la Casa de Cambio
Evidencia:
![Captura](docs/imagenes/reto4_1.png)
![Captura](docs/imagenes/reto4_2.png)
![Captura](docs/imagenes/reto4_3.png)
![Captura](docs/imagenes/reto4_4.png)
![Captura](docs/imagenes/reto4_5.png)
![Captura](docs/imagenes/reto4_6.png)
![Captura](docs/imagenes/reto4_salida.png)

Descripción:
Una casa de cambio tenía como anterior propietario conocido como “El Gringo”, resulta que para cualquier persona que quisiera cambiar su dinero a dólares (Euros, Yenes, Pesos Colombianos) el utilizaba la misma tasa de cambio para todas por lo que los usuarios eran estafados.
El nuevo dueño los ha contratado y les ha asignado La tarea de crear un servicio que permita convertir cualquier moneda a cualquier designación de las utilizadas con la tasa real.
**Patrón de Diseño**

- **Categoría:** Comportamiento  
- **Patrón Utilizado:** Strategy  

### Justificación
El patrón Strategy permite definir una familia de algoritmos (en este caso, diferentes tipos de conversión de divisas), encapsularlos y hacerlos intercambiables sin modificar el código del cliente.  
Esto resuelve el problema de tener que manejar múltiples conversiones en una sola clase con condicionales.

### Cómo lo aplicamos:
- La interfaz `ConversionStrategy` define el contrato de conversión de cualquier moneda.  
- Cada clase concreta (ej: `UsdConversion`, `EuroConversion`, `YenConversion`, etc.) implementa la lógica para convertir desde la moneda original hacia la deseada.  
- La clase `CurrencyConverter` actúa como contexto, recibiendo una estrategia de conversión y aplicándola a la cantidad de dinero ingresada.  
- La clase `ApplicationReto4` funciona como cliente, donde el usuario ingresa las transacciones y selecciona la conversión.  
- La clase `ConversionReceipt` muestra los resultados: monto original, monto convertido y totales calculados con el uso de streams.

### RETO #5: El Café Personalizado
Evidencia:

<img width="573" height="127" alt="image" src="https://github.com/user-attachments/assets/be5394f8-7691-4be1-97fc-0dda6fa6c4d3" />
<img width="736" height="385" alt="image" src="https://github.com/user-attachments/assets/6b8abdb4-8e62-4d08-a6e8-f4112ab9e3c5" />
<img width="563" height="350" alt="image" src="https://github.com/user-attachments/assets/abc090a9-1831-4bcf-ac3a-44f47be27210" />
<img width="596" height="348" alt="image" src="https://github.com/user-attachments/assets/6c210436-ed5e-4336-b83b-f57eab9ab4c9" />
<img width="548" height="348" alt="image" src="https://github.com/user-attachments/assets/cfd6b681-e066-47df-ac56-3198e6ce8513" />
<img width="554" height="280" alt="image" src="https://github.com/user-attachments/assets/f42b55ff-ee4b-4b59-8564-eae1d1283499" />
<img width="665" height="436" alt="image" src="https://github.com/user-attachments/assets/de8e2ae0-0c25-4df6-b557-2edef9873e2c" />
<img width="727" height="1129" alt="image" src="https://github.com/user-attachments/assets/62038a33-ddc9-42eb-ba9a-825a8f11f761" />

📝 Entrada:

<img width="528" height="625" alt="image" src="https://github.com/user-attachments/assets/9425da4f-47d2-41b3-8314-8d1be3dfe5f1" />

📢 Salida:

<img width="450" height="125" alt="image" src="https://github.com/user-attachments/assets/e3a4e57a-864b-4a9c-8c55-d257174eeceb" />

Descripción:
- ***Patrón de diseño:*** Estructural
- ***Patrón utilizado:*** Decorator
- ***Justificación:*** Implementamos un patrón de diseño decorador para construir cafés personalizados agregando dinámicamente toppings como leche, chocolate y caramelo.
Esto permite extender las funcionalidades del objeto base (SimpleCoffee) sin modificar su código, agregando nuevas características de manera flexible y siguiendo el principio abierto/cerrado (OCP) de SOLID.

- ***Cómo lo aplicamos:*** Definimos la interfaz Coffee y la clase base SimpleCoffee.
Luego creamos un decorador abstracto (CoffeeDecorator) y decoradores concretos (Milk, Chocolate, Caramel) que añaden comportamiento extra al café (más descripción y más precio).
El usuario puede ir seleccionando los toppings deseados en tiempo de ejecución y cada uno se va envolviendo sobre el café base.
Finalmente, usamos streams para calcular el total de varios cafés en una misma orden y mostrarlo en el recibo.

### RETO #6: Habla con Soporte Técnico
Evidencia:

![Captura](docs/imagenes/reto6_1.png)
![Captura](docs/imagenes/reto6_2.png)
![Captura](docs/imagenes/reto6_3.png)

📝 Entrada:

![Captura](docs/imagenes/reto6_entrada.png)

📢 Salida:

![Captura](docs/imagenes/reto6_salida.png)

Descripción:
Cada ticket tiene un nivel de complejidad el basico, intermedio o avanzado y una prioridad baja media o alta.
Los técnicos tambien se clasificion en basico, intermedio o avanzado intentan resolver cada ticket en orden, pero si ninguno puede resolverlo,
el ticket queda pendiente de escalamiento y para eso usamos streams para generar las carateristicas.

**Patrón de diseño:**

- ***Patrón de diseño:*** De comportamiento
- ***Patrón utilizado:*** Chain of Responsibility
- ***Justificación:*** Implementamos un patrón de diseño de cadena de responsabilidad para el procesamiento de tickets.
  Esto permite que una solicitud sea evaluada secuencialmente por múltiples tecnicos hasta que uno la procesa.
  Si ningún tecnico puede hacerse cargo, el ticket llega al final de la cadena y se marca para su escalada.

- ***Como lo aplicamos:*** Cuando un ticket se procesa, se invoca el método handleTicket(). Este verifica si el técnico actual puede resolverlo.
  Si es así, se marca el ticket como resuelto y se guarda el nivel del técnico que lo atendió. Si no puede resolverlo,
  el ticket se envía automáticamente al siguiente técnico de la cadena. Finalmente, si ningún técnico logra atenderlo,
  se marca el ticket como pendiente de escalamiento.


### RETO #7: El control remoto Mágico

Evidencia:

![Captura](docs/imagenes/reto7_1.png)
![Captura](docs/imagenes/reto7_2.png)
![Captura](docs/imagenes/reto7_3.png)
![Captura](docs/imagenes/reto7_4.png)
![Captura](docs/imagenes/reto7_5.png)
![Captura](docs/imagenes/reto7_6.png)
![Captura](docs/imagenes/reto7_7.png)
![Captura](docs/imagenes/reto7_8.png)
![Captura](docs/imagenes/reto7_9.png)
![Captura](docs/imagenes/reto7_10.png)
![Captura](docs/imagenes/reto7_11.png)
![Captura](docs/imagenes/reto7_12.png)



📝 Entrada:

![Captura](docs/imagenes/reto7_entrada.png)

📢 Salida:

![Captura](docs/imagenes/reto7_salida.png)


Descripción: 
Lo que se hizo fue encapsular las distintas acciones que se hacen con el control 
entonces se registraron en un historial,

**Patrón de diseño:**

- ***Patrón de diseño:*** De comportamiento
- ***Patrón utilizado:*** Command
- ***Justificación:*** Convierte cada acción en un objeto, separando claramente quién pide la acción de quién la ejecuta, asi se facilita
  que se pueda deshacer ya que cada comando guarda una especie de historial que guarda el estado anterior necesario para revertir la operación,
  asi facilmente se agregan nuevas funcionalidades, cumpliendo el principio de open/closed.

- ***Como lo aplico:***
  Por medio de una interfaz Command que actúa como contrato común, las distintas acciones se implementan como objetos que exponen métodos para ejecutar,
  deshacer y describirse (registro). De este modo las clases concretas quedan contenidas en un archivo y cada una encapsula los parámetros necesarios para realizar su función y,
  cuando hace falta, guarda el estado previo para poder restaurarlo al deshacer.
  La clase invocadora crea los comandos, llama a execute() y, si corresponde, a undo(), y además almacena un ActionRecord
  por cada petición para mantener el historial y poder investigar quién realizó cada cambio.


### RETO #8: El Zoológico de los UML

Nos acaban de contratar para hacer una app llamada ECI Zoo en la que vamos a gestionar los animales, cuidadores y visitantes,
para elló, tomamos los animales y los gestionamos con atributos estáticos y dinámicos.
Modelamos los cuidadores, sus especialidades y sus interacciones (alimentar, bañar, limpiar hábitat).
Modelamos los visitantes que pueden marcar favoritos, alimentar animales, dar propinas y subir fotografías.
Para darle solución usamos principios de diseño SOLID y patrones cuando correspondia.

**Diagrama de Clases:**
![Captura](docs/uml/reto8_zoo_eci.png)

***Evidendia de realización en Lucidchart:***
https://lucid.app/lucidchart/47a13a4b-f336-4fa6-9a75-147ec7fe6ca7/edit?viewport_loc=-2429%2C-1585%2C5646%2C2537%2C0_0&invitationId=inv_41ec6382-579a-4ae1-9f06-aa9cafa1f7ce

***Clases principales:***
- Animal, Caregiver, Visitor, Phograph, Propinable y DynamicAttribute

***Asociaciones y multiplicidades:***
- Un animal puede tener 1..* cuidadores o un cuidador puede tener 1..* animales que cuidar.
- Un visitante puede tener varios favoritos, y un animal puede ser favorito de muchos visitantes.
- Cada foto siempre tiene un visitante asociado, y un visitante puede subir múltiples fotos.
- Cada animal puede tener múltiples atributos dinámicos como pelaje, rareza o historial médico
- Modelamos que un visitante puede dar propinas o interactuar con varios cuidadores y viceversa. La interacción concreta de dar propina se modela mediante la interfaz Propinable


***Aplicación de SOLID***

- Single Responsibility Principle: Cada clase cumple una sola responsabilidad: Animal el comportamiento de animales; Cuidador acciones sobre animales; Visitor interatua con el zoo; DynamicAttribute solo maneja atributos dinámicos y Propinable se encarga de las propinas
- Open/Closed Principle: La clase Animal esta abierta a extención ya que añade nuevas subclases y Propinable permite nuevos receptores de propinas sin modificar Visitor.
- Liskov Substitution Principle: Las subclases de Animal deben comportarse como Animal, y cada una tiene un método único
- Interface Segregation Principle: La interfaz Propinable es pequeña y específica ya que solo tiene un metodo estableciendo un contrato para que los visitantes que dan propina estén cómodos.
- Dependency Inversion Principle: Visitor es como un modulo de alto nivel que depende de la abstracción Propinable que es la interfaz, en lugar de depender de modulos de bajo nivel como lo es la clase de Caregiver por lo que el Caregiver es una implementación concreta de esa abstracción.

***Patrones de diseño usados***
- Abstract Factory: para creación de Animal según su tipo.
- Decorator: Nos sirvio para modelar DynamicAttribute si se desea añadir un nuevo comportamiento y encapsularlo.
- Observer: Para notificar cambios de healthStatus a cuidadores o a subsistemas


