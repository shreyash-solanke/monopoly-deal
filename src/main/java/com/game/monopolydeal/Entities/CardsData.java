package com.game.monopolydeal.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "cards_data")
public class CardsData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CardID;

    private String CardName;

    private String CardType;

    private Integer TotalCount;

    private Integer needed_for_set;

    private Integer MonetoryValue_Millions;

    private String CardsDescription;

    // getters and setters...
    public Integer getCardID() {
        return CardID;
    }

    public void setCardID(Integer cardID) {
        CardID = cardID;
    }

    public String getCardName() {
        return CardName;
    }

    public void setCardName(String cardName) {
        CardName = cardName;
    }

    public String getCardType() {
        return CardType;
    }

    public void setCardType(String cardType) {
        CardType = cardType;
    }

    public Integer getTotalCount() {
        return TotalCount;
    }

    public void setTotalCount(Integer totalCount) {
        TotalCount = totalCount;
    }

    public Integer getNeeded_for_set() {
        return needed_for_set;
    }

    public void setNeeded_for_set(Integer needed_for_set) {
        this.needed_for_set = needed_for_set;
    }

    public Integer getMonetoryValue_Millions() {
        return MonetoryValue_Millions;
    }

    public void setMonetoryValue_Millions(Integer monetoryValue_Millions) {
        MonetoryValue_Millions = monetoryValue_Millions;
    }

    public String getCardsDescription() {
        return CardsDescription;
    }

    public void setCardsDescription(String cardsDescription) {
        CardsDescription = cardsDescription;
    }
}