public class Carro  extends Veiculo{
	
	private boolean  quatroPortas;

	public boolean isQuatroPortas() {
		
		return quatroPortas;
	}
	
	public void setquatroPortas(boolean quatroPortas) {
		this.quatroPortas=quatroPortas;
		
	}

	@Override
	public void ImprimirDados() {
		// TODO Auto-generated method stub
		super.ImprimirDados();
		System.out.println("Quatro Portas: "+quatroPortas);
	}

	
}
