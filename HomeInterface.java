public class HomeInterface{
    private HomeService hs;

    public HomeInterface(HomeService hs){
        this.hs = hs;
    }

    public String turnOnAll(){
        return hs.turnOnAll();
    }

    public String turnOffAll(){
        return hs.turnOffAll();
    }
}