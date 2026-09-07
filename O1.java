public class O1 {
    public static void main() {
        //Tester funksjonen innenfor de forskjelige trinnene
        System.out.println("100000: " + BeregnTrinnSkatt(100000));
        System.out.println("250000: " + BeregnTrinnSkatt(250000));
        System.out.println("500000: " + BeregnTrinnSkatt(500000));
        System.out.println("750000: " + BeregnTrinnSkatt(750000));
        System.out.println("1000000: " + BeregnTrinnSkatt(1000000));
        System.out.println("1500000: " + BeregnTrinnSkatt(1500000));
    }


    public static double BeregnTrinnSkatt(double bruttoinntekt){
        if(bruttoinntekt <= 226100)
            return 0;
        if(bruttoinntekt <= 318300)
            return bruttoinntekt * 0.017;
        if(bruttoinntekt <= 725050)
            return bruttoinntekt * 0.04;
        if(bruttoinntekt <= 980100)
            return bruttoinntekt * 0.137;
        if(bruttoinntekt <= 1467200)
            return bruttoinntekt * 0.168;
        return bruttoinntekt * 0.178;
    }
}
