/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shoogi;


public class Pawn extends Nut
{
    public Pawn(int initialX, int initialY, int player)
    {
        super(initialX,initialY,player);
        //possible = new int[1][2];
        int p[][] = { { 0, -1} };
        this.possible = p;
        
    }
    @Override
    public char getName()
    {
        if(this.player == 1)
            return 'P';
        else
            return 'p';
    }
}
