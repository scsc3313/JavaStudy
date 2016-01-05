/**
 * Created by HSH on 2016. 1. 5..
 */
public class EncryptionOut extends Decorator {

    public EncryptionOut(FileOut delegate) {
        super(delegate);
    }

    public void write(Byte[] data){
        byte[] encriptedData = encrypt(data);
        super.doDelegate(encriptedData);
    }

    private byte[] encrypt(Byte[] data) {
        return null;
    }
}
