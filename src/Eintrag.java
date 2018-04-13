public class Eintrag {

    Eintrag prev;
    Eintrag next;
    int val;

    public Eintrag(int val){
        this.val = val;
    }

    public Eintrag getPrev() {
        return prev;
    }

    public void setPrev(Eintrag prev) {
        this.prev = prev;
    }

    public Eintrag getNext() {
        return next;
    }

    public void setNext(Eintrag next) {
        this.next = next;
    }

    public int getVal() {
        return val;

    }

    public void setVal(int val) {
        this.val = val;
    }


}
