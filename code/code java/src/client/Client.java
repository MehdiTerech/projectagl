package client;
import entite.*;
import java.io.IOException;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
*
*
* @author Client
*/
public class Client {
private Socket s;
private ObjectInputStream in;
private PrintWriter out;
/**
 * instancier les flux d'e/s
 * @param IP
 * @param port
 */
    public Client(String IP,int port) {
    try {
        s=new Socket(IP,port);
        in=new ObjectInputStream(s.getInputStream());
        out=new PrintWriter(s.getOutputStream(),true);
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null,ex.getMessage());
    }
                
    }
/**
 * retourn toutes les etudiants 
 * @return ArrayList<Etudiant>
 */
public ArrayList<Etudiant> getAllEtds()
{
	ArrayList<Etudiant> list =  new ArrayList();
    try {
        out.println(0);
        list  = (ArrayList<Etudiant>)in.readObject() ;
        return list ;
    } catch (Exception e) {
        return list ;
    }
}
/**
 * returne touts
 *  les filiers 
 * @return ArrayList<Filiere>
 */
public ArrayList<Filiere> getFilieres()
{
	ArrayList<Filiere> list = new ArrayList() ;
    try {
        out.println(-1);
        list = (ArrayList<Filiere>)in.readObject() ;
        return list;
    } catch (Exception e) {
        return list ;
    }
}
/***
 * 
 * @param cf
 * @return ArrayList<Etudiant>
 */
public ArrayList<Etudiant> getEtudiants(int cf)
{
	ArrayList<Etudiant> list = new ArrayList();
    try {
        out.println(cf);
        list = (ArrayList<Etudiant>)in.readObject() ;
        return list ;
    } catch (Exception e) {
        return list ;
    }
}
  
}
