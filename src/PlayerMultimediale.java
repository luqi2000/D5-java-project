
public abstract class PlayerMultimediale {
	//attributi
	protected String title;
	
	//costruttore
	public PlayerMultimediale(String title) {
		this.title = title;
	}
	//metodo astratto per fare in modo che tutti i suoi figli lo debbano scrivere
	public abstract void play();
}
