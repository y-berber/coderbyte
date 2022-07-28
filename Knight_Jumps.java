package coderbyte;
import java.util.*; 


class Knight_Jumps {
  public static String KnightJumps(String str) {
    // code goes here  
    String input=str ;
    input=input.replaceAll("[\\W]" , "" );
    String ilkKordinat = input.substring(0,1);
    String ikinciKordinat = input.substring(1,2);
    int ilkSayi = Integer.parseInt(ilkKordinat);
    int ikinciSayi = Integer.parseInt(ikinciKordinat);
    int result = hamleSayici(ilkSayi , ikinciSayi);
    String strResult = String.valueOf(result);
  return strResult;  }

  static int board [][] = new int [8][8] ;
  static int count =  0 ;
  static int x = 4 ;
  static int y = 4 ;

  public static int hamleSayici (int a , int b ){
    count = 0 ; x = a-1 ; y = b-1 ;
    if((x<8 && x>=0)&&(y<8 && y>=0)){

    if((
      ((x-2)>-1)&&((y-1)>-1))
    &&(
      ((x-2)< 8)&&((y-1)< 8))
    )
      {if((board[x][y]==1)&&(board[x-2][y-1]==1)){ count++;} ;} //birinci hamle ihtimali

    if((
      ((x-1)>-1)&&((y-2)>-1))
      &&(
        ((x-1)<8)&&((y-2)<8))
    )
      {if((board[x][y]==1)&&(board[x-1][y-2]==1)){ count++;} ;} //ikinci hamle ihtimali

    if((
      ((x-2)>-1)&&((y+1)>-1))
      &&(
        ((x-2)<8)&&((y+1)<8))
    )
      {if((board[x][y]==1)&&(board[x-2][y+1]==1)){ count++;} ;} //ucuncu hamle ihtimali

    if((
      ((x-1)>-1)&&((y+2)>-1))
      &&(
        ((x-1)<8)&&((y+2)<8))
    )
      {if((board[x][y]==1)&&(board[x-1][y+2]==1)){ count++;} ;} //dorduncu hamle ihtimali

    if((
      ((x+1)>-1)&&((y+2)>-1))
      &&(
        ((x+1)<8)&&((y+2)<8))
    )
      {if((board[x][y]==1)&&(board[x+1][y+2]==1)){ count++;} ;} //besinci hamle ihtimali

    if((
      ((x+2)>-1)&&((y+1)>-1))
      &&(
        ((x+2)<8)&&((y+1)<8))
    )
      {if((board[x][y]==1)&&(board[x+2][y+1]==1)){ count++;} ;} //altinci hamle ihtimali

    if((
      ((x+2)>-1)&&((y-1)>-1))
      &&(
        ((x+2)<8)&&((y-1)<8))
    )
      {if((board[x][y]==1)&&(board[x+2][y-1]==1)){ count++;} ;} //yedinci hamle ihtimali

    if((
      ((x+1)>-1)&&((y-2)>-1))
      &&(
        ((x+1)<8)&&((y-2)<8))
    )
      {if((board[x][y]==1)&&(board[x+1][y-2]==1)){ count++;} ;} //sekizinci hamle ihtimali

   return count ; }else {return 0;}  
  } //hamleSayici kapaması

  public static void main (String[] args) { 
    for(int i =0 ; i<8;i++){for(int j =0;j<8;j++){board[i][j]=1;}} 
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(KnightJumps(s.nextLine())); 
    s.close();
  }

}