# Ejercicio 6 - Cálculos de Progreso y Porcentajes (Libro)

## Explicación del programa

En este ejercicio se creó una clase llamada `Libro` que gestiona los siguientes atributos:
* `titulo`, de tipo `String`.
* `autor`, de tipo `String`.
* `paginasTotales`, de tipo `int`.
* `paginaActual`, de tipo `int`.

Se definió un constructor parametrizado que recibe el título, el autor y las páginas totales, asignándolos mediante la referencia `this`, y estableciendo automáticamente el atributo `paginaActual` en `0` al momento de instanciar el objeto.

Además, la clase cuenta con dos métodos de instancia principales:
* `leer(int paginas)`: Incrementa el valor de `paginaActual` sumándole las páginas leídas. Incluye una estructura condicional `if` que valida si la suma excede o iguala a `paginasTotales`; en caso afirmativo, ajusta la `paginaActual` al límite total e imprime un mensaje por pantalla notificando que la lectura ha finalizado.
* `mostrarProgreso()`: Calcula el porcentaje de lectura realizado aplicando una conversión explícita (*casting*) a `double` sobre `paginaActual` para evitar los problemas de la división entera en Java, y muestra de forma estructurada los datos del libro, las páginas leídas y el porcentaje completado.

Luego, dentro del método `main`, se creó un objeto de la clase `Libro` utilizando el constructor:
`Libro milibro = new Libro("El Mentalista", "Lucas", 500);`

Finalmente, se invocó el método `milibro.leer(200);` para simular el avance en la lectura y posteriormente se ejecutó `milibro.mostrarProgreso()` para visualizar los resultados por consola.

## Lógica utilizada

La lógica del programa consiste en:
* Declarar la clase `Libro` y sus atributos correspondientes.
* Implementar el constructor para inicializar los datos básicos y fijar la página inicial en cero.
* Crear el método `leer()` para actualizar el estado del progreso y aplicar una validación de límite superior para que la página actual nunca supere el total de páginas del libro.
* Programar el cálculo matemático del porcentaje en `mostrarProgreso()` mediante *casting* explícito a `double` (`(double) this.paginaActual / this.paginasTotales * 100`) para obtener decimales precisos.
* Estructurar la salida por pantalla utilizando múltiples llamadas a `System.out.println()`.
* Instanciar el objeto y probar las interacciones desde el método `main`.

De esta manera se demuestra cómo manipular múltiples atributos interrelacionados y calcular datos derivados con precisión numérica en la programación orientada a objetos.

## Resultado de la ejecución

La ejecución del programa muestra en la consola la siguiente información:
* --- PROGRESO DE LECTURA ---
* Título: El Mentalista
* Autor: Lucas
* Páginas leídas: 200 de 500
* Porcentaje completado: 40.0%

## Captura de pantalla

<img width="1256" height="237" alt="image" src="https://github.com/user-attachments/assets/f8846722-7880-4d3e-b60a-b7938a03f871" />
