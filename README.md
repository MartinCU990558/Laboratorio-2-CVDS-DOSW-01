# Laboratorio 02 – SOLID, Patrones de Diseño y UML

---

## 👥 Integrantes
- **Sebastian Barros**  
- **Karol Estupiñan**  
- **Juan Puentes**  

📌 **Nombre de la rama:**  
`feature/EstupiñanKarol_PuentesJuan_BarrosSebastian_2025-2`

---

## ✅ Retos Completados

---

###  Reto 1

#### Evidencia del código de la solución implementada:


#### Evidencia de la ejecución:


---

###  Reto 2 – Patrón **Builder**

#### Evidencia #1
![alt text](image.png)

#### Explicación
- **Patrón de Diseño:** Creacional.  
- **Patrón Utilizado:** **Builder**.  
- **Justificación:** El patrón Builder permite la **creación de objetos complejos paso a paso**, lo cual resulta ideal cuando se deben armar productos con múltiples combinaciones posibles.  
- **Aplicación:**  
  - Se definió una **interfaz Builder** con los métodos necesarios para construir el objeto (en este caso, la hamburguesa).  
  - Se creó una clase concreta `HamburguesaBuilder` que implementa los métodos de la interfaz para realizar la construcción.  

#### Evidencia #2
![alt text](image-1.png)  
![alt text](image-2.png)  
![alt text](image-3.png)  

---

###  Reto 3 - Patrón Abstract Factory

#### Evidencia de la ejecución:

![alt text](image-8.png)

#### Explicación
**Patrón de Diseño:** Creacional.
**Patrón Utilizado:** Abstract Factory.
**Justificación:** Este patron nos permite crear familias de objetos relacionados, en este ejercicio, debemos crear diferentes variantes de vehiculos, por lo que este patron es ideal. 
**Aplicación:** Creamos la clase abstracta VehiculoAbstractFactory, con el metodo crearVehiculo
Luego, creamos una Factory para los vehiculos, economicos, de lujo y usados que extiende a VehiculoAbstractFactory y contiene los llamados a los constructores. De esta forma, ya sabiendo el vehiculo que quiera el usuario, solo debemos crear la factory apropiada y pasarle los parametros requeridos al constructor de Vehiculo. 

#### Evidencia #2
![alt text](image-9.png)

![alt text](image-10.png)

![alt text](image-11.png)

![alt text](image-12.png)

---

###  Reto 5 – Patrón **Decorator**

#### Evidencia #1
![alt text](image-4.png)

#### Explicación
- **Patrón de Diseño:** Estructural.  
- **Patrón Utilizado:** **Decorator**.  
- **Justificación:** Este patrón permite extender las funcionalidades de un objeto en tiempo de ejecución, sin necesidad de modificar el código base.  
- **Aplicación:**  
  - Se definió una **interfaz base** que contiene los métodos que deben implementar todos los componentes (toppings).  
  - Se creó una **clase decoradora abstracta**, la cual envuelve a un objeto del mismo tipo y delega las operaciones hacia él.  
  - Finalmente, cada **topping concreto** hereda de la clase decoradora, agregando su propia lógica (sumar costo y añadir descripción).  

#### Evidencia #2
![alt text](image-5.png)  
![alt text](image-6.png)  
![alt text](image-7.png)  

---

### Reto 7 - Patrón **Command**

##### Evidencia #1:
![alt text](<Captura de pantalla de 2025-08-27 17-31-09.png>)
![alt text](<Captura de pantalla de 2025-08-27 17-31-40.png>)


#### Explicación

- **Patrón de Diseño:**Comportamiento.

- **Patrón Utilizado:** **Command**.

- **Jusificación:** La usamos porque este patron nos permite encapsular las solicitudes como objetos, y era lo que necesitamos aca por las acciones del contro remoto como encender luz,subir volumen, etc.

- **Aplicacion:**
- Se creo una interfaz comand para que cada accion implemente las acciones necesarias.
- Creamos cada accion(Encender luz,subir volumen, ...) para que implementan la interfaz para realizar sus acciones.
- Por ultimo, creamos una clase control donde hacemos el historial y  resumen, de cada una de las acciones que elije el usuario.

#### Evidencia #2
![alt text](<Captura de pantalla de 2025-08-27 17-32-21.png>)
![alt text](<Captura de pantalla de 2025-08-27 17-33-30.png>)
![alt text](<Captura de pantalla de 2025-08-27 17-34-16.png>)

 
