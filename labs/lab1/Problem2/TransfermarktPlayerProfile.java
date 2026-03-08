package labs.lab1.Problem2;

import java.time.LocalDate;
import java.time.Period;

public class TransfermarktPlayerProfile {

    public static final int MIN_HEIGHT = 140;
    public static final int MAX_HEIGHT = 220;

    private static int profilesCreated = 0;

    private final int playerId;
    private final LocalDate createdAt;

    private String name;
    private String club;
    private String country;
    private String league;
    private Position position;

    private int heightCm;
    private int weightKg;

    private LocalDate birthDate;
    private int gamesPlayed;
    private double marketValue;

    private String handsome;

    {
        profilesCreated++;
    }

    public TransfermarktPlayerProfile(int playerId) {
        this(playerId, "Unknown", Position.MIDFIELDER);
    }

    public TransfermarktPlayerProfile(int playerId, String name, Position position) {
        this.playerId = playerId;
        this.createdAt = LocalDate.now();

        this.name = name;
        this.position = position;
    }

   
    public void updateMarketValue(double value) {
        this.marketValue = value;
    }

    public void updateMarketValue(double value, int newGamesPlayed) {
        this.marketValue = value;
        this.gamesPlayed += newGamesPlayed;
    }

    public int getAge() {
        if (birthDate == null)
            return 0;
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

   
    public int getPlayerId() {
        return playerId;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }


    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public void setHeightCm(int heightCm) {
        if (heightCm < MIN_HEIGHT || heightCm > MAX_HEIGHT)
            throw new IllegalArgumentException("Invalid height");
        this.heightCm = heightCm;
    }

    public void setWeightKg(int weightKg) {
        this.weightKg = weightKg;
    }

    public void setHandsome(String handsome) {
        this.handsome = handsome;
    }

    public static int getProfilesCreated() {
        return profilesCreated;
    }

    @Override
    public String toString() {
        return name + " | " + position +
                " | age: " + getAge() +
                " | games: " + gamesPlayed +
                " | Price:" + marketValue + "M" +
                " | height: " + heightCm +
                "| weight: " + weightKg +
                " | handsome: " + handsome +
                "| CLub: " + club +
                " | Country: " + country +
                " | Leage: " + league

        ;
    }
}
