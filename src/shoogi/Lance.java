/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shoogi;

public class Lance extends Nut
{
    public Lance(int initialX, int initialY, int player)
    {
        super(initialX,initialY,player);
        //possible = new int[8][2];
        
        if( player == 1)
        {
            int i = 1;
            while( this.y+i<10) // in vase player balayie ast 
            {
                this.possible[i-1][0] = 0;
                this.possible[i-1][1] = i;
                i++;
            }
        }
        /*if(player == 2)
        {
            int i = 1;
            while( this.y-i>=0) // in vase player payinie ast 
            {
                this.possible[i-1][0] = 0; // too namayeshe khoonehaye momken baraye lance 6 mizane
                this.possible[i-1][1] = i;
                i++;
            } 
        }*/
    }
    @Override
    public char getName()
    {
        if(this.player == 1)
            return 'L';
        else
            return 'l';
    }
}
