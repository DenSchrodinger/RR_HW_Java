package HW10;
public class Codewars14 {
        public static String updateLight(String current) {
            return switch (current) {
                case "green" -> "yellow";
                case "yellow" -> "red";
                case "red" -> "green";
                default -> throw new IllegalArgumentException("Invalid traffic light color: " + current);
            };
    }
}
