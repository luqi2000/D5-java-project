
public class Audio extends PlayerMultimediale implements IVolume{
	//attributi
	private int volume = 5;
	private int durata;
	
	//costruttore
	public Audio(String title, int durata) {
		super(title);
		this.durata = durata;
	}
	//override dei metodi
	@Override
	public int alzaVolume() {
		return volume++;
	}
	
	@Override
	public int abbassaVolume() {
		return volume--;
	}
	//metodo uguale alla tabella pitagorica. Esegue tutto il loop interno finche non diventa j<=volume,
	//poi esgue 1 volta sola il loop esterno per poi ri-eseguire da capo il loop interno finche 
	//non diventa j<=volume per poi tornare sul loop esterno solo eseguendolo solo una volta e cosi via
	@Override
	public void play() {
		for (int i = 0; i < durata; i++) {
			System.out.print(title);
            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }
            System.out.println();
        }
		
	}

	
}
