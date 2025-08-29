# Laboratorio 02 -SOLID, Patrones de diseño y UML

**Integrantes**
- Daniel Patiño Mejia
- Juan Felipe Rangel
- Ana Gabrile Fiquitiva

**feature/PatiñoDaniel_FiquitivaAna_RangelJuan_2025-2**

---

##Retos Completados

###Reto 1:
- **Tipo de patron:** 
- **Patron:** 
- **Imagen:** ![Caso de prueba]()

###Reto 2:
- **Tipo de patron:** Creacional
- **Patron:** Builder
- **Justificacion**: Elegimos este patron ya que este nos permite construir distintos tipos y representaciones del objeto, en este caso como todas las hamburguesas no tienen los mismos ingredientes, por lo tanto se implemento una clase builder donde se pueden elegir los ingredientes para construir el objeto hamburguesa.
- **Imagen:** 
![Caso de prueba](docs/imagenes/reto2.png)

###Reto 3:
- **Tipo de patron:** 
- **Patron:** 
- **Imagen:** ![Caso de prueba]()

###Reto 4:
- **Tipo de patron:** Comportamiento
- **Patron:** Strategy
- **Justificacion:** La razon por la cual utilizamos strategy fue porque teniamos que implementar una logica distinta para cada tipo de conversion, lo que se hizo fue implementar una interfaz donde se tiene un metodo convertir y se crearon multiples clases, una por cada divisa donde se implementa la interfaz acorde a al tipo de conversion y los valores de conversion por moneda.
- **Imagen:** ![Caso de prueba](docs/imagenes/reto4.png)

###Reto 5:
- **Tipo de patron:** 
- **Patron:** 
- **Imagen:** ![Caso de prueba]()

###Reto 6:
- **Tipo de patron:** 
- **Patron:** 
- **Imagen:** ![Caso de prueba]()

###Reto 7:
- **Tipo de patron:** 
- **Patron:** 
- **Imagen:** ![Caso de prueba]()

###Reto 8:
- **Explicacion:** En el diseño del diagrama se consolidaron los principos SOLID destacando la S (Single Responsability), la O(open/close) la I(Interface Segregation), en primera instancia cada clase, componente y servicio planteado en el diagrama tiene solo una unica responsabilidad evitando el acoplamiento y que el codigo sea mas facil de mantener evitando problemas si es que se requiere una extension en un futuro. Como siguiente principio está la O ya que con la creacion de clases con enumeraciones y herencias el codigo estaria abierto a la extension evitando problemas a futuro si es que se quiere agregar un nuevo habitat o un nuevo tipo de comida, el diagrama se puede modificar y extender sin necesidad de cambiar el codigo existente. Seguimos con la I y esta la implementamos en el caso de las funciones que tiene que hacer el cuidador y las del visitante, como se enunció en la guia, los animales pueden ser alimentados por cuidadores y por visitantes por lo que tener una interfaz con las funciones todas las funciones no fue lo ideal, por lo que se crea una interfaz de alimentacion para que ambos puedan alimentar a los animales segun sus aptitudes separado de las funciones de un trabajador. 

Con respecto a el patron utilizado, el mas conveniente fue singleton, ya que con eso nos aseguramos que ECIZoo tenga una unica instacia, evitando crearla muchas veces para asi tambien poder acceder de manera global en el codigo.
- **Imagen:** ![Caso de prueba](docs/imagenes/reto8.png)