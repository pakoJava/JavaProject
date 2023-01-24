package dto;

public class CompagniaDto {

    private int compID;
    private String compName;

    public CompagniaDto(int compID, String compName) {
        this.compID = compID;
        this.compName = compName;
    }
    public CompagniaDto(){
    }


    public int getCompID() {
        return compID;
    }

    public void setCompID(int compID) {
        this.compID = compID;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }
}
