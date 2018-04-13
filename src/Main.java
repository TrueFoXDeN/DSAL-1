
public class Main {

    public static void main(String[] args) {

        Liste list = new Liste(new Eintrag(22), new Eintrag(100));

        list.add(new Eintrag(70));
        list.add(new Eintrag(20));
        list.add(new Eintrag(71));
        list.add(new Eintrag(42));
        list.add(new Eintrag(112));
        list.add(new Eintrag(78));


        Iterativ i = new Iterativ();
        System.out.println(i.findSec(list));

        Rekursiv r = new Rekursiv();
        System.out.println(r.findSec(list));

    }
}
