package test;
import java.util.Scanner;
public class Hesap {

	public static void main(String[] args) {
		Scanner hesap = new Scanner(System.in);
		System.out.println("Hoşgeldiniz!");
		System.out.println("Yapmak İstediğiniz İşlemi Seçin = ");
		System.out.println("+ Toplama - Çıkarma / Bölme * Çarpma = ");
		String a = hesap.nextLine();
		System.out.println("İşlem Yapacağınız Sayıları Giriniz =  ");
		int b,c,d;
		b = hesap.nextInt();
		c = hesap.nextInt();
		switch (a) {
		case "+":
			d = b+c;
			System.out.println("İşlem Sonucu = " + d);
			break;
		case "-":
			d = b-c;
			System.out.println("İşlem Sonucu = " + d);
			break;
		case "/":
			d = b/c;
			System.out.println("İşlem Sonucu = " + d);
			break;
		case "*":
			d = b*c;
			System.out.println("İşlem Sonucu = " + d);
			break;
		default:
			System.out.println("Hatalı İşlem Girdiniz");
			break;
		}

	}

}
