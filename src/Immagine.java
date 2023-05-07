
public class Immagine extends PlayerMultimediale implements ILuminosita{
	//attributi
	private int luminosita;//private luminosita in questo caso in modo tale da arrivarci solo con il metodo show
	
	//costruttore
	public Immagine(String title, int luminosita) {
		super(title);
		this.luminosita = luminosita;
	}
	//metodi
	public void show() {
		System.out.print(title);
		for(int i=0; i<luminosita; i++) {
				System.out.print(" * ");
		}
		System.out.println();
	}
	
	@Override
	public int aumentaLuminosita() {
		return luminosita++;
	}

	@Override
	public int diminuisciLuminosita() {
		return luminosita--;
	}

	@Override
	public void play() {
	}

}
