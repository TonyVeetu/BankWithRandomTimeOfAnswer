package ru.bk.uteev.helpdata;

public class CardInfo {
    private String numberOfCard;
    private String firstName;
    private String lastName;
    private String nameOfBank;
    private String cardLifeTime;


    public CardInfo(String numberOfCard, String firstName, String lastName, String nameOfBank, String cardLifeTime) {
        this.numberOfCard = numberOfCard;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nameOfBank = nameOfBank;
        this.cardLifeTime = cardLifeTime;
    }

}
