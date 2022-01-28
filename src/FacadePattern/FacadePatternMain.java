package FacadePattern;

public class FacadePatternMain {
    public static void main(String[] args) {
//
//        FTP ftp = new FTP("www.naver.com", 22, "/home/etc");
//        ftp.connect();
//        ftp.moveDirectory();
//        ftp.disconnect();
//        Reader reader = new Reader("text.tmp");
//        Writer writer = new Writer("text.tmp");
//
//        writer.write();
//        reader.fileConnect();
//        reader.fileRead();
//
//        reader.fileDisconnect();
//        writer.fileDisconnect();
//        ftp.disconnect();
        SFTPClient sftpClient = new SFTPClient("www.naver.com",22,"home/etc/","text.tmp");
        sftpClient.connect();
        sftpClient.read();
        sftpClient.write();
        sftpClient.disConnect();
    }
}
