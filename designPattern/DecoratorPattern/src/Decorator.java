/**
 * Created by HSH on 2016. 1. 5..
 */
public class Decorator implements FileOut {
    private FileOut delegate;

    public Decorator(FileOut delegate) {
        this.delegate = delegate;
    }

    protected void doDelegate(byte[] data){
        delegate.write(data);
    }

    @Override
    public void write(byte[] data) {

    }
}
