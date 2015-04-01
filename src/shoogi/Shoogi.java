/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shoogi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MT
 */
public class Shoogi 
{ 
    private char [][] screen;
    public int[][] valid;
    String name;
    public Shoogi()
    {
        valid = new int[10][2];
        screen = new char[11][11];
        
    }
    // Player1 Nuts Objects
    King k1 = new King(5,1,1);
    Lance lA1 = new Lance(1,1,1);
    Lance lB1 = new Lance(9,1,1);
    Knight nA1 = new Knight(2,1,1);
    Knight nB1 = new Knight(8,1,1);
    SilverGeneral sA1 = new SilverGeneral(3,1,1);
    SilverGeneral sB1 = new SilverGeneral(7,1,1);
    GoldGeneral gA1 = new GoldGeneral(4,1,1);
    GoldGeneral gB1 = new GoldGeneral(6,1,1);
    Rook r1 = new Rook(2,2,1);
    Bishop b1 = new Bishop(8,2,1);
    Pawn pA1 = new Pawn(1,2,1);
    // Player2 Objects
    King k2 = new King(5,9,2);
    Lance lA2 = new Lance(1,9,2);
    Lance lB2 = new Lance(9,9,2);
    Knight nA2 = new Knight(2,9,2);
    Knight nB2 = new Knight(8,9,2);
    SilverGeneral sA2 = new SilverGeneral(3,9,2);
    SilverGeneral sB2 = new SilverGeneral(7,9,2);
    GoldGeneral gA2 = new GoldGeneral(4,9,2);
    GoldGeneral gB2 = new GoldGeneral(6,9,2);
    Rook r2 = new Rook(8,8,2);
    Bishop b2 = new Bishop(2,8,2);
    public void initializeScreen()
    {
        for(int i=0; i<11; i++)
            for(int j=0; j<11; j++)
                screen[i][j]='-';
        for(int i=0; i<11; i++)
        {
            screen[0][i] = 'O';
            screen[10][i] = 'O';
        }
        for(int i=0; i<11; i++)
        {
            screen[i][0] = 'O';
            screen[i][10] = 'O';
        }
        putOnScreen(k1);
        putOnScreen(lA1);
        putOnScreen(lB1);
        putOnScreen(nA1);
        putOnScreen(nB1);
        putOnScreen(sA1);
        putOnScreen(sB1);
        putOnScreen(gA1);
        putOnScreen(gB1);
        putOnScreen(r1);
        putOnScreen(b1);
        putOnScreen(k2);
        putOnScreen(lA2);
        putOnScreen(lB2);
        putOnScreen(nA2);
        putOnScreen(nB2);
        putOnScreen(sA2);
        putOnScreen(sB2);
        putOnScreen(gA2);
        putOnScreen(gB2);
        putOnScreen(r2);
        putOnScreen(b2);
    }
    public void putOnScreen(Nut n)
    {
        screen[n.x][n.y] = n.getName();
    }
    public void printScreen()
    {
        for(int j=0; j<11; j++)
        {
            for(int i=0; i<11; i++)
            System.out.print(" "+screen[i][j]+" ");
            System.out.println(""); 
        }
    }
    
    public void showPossibleMovesP1(Nut n) 
    {
        //System.out.println("in: "+(n.x) + "," + (n.y));
        //for(int i=0; i<8; i++)
            //System.out.println((n.possible[i][0]) + "," + (n.possible[i][1]));
        int number = 0;
        for( int i=0; i<18; i++)
        {
            if( (screen [(n.x+n.possible[i][0])][(n.y+n.possible[i][1])] != 'O') && (screen [(n.x+n.possible[i][0])][(n.y+n.possible[i][1])] != 'K') && (screen [(n.x+n.possible[i][0])][(n.y+n.possible[i][1])] != 'G') && (screen [(n.x+n.possible[i][0])][(n.y+n.possible[i][1])] != 'S') && (screen [(n.x+n.possible[i][0])][(n.y+n.possible[i][1])] != 'N') && (screen [(n.x+n.possible[i][0])][(n.y+n.possible[i][1])] != 'L') && (screen [(n.x+n.possible[i][0])][(n.y+n.possible[i][1])] != 'R') && (screen [(n.x+n.possible[i][0])][(n.y+n.possible[i][1])] != 'B') && (screen [(n.x+n.possible[i][0])][(n.y+n.possible[i][1])] != 'P'))
            {
                
                
                System.out.println((n.x+n.possible[i][0]) + "," + (n.y+n.possible[i][1]));
            }
        }
    }
    
    //public void 
    public void moveP1()
    {
        
    }        
     
    public void askName()
    {
        Scanner s = new Scanner(System.in);
        name = s.nextLine();
        
            
    }
    public static void main(String[] args) 
    {
        Shoogi s = new Shoogi();
        s.initializeScreen();
        s.printScreen();
        s.askName();
        if( s.name.equals("lA"))
        {
            s.showPossibleMovesP1(s.lA1); 
        }
        //System.out.println("Lance A:");
        //s.showPossibleMovesP1(s.lA1);
        
       
    }  
}
