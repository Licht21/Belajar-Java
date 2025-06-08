public class SwitchStatement {
    public static void main(String[] args) {
//        Switch is conditional statement where only can compare with ==
        char nilai = 'D';
        String ucapan = "";

        switch (nilai) {
            case 'A' :
                System.out.println("Wow, Kerja Bagus");
                break;
            case 'B' :
            case 'C' :
                System.out.println("Kerja Bagus");
                break;
            default:
                System.out.println("blok");
        }

//        In java, there's lambda that can be easier to write switch statement
        switch (nilai) {
            case 'A' -> System.out.println("Wow, Kerja Bagus");
            case 'B' -> System.out.println("Kerja Bagus");
            case 'C' -> System.out.println("Kerja Bagus");
            default -> System.out.println("Blok");
        }

//        In java also, instead of just reassign value to the variable, we can return a value with yield
        System.out.println(ucapan);
        ucapan = switch (nilai) {
            case 'A' :
                yield "Wow, Kerja Bagus";
            case 'B' :
                yield "Kerja Bagus";
            case 'C' :
                yield "Kerja Bagus";
            default :
                yield "Blok";
        };
        System.out.println(ucapan);
    }
}
