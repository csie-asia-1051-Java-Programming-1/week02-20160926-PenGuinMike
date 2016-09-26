package ex;
import java.util.Scanner;
/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 104021074 楊永聖
 */

public class ex03_104021074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		System.out.print("請輸入停車分鐘數:");
		int m = scn.nextInt();
		int x=(int) Math.floor(m/30);
		//System.out.print(x);
		if(x<=1){
			System.out.print("停車時間未超過30分鐘,不需繳費!!!");
		}else{
			if(x<4){
			int mon = x*30;
			System.out.print("停車費總共為:"+mon);
			}else{
				if(x>=4&&x<8){
					int mon = x*40;
					System.out.print("停車費總共為:"+mon);
				}else{
					if(x>=8){
					int mon = x*60;
					System.out.print("停車費總共為:"+mon);
					}
				}
			}
		}
	}

}
