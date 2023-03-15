package maktab_questiion_one;

import static maktab_questiion_one.Leaf.Color.GREEN;
import static maktab_questiion_one.Pancake.Face.head;

public class DemoTurners {
    public static void main(String[] args) {
        Leaf leaf=new Leaf(GREEN);
        leaf.turn();
        Page page=new Page(5,7);
        page.turn();
        Pancake pancake=new Pancake(head);
        pancake.turn();
    }
}
