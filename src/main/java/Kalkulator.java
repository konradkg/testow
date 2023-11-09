public class Kalkulator
{
    public Integer dodaj(final String dane) {
        if( dane == null || dane.isEmpty()) {
            return 0;
        }
        String separator = ",|\n";
        String mojeDane = dane;
        String nowySeparator = "";

        // *//\n1*2*3*4
        if(dane.startsWith("//")) {
            mojeDane = dane.substring(dane.indexOf("\n")+1); // beginIndex, endIndex; 3;
            nowySeparator = dane.substring(2, dane.indexOf("\n")); // +1 ==> *

//            System.out.println("mojeDane " + mojeDane);
//            System.out.println("mojeDane " + nowySeparator);

            separator = separator + "|" + nowySeparator;
//          mojeDane = "1,2*3";
        }


        String[] danePodzielone = mojeDane.split(separator);

        Integer suma = 0;
        for(int i = 0; i < danePodzielone.length; i++) {
            String liczba = danePodzielone[i];
            suma += Integer.parseInt(liczba);
        }

        return suma;
    }
}
