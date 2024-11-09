public class ControleRemoto {
    private Command botaoLigar;
    private Command botaoDesligar;
    private Command botaoAumentarVolume;
    private Command botaoDiminuirVolume;

    public ControleRemoto(Command ligar, Command desligar, Command aumentarVolume, Command diminuirVolume) {
        this.botaoLigar = ligar;
        this.botaoDesligar = desligar;
        this.botaoAumentarVolume = aumentarVolume;
        this.botaoDiminuirVolume = diminuirVolume;
    }

    public void pressionarBotaoLigar() {
        botaoLigar.execute();
    }

    public void pressionarBotaoDesligar() {
        botaoDesligar.execute();
    }

    public void pressionarBotaoAumentarVolume() {
        botaoAumentarVolume.execute();
    }

    public void pressionarBotaoDiminuirVolume() {
        botaoDiminuirVolume.execute();
    }
}
