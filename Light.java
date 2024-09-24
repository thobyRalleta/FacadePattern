public class Light implements HomeService{

    @Override
    public String turnOnAll(){
        return "Light is turned on ...";
    }

    @Override
    public String turnOffAll(){
        return "Light is turned off ...";
    }
}