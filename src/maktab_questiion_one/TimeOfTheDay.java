package maktab_questiion_one;

public class TimeOfTheDay implements Turner{
    private times timing;

    public TimeOfTheDay(times timing) {
        this.timing = timing;
    }

    @Override
    public void turn() {
        switch (timing){
            case morning:
                this.timing=times.noon;
                System.out.println("it /'s noon ");
                break;
            case noon:
                this.timing=times.afternoon;
                System.out.println("it /'s afternoon ");
                break;
            case afternoon:
                this.timing=times.evening;
                System.out.println("it /'s evening ");
                break;
            case evening:
                System.out.println("it /'s out of day.night begins ");
                break;
        }
    }

    public enum times{
        morning,
        noon,
        afternoon,
        evening;
    }

}
