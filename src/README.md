# Mejora del Algoritmo de Productor-Consumidor usando una Cola Simple

## Descripción del Proyecto

Este proyecto implementa el clásico problema del productor-consumidor utilizando una cola simple para mejorar la eficiencia y la sincronización entre los hilos productores y consumidores.

## Estructura del Proyecto

- `MejoraProductoConsumidor.iml`: Archivo de configuración del módulo del proyecto.
- `src/Consumidor.java`: Implementación de la clase `Consumidor` que consume elementos del buffer.
- `src/Productor.java`: Implementación de la clase `Productor` que produce elementos y los añade al buffer.
- `src/Buffer.java`: Implementación de la cola simple que actúa como buffer compartido entre productores y consumidores.

## Mejoras Implementadas

1. **Uso de una Cola Simple**: Se ha implementado una cola simple para gestionar el buffer compartido, lo que permite una mejor gestión de los elementos producidos y consumidos.
2. **Sincronización Mejorada**: Se han utilizado mecanismos de sincronización para asegurar que los productores y consumidores no accedan al buffer de manera concurrente, evitando condiciones de carrera.
3. **Control de Flujo**: Se ha añadido control de flujo para que los productores esperen si el buffer está lleno y los consumidores esperen si el buffer está vacío.

## Ejecución del Proyecto

Para ejecutar el proyecto, asegúrate de tener configurado un entorno de desarrollo Java. Compila y ejecuta las clases `Productor` y `Consumidor` desde tu IDE o línea de comandos.

## Ejemplo de Uso

```java
public class Main {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(10); // Tamaño del buffer
        Thread productor = new Thread(new Productor(buffer));
        Thread consumidor = new Thread(new Consumidor(buffer));

        productor.start();
        consumidor.start();
    }
}