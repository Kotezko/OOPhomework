package homework.vetClinic;

public interface Crawling {
    void crawl();
    default double getCrawlSpeed(){
        return 2.5;
    }
}
