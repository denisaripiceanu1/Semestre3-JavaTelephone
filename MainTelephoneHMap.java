
public class MainTelephoneHMap {
    public static void main(String[] args) {
        TelephoneHMap telephone = new TelephoneHMap();

        String saisie4 = "44433355556666***";
        String message4 = telephone.decoderSaisieSMS(saisie4);
        System.out.println("Saisie: " + saisie4);
        System.out.println("Message: " + message4);

        String saisie5 = "2222666633444466644";
        String message5 = telephone.decoderSaisieSMS(saisie5);
        System.out.println("Saisie: " + saisie5);
        System.out.println("Message: " + message5);
        
        String saisie1 = "6699990066622663330044447777700***00***00***";
        String message1 = telephone.decoderSaisieSMS(saisie1);
        System.out.println("Saisie: " + saisie1);
        System.out.println("Message: " + message1);

        String saisie2 = "44445555003333224444880022233322888**";
        String message2 = telephone.decoderSaisieSMS(saisie2);
        System.out.println("Saisie: " + saisie2);
        System.out.println("Message: " + message2);
        

    }

    
    
}
