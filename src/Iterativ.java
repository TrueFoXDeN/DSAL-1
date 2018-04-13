public class Iterativ {

    public int findSec(Liste list){
        int max = 0, secmax = 0;

        int n = list.size();

        for (int i = 0; i < n; i++) {
            if (list.get(i).getVal() >= max) {
                secmax = max;
                max = list.get(i).getVal();
            } else if (list.get(i).getVal() > secmax) {
                secmax = list.get(i).getVal();
            }
        }
        return secmax;
    }
}
