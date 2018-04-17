package arcade;

/**
 * A cell to store which player
 * picked the cell during the game.
 * 
 *@author Jake Miller
 *@version 4/12/2018
 */
public class CCell {
    
    /** The player. Either 1 or 2. */
    private int player;
    
    /**
     * Constructor that instantiates a cell's current state
     * and sets the player to input.
     * 
     * @param player the player.
     */
    public CCell(final int player) {
        if (player > 0 && player < 3) {
            this.player = player; 
        } else {
            this.player = 1;
        }
    }
    
    /**
     * sets player for the game.
     * 
     * @param player the player.
     */
    public void setPlayer(final int player) {
        if (player > 0 && player < 3) {
            this.player = player;
        } else {
            this.player = 1;
        }
    }
    
    /**
     * Returns the player.
     * 
     * @return Player.
     */
    public int getPlayer() {
        return player;
    }
}