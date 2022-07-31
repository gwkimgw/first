package trycatch;

public class AutoClose implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("closed");
    }
}
