public class Light implements HomeService{

    @Override
    public void turnOn(){
        System.out.println("The Lights are now on...✔\uFE0F");
    }

    @Override
    public void turnOff(){
        System.out.println("The Lights are now off...❌");
    }
}