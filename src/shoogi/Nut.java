/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shoogi;


public class Nut 
{
    protected int x;
    protected int y;
    protected int player;
    public int possible[][];    
    
    public Nut(int initialX, int initialY, int player)
    {
        this.x = initialX;
        this.y = initialY;
        this.player = player;
        this.possible = new int[18][2];
    }
    public char getName()
    {
        return 'n';
    }
    
}
