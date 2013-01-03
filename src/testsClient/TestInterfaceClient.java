package testsClient;

import java.util.LinkedList;

import main.Arret;
import main.Ligne;
import main.csv;
import Client.InterfaceClient;

public class TestInterfaceClient {
	public static void main(String[] args) {
		LinkedList<Arret> mesArrets = csv.csvCreerArrets("./files/stations.csv");
		InterfaceClient client =  new InterfaceClient();
		client.chargerArrets(mesArrets);
		
		
	}
	
}
