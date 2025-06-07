public class DataTypeArray {
    public static void main(String[] args) {
//        Make an array without declaring it's length
        String[][][] members = {
                {
                        {"Muhammad Yusuf", "Aulia"},
                        {"Atha Rizky Putra", "Sinuraya"},
                }
        };

        System.out.println(members);
        System.out.println(members[0]);
        System.out.println(members[0][0][0]);
        System.out.println(members[0][1][0]);


//        Make an Array with declaring it's length
        String[] foods = new String[3];
        foods[0] = "Pho";
        foods[1] = "Ramen";
        foods[2] = "Takoyaki";

        System.out.println(foods[0]);
        System.out.println(foods[1]);
        System.out.println(foods[2]);
    }
}
