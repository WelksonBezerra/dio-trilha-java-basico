public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.canal(10);

        System.out.println("O canal atual é: " + smartTv.canal);

    }
}
