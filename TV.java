public class TV implements HomeService{

    @Override
    public String turnOnAll(){
        return "TV is turned on ...";
    }

    @Override
    public String turnOffAll(){
        return "TV is turned off ...";
    }
}