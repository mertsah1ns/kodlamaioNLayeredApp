package kodlamaioNlayeredApp.entities;

public class Instructor {
    private int id;
    private String name;
    private String corporateMail;
    private String profession;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCorporateMail() {
        return corporateMail;
    }

    public void setCorporateMail(String corporateMail) {
        this.corporateMail = corporateMail;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
