public class GenThree {
    public static void main(String[] args){
        int low = Integer.parseInt(args[0]);
        int high = Integer.parseInt(args[1]);

        int a = (int)((Math.random()*(high-low))+low);
        int b = (int)((Math.random()*(high-low))+low);
        int c = (int)((Math.random()*(high-low))+low);
        int min = (int)Math.min(c, Math.min(a, b));

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("The minimal generated number was " + min);
    }
}
