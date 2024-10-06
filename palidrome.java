 class Palidrome{
    public static void main(String[] args) {
        String real_string = "SDF";
        String reverse_string = "";

        for(int i = real_string.length()-1; i>=0;i--)
        {
            reverse_string = reverse_string+real_string.charAt(i);
        }
        if(real_string.compareTo(reverse_string)==0)
        {
            System.out.println("STRING IS PALIDROME");
        }
        else{
            System.out.println("STRING IS NOT PALIDROME");
        }
    }
}