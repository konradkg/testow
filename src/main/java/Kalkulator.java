public class Kalkulator
{
    public Integer dodaj(String dane) {
        if( dane.isEmpty()) {
            return 0;
        }

        // 1,2,3,4

        // [] = "1", "2", "3", "4"


        String[] danePodzielone = dane.split(",|\n");

        Integer suma = 0;
        for(int i = 0; i < danePodzielone.length; i++) {
            String liczba = danePodzielone[i];
            suma += Integer.parseInt(liczba);
        }

        return suma;
    }
}
