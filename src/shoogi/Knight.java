/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shoogi;


public class Knight extends Nut
{
    public Knight(int initialX, int initialY, int player)
    {
        super(initialX,initialY,player);
        //possible = new int[2][2];
        int p[][] = { {1,2} , {-1,2}};
        this.possible = p;
        
    }
    @Override
    public char getName()
    {
       if(this.player == 1)
            return 'N';
        else
            return 'n';
    }
}
