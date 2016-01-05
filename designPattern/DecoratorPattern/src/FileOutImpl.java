/**
 * Created by HSH on 2016. 1. 5..
 */
public class FileOutImpl implements FileOut {
    private byte[] data;

    @Override
    public void write(byte[] data) {
        this.data = data;
    }

    public void print(){
        System.out.println(data);
    }
}
