package bulldogjob;
import java.lang.Integer;
import java.lang.Double;
/**
 * Created by Paweł on 28.12.2017.
 */
public class Podatek {
    Integer kwota = 10000;

        public void licz_liniowy(Integer ile) {

                    ile = kwota + 18;
            }

        public class licz_zwykly {

            Double podatek_zwykly() {

                Double ile_2 = (kwota - 3500) * 0.19;
                return ile_2;

            }
        }



//        public void dochod_roczny(Integer kwota) {
//                Integer kwota = 10000;
//            return;
//        }

//
//        public static void main(String[] args) {
//
//            licz_liniowy  test2 = new licz_liniowy();
//            licz_zwykly test3 = new licz_zwykly();
//
//
//            System.out.println(licz_liniowy());
//            System.out.println(licz_zwykly());
//        }

}






