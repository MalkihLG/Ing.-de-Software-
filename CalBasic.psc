Algoritmo CalBasic
    Definir num1, num2 Como Entero
    Definir op Como Caracter
	
    Escribir "Ingresa el primer n�mero: "
    Leer num1
	
    Escribir "Ingresa el segundo n�mero: "
    Leer num2
	
    Escribir "Ingresa la operaci�n (+, -, *, /): "
    Leer op
	
    Segun op Hacer
        "+":
            Escribir "Resultado: ", num1 + num2
        "-":
            Escribir "Resultado: ", num1 - num2
        "*":
            Escribir "Resultado: ", num1 * num2
        "/":
            Si num2 <> 0 Entonces
                Escribir "Resultado: ", num1 / num2
            SiNo
                Escribir "Error: no se puede realizar la divisi�n por cero"
            FinSi
        De Otro Modo:
            Escribir "Operador inv�lido, intenta con otro diferente"
    FinSegun
FinAlgoritmo