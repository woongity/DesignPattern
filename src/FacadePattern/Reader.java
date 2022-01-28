package FacadePattern;

public class Reader {
    private String fileName;

    public Reader(String fileName) {
        this.fileName = fileName;
    }
    public void fileConnect(){
        String message = String.format("Reader %s로 들어갑니다",fileName);
        System.out.println(message);
    }
    public void fileRead(){
        String msg = String.format("Reader %s의 이름으 읽어봅니다",fileName);
    }
    public void fileDisconnect(){
        System.out.format("Reader %s의 연결을 해지합니다",fileName);
    }
}
