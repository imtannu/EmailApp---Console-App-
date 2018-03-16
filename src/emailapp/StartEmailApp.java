package emailapp;
import java.util.Scanner;

public class StartEmailApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Employee's Email you want Generate");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
		email em1 = new email();
		System.out.println("-----------------------------------");
		System.out.println(em1.ShowInfo());
		MenuService menu = new MenuService(em1);
		menu.showmenu();
		
	}
	}
	}
