public class Employer {
    private String fullName;
    private String posada;
    private String email;
    private String phoneNumber;
    private String years;

    public Employer(String fullName,String posada, String email, String phoneNumber, String years){
        this.fullName = fullName;
        this.posada = posada;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.years = years;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setPosada(String posada) {
        this.posada = posada;
    }

    public String getPosada() {
        return posada;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setYears(String years) {
        this.years = years;
    }

    public String getYears() {
        return years;
    }
}
