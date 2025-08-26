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
- **Justificación de Uso:** El patrón Builder permite la **creación de objetos complejos paso a paso**, lo cual resulta ideal cuando se deben armar productos con múltiples combinaciones posibles.  
- **Aplicación:**  
  - Se definió una **interfaz Builder** con los métodos necesarios para construir el objeto (en este caso, la hamburguesa).  
  - Se creó una clase concreta `HamburguesaBuilder` que implementa los métodos de la interfaz para realizar la construcción.  

#### Evidencia #2
![alt text](image-1.png)  
![alt text](image-2.png)  
![alt text](image-3.png)  

---

### 🔹 Reto 5 – Patrón **Decorator**

#### Evidencia #1
![alt text](image-4.png)

#### Explicación
- **Patrón de Diseño:** Estructural.  
- **Patrón Utilizado:** **Decorator**.  
- **Justificación de Uso:** Este patrón permite **extender las funcionalidades de un objeto en tiempo de ejecución**, sin necesidad de modificar el código base.  
- **Aplicación:**  
  - Se definió una **interfaz base** que contiene los métodos que deben implementar todos los componentes (toppings).  
  - Se creó una **clase decoradora abstracta**, la cual envuelve a un objeto del mismo tipo y delega las operaciones hacia él.  
  - Finalmente, cada **topping concreto** hereda de la clase decoradora, agregando su propia lógica (sumar costo extra y añadir descripción al producto).  

#### Evidencia #2
![alt text](image-5.png)  
![alt text](image-6.png)  
![alt text](image-7.png)  

---

 
