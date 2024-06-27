public class ArrTest {
  public static void main( String args[] ) {
    char[] list = {'m', 'e', 'y','f',};

    int index = -1;

    for (int i = 0; (i < list.length); i++) {
        if (list[i] == 'e') {
            index = i;
        }
    }

    System.out.println(list[index]);
  }
}