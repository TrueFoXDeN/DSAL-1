public class Rekursiv {
    public int max = 0, secmax = 0;

    public int findSec(Liste list) {

        Eintrag e = list.first;
        return help(e);
    }

    private int help(Eintrag e) {

        if (e.getVal() >= max) {
            secmax = max;
            max = e.getVal();
        } else if (e.getVal() > secmax) {
            secmax = e.getVal();
        }
        if (e.next != null) {
            help(e.next);
        }
        return secmax;
    }

}
