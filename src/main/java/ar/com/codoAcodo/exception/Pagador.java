package ar.com.codoAcodo.exception;

public class Pagador {

	public static void pagar(Venta venta) throws TimeOutException, InvalidPaymentMethod, InsufficientFundsException {

		System.out.println("invocando al medio de pago...");
		System.out.println("comunicando con mercadopago....");

		if (venta.getMontoVenta() < 0) {
			throw new InsufficientFundsException("monto inválido: " + venta.getMontoVenta());
		}

		if (venta.getMontoVenta() > 1400) {

			throw new TimeOutException("No se pudo pagar porque se corto internet");
		}

		if ("visa".equals(venta.getMedioDePago().getNombre())) {
			throw new InvalidPaymentMethod("No se puede pagar con visa");
		}

	}

}
