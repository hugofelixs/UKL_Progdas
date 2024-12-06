import java.util.Random;
import java.util.Scanner;

public class Sedang {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Selamat Datang di Quizzier");
        System.out.println("Dipastikan Quiz ini sesuai dengan level kemampuan anda.\n");

        while (true) {
            // angka acak
            int pertama = r.nextInt(100) + 1;
            int kedua = r.nextInt(100) + 1;
            int rumus = r.nextInt(3);

            String simbolRumus = "";
            int correctAnswer = 0;

            // menentukan rumus
            if (rumus == 0) {
                simbolRumus = "*";
                correctAnswer = pertama * kedua;
            } else if (rumus == 1) {
                simbolRumus = "/";
                correctAnswer = pertama / kedua;
                pertama = correctAnswer * kedua; // agar bilangan tetap bulat
            } else {
                simbolRumus = "%";
                correctAnswer = pertama % kedua;
            }

            System.out.println("Berapa hasil dari " + pertama + simbolRumus + kedua);
            System.out.print("Input jawaban anda : ");
            String jawaban = s.nextLine();

            if (jawaban.equalsIgnoreCase("exit")) {
                System.out.println("Terimakasih telah bermain Quizzier!!");
                break;
            }

            try {
                int userAnswer = Integer.parseInt(jawaban);
                if (userAnswer == correctAnswer) {
                    System.out.println("Jawaban Anda benar!\n");
                } else {
                    System.out.println("Jawaban anda salah, Jawaban yang benar adalah: " + correctAnswer + "\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Silahkan mulai ulang game.");
                break;
            }

        }
        s.close();
    }
}