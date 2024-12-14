public class Cajera {

	private String nombre;

	public Cajera(String nombre){
		this.nombre=nombre;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void procesarCompra(Cliente cliente, long tiempo){

		System.out.println("La cajera "+this.nombre+" comienza a procesar la compra del cliente "+
				cliente.getNombre()+" en el tiempo: "+ (System.currentTimeMillis()-tiempo)/1000+ " seg.");

		for (int i = 0; i < cliente.getCarroCompra().length; i++) {

			this.esperarXsegundos(cliente.getCarroCompra()[i]);
			System.out.println("Procesando el producto "+(i+1)+". Tiempo: " +
					(System.currentTimeMillis()-tiempo)/1000+ " seg.");
		}
		System.out.println("La cajera "+this.nombre+" ha terminado de procesar la compra del cliente "+
				cliente.getNombre()+" en el tiempo: "+ (System.currentTimeMillis()-tiempo)/1000+ " seg.");

			if(cliente.getNombre().equals("Jaime")){
				System.out.println("La cajera se ha enamorado del cliente y la han despedido");
			}
		}
	
		private void esperarXsegundos(int segundos) {
			try {
				Thread.sleep(segundos * 1000);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}

	public void asignarCliente(Cliente cliente1, long initialTime) {
	}
}
