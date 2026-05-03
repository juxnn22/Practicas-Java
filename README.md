# JavaApplication2

Proyecto Java clásico orientado a la gestión de instrumentos, clases e instructores musicales. Usa Ant y NetBeans.

## Requisitos

- Java **21** o superior.
- **Ant** (con NetBeans opcional para desarrollo IDE).
- Sin dependencias externas por defecto.

## Estructura del proyecto

- `/src` — Código fuente principal.
- `/test` — Pruebas unitarias (vacío por defecto, requerido por Ant para tests).
- `/nbproject` — Configuración NetBeans/Ant (**no borrar**).
- `/build` — Binarios y temporales.
- `/dist` — Artefactos finales (`.jar`).

## Comandos básicos

```sh
ant clean build   # Compila y limpia el proyecto
ant run           # Ejecuta la aplicación principal
ant test          # Corre pruebas unitarias
```

- Clase principal: `javaapplication2.JavaApplication2`

## Notas sobre pruebas

- Las pruebas deben colocarse en `/test`.
- Si `/test` está vacío, Ant muestra "no tests", pero no es un error.

## Detalles relevantes

- Sigue la convención estándar NetBeans/Ant (ver `nbproject/project.properties`).
- El diagrama UML de clases principales se encuentra en `MúsicaUML.png`.
- Personaliza el build editando sólo `build.xml` (no el autogenerado `build-impl.xml`).
- Para dependencias externas, modifica `javac.classpath` y documenta aquí.

## Licencia

_Agrega aquí la información de licencia si corresponde._
