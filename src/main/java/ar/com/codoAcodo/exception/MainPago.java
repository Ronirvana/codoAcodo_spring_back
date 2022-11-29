package ar.com.codoAcodo.exception;

import java.util.Date;

public class MainPago {

	public static void main(String[] args) {

		String nombre = "carlos";

		// datos de la orden
		String producto = "termo lumilagro";

		MedioDePago medioDePago = new MedioDePago("mercadopago");
		Venta venta = new Venta(nombre, medioDePago, new Date(), -1d);

		int reintentar = 3;
		boolean success = false;

		do {
			try {
				Pagador.pagar(venta);
				success = true;

			} catch (TimeOutException te) {
				System.err.println(te.getMessage());
				te.printStackTrace();

				reintentar--;
			} /*
				 * catch (InvalidPaymentMethod ipm) { System.err.println(ipm.getMessage());
				 * ipm.printStackTrace(); break;
				 * 
				 * } catch (InsufficientFundsException ife) {
				 * System.err.println(ife.getMessage()); ife.printStackTrace(); break; }
				 */
			catch (InvalidPaymentMethod | InsufficientFundsException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
				break;

			} finally {
				System.out.println("Esto se ejecuta siempre");
			}

		} while (reintentar > 0 && !success);

		if (success) {
			System.out.println("pago exitoso");
		} else {
			System.err.println("pago fallido");
		}

	}

}
