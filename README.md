# ED - Practica 4 - Refactorizaciones
## Trabajo hecho por Matias Alejandro Gomez Jatab & Joan Llompart

Para empezar hemos creado un neuvo repositorio a partir de la version 1.1.0 del reposotorio https://github.com/JuanLlado/Practica4.

A partir de la rama principal creamos una rama secundaria llamada Develop la cual utilizaremos para hacer las refactorizaciones y entramos en ella.
```bash
$ git branch Develop
$ git checkout Develop
```
Con la rama ya creada podemos proceder ha realizar las refactorizaciones. Para ello simplemente modificaremos el código y subiremos al repo. Los primeros dos cambios han sido agregar los constructores por defecto de la clase Niño y Adulto, por separado.

El proceso ha sido el siguiente.
1. Hacer los cambios (agregar el constructor).
2. Hacer commit de este cambio.
```bash
$ git add ./src/EDPractica4/Niño.java
$ git commit -m "feat(Niño): Añadir constructor por defecto"
```
3. Crear una nueva tag.
```bash
$ git tag v1.2.0
```
4. Subir los cambios y las tags.
```bash
$ git push
$ git push --tags
```
> El proceso ha sigo el mismo con los siguientes cambios, aumentando el numero de la version en cada commit.

Hecho los dos primeros cambios actualizaremos la rama master. Para ello nos iremos a ella y desde allí fusionaremos las ramas.
```bash
$ git checkout master
$ git merge Develop
```
Esto traerá los ultimos cambios que hemos hecho en la rama Develop a la rama master.

Para los siguientes dos cambios hemos hecho exactamente lo mismo, sin olvidarnos de actualizar las tags.
