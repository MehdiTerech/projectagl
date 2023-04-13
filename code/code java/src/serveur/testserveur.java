package serveur;

import static org.junit.Assert.*;

import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import client.Client;
import entite.Etudiant;
import entite.Filiere;

public class testserveur {
	private static Client cl;
	ArrayList<Filiere> tf ;
	ArrayList<Etudiant> te ;

	@Before
    public void setUp() {
		cl =new Client("localhost",4000);
		
    }
	@Test
	public void testgetfilier() {
		tf=cl.getFilieres();
		Filiere f = new Filiere(1,"dsi") ;
		assertEquals(f.getCodef(), tf.get(0).getCodef());
		
	}
	@Test
	public void testgeetd() {
		te=cl.getEtudiants(1);
		Etudiant etd = new Etudiant(1,"brahim","elhamdi");
		assertEquals(etd.getCode(), te.get(0).getCode());
		
	} 

}
