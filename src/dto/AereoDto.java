package dto;

public class AereoDto {

    private int compID;
    private String targa;

    public AereoDto(int compID, String targa) {
        this.compID = compID;
        this.targa = targa;
    }
    public AereoDto(){
    }

    public int getCompID() {
        return compID;
    }

    public void setCompID(int compID) {
        this.compID = compID;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }
}
