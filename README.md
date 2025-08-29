# 📘 Laboratorio 2 - CVDS DOSW 01  

## 👥 Integrantes  
- **Raquel Selma**  
- **Néstor David López**  
- **Santiago Suárez**  

---

## 🌿 Rama de trabajo  
`feature/SuarezSantiago_SelmaRaquel_LopezNestor_2025-2`  

---

## 🔎 Reto 5  

### Patrón utilizado: **Decorator**  

Para este reto realizamos un análisis de los diferentes patrones de diseño, con el fin de determinar cuál era el más adecuado. Tras la revisión concluimos que el patrón **Decorator** era el más apropiado, ya que:  
- Es un **patrón estructural**.  
- Permite **añadir funcionalidades adicionales a los objetos** sin modificar su estructura base.  
- Facilita la **extensibilidad** y el **reuso de código**.  

En nuestro caso:  

- El **componente principal** es el **café**.  
- Creamos una **interfaz para los toppings**, que se implementa en una clase abstracta.  
- A partir de esta clase se heredan los diferentes tipos de **toppings** que pueden agregarse al café.  

---

## Evidencia trabajo en equipo 
![alt text](image-2.png)
**Nuestra compañera Raquel nos ayudo en presencia asi que ella no tiene commmits, ella nos ayudo en clase**
---

## 📊 Resultados  
A continuación, se muestran los resultados obtenidos:  
![alt text](image.png)

## 🔎 Reto 6

### Patron utilizado: Chain of Resposibility
Para este reto en un primer momento tratamos de analizar lo que es la prioridad del reto como tal, tras observalo durante casi una hora logramos identificar que quizas necesitaba un patron comportamental ya que el ejercicio era de que los objetos como lo son los tecnicos tienen su responsabilidad y dependiendo de eso saben que realiza que. Luego al ver mas a fondo los patrones encontramos el Chain of resposibility el cual consiste en pasar las solicitudes haciendo que cada uno decida si lo procesa o no lo hace. Esto es muy oportuno para nuestro ejercicio debido a que cada tecnico elije si puede o no hacer el trabajo por lo que decidimos aplicarlo.
Entonces para eso creamos la clase abstracta tecnico y de ahi salen los tecnicos basicos, intermedios y avanzados. Delegando la resposabilidad dependiendo del nivel del trabajo. Sin embargo tuvimos un problema y es que al ver la salida no entendiamos por que el intermedio no podia resolver su problema y tampoco entendimos por que el basico no podia atender con el ultimo pedido asi que al no entender no pudimos aplicarlo y lo dejamos de tal manera que dependiendo del nivel que tenga los tecnicos van a ver si lo pueden resolver o no.
Asi que nos dio como resultado:
![alt text](image-1.png)