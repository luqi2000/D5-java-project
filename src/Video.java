
public class Video extends PlayerMultimediale implements ILuminosita, IVolume {
	//attributi
	private int volume = 5;
	private int luminosita = 2;
	private int durata;
	
	//costruttore
	public Video(String title, int durata) {
		super(title);
		this.durata = durata;
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
	public int alzaVolume() {
		return volume++;
	}

	@Override
	public int abbassaVolume() {
		return volume--;
	}
	//metodo play simile alla tabella pitagorica fatta a lezione 
	//con aggiunta di un altro ciclo for all'interno per 
	//la stampa di asterisci dopo i punti esclamativi
	@Override
	public void play() {
		for (int i = 0; i < durata; i++) {
			System.out.print(title);
            for (int j = 0; j < volume; j++) {
                System.out.print(" ! ");
            }
            for(int x = 0; x < luminosita; x++) {
            	System.out.print(" * ");
            }
            System.out.println();
        }
		
		
	}

}
