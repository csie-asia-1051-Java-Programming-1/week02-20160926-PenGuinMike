package hw;
import java.util.Scanner;
/*
 * 已知男生標準體重＝(身高－80 )*0.7；女生標準體重＝(身高－70)*0.6；試寫一個程式可以計算男生女生的標準體重。
 * (輸入兩個數值，依序代表為身高及性別（1代表男性；2代表女性）)
 */
public class hw02_104021074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		System.out.print("請輸入性別 1(男)/0(女):");
		int x = scn.nextInt();
    		if (x>0 && x<2){
    			System.out.print("請輸入身高:");
    			int y= scn.nextInt();
			float z =(float) ((y-80)*0.7);
			System.out.print("男生的標準體重為:"+z);
		}else if(x<1&&x>-1){
			System.out.print("請輸入身高:");
			int y= scn.nextInt();
			float z=(float) ((y-70)*0.6);
			System.out.print("女生的標準體重為:"+z);
		}else{
			System.out.print("404 Not Found");
		}
	}

}
