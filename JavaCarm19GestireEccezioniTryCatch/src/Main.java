public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 0;

		/*
		 * Gestisco l'eccezzione con un blocco try-catch 
		 * 
		 * Blocco TRY
		 * Nel blocco try vanno le righe che possono generare un errore
		 * 
		 * Blocco CATCH
		 * è polimorfico
		 * Se ci metto Exception invece di ArithmeticException, questo cattura tutt e le eccezioni, ma sarebbe troppo generico
		 * Se metto ArithmeticException catturo solo quel tipo di eccezioni
		 * 
		 * Posso scrivere piu blocchi catch a seconda di quante eccezioni voglio gestire
		 */
		try {
			System.out.println("Il rapporto tra a e b è: " + (a / b));
		}  catch (ArithmeticException ex){
			System.out.println("Hai diviso per zero");      //se il primo catch non è verificato passo al secondo, l'esecuzione è sequenziale
		}  catch (Exception ex) {
			//System.out.println("Hai provato a dividere per zero....non si fa");			
			
			ex.printStackTrace();    //<-- scrivendo questo stampo a video le eccezioni
			                         //Attenzione, il programma non è terminato in modo anomalo perchè ho gestito l'eccezione
		} 
		
		
		
		finally{
			System.out.println("Programma terminato");
		}

	}       //Posso aggiungere un blocco finally.   Questo contiene linee di codice che andranno in esecuzione sia 
	        //con sia senza eccezione

}
