public class SmartTv {

    boolean ligado = false;
    int canal = 1;
    int volume = 2;

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }

    public void canal(int canal) {
        this.canal = canal;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando para : " + volume);
    }

    public void diminuindoVolume() {
        volume--;
        System.out.println("Diminuindo para : " + volume);
    }

    public void mudarCanal(int canal) {

        canal++;

        System.out.println("Mudando canal : " + ++canal);

    }

}
