package Databases;

import java.util.ArrayList;

/**
 * Created by AndrewMiller on 11/9/15.
 */
public class BackgroundData extends Data {
    ArrayList<Data> bd = new ArrayList<Data>();

    Data acolytebackground = new Data();
    public void setAcolytebackground(Data acolytebackground){
        acolytebackground.abilName = "Acolyte Background Features";
        //Skills alphabetically: Acrobatics, Animal Handling, Arcana, Athletics, Deception, History, Insight, Intimidation,Investigation, Medicine, Nature, Perception, Performance, Persuasion, Religion, Sleight of Hand, Stealth, Survival.
        //                  {0    ,1    ,2    ,3    ,4    ,5    ,6    ,7    ,8    ,9    ,10   ,11   ,12   ,13   ,14   ,15   ,16   ,17  }
        boolean skills[] =  {false,false,false,false,false,true,false,false,false,false,false,false,false,false,true,false,false,false};
        acolytebackground.backgroundSkills = skills;
        acolytebackground.languages = "Two languages of your choice.";
        acolytebackground.startGold = 15;
        acolytebackground.flavor = "You have spent your life in the service of a temple\n" +
                "to a specific god or pantheon of gods. You act as an\n" +
                "intermediary between the realm of the holy and the\n" +
                "mortal world, performing sacred rites and offering\n" +
                "sacrifices in order to conduct worshipers into the\n" +
                "presence of the divine. You are not necessarily a cleric-performing sacred rites is not the same thing as channeling divine power. 6\n" +
                "Choose a god, a pantheon of gods, or some other quasi-divine being from among those listed in appendix B or those specified by your DM, and work with your DM to detail the nature of your religious service.\n" +
                "Were you a lesser functionary in a temple, raised from childhood to assist the priests in the sacred rites? Or were you a high priest who suddenly experienced a call to serve your god in a different way? Perhaps you were the leader of a small cult outside of any established temple structure, or even an occult group that served a fiendish master that you now deny.";
    }

    Data acolyteShelterOfTheFaithful = new Data();
    public void setAcolyteShelterOfTheFaithful(Data acolyteShelterOfTheFaithful){
        acolyteShelterOfTheFaithful.abilName = "Shelter Of the Faithful";
        acolyteShelterOfTheFaithful.dlevel = 1;
        acolyteShelterOfTheFaithful.flavor = "As an acolyte, you command the respect of those who share your faith, and you can perform the religious ceremonies of your deity. You and your adventuring companions can expect to receive free healing and care at a temple, shrine, or other established presence of your faith, though you must provide any material components needed for spells. Those who share\n" +
                "your religion will support you (but only you) at a modest lifestyle.\n" +
                "You might also have ties to a specific temple dedicated to your chosen deity or pantheon, and you have a residence there. This could be the temple where you used to serve, if you remain on good terms with it, or a temple where you have found a new home. While near your temple, you can call upon the priests for assistance, provided the assistance you ask for is not hazardous and you remain in good standing with your temple.";
    }

    Data charlatanFeatures = new Data();
    public void setCharlatanFeatures(Data charlatanFeatures){
        charlatanFeatures.abilName = "Charlatan Features";
        //Skills alphabetically: Acrobatics, Animal Handling, Arcana, Athletics, Deception, History, Insight, Intimidation,Investigation, Medicine, Nature, Perception, Performance, Persuasion, Religion, Sleight of Hand, Stealth, Survival.
        //                  {0    ,1    ,2    ,3    ,4    ,5    ,6    ,7    ,8    ,9    ,10   ,11   ,12   ,13   ,14   ,15   ,16   ,17  }
        boolean skills[] =  {false,false,false,false,true,false,false,false,false,false,false,false,false,false,false,true,false,false};
        charlatanFeatures.backgroundSkills = skills;
        charlatanFeatures.toolProf = "Disguise Kit, Foergery Kit";
        charlatanFeatures.startGold = 15;
        charlatanFeatures.flavor = "You have always had a way with people. You know\n" +
                "what makes them tick, you can tease out their hearts' desires after a few minutes of conversation, and with a few leading questions you can read them like they were children's books. It’s a useful talent, and one that you’re perfectly willing to use for your advantage.\n" +
                "You know what people want and you deliver, or rather, you promise to deliver. Common sense should steer people away from things that sound too good to be true, but common sense seems to be in short supply when you’re around. The bottle of pink-colored liquid will surely cure that unseemly rash, this ointment—nothing more than a bit of fat with a sprinkle of silver dust—can restore youth and vigor, and there’s a bridge in the city thatjust happens to be for sale. These marvels sound implausible, but you make them sound like the real deal.\n";
    }

    Data charlatanFalseID = new Data();
    public void setCharlatanFalseID(Data charlatanFalseID){
        charlatanFalseID.abilName = "False Identity";
        charlatanFalseID.dlevel = 1;
        charlatanFalseID.flavor = "You have created a second identity that includes documentation, established acquaintances, and disguises that allow you to assume that persona. Additionally, you can forge documents including official papers and personal letters, as long as you have seen an example of the kind of document or the handwriting you are trying to copy.";
    }

    Data criminalFeatures = new Data();
    public void setCriminalFeatures(Data criminalFeatures) {
        criminalFeatures.abilName = "Criminal Features";
        //Skills alphabetically: Acrobatics, Animal Handling, Arcana, Athletics, Deception, History, Insight, Intimidation,Investigation, Medicine, Nature, Perception, Performance, Persuasion, Religion, Sleight of Hand, Stealth, Survival.
        //                  {0    ,1    ,2    ,3    ,4    ,5    ,6    ,7    ,8    ,9    ,10   ,11   ,12   ,13   ,14   ,15   ,16   ,17  }
        boolean skills[] = {false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, true, false};
        criminalFeatures.backgroundSkills = skills;
        criminalFeatures.toolProf = "One type of gaming set, thieves' tools";
        criminalFeatures.startGold = 15;
        criminalFeatures.flavor = "You are an experienced criminal with a history of breaking the law. You have spent a lot of time among other criminals and still have contacts within the criminal underworld. You’re far closer than most people to the world of murder, theft, and violence that pervades the underbelly of civilization, and you have survived up to this point by flouting the rules and regulations of society.";
    }

    Data criminalContact = new Data();
    public void setCriminalContact(Data criminalContact) {
        criminalContact.abilName = "Criminal Contact";
        criminalContact.dlevel = 1;
        criminalContact.flavor = "You have a reliable and trustworthy contact who acts as your liaison to a network of other criminals. You know how to get messages to and from your contact, even\n" +
                "over great distances; specifically, you know the local messengers, corrupt caravan masters, and seedy sailors who can deliver messages for you.\n";
    }

    Data criminalVariantSpy = new Data();
    public void setCriminalVariantSpy(Data criminalVariantSpy){
        criminalVariantSpy.abilName = "False Identity";
        criminalVariantSpy.dlevel = 1;
        criminalVariantSpy.flavor = "You have created a second identity that includes documentation, established acquaintances, and disguises that allow you to assume that persona. Additionally, you can forge documents including official papers and personal letters, as long as you have seen an example of the kind of document or the handwriting you are trying to copy.";
    }

    Data entertainerFeatures = new Data();
    public void setEntertainerFeatures(Data entertainerFeatures) {
        entertainerFeatures.abilName = "Criminal Features";
        //Skills alphabetically: Acrobatics, Animal Handling, Arcana, Athletics, Deception, History, Insight, Intimidation,Investigation, Medicine, Nature, Perception, Performance, Persuasion, Religion, Sleight of Hand, Stealth, Survival.
        //                 {0   ,1     ,2     ,3     ,4     ,5     ,6     ,7     ,8     ,9     ,10    ,11    ,12    ,13    ,14    ,15    ,16    ,17  }
        boolean skills[] = {true, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false};
        entertainerFeatures.backgroundSkills = skills;
        entertainerFeatures.toolProf = "Disguise Kit, One type of musical instrument";
        entertainerFeatures.startGold = 15;
        entertainerFeatures.flavor = "You are an experienced criminal with a history of breaking the law. You have spent a lot of time among other criminals and still have contacts within the criminal underworld. You’re far closer than most people to the world of murder, theft, and violence that pervades the underbelly of civilization, and you have survived up to this point by flouting the rules and regulations of society.";
    }

    Data entertainerByPopularDemand = new Data();
    public void setEntertainerByPopularDemand(Data entertainerByPopularDemand) {
        entertainerByPopularDemand.abilName = "By Popular Demand";
        entertainerByPopularDemand.dlevel = 1;
        entertainerByPopularDemand.flavor ="You can always find a place to perform, usually in an\n" +
                "inn or tavern but possibly with a circus, at a theater, or even in a noble’s court. At such a place, you receive free lodging and food of a modest or comfortable standard (depending on the quality of the establishment), as\n" +
                "long as you perform each night. In addition, your performance makes you something of a local figure. When strangers recognize you in a town where you have performed, they typically take a liking to you.";
    }

    Data entertainerVariantGlad = new Data();
    public void setEntertainerVariantGlad(Data entertainerVariantGlad){
        entertainerVariantGlad.abilName = "Variant: Gladiator";
        entertainerVariantGlad.dlevel = 1;
        entertainerVariantGlad.flavor = "A gladiator is as much an entertainer as any minstrel\n" +
                "or circus performer, trained to make the arts of combat into a spectacle the crowd can enjoy. This kind of\n" +
                "flashy combat is your entertainer routine, though you might also have some skills as a tumbler or actor.\n" +
                "Using your By Popular Demand feature, you can find a place to perform in any place that features combat for entertainment—perhaps a gladiatorial arena or secret pit fighting club. You can replace the musical instrument in your equipment package with an inexpensive but unusual weapon, such as a trident or net.\n";
    }

    Data folkHeroFeatures = new Data();
    public void setFolkHeroFeatures(Data folkHeroFeatures) {
        folkHeroFeatures.abilName = "Folk Hero Features";
        //Skills alphabetically: Acrobatics, Animal Handling, Arcana, Athletics, Deception, History, Insight, Intimidation,Investigation, Medicine, Nature, Perception, Performance, Persuasion, Religion, Sleight of Hand, Stealth, Survival.
        //                 {0    ,1     ,2     ,3     ,4     ,5     ,6     ,7     ,8     ,9     ,10    ,11    ,12    ,13    ,14    ,15    ,16    ,17  }
        boolean skills[] = {false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true};
        folkHeroFeatures.backgroundSkills = skills;
        folkHeroFeatures.toolProf = "One type of artisan's tools. Vehicles(land).";
        folkHeroFeatures.startGold = 10;
        folkHeroFeatures.flavor = "ou previously pursued a simple profession among\n" +
                "the peasantry, perhaps as a farmer, miner, servant, shepherd, woodcutter, or gravedigger. But something happened that set you on a different path and marked you for greater things. Choose or randomly determine a defining event that marked you as a hero of the people.";
    }

    Data folkHeroRusticHos = new Data();
    public void setFolkHeroRusticHos(Data folkHeroRusticHos){
        folkHeroRusticHos.abilName = "Rustic Hospitality";
        folkHeroRusticHos.dlevel = 1;
        folkHeroRusticHos.flavor = "Since you come from the ranks of the common folk, you fit in among them with ease. You can find a place to hide, rest, or recuperate among other commoners, unless you have shown yourself to be a danger to them. They will shield you from the law or anyone else searching for you, though they will not risk\n" +
                "their lives for you.";
    }

    Data guildArtisanFeatures = new Data();
    public void setGuildArtisanFeatures(Data guildArtisanFeatures) {
        guildArtisanFeatures.abilName = "Guild Artisan Features";
        //Skills alphabetically: Acrobatics, Animal Handling, Arcana, Athletics, Deception, History, Insight, Intimidation,Investigation, Medicine, Nature, Perception, Performance, Persuasion, Religion, Sleight of Hand, Stealth, Survival.
        //                 {0    ,1     ,2     ,3     ,4     ,5     ,6     ,7     ,8     ,9     ,10    ,11    ,12    ,13    ,14    ,15    ,16    ,17  }
        boolean skills[] = {false, false, false, false, false, false, true, false, false, false, false, false, false, true, false, false, false, false};
        guildArtisanFeatures.backgroundSkills = skills;
        guildArtisanFeatures.toolProf = "One type of artisan's tools.";
        guildArtisanFeatures.languages = "One language of your choice.";
        guildArtisanFeatures.startGold = 15;
        guildArtisanFeatures.flavor ="You are a member of an artisan’s guild, skilled in\n" +
                "a particular field and closely associated with other artisans. You are a well-established part of the mercantile world, freed by talent and wealth from the constraints of a feudal social order. You learned your skills as an apprentice to a master artisan, under the sponsorship of your guild, until you became a master in your own right.";
    }

    Data guildArtisanGuildBusiness = new Data();
    public void setGuildArtisanGuildBusiness(Data guildArtisanGuildBusiness) {
        guildArtisanGuildBusiness.abilName = "Guild Business";
        guildArtisanGuildBusiness.dlevel = 1;
        guildArtisanGuildBusiness.flavor = "Guilds are generally found in cities large enough to support several artisans practicing the same trade. However, your guild might instead be a loose network of artisans who each work in a different village within a larger realm. Work with your DM to determine the nature of your guild. As a member of your guild, you know the skills needed to create finished items from raw materials (reflected in your proficiency with a certain kind of artisan’s tools),\n" +
                "as well as the principles of trade and good business practices. The question now is whether you abandon your trade for adventure, or take on the extra effort to weave adventuring and trade together. ";
    }

    Data guildArtisanGuildMember = new Data();
    public void setGuildArtisanGuildMember(Data guildArtisanGuildMember) {
        guildArtisanGuildMember.abilName = "Guild Member";
        guildArtisanGuildMember.dlevel = 1;
        guildArtisanGuildMember.flavor = "As an established and respected member of a guild, you can rely on certain benefits that membership provides. Your fellow guild members will provide you with lodging and food if necessary, and pay for your funeral if needed. In some cities and towns, a guildhall offers a central place to meet other members of your profession, which can be a good place to meet potential patrons, allies, or hirelings.\n" +
                "Guilds often wield tremendous political power. If\n" +
                "you are accused of a crime, your guild will support you\n" +
                "if a good case can be made for your innocence or the crime is justifiable. You can also gain access to powerful political figures through the guild, if you are a member in good standing. Such connections might require the donation of money or magic items to the guild’s coffers.\n" +
                "You must pay dues of 5 gp per month to the guild. If you miss payments, you must make up back dues to remain in the guild’s good graces.";
    }

    Data guildArtisanVariantMerchant = new Data();
    public void setGuildArtisanVariantMerchant(Data guildArtisanVariantMerchant) {
        guildArtisanVariantMerchant.abilName = "Guild Merchant";
        guildArtisanVariantMerchant.dlevel = 1;
        guildArtisanVariantMerchant.flavor = "Instead of an artisans’ guild, you might belong to a\n" +
                "guild of traders, caravan masters, or shopkeepers. You don’t craft items yourself but earn a living by buying\n" +
                "and selling the works of others (or the raw materials artisans need to practice their craft). Your guild might be a large merchant consortium (or family) with interests across the region. Perhaps you transported goods from one place to another, by ship, wagon, or caravan, or bought them from traveling traders and sold them in your own little shop. In some ways, the traveling merchant’s life lends itself to adventure far more than the life of an artisan.\n" +
                "Rather than proficiency with artisan’s tools, you might be proficient with navigator’s tools or an additional language. And instead of artisan’s tools, you can start with a mule and a cart.";
    }

    Data hermitFeatures = new Data();
    public void setHermitFeatures(Data hermitFeatures) {
        hermitFeatures.abilName = "Hermit Features";
        //Skills alphabetically: Acrobatics, Animal Handling, Arcana, Athletics, Deception, History, Insight, Intimidation,Investigation, Medicine, Nature, Perception, Performance, Persuasion, Religion, Sleight of Hand, Stealth, Survival.
        //                 {0    ,1     ,2     ,3     ,4     ,5     ,6     ,7     ,8     ,9     ,10    ,11    ,12    ,13    ,14    ,15    ,16    ,17  }
        boolean skills[] = {false, false, false, false, false, false, false, false, false, true, false, false, false, false, true, false, false, false};
        hermitFeatures.backgroundSkills = skills;
        hermitFeatures.toolProf = "Herbalism Kit";
        hermitFeatures.languages = "One language of your choice.";
        hermitFeatures.startGold = 5;
        hermitFeatures.flavor = "You lived in seclusion—either in a sheltered community such as a monastery, or entirely alone—for a formative part of your life. In your time apart from the clamor of society, you found quiet, solitude, and perhaps some of the answers you were looking for.";
    }

    Data hermitLife = new Data();
    public void setHermitLife(Data hermitLife) {
        hermitLife.abilName = "Life of Seclusion";
        hermitLife.dlevel = 1;
        hermitLife.flavor = "What was the reason for your isolation, and what changed to allow you to end your solitude? You can work with your DM to determine the exact nature of your seclusion, or you can choose or roll on the table below to determine the reason behind your seclusion.";
    }

    Data hermitDiscovery = new Data();
    public void setHermitDiscovery(Data hermitDiscovery) {
        hermitDiscovery.abilName = "Discovery";
        hermitDiscovery.dlevel = 1;
        hermitDiscovery.flavor = "The quiet seclusion of your extended hermitage gave you\n" +
                "access to a unique and powerful discovery. The exact nature of this revelation depends on the nature of your seclusion. It might be a great truth about the cosmos, the deities, the powerful beings of the outer planes, or the forces of nature. It could be a site that no one else has ever seen. You might have uncovered a fact that has long been forgotten, or unearthed some relic of the past that could rewrite history. It might be information that would be damaging to the people who or consigned you to exile, and hence the reason for your return to society.\n" +
                "Work with your DM to determine the details of your discovery and its impact on the campaign.";
    }


    public ArrayList<Data> getBd(){
        //acolyte
        setAcolytebackground(acolytebackground);
        bd.add(acolytebackground);

        setAcolyteShelterOfTheFaithful(acolyteShelterOfTheFaithful);
        bd.add(acolyteShelterOfTheFaithful);

        //Carlatan
        setCharlatanFeatures(charlatanFeatures);
        bd.add(charlatanFeatures);

        setCharlatanFalseID(charlatanFalseID);
        bd.add(charlatanFalseID);

        //Criminal
        setCriminalFeatures(criminalFeatures);
        bd.add(criminalFeatures);

        setCriminalContact(criminalContact);
        bd.add(criminalContact);

        setCriminalVariantSpy(criminalVariantSpy);
        bd.add(criminalVariantSpy);

        //entertainer
        setEntertainerFeatures(entertainerFeatures);
        bd.add(entertainerFeatures);

        setEntertainerByPopularDemand(entertainerByPopularDemand);
        bd.add(entertainerByPopularDemand);

        setEntertainerVariantGlad(entertainerVariantGlad);
        bd.add(entertainerVariantGlad);

        //Folk Hero
        setFolkHeroFeatures(folkHeroFeatures);
        bd.add(folkHeroFeatures);

        setFolkHeroRusticHos(folkHeroRusticHos);
        bd.add(folkHeroRusticHos);

        //Guild Artisan
        setGuildArtisanFeatures(guildArtisanFeatures);
        bd.add(guildArtisanFeatures);

        setGuildArtisanGuildBusiness(guildArtisanGuildBusiness);
        bd.add(guildArtisanGuildBusiness);

        setGuildArtisanGuildMember(guildArtisanGuildMember);
        bd.add(guildArtisanGuildMember);

        setGuildArtisanVariantMerchant(guildArtisanVariantMerchant);
        bd.add(guildArtisanVariantMerchant);

        //Hermit
        setHermitFeatures(hermitFeatures);
        bd.add(hermitFeatures);

        setHermitLife(hermitLife);
        bd.add(hermitLife);

        setHermitDiscovery(hermitDiscovery);
        bd.add(hermitDiscovery);

        //Noble



        return bd;
    }





}
