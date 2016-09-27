package hw;
import java.util.Scanner;
/*
 * 假設銅板有1元、5元、50元共三種，媽媽請小明去菜市場買水果，給了小明N元，且媽媽交待，要老闆找小明的零錢的數目要最少，
 * 而小明到了水果攤買了a1顆蘋果，a2顆柳丁，及a3顆桃子，1顆蘋果15元，1顆柳丁20元，1顆桃子30元，
 * 請問老問需找多少個1元、5元、50元，其銅板數目最少。(先輸入媽媽給小明多少錢，N，接著輸入a1, a2, a3 ， 
 * 在此n, a1, a2, a3為整數，且a1*15+ a2*20+ a3*30小於或等於N。列出共找小明多少個1元，5元及50元，
 * 若帶的錢不夠買水果，則顯示”0”)
 */
public class hw01_104021074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("媽媽給了小明多少錢:");
		int x= scn.nextInt();
		System.out.print("小明要買幾顆蘋果:");
		int a1= scn.nextInt();
		System.out.print("小明要買幾顆柳丁:");
		int a2= scn.nextInt();
		System.out.print("小明要買幾顆桃子:");
		int a3= scn.nextInt();
		int  y = (a1*15)+(a2*20)+(a3*30);
		if (y<=x){
			int z= x-y;
			//System.out.println("z="+z);
			int z1= z/50;
			//System.out.println("z1="+z1);
			int z2= (z-(50*z1))/5;
			//System.out.println("z2="+z2);
			int z3= ((z-((50*z1)+(5*z2)))/1);
			//System.out.println("z3="+z3);
			System.out.println("找錢總共為"+z+" \t"+"50元銅板有"+z1+"個"+"\t "+"5元銅板有"+z2+"個"+"\t "+"1元銅板有"+z3+"個");
		}else{
			System.out.println("小明的錢不夠RRRR（╯‵□′）╯︵┴─┴");
		}
	}

}
