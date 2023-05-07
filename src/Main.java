import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Scanner per dare all'utente la scelta
		Scanner in = new Scanner(System.in);
		//1
		System.out.println("Inserisci titolo e durata");
		Audio uno = new Audio(in.nextLine(), in.nextInt());
		//uno.play();
		in.nextLine(); // senza questo il programma da errori 
		//2
		System.out.println("Inserisci titolo e durata");
		Video due = new Video(in.nextLine(), in.nextInt());
		//due.play();
		in.nextLine();
		//3
		System.out.println("Inserisci titolo e luminosita");
		Immagine tre = new Immagine(in.nextLine(), in.nextInt());
		//tre.show();
		in.nextLine();
		//4
		System.out.println("Inserisci titolo e durata");
		Audio quattro = new Audio(in.nextLine(), in.nextInt());
		//quattro.play();
		in.nextLine();
		//5
		System.out.println("Inserisci titolo e durata");
		Audio cinque = new Audio(in.nextLine(), in.nextInt());
		//cinque.play();
		in.nextLine();
		
		Object [] arr = {uno, due, tre, quattro, cinque};//array di oggetti
		int selezione = 0;
		//do-while
		do {
			System.out.println("Inserisci un numero da 1 a 5 per visualizzare il PlayerMultimediale preimpostato precedentemente");
			selezione = in.nextInt();
			if (selezione >= 1 && selezione <= 5){
				
				switch(selezione) {
				case 1:
					//cast
					((Audio) arr[0]).play();
					break;
					
				case 2:
					((Video) arr[1]).play();
					break;
				
				case 3:
					((Immagine) arr[2]).show();
					break;
					
				case 4:
					((Audio) arr[3]).play();
					break;
					
				case 5: 
					((Audio) arr[4]).play();
					break;
				
				case 0:
					System.out.println("Fine");
					break;
					
				default:
					System.out.println("Hai inserito un numero non valido");
			};
				
			}else if (selezione != 0) {
                System.out.println("Selezione non valida, inserisci un numero da 1 a 5 oppure 0 per uscire.");
            }
			
		}while (selezione != 0);
        System.out.println("Arrivederci");
		in.close();
	}
}
