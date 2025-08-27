# 🧪 Laboratorio 02 - SOLID, Patrones de Diseño y UML

**Integrantes:**

- Tulio Riaño Sanchez
- Samuel Leonardo Albarracin

**Nombre de la rama:**
'feature/RianoTulio_SamuelAlbarracin_2025-2'

---

## ✅ Retos Completados

## Reto 1 Culminado:

**Evidencia**

![alt text](image.png)

---

## Reto 2 Culminado:

**Evidencia**

![alt text](image-1.png)

## Explicacion:

- Patrón de Diseño: Para la solución de este ejercicio se uso un patrón creacional

- Patrón Utilizado: Se empleo Builder

- Justificación: El patrón builder permite construir objetos complejos paso a paso, evitando tener constructores telescopicos, es decir, que tengan muchos parámetros.

- Como lo aplico: El patrón builder esta implementando mediante una interfaz (builder) todos los métodos para construir un objeto, una clase hamburguesaBuilder que implementa la interfaz para obtener el objeto esperado en este caso HamburguesaNuevoIngrediente.

**Evidencia**

![alt text](image-5.png)

![alt text](image-6.png)

---

### Reto 3:

---

### Reto 4:

---

### Reto 5 Culminado:

**Evidencia**

![alt text](image-7.png)

### Explicacion:

- Patrón de Diseño: Para la solución del reto se uso un patrón estructural

- Patrón Utilizado: Se empleo el patrón Decorator.

- El patrón decorator te permite añadir funcionalidades a objetos colocandos especies de encapsuladores que contienen estas nuevas funcionalidades.

- Para aplicar este patrón necesitmos generalizar una interfaz que tenga los métodos que vayan a compartir todos los objetos en este caso se llama Topping con los métodos getPrecio() y getNombre(), luego generalizamos un decorator base que va implementar esta interfaz y va a realizar los llamados correspondientes, a partir de esto añadimos los toppings: cafe, leche, chocolate pero heredando del decorator base y solamente sobreescribiendo sus métodos correspondientes.

**Evidencia**

![alt text](image-8.png)

![alt text](image-9.png)

![alt text](image-10.png)

![alt text](image-11.png)

---

### Reto 6

---

### Reto 7

---

### Reto 8
