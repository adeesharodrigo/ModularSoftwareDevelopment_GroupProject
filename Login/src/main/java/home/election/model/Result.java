package home.election.model;

public class Result {
    private int divisioncode;
    private String division;
    private int party1results;
    private int party2results;
    private int party3results;
    private int total;
    private int valid;
    private int rejected;

    public void setDivisioncode(int divisioncode){
        this.divisioncode=divisioncode;
    }
    public void setDivision(String division){
        this.division=division;
    }
    public void setParty1results(int party1results){
        this.party1results=party1results;
    }
    public void setParty2results(int party2results){
        this.party2results=party2results;
    }
    public void setParty3results(int party3results){
        this.party3results=party3results;
    }
    public void setTotal(int total){
        this.total=total;
    }
    public void setValid(int valid){
        this.valid=valid;
    }
    public void setRejected(int rejected){
        this.rejected=rejected;
    }

}
