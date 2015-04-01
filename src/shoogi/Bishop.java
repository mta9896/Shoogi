/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shoogi;

public class Bishop extends Nut 
{
    public Bishop(int initialX, int initialY, int player)
    {
        super(initialX,initialY,player);
        //possible = new int[16][2];
        int i = 1;
        int t =0;
        while( (x+i < 9) && (y+i <9))
        {
            this.possible[t][0] = i;
            this.possible[t][1] = i;    
            i++;
            t++;
        }
        i = 1;
        while( (x+i < 9) && (y-i >=0))
        {
            this.possible[t][0] = i;
            this.possible[t][1] = -i;    
            i++;
            t++;
        }
        i=1;
        while( (x-i >= 0) && (y-i >=0))
        {
            this.possible[t][0] = -i;
            this.possible[t][1] = -i;    
            i++;
            t++;
        } 
        i=1;
        while( (x-i >= 0) && (y+i <9))
        {
            this.possible[t][0] = -i;
            this.possible[t][1] = i;    
            i++;
            t++;
        } 
    }    
    @Override
    public char getName()
    {
        if(this.player == 1)
            return 'B';
        else
            return 'b';
    }
}
