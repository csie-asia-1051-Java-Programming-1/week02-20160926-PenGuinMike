package ex;
import java.util.Scanner;
/*
 * Topic: 電話公司的計費方式是 600分鐘以下每分鐘0.5元；
 * 	600~1200分鐘電話費以9折計算；1200分鐘以上電話費以79折計算，
 *  讓使用者輸入單月使用分時間(分鐘)，算出電話費(元)
 * Date: 2016/09/26
 * Author: 104021074 楊永聖
 */

public class ex01_104021074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		float mon=0.5f;
		System.out.print("請輸入單月使用時間:");
		int n= scn.nextInt();
		if(n<600){
			float pr=mon*n;
			System.out.print("電話費="+pr);
		}else{
			if(n>=600 && n<1200){
				float pr=(mon*n)*0.9f;
				System.out.print("電話費="+pr);
			}else{
					float pr=(mon*n)*0.79f;
					System.out.print("電話費="+pr);
				}
			}
		}
		
	}


