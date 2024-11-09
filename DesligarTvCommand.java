public class DesligarTvCommand implements Command {
    private Televisao tv;

    public DesligarTvCommand(Televisao tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.desligar();
    }
}
