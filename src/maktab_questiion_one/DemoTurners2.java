package maktab_questiion_one;

import static maktab_questiion_one.Leaf.Color.GREEN;
import static maktab_questiion_one.Pancake.Face.head;
import static maktab_questiion_one.Season.season.winter;
import static maktab_questiion_one.TimeOfTheDay.times.morning;

public class DemoTurners2 {
    public static void main(String[] args) {
        Leaf leaf=new Leaf(GREEN);
        leaf.turn();
        Page page=new Page(5,7);
        page.turn();
        Pancake pancake=new Pancake(head);
        pancake.turn();
        TimeOfTheDay timeOfTheDay=new TimeOfTheDay(morning);
        timeOfTheDay.turn();
        Season season=new Season(winter);
        season.turn();
    }
}
