package maktab_questiion_one;

public class Page implements Turner{
    private int pageNumber;
    private final int totalPages;

    public Page(int pageNumber, int totalPages) {
        this.pageNumber = pageNumber;
        this.totalPages = totalPages;
    }

    @Override
    public void turn() {
        if (pageNumber<totalPages){
            pageNumber++;
            System.out.println(pageNumber);
        }else System.out.println("final page is"+totalPages);
    }
}
