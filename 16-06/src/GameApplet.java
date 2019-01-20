import javax.swing.JApplet;

public class GameApplet extends JApplet {
    private static final long serialVersionUID = 1L;

    public void init() {
        setContentPane(new GamePanel());
    }
}
