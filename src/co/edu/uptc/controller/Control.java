package co.edu.uptc.controller;

import co.edu.uptc.model.Invoice;
import co.edu.uptc.model.OrderManager;
import co.edu.uptc.view.IoManager;

public class Control {
	private final IoManager ioManager; 
	private final OrderManager orderManager;
	private int digitedSize;
	private int pairsToBuy;
	private boolean avaiableSize;
	private int digitedOption;

	public Control() {
		ioManager = new IoManager();
		orderManager = new OrderManager();
	}


	public void init() {
		runMenu();
	}

	public void runMenu() {
		boolean exit = false;
		digitedOption = 0;

		while(!exit){
			try {
				ioManager.printMessage("Bienvenido a la Cadena de Zapatos");
				digitedOption = ioManager.readInt("Estas son Las marcas que manejamos\nEscoge la Opcion que desees\n1.Verlon(Zapatos escolares para niños\n2.Velez(Zapatos formales para niños)\n3.Bossi(Zapatos casuales para adulto)\n4.Salir");

				switch(digitedOption){
				case 1:
					runVerlonBrandLogic();
					break;
				case 2:
                    runVelezBrandLogic();
					break;
				case 3:
                    runBossiBrandLogic();
					break;
				case 4:
					exit = true;
					break;

				default:
					ioManager.printMessage("La opcion Ingresada no esta dentro del rango");
					break;

				}

			}catch(NumberFormatException e){
				ioManager.printMessage("El campo digitado no puede estar vacio,y debe ser un numero");
			}
		}


	}

	public void runVerlonBrandLogic() {
		boolean exit = false;

		while(!exit){
			try {
				digitedOption = ioManager.readInt("Bienvenido a Verlon\nDigita la Opcion que desees\n1.Comprar Zapatos\n2.Volver al menu principal");

				switch(digitedOption){
				case 1:
					digitedSize = ioManager.readInt("Ingresa la talla que deseas para tus zapatos\nLas tallas que ofrecemos van desde la 19 a la 30");
					pairsToBuy = ioManager.readInt("Ingresa la cantidad de pares que deseas comprar");
					avaiableSize = orderManager.evaluateVerlonSize(digitedSize);

					if(avaiableSize){
						Invoice createdOrder = orderManager.createInvoice(pairsToBuy, "Verlon");
						ioManager.printMessage(createdOrder.toString());
					}

					else {
						ioManager.printMessage("Lo sentimos,la talla no esta dentro de los rangos permitidos");
					}

					break;
				case 2:
					exit = true;
					break;
				}

			}catch(NumberFormatException e) {
				ioManager.printMessage("El campo digitado no puede estar vacio,y debe ser un numero");
			}





		}


	}

	public void runVelezBrandLogic(){
		boolean exit = false;

		while(!exit){
			try {
				digitedOption = ioManager.readInt("Bienvenido a Velez\nDigita la Opcion que desees\n1.Comprar Zapatos\n2.Volver al menu principal");

				switch(digitedOption){
				case 1:
					digitedSize = ioManager.readInt("Ingresa la talla que deseas para tus zapatos\nLas tallas que ofrecemos van desde la 35 a 43");
					pairsToBuy = ioManager.readInt("Ingresa la cantidad de pares que deseas comprar");
					avaiableSize = orderManager.evaluateVelezSize(digitedSize);

					if(avaiableSize){
						Invoice createdOrder = orderManager.createInvoice(pairsToBuy, "Verlon");
						ioManager.printMessage(createdOrder.toString());
					}

					else {
						ioManager.printMessage("Lo sentimos,la talla no esta dentro de los rangos permitidos");
					}

					break;
				case 2:
					exit = true;
					break;
				}

			}catch(NumberFormatException e) {
				ioManager.printMessage("El campo digitado no puede estar vacio,y debe ser un numero");
			}
		}
	}

	public void runBossiBrandLogic() {
		boolean exit = false;

		while(!exit){
			try {
				digitedOption = ioManager.readInt("Bienvenido a Bossi\nDigita la Opcion que desees\n1.Comprar Zapatos\n2.Volver al menu principal");

				switch(digitedOption){
				case 1:
					digitedSize = ioManager.readInt("Ingresa la talla que deseas para tus zapatos\nLas tallas que ofrecemos van desde la 31 a1 la 38");
					pairsToBuy = ioManager.readInt("Ingresa la cantidad de pares que deseas comprar");
					avaiableSize = orderManager.evaluateBossiSize(digitedSize);

					if(avaiableSize){
						Invoice createdOrder = orderManager.createInvoice(pairsToBuy, "Verlon");
						ioManager.printMessage(createdOrder.toString());
					}

					else {
						ioManager.printMessage("Lo sentimos,la talla no esta dentro de los rangos permitidos");
					}

					break;
				case 2:
					exit = true;
					break;
				}

			}catch(NumberFormatException e) {
				ioManager.printMessage("El campo digitado no puede estar vacio,y debe ser un numero");
			}
		}

	}
	
	
}
