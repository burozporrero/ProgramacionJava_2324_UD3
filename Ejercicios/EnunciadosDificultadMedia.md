## Tarta
Una pastelería nos ha pedido realizar un programa que haga presupuestos de tartas. 

El programa preguntará primero de qué sabor quiere el usuario la tarta: manzana, fresa o chocolate. 

La tarta de manzana vale 18 euros y la de fresa 16. 

En caso de seleccionar la tarta de chocolate, el programa debe preguntar además si el chocolate es negro o blanco; la primera opción vale 14 euros y la segunda 15. 

Por último, se pregunta si se añade nata y si se personaliza con un nombre; la nata suma 2.50 y la escritura del nombre 2.75.

Ejemplo 1:

    Elija un sabor (manzana, fresa o chocolate): chocolate
    ¿Qué tipo de chocolate quiere? (negro o blanco): negro
    ¿Quiere nata? (si o no): si
    ¿Quiere ponerle un nombre? (si o no): no
    Tarta de chocolate negro: 14,00 €
    Con nata: 2,50 €
    Total: 16,50 €

Ejemplo 2:

    Elija un sabor (manzana, fresa o chocolate): manzana
    ¿Quiere nata? (si o no): no
    Sentencia condicional (if y switch) 52
    ¿Quiere ponerle un nombre? (si o no): si
    Tarta de manzana: 18,00 €
    Con nombre: 2,75 €
    Total: 20,75 €

## Billete tren
Escribe un programa que calcule el precio de un billete de ferrocarril.

- Si es un billete sencillo, el precio es de 0.33€ el kilómetro.
- Si es un billete de ida y vuelta, el precio es de 0.26€ el kilómetro.
- Si el precio es superior a 50€, hay un descuento del 5%
- Si el precio es superior a 110€, hay un descuento del 10%.
- Si el cliente presenta la tarjeta Interrail, hay un descuento del 25%.

Los descuentos no son acumulables, se aplica el mayor.

Mostrar la información por pantalla usando el método printf.

## Maratón
Desarrollar primero un ordinograma y después un programa que muestre si un corredor puede participar en un maratón.

Para poder participar, el corredor ha de ser mayor de edad. Además, tiene que haber participado en alguna maratón anterior y haberla acabado en un tiempo inferior a:

- 190 minutos para menores de 35 años
- 225 minutos para mayores de 35 años

Los mensajes a mostrar son: “Persona seleccionada", "Persona no seleccionada", “No puede participar”, en función de los datos introducidos.
