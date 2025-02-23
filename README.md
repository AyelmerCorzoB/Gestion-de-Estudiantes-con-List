# Gestion-de-Estudiantes-con-List🎓📚

Este programa en Java permite gestionar una lista de estudiantes, almacenando sus nombres en una `LinkedList`. El usuario puede agregar estudiantes, ordenarlos alfabéticamente y buscar un estudiante específico por su nombre.

## Características principales ✨

- **Agregar estudiantes**: Permite al usuario ingresar nombres de estudiantes (máximo 30).
- **Ordenar estudiantes**: Ordena la lista de estudiantes alfabéticamente (de A a Z).
- **Buscar estudiante**: Permite buscar un estudiante específico por su nombre.
- **Uso de LinkedList**: Almacena los estudiantes en una `LinkedList`, lo que facilita la manipulación de la lista.
- **Validación de entradas**: Asegura que las entradas del usuario sean válidas.

## ¿Cómo funciona? ⚙️

1. El programa solicita al usuario que ingrese la cantidad de estudiantes (máximo 30).
2. Para cada estudiante, se pide su nombre.
3. Los nombres se almacenan en una `LinkedList<Estudiante>`.
4. La lista de estudiantes se ordena alfabéticamente utilizando `Comparator`.
5. El usuario puede buscar un estudiante específico por su nombre.
6. El programa muestra si el estudiante está o no en la lista.

## Ejemplo de uso 🖥️

### Agregar estudiantes:
````bash
Ingresa la cantidad de estudiantes que deseas registrar (Max 30): 3
La cantidad de estudiantes es: 3

Ingresa el nombre del estudiante 1: Juan
Ingresa el nombre del estudiante 2: María
Ingresa el nombre del estudiante 3: Pedro
````

### Mostrar lista ordenada:
````bash
Lista de estudiantes ordenados de (A-Z):
Juan
María
Pedro

````
### Buscar estudiante:
````bash
Ingresa el nombre del estudiante que deseas buscar: María
El estudiante María está en la lista.
````

## Requisitos 📋

- **Java JDK**: Asegúrate de tener Java JDK instalado (versión 8 o superior).
- **IDE o editor de texto**: Puedes usar IntelliJ, Eclipse, VS Code o cualquier editor de tu preferencia.

## ¿Cómo ejecutar el programa? 🚀

1. Clona este repositorio o copia el código en tu entorno de desarrollo.
2. Compila y ejecuta el archivo `Main.java`.
3. Sigue las instrucciones en la consola para gestionar la lista de estudiantes.

## Estructura del proyecto 🗂️

- **Main.java**: Contiene la lógica principal del programa, incluyendo la interacción con el usuario.
- **Estudiante.java**: Representa la clase `Estudiante` con el atributo `nombre`.
- **Funciones.java**: Contiene las funciones para mostrar la lista de estudiantes y buscar un estudiante.

## Contribuciones 🤝

Si encuentras algún error o tienes alguna mejora, ¡no dudes en abrir un issue o enviar un pull request! Todas las contribuciones son bienvenidas.

---

## 🧑‍💻 **Autor**
* [AyelmerCorzoB](https://github.com/AyelmerCorzoB)

---