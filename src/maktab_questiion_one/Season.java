package maktab_questiion_one;

public class Season implements Turner{
    public season season;

    public Season(Season.season season) {
        this.season = season;
    }

    public enum season{
        spring,
        summer,
        autumn,
        winter;
    }
    @Override
    public void turn() {
        switch (season){
            case spring:
                this.season= season.summer;
                System.out.println("next season is summer");
                break;
            case summer:
                this.season= season.autumn;
                System.out.println("next season is fall");
                break;
            case autumn:
                this.season= season.winter;
                System.out.println("next season is winter");
                break;
            case winter:
                this.season= season.spring;
                System.out.println("next season is spring");
                break;
        }
    }
}
