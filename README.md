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



