// Alphabet pattern
public class AlphabetPattern{
    public static void main(String[] args) {
        for(int i=1;i<=4;i++) {

            if (i == 1) {
                for (char j = 'a'; j <= 'd'; j++) {
                    System.out.print((char) j);
                }
            } else if (i == 2) {
                for (char j = 'e'; j <= 'h'; j++) {
                    System.out.print((char) j);
                }
            } else if (i == 3) {
                for (char j = 'i'; j <= 'l'; j++) {
                    System.out.print((char) j);
                }
            } else if (i == 4) {
                for (char j = 'm'; j <= 'p'; j++) {
                    System.out.print((char) j);
                }
            }

            System.out.println();
        }
        }
    }
