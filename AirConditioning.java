public class AirConditioning implements HomeService{

    @Override
    public String turnOnAll(){
        return "Air conditioning is turned on ...";
    }

    @Override
    public String turnOffAll(){
        return "Air conditioning is turned off ...";
    }
}