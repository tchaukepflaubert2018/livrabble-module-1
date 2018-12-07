
class Personne {
	//attributs
	private String nom;
	private String prenom;
	private int datedenaissance;
	private String lieudenaissance;
	private String profession;
	private String sexe;
	private String statusmatrimoniale;
	// constructeurs
	public Personne(){
		super();
	}
	public Personne(String n, String p, int d, String ln, String pr, String s,  String sm){
		this.nom = n;
		this.prenom = p;
		this.datedenaissance = d;
		this.lieudenaissance = ln;
		this.profession = pr;
		this.sexe = s;
		this.statusmatrimoniale = sm;
	}
	//	getteurs/ setteurs
	public String getNom(){
		return nom;
	}
	public void setNom(String n){
			this.nom = n;
	}
	public String getPrenom(){
		return prenom;
	}
	public void setPrenom(String p){
		this.prenom = p;
	}
	public int getDateDeNaissance(){
		return datedenaissance;
	}
	public void setDateDeNaissance(int d){
		this.datedenaissance = d;
	}
	public String getLieuDeNaissance(){
		return lieudenaissance;
	}
	public void setLieuDeNaissance(String ln){
		this.lieudenaissance = ln;
	}
	public String getProfession(){
		return profession;
	}
	public void setProfession(String pr){
		this.profession = pr;
	}
	public String getSexe(){
		return sexe;
	}
	public void setSexe(String s){
		this.sexe = s;
	}
	public String getStatusMatrimoniale(){
		return statusmatrimoniale;
	}
	public void setStatusMatrimoniale(String sm){
		this.statusmatrimoniale = sm;
	}
}
