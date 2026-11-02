public class Ex02 {
    public static String getAngryDog(int nbr) {
        var response = "";
        for (int i = 0; i < nbr; i++) {
            response += "woof";
        }
        response += "\n";
        return response;
    }
}
