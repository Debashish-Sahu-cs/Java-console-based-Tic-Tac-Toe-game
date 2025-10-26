    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tictactoegame;

/**
 *
 * @author jeet
 */
import java.util.*;

public class TictactoeGame {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        String result="true";
        
        System.out.println("Enter Mode! Computer mode / 2 player mode .");
        String mode =sc.nextLine();
        
        String board[][]= new String [3][3];
        // 2 player mode>>>>>>>>>>>>>>>>>
        
        if( mode.equalsIgnoreCase("start")){
            System.out.println("Start game...");
            
            for( int i = 0 ; i < 3  ; i++){
                for ( int j = 0 ; j < 3 ; j++){
                    board[i][j]=" ";
                    System.out.print(" "+board[i][j]+" ");
                    
                }
                System.out.println();
                if(i==2){
                    System.out.print("");
            }else{
                System.out.println("--+--+--");
                }
            }
            
            while(result.equals("true")){
                
            System.out.println("player X turn:(row x column)");
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(board[a][b].equals("X") || board[a][b].equals("0")){
                        System.out.println("invalid move");
                        continue;
                    }else
                board[a][b]="X";
            
            for( int i = 0 ; i < 3  ; i++){
                for ( int j = 0 ; j < 3 ; j++){
                    
                    System.out.print(" "+board[i][j]+" ");
                    
                    }
                System.out.println();
                if(i==2){
                    System.out.print("");
            }else{
                System.out.println("--+--+--");
                }
            }
            if(board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2]) && ( board[0][0].equals("X") || board[0][0].equals("O"))){
                System.out.println("player "+board[0][0]+" win...");
                result="false";
                break;
            }else if(board[0][0].equals(board[0][1]) && board[0][0].equals(board[0][2]) && ( board[0][0].equals("X") || board[0][0].equals("O"))){
                System.out.println("player "+board[0][0]+" win...");
                result="false";
                break;
            }else if(board[1][0].equals(board[1][1]) && board[1][0].equals(board[1][2]) && ( board[1][0].equals("X") || board[1][0].equals("O"))){
                System.out.println("player "+board[1][0]+" win...");
                result="false";
                break;
            }else if(board[2][0].equals(board[2][1]) && board[2][0].equals(board[2][2]) && ( board[2][0].equals("X") || board[2][0].equals("O"))){
                System.out.println("player "+board[2][0]+" win...");
                result="false";
                break;
            }else if(board[0][0].equals(board[1][0]) && board[0][0].equals(board[2][0]) && ( board[0][0].equals("X") || board[0][0].equals("O"))){
                System.out.println("player "+board[0][0]+" win...");
                result="false";
                break;
            }else if(board[0][1].equals(board[1][1]) && board[0][1].equals(board[2][1]) && ( board[0][1].equals("X") || board[0][1].equals("O"))){
                System.out.println("player "+board[0][1]+" win...");
                result="false";
                break;
            }else if(board[0][2].equals(board[1][2]) && board[0][2].equals(board[2][2]) && ( board[0][2].equals("X") || board[0][2].equals("O"))){
                System.out.println("player "+board[0][2]+" win...");
                result="false";
                break;
            }else if(board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0]) && ( board[0][2].equals("X") || board[0][2].equals("O"))){
                System.out.println("player "+board[0][2]+" win...");
                result="false";
                break;
            }
            else{
                result="true";
                
            }
            if((board[0][0].equals("X") || board[0][0].equals("O")) && (board[0][1].equals("X") || board[0][1].equals("O")) && (board[0][2].equals("X") || board[0][2].equals("O")) &&
               (board[1][0].equals("X") || board[1][0].equals("O")) && (board[1][1].equals("X") || board[1][1].equals("O")) && (board[1][2].equals("X") || board[1][2].equals("O")) &&
               (board[2][0].equals("X") || board[2][0].equals("O")) && (board[2][1].equals("X") || board[2][1].equals("O")) && (board[2][2].equals("X") || board[2][2].equals("O"))){
                System.out.println("Draw!!");
                result="false";
                break;
            }else
                result="true";
                
            System.out.println("player O turn:");
            int c = sc.nextInt();
            int d = sc.nextInt();
            
            if(board[c][d].equals("X") || board[c][d].equals("0")){
                        System.out.println("invalid move");
                        continue;
                    }else
                board[c][d]="O";
            
            for( int i = 0 ; i < 3  ; i++){
                for ( int j = 0 ; j < 3 ; j++){
                    
                    System.out.print(" "+board[i][j]+" ");
                    
                }
                System.out.println();
                if(i==2){
                    System.out.print("");
            }else{
                System.out.println("--+--+--");
                }
            }
            
            if(board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2]) && ( board[0][0].equals("X") || board[0][0].equals("O"))){
                System.out.println("player "+board[0][0]+" win...");
                result="false";
                break;
            }else if(board[0][0].equals(board[0][1]) && board[0][0].equals(board[0][2]) && ( board[0][0].equals("X") || board[0][0].equals("O"))){
                System.out.println("player "+board[0][0]+" win...");
                result="false";
                break;
            }else if(board[1][0].equals(board[1][1]) && board[1][0].equals(board[1][2]) && ( board[1][0].equals("X") || board[1][0].equals("O"))){
                System.out.println("player "+board[1][0]+" win...");
                result="false";
                break;
            }else if(board[2][0].equals(board[2][1]) && board[2][0].equals(board[2][2]) && ( board[2][0].equals("X") || board[2][0].equals("O"))){
                System.out.println("player "+board[2][0]+" win...");
                result="false";
                break;
            }else if(board[0][0].equals(board[1][0]) && board[0][0].equals(board[2][0]) && ( board[0][0].equals("X") || board[0][0].equals("O"))){
                System.out.println("player "+board[0][0]+" win...");
                result="false";
                break;
            }else if(board[0][1].equals(board[1][1]) && board[0][1].equals(board[2][1]) && ( board[0][1].equals("X") || board[0][1].equals("O"))){
                System.out.println("player "+board[0][1]+" win...");
                result="false";
                break;
            }else if(board[0][2].equals(board[1][2]) && board[0][2].equals(board[2][2]) && ( board[0][2].equals("X") || board[0][2].equals("O"))){
                System.out.println("player "+board[0][2]+" win...");
                result="false";
                break;
            }else if(board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0]) && ( board[0][2].equals("X") || board[0][2].equals("O"))){
                System.out.println("player "+board[0][2]+" win...");
                result="false";
                break;
            }else{
                result="true";
                
            }
            if((board[0][0].equals("X") || board[0][0].equals("O")) && (board[0][1].equals("X") || board[0][1].equals("O")) && (board[0][2].equals("X") || board[0][2].equals("O")) &&
               (board[1][0].equals("X") || board[1][0].equals("O")) && (board[1][1].equals("X") || board[1][1].equals("O")) && (board[1][2].equals("X") || board[1][2].equals("O")) &&
               (board[2][0].equals("X") || board[2][0].equals("O")) && (board[2][1].equals("X") || board[2][1].equals("O")) && (board[2][2].equals("X") || board[2][2].equals("O"))){
                System.out.println("Draw!!");
                result="false";
                break;
            }else
                result="true";
            
            }
        
        //Computer generated game>>>>>>>>>>>>>>>>>>>>>>>>
        
//        }else if( mode.equalsIgnoreCase("Computer mode")){
//            System.out.println("Start game...");
//            
//            for( int i = 0 ; i < 3  ; i++){
//                for ( int j = 0 ; j < 3 ; j++){
//                    board[i][j]="";
//                    System.out.print(" "+board[i][j]+" ");
//                    
//                }
//                System.out.println();
//                System.out.println("--+--+--");
//                
//            }
//            String winner="true";
//            do{
//               System.out.println("player X turn:(row x column)");
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            
//            for( int i = 0 ; i < 3  ; i++){
//                for ( int j = 0 ; j < 3 ; j++){
//                    
//                    board[a][b]="X";
//                    
//                    System.out.print(" "+board[i][j]+" ");
//                }
//                System.out.println();
//                System.out.println("--+--+--");
//                
//            }
//             
//            if(board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2]) && ( board[0][0].equals("X") || board[0][0].equals("O"))){
//                System.out.println("player "+board[0][0]+" win...");
//                winner="false";
//                break;
//            }else if(board[0][0].equals(board[0][1]) && board[0][0].equals(board[0][2]) && ( board[0][0].equals("X") || board[0][0].equals("O"))){
//                System.out.println("player "+board[0][0]+" win...");
//                winner="false";
//                break;
//            }else if(board[1][0].equals(board[1][1]) && board[1][0].equals(board[1][2]) && ( board[1][0].equals("X") || board[2][0].equals("O"))){
//                System.out.println("player "+board[1][0]+" win...");
//                winner="false";
//                break;
//            }else if(board[2][0].equals(board[2][1]) && board[2][0].equals(board[2][2]) && ( board[2][0].equals("X") || board[2][0].equals("O"))){
//                System.out.println("player "+board[2][0]+" win...");
//                winner="false";
//                break;
//            }else if(board[0][0].equals(board[1][0]) && board[0][0].equals(board[2][0]) && ( board[0][0].equals("X") || board[0][0].equals("O"))){
//                System.out.println("player "+board[0][0]+" win...");
//                winner="false";
//                break;
//            }else if(board[0][1].equals(board[1][1]) && board[0][1].equals(board[2][1]) && ( board[0][1].equals("X") || board[0][1].equals("O"))){
//                System.out.println("player "+board[0][1]+" win...");
//                winner="false";
//                break;
//            }else if(board[0][2].equals(board[1][2]) && board[0][2].equals(board[2][2]) && ( board[0][2].equals("X") || board[0][2].equals("O"))){
//                System.out.println("player "+board[0][2]+" win...");
//                winner="false";
//                break;
//            }else if(board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0]) && ( board[0][2].equals("X") || board[0][2].equals("O"))){
//                System.out.println("player "+board[0][2]+" win...");
//                winner="false";
//                break;
//            }
//            else{
//                winner="true";
//                
//            }
//            if((a==1 && b==1)){
//                board[0][0]="0";
//                
//            }else if((a==0 && b==0)){
//                board[2][2]="0";
//                
//            }else if(a==0 && b==2){
//                board[2][0]="0";
//                
//            }else if(a==2 && b==0){
//                board[0][2]="0";
//                
//            }else if(a==1 && b==0){
//                
//            }
//            
//            }while(winner.equals("true"));
        }
        
    }
}


