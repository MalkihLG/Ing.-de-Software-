Algoritmo AreaFiguras
    Definir opcion Como Entero
    Definir radio, lado, base, altura, area Como Real
	
    Escribir "Men� de Figuras"
    Escribir "1. C�rculo"
    Escribir "2. Cuadrado"
    Escribir "3. Rect�ngulo"
    Escribir "4. Tri�ngulo"
    Escribir "Elige una figura: "
    Leer opcion
	
    Segun opcion Hacer
        1:
            Escribir "Ingresa la medida del radio: "
            Leer radio
            area <- PI * radio * radio
            Escribir "El �rea del c�rculo es: ", area
        2:
            Escribir "Ingresa la medida de un lado: "
            Leer lado
            area <- lado * lado
            Escribir "El �rea del cuadrado es: ", area
        3:
            Escribir "Ingresa la medida de la base: "
            Leer base
            Escribir "Ingresa la medida de la altura: "
            Leer altura
            area <- base * altura
            Escribir "El �rea del rect�ngulo es: ", area
        4:
            Escribir "Ingresa la medida de la base: "
            Leer base
            Escribir "Ingresa la medida de la altura: "
            Leer altura
            area <- (base * altura) / 2
            Escribir "El �rea del tri�ngulo es: ", area
        De Otro Modo:
            Escribir "Opci�n inv�lida, intenta de nuevo"
    FinSegun
FinAlgoritmo
