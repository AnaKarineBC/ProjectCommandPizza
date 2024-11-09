public class LigarTvCommand implements Command {
    private Televisao tv;

    public LigarTvCommand(Televisao tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.ligar();
    }
}

