package com.github.pabloo99.xmlsoccer.model.xml;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "player",
        "accountInformation"
})
@XmlRootElement(name = "XMLSOCCER.COM")
@Data
public class GetPlayersByTeamResultXML {

    @XmlElement(name = "Player")
    protected List<Player> player;
    @XmlElement(name = "AccountInformation", required = true)
    protected String accountInformation;

    public List<Player> getPlayer() {
        if (player == null) {
            player = new ArrayList<Player>();
        }
        return this.player;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "id",
            "name",
            "height",
            "weight",
            "nationality",
            "position",
            "teamId",
            "playerNumber",
            "dateOfBirth",
            "dateOfSigning",
            "signing"
    })
    @Data
    public static class Player {

        @XmlElement(name = "Id")
        protected Integer id;
        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "Height")
        protected Double height;
        @XmlElement(name = "Weight")
        protected Double weight;
        @XmlElement(name = "Nationality", required = true)
        protected String nationality;
        @XmlElement(name = "Position", required = true)
        protected String position;
        @XmlElement(name = "Team_Id")
        protected Integer teamId;
        @XmlElement(name = "PlayerNumber")
        protected Integer playerNumber;
        @XmlElement(name = "DateOfBirth", required = true)
        @XmlSchemaType(name = "dateTime")
        protected Date dateOfBirth;
        @XmlElement(name = "DateOfSigning", required = true)
        @XmlSchemaType(name = "dateTime")
        protected Date dateOfSigning;
        @XmlElement(name = "Signing", required = true)
        protected String signing;
    }
}
