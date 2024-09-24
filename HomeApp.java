public class HomeApp{
    public static void main(String[] args) {
      
        HomeService tv = new TV();
        HomeService light = new Light();
        HomeService airConditioning = new AirConditioning();
        
        HomeInterface tvHomeInterface = new HomeInterface(tv);
        HomeInterface lightHomeInterface = new HomeInterface(light);
        HomeInterface airConditioningHomeInterface = new HomeInterface(airConditioning);

        System.out.println(tvHomeInterface.turnOnAll());
        System.out.println(tvHomeInterface.turnOffAll());

        System.out.println(lightHomeInterface.turnOnAll());
        System.out.println(lightHomeInterface.turnOffAll());

        System.out.println(airConditioningHomeInterface.turnOnAll());
        System.out.println(airConditioningHomeInterface.turnOffAll());
    }
}