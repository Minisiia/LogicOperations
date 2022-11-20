public class LogicOperations {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = 15;
        x += y >> x++ * z;// x = 5, y = 10, z = 15
        z = ++x & y * 5; // x = 6, y = 10, z = 2
        y /= x + 5 | z; // x = 6, y = 0, z = 2
        z = x++ & y * 5; // x = 7, y = 0, z = 0
        x = y << x++ ^ z; // x = 0, y = 0, z = 0
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);

    }
}
