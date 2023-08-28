public class EqualsExample {
  	public static void main(String[] args){
      String palabra1 = "Otorrinolaringólogo";
      String palabra2 = "Taumatawhakatangihangakoauauotamateaturipukakapikimaungahoronukupokaiwhenuakitanatahu";
      String palabra3 = "Taumatawhakatangihangakoauauotamateaturipukakapikimaungahoronukupokaiwhenuakitanatahu";

      System.out.println(palabra1.equals(palabra2));
      System.out.println(palabra2.equals(palabra3));
    }       
}