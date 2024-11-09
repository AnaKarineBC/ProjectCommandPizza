public class AumentarVolumeCommand implements Command {
    private Televisao tv;

    public AumentarVolumeCommand(Televisao tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.aumentarVolume();
    }
}
