public class INCREMENT 
// {
//     public static void main(String[] args) {
//       int a = 5;
//       int b = ++a + ++a;
//       System.out.println(a);
//       System.out.println(b);
//     }
// }

{
    public static void main(String[] args){
        int a  = 5;
        int b = ++a + ++a + --a + --a + a++ + a++ + ++a + --a + a-- + a++;
        System.out.println(a);
        System.out.println(b);
    }

        
}