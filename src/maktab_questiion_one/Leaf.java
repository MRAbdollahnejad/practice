package maktab_questiion_one;

public class Leaf implements Turner {
    private Color color;

    public Leaf(Color color) {
        this.color = color;
    }
    
    public enum Color {
        YELLOW,
        RED,
        GREEN;
    }

    @Override
    public void turn() {
        switch (color) {
            case GREEN:
                System.out.println("next color is red");
                break;
            case RED:
                System.out.println("next color is yellow");
                break;
            case YELLOW:
                System.out.println("no more turn ");

                break;
        }
    }
}
