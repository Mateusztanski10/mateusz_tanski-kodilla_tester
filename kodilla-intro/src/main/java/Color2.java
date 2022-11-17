public class Color2 {
    public static String color2() {
        String userSelected = Color.getColor();
        switch (userSelected) {
            case "Y":
                return "YELLOW";
            case "B":
                return "BLACK";
            case "G":
                return "GREY";
            case "W":
                return "WHITE";
            default: return "Wrong letter";
        }
    }
}

