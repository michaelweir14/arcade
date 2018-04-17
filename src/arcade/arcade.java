package arcade;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Creates the GUI frame for the arcade.
 * 
 */

public class arcade extends JFrame {
    /** Creates new Image for minesweeper. */
    ImageIcon minePic = new ImageIcon("C:\\Users\\michael\\workspace\\arcade\\pics\\mine.png");
    /** Creates new Image for tictactoe. */
    ImageIcon tictac = new ImageIcon("C:\\Users\\michael\\workspace\\arcade\\pics\\Tictactoe.png");
    /** Creates new Image for connect four. */
    ImageIcon connect = new ImageIcon("C:\\Users\\michael\\workspace\\arcade\\pics\\connect.png");
    /** Stabalizes the constructor. */
    private static final long serialVersionUID = 1L;
    /** Creates JPanel which include buttons. */
    private JPanel panel = new JPanel();
    /** Creates button for minesweeper. */
    JButton minesweeper = new JButton(minePic);
    /** Creates button for tictactoe. */
    JButton TTC = new JButton(tictac);
    /** Creates button for connectfour. */
    JButton connectFour = new JButton(connect);
    
    /**
     * Creates the GUI for the arcade, adds listeners to start each game.
     * 
     */
    public arcade() {
        super("Mike and Jake's Arcade");
        setSize(420, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        panel.setLayout(new GridLayout(3,0));
        minesweeper.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        MineSweeperPanel MineS = new MineSweeperPanel();
                }
                }
                );
        TTC.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        TTCpanel ttc = new TTCpanel();
                        
                }
                }
                );
        connectFour.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) { 
                Game connect4 = new Game();
        }
        }
        );
        panel.add(minesweeper);
        panel.add(TTC);
        panel.add(connectFour);
            add(panel);
            setVisible(true);
        }
    /**
     * Main method that starts the program "arcade".
     * @param args arguement.
     * 
     */
    public static void main(final String[] args) {
        new arcade();
        JOptionPane.showMessageDialog(null, "Welcome to Mike and Jake's Arcade! Choose a game!");
        }
    
}
