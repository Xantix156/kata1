# Kata 1 - Familiarización con IntelliJ IDEA y flujo básico de trabajo

## Objetivo

Esta kata consiste en crear un microproyecto Java desde cero utilizando IntelliJ IDEA. El objetivo es practicar el flujo básico de trabajo: crear y ejecutar un proyecto Java, navegar por el código, refactorizar, depurar y utilizar Git y GitHub.

La aplicación crea una persona, consulta sus datos y calcula su edad a partir de su fecha de nacimiento.

## Requisitos

- JDK 26
- IntelliJ IDEA
- Git
- Maven

## Estructura del proyecto
- Person: clase de dominio que representa una persona mediante atributos privados, constructor y métodos de consulta. Incluye el cálculo de la edad a partir de la fecha de nacimiento.
- Main: punto de entrada de la aplicación. Crea una instancia de Person y muestra los resultados por consola.

## Compilación y ejecución

### Desde IntelliJ IDEA

1. Clonar o abrir el proyecto.
2. Comprobar que el JDK configurado es el JDK 26.
3. Abrir Main.java.

### Desde Maven

```bash
mvn clean compile
```

## Verificación realizada

Se ha comprobado que:

- El proyecto compila correctamente.
- La clase Main ejecuta el programa y muestra el resultado por consola.
- La clase Person calcula la edad a partir de la fecha de nacimiento.
- Se ha utilizado el depurador con breakpoints en el constructor y en el método de cálculo.
- Se ha realizado una refactorización para separar responsabilidades en métodos más pequeños.

## Flujo Git y GitHub

El repositorio utiliza una rama principal (master) y una rama de desarrollo (develop).

El flujo seguido ha sido:

1. Crear el repositorio local y el repositorio público en GitHub.
2. Crear la rama develop desde la rama principal.
3. Realizar el trabajo habitual en develop.
4. Crear commits pequeños y descriptivos.
5. Integrar la versión final en la rama principal.
6. Hacer push para sincronizar las ramas con GitHub.

El archivo `.gitignore` evita subir archivos generados por Maven e IntelliJ IDEA, como `target/`, `out/`, archivos `.class` y configuraciones locales del IDE.


La kata se ha repetido para practicar el mismo flujo desde el inicio y reducir la fricción al usar IntelliJ IDEA y Git.

Como evidencia de la repetición se creó una rama adicional desde el commit inicial, denominada develop2 y  'develop3'

## Vídeo explicativo

[Ver vídeo de la Kata 1](PEGA_AQUI_EL_ENLACE_DEL_VIDEO)

