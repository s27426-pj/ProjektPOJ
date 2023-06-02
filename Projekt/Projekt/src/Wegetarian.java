public class Wegetarian extends Pizza implements Opis{
    public Wegetarian(){
        nazwa = "Wegetariańska";
        skladniki = "szpinak,pomidor,sos,ser";
        ostrosc = 0;
        CenM = 25;
        CenS = 30;
        CenD = 35;
    }
    private String getPrince(){
        return " mała - 25zł, średnia - 30zł, duża - 35zł ";
    }

    @Override
    public String getOpis() {
        return "Nazwa pizzy : " + nazwa + " Składniki: " + skladniki + " Ostrość: " + ostrosc + " Cena:" + getPrince();
    }

}
