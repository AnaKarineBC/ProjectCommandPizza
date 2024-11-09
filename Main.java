public class Main {
    public static void main(String[] args) {
        // Instanciando o receptor
        Televisao tv = new Televisao();

        // Criando comandos concretos
        Command ligarTv = new LigarTvCommand(tv);
        Command desligarTv = new DesligarTvCommand(tv);
        Command aumentarVolume = new AumentarVolumeCommand(tv);
        Command diminuirVolume = new DiminuirVolumeCommand(tv);

        // Configurando o controle remoto com os comandos
        ControleRemoto controle = new ControleRemoto(ligarTv, desligarTv, aumentarVolume, diminuirVolume);

        // Usando o controle remoto
        controle.pressionarBotaoLigar();         // Saída: "TV ligada."
        controle.pressionarBotaoAumentarVolume(); // Saída: "Volume aumentado para 11"
        controle.pressionarBotaoDiminuirVolume(); // Saída: "Volume diminuído para 10"
        controle.pressionarBotaoDesligar();       // Saída: "TV desligada."
    }
}
