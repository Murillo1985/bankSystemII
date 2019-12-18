package agencyProperties;

public class Client {
    private String name;
    private String nif;
    private String profession;
    
    public Client(String name, String nif, String profession) {
		super();
		this.name = name;
		this.nif = nif;
		this.profession = profession;
	}
	

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNif() {
        return nif;
    }
    public void setNif(String nif) {
        this.nif = nif;
    }
    public String getProfession() {
        return profession;
    }
    public void setProfession(String profession) {
        this.profession = profession;
    }


}
