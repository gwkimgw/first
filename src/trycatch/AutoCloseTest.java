package trycatch;

class AutoCloseTest {
    public static void main(String[] args) {
        try (AutoClose autoClose = new AutoClose()){
            throw new Exception();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}