Algoritmo EntradaCine
		Definir NumPersonas, Dia, PrecioBase, total, parejas, extra Como Entero
		Definir Membresia, Descuento Como Real
		
		Escribir "Ingresa el n�mero de personas: "
		Leer NumPersonas
		Escribir "Ingresa el d�a de la semana (1=Lunes,2=Martes,3=Miercoles,4=Jueves,5=Viernes,6=Sabado,7=Domingo): "
		Leer Dia
		Escribir "�Cuenta con nuestra membres�a? (1=S�, 0=No): "
		Leer  Membresia
		
		descuento <- 0
		Si Membresia = 1 Entonces
			Descuento <- 0.10
		FinSi
		
		Segun Dia Hacer
			Caso 3:   // Mi�rcoles
				PrecioBase <- 30
				total <- NumPersonas * PrecioBase
			Caso 4:   // Jueves
				parejas <- NumPersonas / 2
				extra <- NumPersonas MOD 2
				total <- parejas * 75 + extra * 50
			De Otro Modo: // Otros d�as
				PrecioBase <- 50
				total <- NumPersonas * PrecioBase
		FinSegun
		
		// Aplicar descuento si hay membres�a
		total <- total - (total * descuento)
		
		Escribir "El precio total a pagar es $",total," pesos"

		
FinAlgoritmo
