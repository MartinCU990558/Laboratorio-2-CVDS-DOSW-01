# Laboratorio-2-CVDS-DOSW-01



\# Laboratorio 02 - SOLID, Patrones de Diseno y UML



\*\* Integrantes :\*\*

\- DEISY LORENA GUZMAN 

\- NICOLAS ANDRES DUARTE

\- JUAN PABLO NIETO 



\*\* Nombre de la rama :\*\*

`feature/GuzmanDeisy\_NietoJuan\_DuarteNicolas\_2025-2'



\##



Retos Completados

## Reto 5
Patrón de Diseño:
Estructural.

Patrón Utilizado:
Decorator.

Justificación:
El patrón Decorator permite añadir responsabilidades adicionales a un objeto de manera dinámica, sin modificar la clase original. Esto se adapta al caso de la cafetería porque se pueden agregar distintos toppings a un café sin alterar la definición de la clase CaféBase.

Cómo se aplicó:
La clase Cafe define la interfaz base con métodos getDescripcion() y getPrecio().
CafeBase es el producto simple (solo café).
Cada ToppingDecorator envuelve un café y añade descripción + precio.
Con esto, podemos personalizar cualquier café con X toppings, incluyendo toppings nuevos que se definan en tiempo de ejecución.
Finalmente, con streams se calcula el total de varios cafés.

![img.png](img.png)
![img_1.png](img_1.png)

## Reto 6
Patrón de diseño: De comportamiento

Patrón utilizado: Chain of Responsibility

Justificación: Se utiliza este patrón porque permite que una solicitud (ticket) 
sea pasada a través de una cadena de objetos (técnicos) hasta que alguno pueda manejarla.
Así evitamos acoplar el ticket a un técnico específico.

Cómo se aplicó:
Cada técnico implementa la clase abstracta Tecnico, y si no puede resolver el ticket 
lo pasa al siguiente en la cadena. Si ninguno lo resuelve, el ticket queda como pendiente 
de escalamiento. Además, se usan Streams para obtener estadísticas como tickets resueltos 
por nivel, pendientes y promedio de prioridades.

![img_2.png](img_2.png)
![img_3.png](img_3.png)
