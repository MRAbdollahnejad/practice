package maktab_questiion_one;

public class Pancake implements Turner {
    private Face face;

    public Pancake(Pancake.Face face) {
        this.face = face;
    }

    public enum Face {
        head,
        tail;
    }

    @Override
    public void turn() {
        if (Math.random() < 0.5) {
            this.face = Face.head;
            System.out.println("head");
        } else {
            this.face = Face.tail;
            System.out.println("tail");
        }
    }
}
