
public class Liste {

    Eintrag first;
    Eintrag last;

    public Liste(Eintrag first, Eintrag last) {
        this.first = first;
        this.last = last;

        this.first.prev = null;
        this.first.next = this.last;

        this.last.next = null;
        this.last.prev = this.first;
    }

    public void add(Eintrag e) {
        last.next = e;
        e.prev = last;
        last = e;
    }

    public int size() {
        int i = 0;
        Eintrag e = first;

        while (e != last) {
            i++;
            e = e.next;
        }
        return i + 1;
    }

    public Eintrag get(int i) {
        Eintrag e = first;
        for (int j = 0; j < i; j++) {
            e = e.next;
        }
        return e;
    }

}
