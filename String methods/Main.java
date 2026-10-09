public class Main{
    public static void main(String[] args) {
        String name = "Unemployment";
        String str = " unemployment ";
        String str2 = "unemployment";
        System.out.println("String Length: "+name.length());
        System.out.println("String uppercase: "+name.toUpperCase());
        System.out.println("String lowercase: "+name.toLowerCase());
        System.out.println("String Char at index 3: "+name.charAt(3));
        System.out.println("Substring from 0 to 3rd index: " +name.substring(0,3));
        System.out.println("Contains yme?: "+name.contains("yme"));
        System.err.println("Remove space: "+str.trim());
        equals(name, str);
        same(name, str2);
        String concat = name + " " + str2;
        System.out.println("Concatenated String: "+concat);
        
    }

    static void equals(String a, String b){
        if(a.equals(b)){
            System.out.println("The strings are equal");
        }
        else{
            System.out.println("The strings arent' equal");
        }
    }

    static void same(String a, String b){
        if(a.equalsIgnoreCase(b)){
            System.out.println("The strings say the same thing");
        }
        else{
            System.out.println("The strings don't say the same thing");
        }
    }

}