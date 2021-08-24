# Introduction
Construccion de pruebas automatizadas con el Patrón Screenplay de Serenity, Cucumber, Junit,
Java y Gradle para probar una REST

Para esta automatización se utilizan los siguientes servicios expuestos:

- URL  https://demoqa.com
### Pruebas construidas

#### REST ####

- AutorizedRunner
- DeleteRunner

## Antes de descargar el repositorio

- Java JDK 1.8
- Gradle 3.2.0 o superior
- GIT

## Patrones de diseño utilizados

- ### [Patron Serenity Screenplay](http://serenity-bdd.info/docs/articles/screenplay-tutorial.html)



## Compilacion

Ya descargado el proyecto, importarlo en el IDE de preferencia.

Es importante compilar el proyecto para esto, ejecutar alguno de los siguientes comandos.
Ejecutar por consola

```
gradle clean build -x test
gradle compileJava
```

## Ejecución

**Ejecución Todos los test**

Para ejecutar todos los test del proyecto y generar el reporte puede usar.

```
gradle clean test aggregate
```

**NOTA:** El reporte generado de las pruebas se genera en la ruta `/target/site/serenity/index.html`

