# Gestor de Tareas en Consola (Java Básico)

Este es un pequeño proyecto en **Java** que permite gestionar una lista de tareas desde la consola.  
Con este programa puedes **agregar**, **mostrar**, y **eliminar** tareas, además de salir del sistema con confirmación.

---

## Funcionalidades

1. **Agregar tarea**  
   Permite añadir nuevas tareas, evitando duplicados gracias a una verificación interna.

2. **Mostrar tareas**  
   Lista todas las tareas registradas en el orden en que fueron ingresadas.

3. **Eliminar tarea**  
   Elimina una tarea específica ingresando su número en la lista.

4. **Salir con confirmación**  
   Pide una confirmación antes de cerrar el programa.

---

## Conceptos de Java practicados

En este proyecto se han trabajado los siguientes conceptos:

- **Colecciones (`List` y `Set`)**
  - Uso de `ArrayList` para mantener el orden de inserción.
  - Uso de `HashSet` para evitar elementos duplicados.
  
- **Control de flujo**
  - Estructuras `while` y `for`.
  - Estructura `switch-case` para manejar menús.
  - Uso de `continue` y `break` para controlar la ejecución.

- **Entrada de datos**
  - Clase `Scanner` para capturar entradas del usuario.
  - Manejo de `nextLine()` y `nextInt()` para evitar errores en la lectura.

- **Manejo de errores**
  - Uso de `try-catch` para capturar `InputMismatchException`.
  - Limpieza del buffer con `scan.nextLine()` para prevenir saltos de lectura.

- **Validaciones**
  - Comprobación de listas vacías.
  - Prevención de índices fuera de rango.
  - Confirmaciones antes de ejecutar acciones críticas.

