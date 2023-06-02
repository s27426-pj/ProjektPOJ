public class Capriciosa extends Pizza implements Opis{
    public Capriciosa(){
        nazwa = "Capriciosa";
        skladniki = "pieczarki,szynka,sos,ser";
        ostrosc = 1;
        CenM = 28;
        CenS = 33;
        CenD = 38;
    }
    private String getPrince() {
        return  "mała - 28zł, średnia - 33zł, duża - 38zł";
    }
    @Override
    public String getOpis() {
        return "Nazwa pizzy : " + nazwa + " Składniki: " + skladniki + " Ostrość: " + ostrosc + " Cena:" + getPrince();
    }
}
