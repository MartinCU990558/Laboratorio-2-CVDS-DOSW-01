# 🧩 Laboratorio 02 - SOLID, Patrones de Diseño y UML

## 👥 Integrantes
- Daniel Patiño Mejia  
- Juan Felipe Rangel  
- Ana Gabriela Fiquitiva  

📌 Rama de trabajo: **feature/PatiñoDaniel_FiquitivaAna_RangelJuan_2025-2**

---

## ✅ Retos Completados

### 🔹 Reto 1
- **Tipo de patrón:**  
- **Patrón:**  
- **Imagen:**  
  ![Caso de prueba]()

---

### 🔹 Reto 2
- **Tipo de patrón:** Creacional  
- **Patrón:** Builder  
- **Justificación:**  
  Elegimos este patrón ya que nos permite construir distintos tipos y representaciones del objeto.  
  En este caso, como todas las hamburguesas no tienen los mismos ingredientes, se implementó una clase **Builder** donde se pueden elegir los ingredientes para construir el objeto hamburguesa.  
- **Imagen:**  
  ![Caso de prueba](docs/imagenes/reto2.png)

---

### 🔹 Reto 3
- **Tipo de patrón:**  
- **Patrón:**  
- **Imagen:**  
  ![Caso de prueba]()

---

### 🔹 Reto 4
- **Tipo de patrón:** Comportamiento  
- **Patrón:** Strategy  
- **Justificación:**  
  La razón por la cual utilizamos **Strategy** fue porque teníamos que implementar una lógica distinta para cada tipo de conversión.  
  Lo que se hizo fue implementar una **interfaz con el método `convertir`**, y se crearon múltiples clases (una por cada divisa) donde se implementa la interfaz acorde al tipo de conversión y sus valores de cambio.  
- **Imagen:**  
  ![Caso de prueba](docs/imagenes/reto4.png)

---

### 🔹 Reto 5
- **Tipo de patrón:**  
- **Patrón:**  
- **Imagen:**  
  ![Caso de prueba]()

---

### 🔹 Reto 6
- **Tipo de patrón:**  
- **Patrón:**  
- **Imagen:**  
  ![Caso de prueba]()

---

### 🔹 Reto 7
- **Tipo de patrón:**  
- **Patrón:**  
- **Imagen:**  
  ![Caso de prueba]()

---

### 🔹 Reto 8
- **Explicación:**  
  En el diseño del diagrama se consolidaron los principios **SOLID**, destacando:  

  - **S (Single Responsibility):** Cada clase, componente y servicio tiene solo una única responsabilidad, evitando acoplamiento y facilitando el mantenimiento.  
  - **O (Open/Closed):** Con enumeraciones y herencias, el código queda abierto a extensión sin modificar lo existente (ej: agregar nuevos hábitats o tipos de comida).  
  - **I (Interface Segregation):** Se separaron las responsabilidades de **cuidadores** y **visitantes** mediante interfaces específicas, ya que ambos pueden alimentar a los animales pero con diferentes funciones.  

  Con respecto al patrón utilizado, el más conveniente fue **Singleton**, ya que asegura que **ECIZoo** tenga una única instancia, accesible globalmente y sin duplicación innecesaria.  

- **Imagen:**  
  ![Caso de prueba](docs/imagenes/reto8.png)
