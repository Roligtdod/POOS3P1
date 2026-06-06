```
README.txt
```

```
============================================================
Proyecto Java - Gestión de Personas, Trabajadores y Direcciones
============================================================
```

## `DESCRIPCIÓN` 

```
-----------
```

```
Este proyecto es una aplicación Java organizada en paquetes que modela
entidades relacionadas con personas, trabajadores y direcciones.
```

```
La aplicación principal crea trabajadores, personas y direcciones, asigna
trabajadores a personas, modifica algunos datos mediante métodos setters y
muestra la información por consola.
```

```
ESTRUCTURA DEL PROYECTO
```

```
-----------------------
untitled1
|
|-- src
|   |-- main
|       |-- java
|           |-- APP
|           |   |-- Main.java
|           |
|           |-- MODULE
|           |   |-- Direccion.java
|           |   |-- Persona.java
|           |   |-- Trabajador.java
|           |
|           |-- Util
|               |-- Excepciones.java
|
|-- pom.xml
```

```
PAQUETES PRINCIPALES
```

```
--------------------
```

```
APP
```

```
---
Contiene la clase principal del proyecto.
```

```
Clase:
- Main
Responsabilidad:
- Ejecutar la aplicación.
- Crear objetos de tipo Trabajador, Persona y Direccion.
- Asignar trabajadores a personas.
- Modificar datos básicos mediante setters.
- Mostrar información en consola.
```

```
MODULE
------
Contiene las clases principales del modelo del proyecto.
```

```
Clases:
- Direccion
- Persona
- Trabajador
Direccion:
Representa una dirección con los siguientes datos:
- País
```

```
- Ciudad
- Calle
- Número
```

```
Incluye validación para evitar campos obligatorios vacíos.
```

```
Trabajador:
Representa a un trabajador con los siguientes datos:
- ID
- Nombre
- Apellido
- Email
- Teléfono
- Cargo
```

```
Incluye validaciones para:
- Campos obligatorios vacíos.
- ID menor a 0.
- Teléfono menor a 0.
- Formato de email inválido.
```

```
Persona:
```

```
Clase ubicada dentro del paquete MODULE. Es utilizada en la aplicación
principal para representar personas y asociarlas con trabajadores y
direcciones.
```

```
Util
----
Contiene clases de utilidad del proyecto.
```

```
Clase:
- Excepciones
```

```
Excepciones:
```

```
Clase personalizada que extiende de Exception y permite crear excepciones
con mensajes personalizados.
```

## `FUNCIONALIDADES` 

```
---------------
- Creación de trabajadores.
```

```
- Creación de personas.
- Asignación de trabajadores a personas.
```

```
- Asignación y modificación de direcciones.
```

```
- Modificación de datos mediante setters.
```

```
- Validación de datos obligatorios.
```

```
- Validación de email en trabajadores.
```

```
- Impresión de información en consola.
```

## `VALIDACIONES IMPLEMENTADAS` 

```
--------------------------
En la clase Direccion:
```

```
- El país, ciudad y calle no pueden estar vacíos.
```

```
En la clase Trabajador:
```

```
- Nombre, apellido, email y cargo no pueden estar vacíos.
```

```
- El ID debe ser mayor o igual a 0.
```

```
- El teléfono debe ser mayor o igual a 0.
```

```
- El email debe cumplir con un formato válido.
```

## `EJECUCIÓN` 

```
---------
La clase principal del proyecto es:
```

```
APP.Main
```

```
Para ejecutar el proyecto, se debe iniciar la aplicación desde el método:
```

```
public static void main(String[] args)
```

```
REQUISITOS
```

```
----------
```

```
- Java SDK 26
```

```
- Proyecto Maven, según la presencia del archivo pom.xml
```

## `SALIDA ESPERADA` 

```
---------------
```

```
Al ejecutar la aplicación, se muestra por consola:
```

```
- El trabajador asignado a cada persona.
```

```
- La información de los clientes creados.
```

```
- Los datos modificados mediante setters.
```

## `MANEJO DE ERRORES` 

```
-----------------
```

```
La aplicación utiliza bloques try-catch para capturar excepciones durante
la ejecución y mostrar el mensaje de error correspondiente en consola.
```

## `AUTOR` 

```
-----
```

```
Maximiliano Pino
```

## `ESTADO DEL PROYECTO` 

```
-------------------
```

```
Proyecto Java básico orientado a objetos, enfocado en el uso de clases,
constructores, encapsulamiento, validaciones, asociación entre objetos y
salida de información por consola.
```

