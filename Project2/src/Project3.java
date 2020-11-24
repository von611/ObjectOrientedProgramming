import java.util.Scanner;
public class Project3 {
	public static void main(String[] args) {
		boolean acc;
		int arr[] = {5658845,8080152,1005231,4520125,4562555,6545231,7895122,5552012,3852085,
				8777541,5050552,7576651,8451277,7825877,7881200,1302850,1250255,4581002};
		System.out.println("Enter account number: ");
		Scanner reader = new Scanner(System.in);
		int number = Integer.parseInt(reader.nextLine());
		acc = true;
		acc = search(arr, number);
		if(acc) {
			System.out.println("found");
		} else {
			System.out.println("not found");
		}
	}
	public static boolean search(int [] arr, int n) {
		boolean acc = true;
		int initial;
		
		initial = 0;
		while(acc && initial < arr.length - 1) {
			if(arr[initial] == n) {
				return acc;
			} else {
				initial ++;
			}
		}
		return false;
	}
}
