public class Televisao {
    private boolean ligada = false;
    private int volume = 10;

    public void ligar() {
        if (!ligada) {
            ligada = true;
            System.out.println("TV ligada.");
        } else {
            System.out.println("A TV já está ligada.");
        }
    }

    public void desligar() {
        if (ligada) {
            ligada = false;
            System.out.println("TV desligada.");
        } else {
            System.out.println("A TV já está desligada.");
        }
    }

    public void aumentarVolume() {
        if (ligada) {
            volume += 1;
            System.out.println("Volume aumentado para " + volume);
        } else {
            System.out.println("Não é possível aumentar o volume, a TV está desligada.");
        }
    }

    public void diminuirVolume() {
        if (ligada) {
            volume -= 1;
            System.out.println("Volume diminuído para " + volume);
        } else {
            System.out.println("Não é possível diminuir o volume, a TV está desligada.");
        }
    }
}
