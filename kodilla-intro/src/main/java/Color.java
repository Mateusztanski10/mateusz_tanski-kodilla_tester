import java.util.Scanner;

public class Color {
        public static String getColor() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Select color: (Y = Yellow, B = Black, G = Grey, W = White");
                String color = scanner.nextLine();
                switch (color) {
                    case "Y": return "YELLOW";
                    case "B": return "BLACK";
                    case "G": return "GREY";
                    case "W": return "WHITE";
                }
            }
        }



    public static void main(String[] args) {
        Color2.color2();
    }
}
