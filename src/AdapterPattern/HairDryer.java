package AdapterPattern;

public class HairDryer implements Electronic110V {

    @Override
    public void powerOn() {
        System.out.println("110v 헤어드라이어 파워온");
    }
}
