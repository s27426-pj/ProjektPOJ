import java.util.Scanner;
public class Pizzeria {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int ilosc;
        int a,b,c;
        int t;
        double cena;
        double cena1,cena2,cena3;
        Cena A = new Cena();
        Wegetarian Wege = new Wegetarian();
        Capriciosa Cap = new Capriciosa();
        Pepperoni Pep = new Pepperoni();
        System.out.println("Witamy w naszej pizzeri!");
        System.out.println("Dostępne pizze to:");
        System.out.println(Wege.getOpis());
        System.out.println(Cap.getOpis());
        System.out.println(Pep.getOpis());
        System.out.println("Ile rodzajów pizz chcesz zamówc? ");
        a = keyboard.nextInt();
        if (a==1){
            System.out.println("Który rodzaj chcesz zamówć? (podaj numer )");
            b = keyboard.nextInt();
            if (b==1){
                System.out.println("Ile sztuk?");
                ilosc = keyboard.nextInt();
                System.out.println("Jakiej wielkości? (1-mała,2-średnia,3-duża)");
                c = keyboard.nextInt();
                if (c==1){
                    A.c1 = ilosc*Wege.CenM;
                } else if (c==2) {
                    A.c1 = ilosc*Wege.CenS;
                }
                else {
                    A.c1 = ilosc*Wege.CenD;
                }
            }
            if (b==2){
                System.out.println("Ile sztuk?");
                ilosc = keyboard.nextInt();
                System.out.println("Jakiej wielkości? (1-mała,2-średnia,3-duża)");
                c = keyboard.nextInt();
                if (c==1){
                    A.c1 = ilosc*Cap.CenM;
                } else if (c==2) {
                    A.c1 = ilosc*Cap.CenS;
                }
                else {
                    A.c1 = ilosc*Cap.CenD;
                }
            }
            if (b==3){
                System.out.println("Ile sztuk?");
                ilosc = keyboard.nextInt();
                System.out.println("Jakiej wielkości? (1-mała,2-średnia,3-duża)");
                c = keyboard.nextInt();
                if (c==1){
                    A.c1 = ilosc*Pep.CenM;
                } else if (c==2) {
                    A.c1 = ilosc*Pep.CenS;
                }
                else {
                    A.c1 = ilosc*Pep.CenD;
                }
            }
        } else if (a==2) {
            System.out.println("Jaki jest 1 rodzaj? (podaj numer)");
            b = keyboard.nextInt();
            if (b==1){
                System.out.println("Ile sztuk?");
                ilosc = keyboard.nextInt();
                System.out.println("Jakiej wielkości? (1-mała,2-średnia,3-duża)");
                c = keyboard.nextInt();
                if (c==1){
                    A.c1 = ilosc*Wege.CenM;
                } else if (c==2) {
                    A.c1 = ilosc*Wege.CenS;
                }
                else {
                    A.c1 = ilosc*Wege.CenD;
                }
            }
            if (b==2){
                System.out.println("Ile sztuk?");
                ilosc = keyboard.nextInt();
                System.out.println("Jakiej wielkości? (1-mała,2-średnia,3-duża)");
                c = keyboard.nextInt();
                if (c==1){
                    A.c1 = ilosc*Cap.CenM;
                } else if (c==2) {
                    A.c1 = ilosc*Cap.CenS;
                }
                else {
                    A.c1 = ilosc*Cap.CenD;
                }
            }
            if (b==3){
                System.out.println("Ile sztuk?");
                ilosc = keyboard.nextInt();
                System.out.println("Jakiej wielkości? (1-mała,2-średnia,3-duża)");
                c = keyboard.nextInt();
                if (c==1){
                    A.c1 = ilosc*Pep.CenM;
                } else if (c==2) {
                    A.c1 = ilosc*Pep.CenS;
                }
                else {
                    A.c1 = ilosc*Pep.CenD;
                }
            }
            System.out.println("A jaki drugi rodzaj?");
            b = keyboard.nextInt();
            if (b==1){
                System.out.println("Ile sztuk?");
                ilosc = keyboard.nextInt();
                System.out.println("Jakiej wielkości? (1-mała,2-średnia,3-duża)");
                c = keyboard.nextInt();
                if (c==1){
                    A.c2 = ilosc*Wege.CenM;
                } else if (c==2) {
                    A.c2 = ilosc*Wege.CenS;
                }
                else {
                    A.c2 = ilosc*Wege.CenD;
                }
            }
            if (b==2){
                System.out.println("Ile sztuk?");
                ilosc = keyboard.nextInt();
                System.out.println("Jakiej wielkości? (1-mała,2-średnia,3-duża)");
                c = keyboard.nextInt();
                if (c==1){
                    A.c2 = ilosc*Cap.CenM;
                } else if (c==2) {
                    A.c2 = ilosc*Cap.CenS;
                }
                else {
                    A.c2 = ilosc*Cap.CenD;
                }
            }
            if (b==3){
                System.out.println("Ile sztuk?");
                ilosc = keyboard.nextInt();
                System.out.println("Jakiej wielkości? (1-mała,2-średnia,3-duża)");
                c = keyboard.nextInt();
                if (c==1){
                    A.c2 = ilosc*Pep.CenM;
                } else if (c==2) {
                    A.c2 = ilosc*Pep.CenS;
                }
                else {
                    A.c2 = ilosc*Pep.CenD;
                }
            }
        }
        else {
                System.out.println("Ile sztuk Wegetariańskiej?");
                ilosc = keyboard.nextInt();
                System.out.println("Jakiej wielkości? (1-mała,2-średnia,3-duża)");
                c = keyboard.nextInt();
                if (c==1){
                    A.c1 = ilosc*Wege.CenM;
                } else if (c==2) {
                    A.c1 = ilosc*Wege.CenS;
                }
                else {
                    A.c1 = ilosc*Wege.CenD;
                }
            System.out.println("Ile sztuk Capriciosa?");
            ilosc = keyboard.nextInt();
            System.out.println("Jakiej wielkości? (1-mała,2-średnia,3-duża)");
            c = keyboard.nextInt();
            if (c==1){
                A.c2 = ilosc*Wege.CenM;
            } else if (c==2) {
                A.c2 = ilosc*Wege.CenS;
            }
            else {
                A.c2 = ilosc*Wege.CenD;
            }
            System.out.println("Ile sztuk Pepperoni?");
            ilosc = keyboard.nextInt();
            System.out.println("Jakiej wielkości? (1-mała,2-średnia,3-duża)");
            c = keyboard.nextInt();
            if (c==1){
                A.c3 = ilosc*Wege.CenM;
            } else if (c==2) {
                A.c3 = ilosc*Wege.CenS;
            }
            else {
                A.c3 = ilosc*Wege.CenD;
            }
        }

        System.out.println("Z dostawą (10zł) czy odbiór osobisty(za darmo)? (podaj numer wyboru)");
        t = keyboard.nextInt();
        if (t==1){
            double suma;
            suma = A.c1+A.c2+A.c3+10;
            System.out.println("Koszt całkowity wynosi: " + suma );
        }
        else {
            double suma;
            suma = A.c1+A.c2+A.c3;
            System.out.println("Koszt całkowity wynosi: " + suma );
        }

    }
}
