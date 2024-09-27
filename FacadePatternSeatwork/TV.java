public class TV implements HomeService{

    @Override
    public void turnOn(){
        System.out.println("The TV is on...✔\uFE0F");
    }

    @Override
    public void turnOff(){
        System.out.println("The TV is off...❌");
    }
}