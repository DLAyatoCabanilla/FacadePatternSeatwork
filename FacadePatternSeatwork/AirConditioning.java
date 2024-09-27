public class AirConditioning implements HomeService{
    @Override
    public void turnOn(){

        System.out.println("The Air condition is on...✔\uFE0F");
    }

    @Override
    public void turnOff(){
        System.out.println("The Air condition is off...❌");
    }
}