package labs.lab1.Problem2;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        TransfermarktPlayerProfile player = new TransfermarktPlayerProfile(19, "Alisher", Position.MIDFIELDER);

        player.setClub("FC KBTU");
        player.setCountry("KAZAKHSTAN");
        player.setLeague("Kazakh - Premier League");
        player.setBirthDate(LocalDate.of(2006, 11, 14));

        player.setHeightCm(177);
        player.setWeightKg(76);
        player.setHandsome("YES");

        player.updateMarketValue(1);
        player.updateMarketValue(1.5, 5);

        
        TransfermarktPlayerProfile player1 = new TransfermarktPlayerProfile(20, "Nursultan", Position.MIDFIELDER);

        player1.setClub("FC KBTU");
        player1.setCountry("KAZAKHSTAN");
        player1.setLeague("Kazakh - Premier League");
        player1.setBirthDate(LocalDate.of(2006, 12, 17));

        player1.setHeightCm(175);
        player1.setWeightKg(60);
        player1.setHandsome("YES");

        player1.updateMarketValue(2);
        player1.updateMarketValue(2.5, 7);

        System.out.println(player);
        System.out.println(player1);

        System.out.println("Profiles created: "
                + TransfermarktPlayerProfile.getProfilesCreated());
    }
}
