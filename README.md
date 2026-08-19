# CaliPelis
Aqui se califican pelis 

-Analisis-

1. ¿Qué propiedades y métodos tendrá cada clase?

La clase Usuario tendrá como propiedades el nombre, nombre de usuario y edad. También tendrá su constructor para poder ingresar esos datos.

La clase Película tendrá el nombre de la película, su ID, el número de película y la calificación. También contará con sus respectivos constructores.

La clase Calificaciones manejará el arreglo donde se guardarán las calificaciones, la cantidad de calificaciones registradas, el promedio, la calificación más alta y la más baja. Además, tendrá métodos para registrar, consultar y modificar calificaciones, calcular el promedio, encontrar la calificación mayor y menor y saber cuántos espacios quedan disponibles.

2. ¿Qué tipo deben tener las propiedades y métodos de cada clase?

Las propiedades como el nombre, nombre de usuario y nombre de la película serán de tipo String.

La edad, el número de película y las calificaciones serán de tipo int, mientras que el arreglo de calificaciones será de tipo int[].

El promedio será de tipo double y las propiedades que indiquen si se cumple alguna condición serán de tipo boolean. Los métodos tendrán el tipo de retorno que corresponda según lo que hagan.

3. ¿Cuál de las propiedades identificadas debe implementarse utilizando un arreglo? ¿Qué tipo de datos almacenará?

La propiedad calificaciones debe utilizar un arreglo porque cada usuario puede registrar como máximo 10 calificaciones.

El arreglo será de tipo int[] y almacenará las calificaciones de las películas, utilizando valores del 1 al 10.

4. ¿Cuáles deben ser los modificadores de visibilidad de los miembros en cada clase?

Las propiedades serán private para aplicar el encapsulamiento y evitar que otras clases puedan modificarlas directamente.

Los métodos que necesiten ser utilizados desde otras clases serán public, al igual que los constructores, ya que estos se necesitan para poder crear los objetos.

5. ¿Qué parámetros serán requeridos por los métodos en sus clases?

El constructor de Usuario recibirá el nombre, nombre de usuario y edad.

Los constructores de Película recibirán los datos necesarios de cada película.

Para registrar una calificación se necesitará recibir la nueva calificación. Para consultar una calificación se necesitará el número de la película y para modificarla se necesitarán el número de la película y la nueva calificación.

Los métodos que calculen el promedio, busquen la calificación más alta o más baja y consulten los espacios disponibles no necesitarán parámetros.

6. ¿Cómo proveerá de valores iniciales a sus objetos? ¿Qué valores iniciales les asignará?

Los valores iniciales se asignarán mediante los constructores de cada clase.

Cuando se cree un usuario se ingresarán su nombre, nombre de usuario y edad. El arreglo de calificaciones tendrá una capacidad de 10 posiciones y comenzará con cero calificaciones registradas.

Después, las calificaciones se irán agregando conforme el usuario las vaya registrando.

7. ¿Cómo determinará cuál es la siguiente posición disponible dentro del arreglo?

Se utilizará la cantidad de calificaciones registradas para saber cuál es la siguiente posición disponible.

Por ejemplo, si ya hay cuatro calificaciones, la siguiente se guardará en la posición 4 del arreglo. Después de registrarla correctamente, la cantidad de calificaciones aumentará en uno.

También se verificará que todavía haya espacio disponible antes de registrar una nueva calificación.

8. ¿Cómo recorrerá únicamente las posiciones del arreglo que contienen calificaciones registradas?

Se utilizará un ciclo repetitivo que recorra el arreglo solamente hasta la cantidad de calificaciones que ya fueron registradas.

Por ejemplo, si el usuario solamente tiene cuatro calificaciones, el programa recorrerá las primeras cuatro posiciones y no las que todavía están vacías. Esto evita recorrer espacios que aún no contienen información.
