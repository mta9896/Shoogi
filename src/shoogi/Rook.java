/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shoogi;

public class Rook extends Nut
{
    public Rook(int initialX, int initialY, int player)
    {
        super(initialX,initialY,player);
        //possible = new int[18][2];
        /*for( int i=1; i<x; i++)
        {
            this.possible[i][0] = i;
            this.possible[i][1] = 0;
        }
         for( int i=x+1; i<9; i++)
        {
            this.possible[i-1][0] = i;
            this.possible[i-1][1] = 0;
        }
         for( int i=0; i<x; i++)
        {
            this.possible[i+8][0] = 0;
            this.possible[i+8][1] = i;
        }
         for( int i=x+1; i<9; i++)
        {
            this.possible[i-1+8][0] = 0;
            this.possible[i-1+8][1] = i;
        }*/
        for( int i=1; i<10; i++)
        {
            this.possible[i-1][0] = i-x;
            this.possible[i-1][1] = 0;
        }
        for( int i=1; i<10; i++)
        {
            this.possible[i+8][0] = 0;
            this.possible[i+8][1] = i-y;
        }
    }
    @Override
    public char getName()
    {
        if(this.player == 1)
            return 'R';
        else
            return 'r';
    }
}
