package entite;
import java.io.Serializable;
public class Filiere implements Serializable{
  private int codef;
  private String nomf;

    public Filiere(int codef, String nomf) {
        this.codef = codef;
        this.nomf = nomf;
    }

    public int getCodef() {
        return codef;
    }

    public String getNomf() {
        return nomf;
    }
    @Override 
    public boolean equals(Object o) {
    	Filiere f = (Filiere) o ;
    	if(f.getCodef()== this.codef)
        return true;
    	return false ;
    }

	public void setCodef(int codef) {
		this.codef = codef;
	}

	public void setNomf(String nomf) {
		this.nomf = nomf;
	} 
}
