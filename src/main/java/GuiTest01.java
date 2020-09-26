import javax.swing.*;

/**
 * Description:
 * Auther:smart
 * Date: 2020/9/26 上午9:08
 */
public class GuiTest01 {
    private JButton button1;
    private JPanel panel1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("GuiTest01");
        frame.setContentPane(new GuiTest01().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600,500);
    }
}
