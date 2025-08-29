# 🧪 Laboratorio 02 - SOLID, Patrones de Diseño y UML

**Integrantes:**
- Julian Camilo Lopez Barrero
- Juan Pablo Caballero Castellanos
- Juan Andres Suarez Fonseca

**Nombre De la Rama:**
`feature/CaballeroJuan_SuarezAndres_LopezJulian_2025-2`
---
## ✅ Retos Completados
## Reto 1 ✅
### Descripción :
- Mediante los principios SOLID se implementaron diferentes clases como Cart , Client que sera una clase abstracta donde dos nuevas clases cliente nuevo y cliente viejo extienden de estas para asi aplicar el descuento dependiendo el tipo se cliente que sea, producto , cliente y recibo iguamente se implementaron para  en principio aplicar el principio de single responsability, para acumular los productos decidimos manejar un HashMap para asi con lambda este fuera mas facil de recorrer y para las operaciones de los costos con ayuda de los streams se pudo realizar de manera satisfactoria.

![alt text](docs/imagenes/Reto1/image.png) 
---
![alt text](docs/imagenes/Reto1/image-1.png)
---
![alt text](docs/imagenes/Reto1/image-4.png)
---
![alt text](docs/imagenes/Reto1/image-3.png)
---
![alt text](docs/imagenes/Reto1/image-5.png)
---
![alt text](docs/imagenes/Reto1/image-6.png)
---
![alt text](docs/imagenes/Reto1/image-7.png)

### 💻Pruebas De Compilación y Ejecucion:

![alt text](docs/imagenes/Reto1/image-8.png)
---
![alt text](docs/imagenes/Reto1/image-9.png)
---
![alt text](docs/imagenes/Reto1/image-10.png)
---
## Reto 2 ✅
### Descripción :
- Se realizo mediante el Patron creacional de Builder que se va a encargar de crear la hamburguesa añadiendo los diferentes ingredientes seleccionados en el menu dado o como lo dice la definicion exacta de este nos permitio crear la hamburgesa paso a paso empleando en mismo codigo 

![alt text](docs/imagenes/Reto2/image.png)
---
![alt text](docs/imagenes/Reto2/image-1.png)
---
![alt text](docs/imagenes/Reto2/image-2.png)
---
![alt text](docs/imagenes/Reto2/image-3.png)
---
![alt text](docs/imagenes/Reto2/image-4.png)
---
![alt text](docs/imagenes/Reto2/image-5.png)
### 💻Pruebas De Compilación y Ejecucion:
![alt text](docs/imagenes/Reto2/image.png)
---
![alt text](docs/imagenes/Reto2/image.png)
---
## Reto 3 ✅
## Descripción :
- El reto 3 se logro ralizar con tres patrones de diseño, pero el principal fue factory method y despues los builder y strategy, donde se pueden manejar tres tipos diferentes de vehiculos y su creación dependiendo si era acuatico, terrestre, aéreo facilitando asi la creación de los objetos, y por último strategy para cambiar dinamicamente el comportamiento del vehiculo según su categoria. 

![alt text](image.png)
---
![alt text](image-1.png)
---
![alt text](image-2.png)
---
![alt text](image-3.png)
---
![alt text](image-4.png)
---
![alt text](image-5.png)
---
![alt text](image-6.png)
---
![alt text](image-7.png)
---
![alt text](image-8.png)
---
![alt text](image-9.png)
---
![alt text](image-10.png)
---
![alt text](image-11.png)
---
![alt text](image-12.png)
---
![alt text](image-13.png)
---
![alt text](image-14.png)
---
![alt text](image-15.png)
### 💻Pruebas De Compilación y Ejecucion:
![alt text](image-16.png)
---
![alt text](image-17.png)
---
![alt text](image-18.png)


## Reto 4 ✅
### Descripción :
- Se uso el patron estructural adapter para el momento de realizar las debidas conversiones de la moneda , como este patron nos permite colaborar entre objetos con interfaces compatibles , en base a la interfaz de conversion conectamos estos adaptadores para luego usar en la transaccion realizada el adaptador principal que viene siendo el de la conversion.

![alt text](docs/imagenes/Reto4/image.png)
---
![alt text](docs/imagenes/Reto4/image-1.png)
---
![alt text](docs/imagenes/Reto4/image-2.png)
---
![alt text](docs/imagenes/Reto4/image-3.png)
---
![alt text](docs/imagenes/Reto4/image-4.png)
---
![alt text](docs/imagenes/Reto4/image-5.png)
---
![alt text](docs/imagenes/Reto4/image-6.png)
---
![alt text](docs/imagenes/Reto4/image-7.png)
--- 
![alt text](docs/imagenes/Reto4/image-8.png)
--- 
![alt text](docs/imagenes/Reto4/image-9.png)
---
![alt text](docs/imagenes/Reto4/image-10.png)
### 💻Pruebas De Compilación y Ejecucion:
![alt text](docs/imagenes/Reto4/image-11.png)
---
![alt text](docs/imagenes/Reto4/image-12.png)

## Reto 5 ✅
### Descripción :
- Se realizo mediante el patron de decorator que lo que nos permitia que teniendo nuestro objeto base que era el cafe mediante este se le podian agregar los toppings que vendrian siendo como las "funcionalidades" nuevas que este iba a tener poniendolos dentro del cafe(Cabe resaltar que tomamos como precio base del cafe 3.000 Pesos Colombianos).

![alt text](docs/imagenes/Reto5/image.png)
---
![alt text](docs/imagenes/Reto5/image-1.png)
---
![alt text](docs/imagenes/Reto5/image-2.png)
---
![alt text](docs/imagenes/Reto5/image-3.png)
---
![alt text](docs/imagenes/Reto5/image-4.png)
### 💻Pruebas De Compilación y Ejecucion:
![alt text](docs/imagenes/Reto5/image-5.png)
---
![alt text](docs/imagenes/Reto5/image-6.png)
---
## Reto 6 ✅
### Descripción :
- Se logro realizar a través del patrón de diseño Chains of Responsability (Patrón de comportamiento) que nos permitio manejar el ticket a través de una cadena de diferentes técnicos hasta que alguno de ellos pueda resolverlo, evitando asi "acoplar" la logica a un técnico en específico.

![alt text](docs/imagenes/Reto6/image-1.jpeg)
---
![alt text](docs/imagenes/Reto6/image-2.jpeg)
---
![alt text](docs/imagenes/Reto6/image-3.jpeg)
---
![alt text](docs/imagenes/Reto6/image-4.jpeg)
---
![alt text](docs/imagenes/Reto6/image-5.jpeg)
---
![alt text](docs/imagenes/Reto6/image-6.jpeg)
---
![alt text](docs/imagenes/Reto6/image-7.jpeg)
---
![alt text](docs/imagenes/Reto6/image-8.jpeg)
---
![alt text](docs/imagenes/Reto6/image-9.jpeg)
### 💻Pruebas De Compilación y Ejecucion:
![alt text](docs/imagenes/Reto6/image-10.jpeg)
---
![alt text](docs/imagenes/Reto6/image-11.jpeg)

## Reto 7 ✅
## Descripción :
- Se utilizó el patrón de comportamiento Command en este ejercicio debido a que según su definición, este permite ""convertir una solicitud en un objeto independiente que contiene toda la información necesaria para ejecutarla"".
En este ejercicio, se creó una interfaz Command, la cual define las operaciones básicas que deben implementar los comandos como ejecutar, deshacer, obtener descripción y usuario.
Cada clase concreta de un comando representa una acción específica sobre los dispositivos como encender luces, abrir puerta, reproducir música, ajustar volumen, ajustar las personas y demas. Estas clases almacenan tanto lo que se necesita hacer en cada una referenciando a los objetos receptores sobre los cuales se aplican las acciones.

![alt text](docs/imagenes/Reto7/image-1.png)
---
![alt text](docs/imagenes/Reto7/image-2.png)
---
![alt text](docs/imagenes/Reto7/image-3.png)
---
![alt text](docs/imagenes/Reto7/image-4.png)
---
![alt text](docs/imagenes/Reto7/image-5.png)
---
![alt text](docs/imagenes/Reto7/image-6.png)
---
![alt text](docs/imagenes/Reto7/image-7.png)
--- 
![alt text](docs/imagenes/Reto7/image-8.png)
---
![alt text](docs/imagenes/Reto7/image-9.png)
---
![alt text](docs/imagenes/Reto7/image-10.png)
---
![alt text](docs/imagenes/Reto7/image-11.png)
---
![alt text](docs/imagenes/Reto7/image-12.png)
---
![alt text](docs/imagenes/Reto7/image-14.png)
---
![alt text](docs/imagenes/Reto7/image-15.png)
---
![alt text](docs/imagenes/Reto7/image-16.png)
---
![alt text](docs/imagenes/Reto7/image-17.png)
### 💻Pruebas De Compilación y Ejecucion:
![alt text](docs/imagenes/Reto7/image-18.png)
---
![alt text](docs/imagenes/Reto7/image-19.png)
---
![alt text](docs/imagenes/Reto7/image-20.png)


