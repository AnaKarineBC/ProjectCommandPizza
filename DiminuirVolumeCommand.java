public class DiminuirVolumeCommand implements Command {
    private Televisao tv;

    public DiminuirVolumeCommand(Televisao tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.diminuirVolume();
    }
}
