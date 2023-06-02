public class Pepperoni extends Pizza implements Opis{
    public Pepperoni(){
        nazwa = "Pepperoni";
        skladniki = "salami,papryka,sos,ser";
        ostrosc = 2;
        CenM = 30;
        CenS = 35;
        CenD = 40;
    }
    private String getPrince(){
        return "mała - 30zł, średnia - 35zł, duża - 40zł";
    }
    @Override
    public String getOpis() {
        return "Nazwa pizzy : " + nazwa + " Składniki: " + skladniki + " Ostrość: " + ostrosc + " Cena:" + getPrince();
    }

}
