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
        acolytebackground.backgroundType = "Acolyte";
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
        acolyteShelterOfTheFaithful.backgroundType = "Acolyte";
        acolyteShelterOfTheFaithful.dlevel = 1;
        acolyteShelterOfTheFaithful.flavor = "As an acolyte, you command the respect of those who share your faith, and you can perform the religious ceremonies of your deity. You and your adventuring companions can expect to receive free healing and care at a temple, shrine, or other established presence of your faith, though you must provide any material components needed for spells. Those who share\n" +
                "your religion will support you (but only you) at a modest lifestyle.\n" +
                "You might also have ties to a specific temple dedicated to your chosen deity or pantheon, and you have a residence there. This could be the temple where you used to serve, if you remain on good terms with it, or a temple where you have found a new home. While near your temple, you can call upon the priests for assistance, provided the assistance you ask for is not hazardous and you remain in good standing with your temple.";
    }

    Data charlatanFeatures = new Data();
    public void setCharlatanFeatures(Data charlatanFeatures){
        charlatanFeatures.abilName = "Charlatan Features";
        charlatanFeatures.backgroundType = "Charlatan";

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
        charlatanFalseID.backgroundType = "Charlatan";

        charlatanFalseID.dlevel = 1;
        charlatanFalseID.flavor = "You have created a second identity that includes documentation, established acquaintances, and disguises that allow you to assume that persona. Additionally, you can forge documents including official papers and personal letters, as long as you have seen an example of the kind of document or the handwriting you are trying to copy.";
    }

    Data criminalFeatures = new Data();
    public void setCriminalFeatures(Data criminalFeatures) {
        criminalFeatures.abilName = "Criminal Features";
        criminalFeatures.backgroundType = "Criminal";
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
        criminalContact.backgroundType = "Criminal";
        criminalContact.dlevel = 1;
        criminalContact.flavor = "You have a reliable and trustworthy contact who acts as your liaison to a network of other criminals. You know how to get messages to and from your contact, even\n" +
                "over great distances; specifically, you know the local messengers, corrupt caravan masters, and seedy sailors who can deliver messages for you.\n";
    }

    Data criminalVariantSpy = new Data();
    public void setCriminalVariantSpy(Data criminalVariantSpy){
        criminalVariantSpy.abilName = "False Identity";
        criminalVariantSpy.backgroundType = "Criminal";
        criminalVariantSpy.dlevel = 1;
        criminalVariantSpy.flavor = "You have created a second identity that includes documentation, established acquaintances, and disguises that allow you to assume that persona. Additionally, you can forge documents including official papers and personal letters, as long as you have seen an example of the kind of document or the handwriting you are trying to copy.";
    }

    Data entertainerFeatures = new Data();
    public void setEntertainerFeatures(Data entertainerFeatures) {
        entertainerFeatures.abilName = "Entertainer Features";
        entertainerFeatures.backgroundType = "Entertainer";
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
        entertainerByPopularDemand.backgroundType = "Entertainer";
        entertainerByPopularDemand.dlevel = 1;
        entertainerByPopularDemand.flavor ="You can always find a place to perform, usually in an\n" +
                "inn or tavern but possibly with a circus, at a theater, or even in a noble’s court. At such a place, you receive free lodging and food of a modest or comfortable standard (depending on the quality of the establishment), as\n" +
                "long as you perform each night. In addition, your performance makes you something of a local figure. When strangers recognize you in a town where you have performed, they typically take a liking to you.";
    }

    Data entertainerVariantGlad = new Data();
    public void setEntertainerVariantGlad(Data entertainerVariantGlad){
        entertainerVariantGlad.abilName = "Variant: Gladiator";
        entertainerVariantGlad.backgroundType = "Entertainer";

        entertainerVariantGlad.dlevel = 1;
        entertainerVariantGlad.flavor = "A gladiator is as much an entertainer as any minstrel\n" +
                "or circus performer, trained to make the arts of combat into a spectacle the crowd can enjoy. This kind of\n" +
                "flashy combat is your entertainer routine, though you might also have some skills as a tumbler or actor.\n" +
                "Using your By Popular Demand feature, you can find a place to perform in any place that features combat for entertainment—perhaps a gladiatorial arena or secret pit fighting club. You can replace the musical instrument in your equipment package with an inexpensive but unusual weapon, such as a trident or net.\n";
    }

    Data folkHeroFeatures = new Data();
    public void setFolkHeroFeatures(Data folkHeroFeatures) {
        folkHeroFeatures.abilName = "Folk Hero Features";
        folkHeroFeatures.backgroundType = "Folk Hero";
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
        folkHeroRusticHos.backgroundType = "Folk Hero";
        folkHeroRusticHos.abilName = "Rustic Hospitality";
        folkHeroRusticHos.dlevel = 1;
        folkHeroRusticHos.flavor = "Since you come from the ranks of the common folk, you fit in among them with ease. You can find a place to hide, rest, or recuperate among other commoners, unless you have shown yourself to be a danger to them. They will shield you from the law or anyone else searching for you, though they will not risk\n" +
                "their lives for you.";
    }

    Data guildArtisanFeatures = new Data();
    public void setGuildArtisanFeatures(Data guildArtisanFeatures) {
        guildArtisanFeatures.abilName = "Guild Artisan Features";
        guildArtisanFeatures.backgroundType = "Guild Artisan";
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
        guildArtisanGuildBusiness.backgroundType = "Guild Artisan";

        guildArtisanGuildBusiness.dlevel = 1;
        guildArtisanGuildBusiness.flavor = "Guilds are generally found in cities large enough to support several artisans practicing the same trade. However, your guild might instead be a loose network of artisans who each work in a different village within a larger realm. Work with your DM to determine the nature of your guild. As a member of your guild, you know the skills needed to create finished items from raw materials (reflected in your proficiency with a certain kind of artisan’s tools),\n" +
                "as well as the principles of trade and good business practices. The question now is whether you abandon your trade for adventure, or take on the extra effort to weave adventuring and trade together. ";
    }

    Data guildArtisanGuildMember = new Data();
    public void setGuildArtisanGuildMember(Data guildArtisanGuildMember) {
        guildArtisanGuildMember.abilName = "Guild Member";
        guildArtisanGuildMember.backgroundType = "Guild Artisan";

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
        guildArtisanVariantMerchant.backgroundType = "Guild Artisan";

        guildArtisanVariantMerchant.dlevel = 1;
        guildArtisanVariantMerchant.flavor = "Instead of an artisans’ guild, you might belong to a\n" +
                "guild of traders, caravan masters, or shopkeepers. You don’t craft items yourself but earn a living by buying\n" +
                "and selling the works of others (or the raw materials artisans need to practice their craft). Your guild might be a large merchant consortium (or family) with interests across the region. Perhaps you transported goods from one place to another, by ship, wagon, or caravan, or bought them from traveling traders and sold them in your own little shop. In some ways, the traveling merchant’s life lends itself to adventure far more than the life of an artisan.\n" +
                "Rather than proficiency with artisan’s tools, you might be proficient with navigator’s tools or an additional language. And instead of artisan’s tools, you can start with a mule and a cart.";
    }

    Data hermitFeatures = new Data();
    public void setHermitFeatures(Data hermitFeatures) {
        hermitFeatures.abilName = "Hermit Features";
        hermitFeatures.backgroundType = "Hermit";
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
        hermitLife.backgroundType = "Hermit";

        hermitLife.dlevel = 1;
        hermitLife.flavor = "What was the reason for your isolation, and what changed to allow you to end your solitude? You can work with your DM to determine the exact nature of your seclusion, or you can choose or roll on the table below to determine the reason behind your seclusion.";
    }

    Data hermitDiscovery = new Data();
    public void setHermitDiscovery(Data hermitDiscovery) {
        hermitDiscovery.abilName = "Discovery";
        hermitDiscovery.backgroundType = "Hermit";

        hermitDiscovery.dlevel = 1;
        hermitDiscovery.flavor = "The quiet seclusion of your extended hermitage gave you\n" +
                "access to a unique and powerful discovery. The exact nature of this revelation depends on the nature of your seclusion. It might be a great truth about the cosmos, the deities, the powerful beings of the outer planes, or the forces of nature. It could be a site that no one else has ever seen. You might have uncovered a fact that has long been forgotten, or unearthed some relic of the past that could rewrite history. It might be information that would be damaging to the people who or consigned you to exile, and hence the reason for your return to society.\n" +
                "Work with your DM to determine the details of your discovery and its impact on the campaign.";
    }

    Data nobleFeatures = new Data();
    public void setNobleFeatures(Data nobleFeatures) {
        nobleFeatures.abilName = "Noble Features";
        nobleFeatures.backgroundType = "Noble";
        //Skills alphabetically: Acrobatics, Animal Handling, Arcana, Athletics, Deception, History, Insight, Intimidation,Investigation, Medicine, Nature, Perception, Performance, Persuasion, Religion, Sleight of Hand, Stealth, Survival.
        //                 {0    ,1     ,2     ,3     ,4     ,5     ,6     ,7     ,8     ,9     ,10    ,11    ,12    ,13    ,14    ,15    ,16    ,17  }
        boolean skills[] = {false, false, false, false, false, true, false, false, false, false, false, false, false, true, false, false, false, false};
        nobleFeatures.backgroundSkills = skills;
        nobleFeatures.toolProf = "One type of gaming set";
        nobleFeatures.languages = "One of your choice";
        nobleFeatures.startGold = 25;
        nobleFeatures.flavor = "You understand wealth, power, and privilege. You\n" +
                "carry a noble title, and your family owns land, collects taxes, and wields significant political influence. You might be a pampered aristocrat unfamiliar with\n" +
                "work or discomfort, a former merchant just elevated\n" +
                "to the nobility, or a disinherited scoundrel with a disproportionate sense of entitlement. Or you could be an honest, hard-working landowner who cares deeply about the people who live and work on your land, keenly aware of your responsibility to them.\n" +
                "Work with your DM to come up with an appropriate title and determine how much authority that title carries. A noble title doesn’t stand on its own—it’s connected to an entire family, and whatever title you hold, you will pass it down to your own children. Not only do you need to determine your noble title, but you should also work with the DM to describe your family and their influence on you.\n" +
                "Is your family old and established, or was your title only recently bestowed? How much influence do they wield, and over what area? What kind of reputation does your family have among the other aristocrats of the region? How do the common people regard them?\n" +
                "What’s your position in the family? Are you the heir to the head of the family? Have you already inherited the title? How do you feel about that responsibility? Or are you so far down the line of inheritance that no one cares what you do, as long as you don’t embarrass the family? How does the head of your family feel about your adventuring career? Are you in your family’s good graces, or shunned by the rest of your family?\n" +
                "Does your family have a coat of arms? An insignia you might wear on a signet ring? Particular colors you wear all the time? An animal you regard as a symbol of your line or even a spiritual member of the family?\n" +
                "These details help establish your family and your title as features of the world of the campaign.";
    }

    Data noblePrivilage = new Data();
    public void setNoblePrivilage(Data noblePrivilage) {
        noblePrivilage.abilName = "Position of Privilage";
        noblePrivilage.backgroundType = "Noble";

        noblePrivilage.dlevel = 1;
        noblePrivilage.flavor = "Thanks to your noble birth, people are inclined to\n" +
                "think the best of you. You are welcome in high society, and people assume you have the right to be wherever you are. The common folk make every effort to accommodate you and avoid your displeasure, and other people of high birth treat you as a member of the same social sphere. You can secure an audience with a local noble if you need to.";
    }

    Data nobleVariantKnight = new Data();
    public void setNobleVariantKnight(Data nobleVariantKnight) {
        nobleVariantKnight.abilName = "Knight";
        nobleVariantKnight.backgroundType = "Noble";

        nobleVariantKnight.dlevel = 1;
        nobleVariantKnight.flavor = "A knighthood is among the lowest noble titles in most\n" +
                "societies, but it can be a path to higher status. If you wish to be a knight, choose the Retainers feature (see the sidebar) instead of the Position of Privilege feature. One of your commoner retainers is replaced by a noble who serves as your squire, aiding you in exchange for training on his or her own path to knighthood. Your two remaining retainers might include a groom to care for your horse and a servant who polishes your armor (and even helps you put it on).\n" +
                "As an emblem of chivalry and the ideals of courtly love, you might include among your equipment a banner or other token from a noble lord or lady to whom you have given your heart—in a chaste sort of devotion. (This person could be your bond.)";
    }

    Data nobleVariantFeature = new Data();
    public void setNobleVariantFeature(Data nobleVariantFeature) {
        nobleVariantFeature.abilName = "Retainers";
        nobleVariantFeature.backgroundType = "Noble";

        nobleVariantFeature.dlevel = 1;
        nobleVariantFeature.flavor = "If your character has a noble background, you may select this background feature instead of Position of Privilege.\n" +
                "You have the service of three retainers loyal to your family. These retainers can be attendants or messengers, and one might be a majordomo. Your retainers are commoners who can perform mundane tasks for you, but they do not fight for you, will not follow you into obviously dangerous areas (such as dungeons), and will leave if they are frequently endangered or abused.";
    }

    Data outlanderFeatures = new Data();
    public void setOutlanderFeatures(Data outlanderFeatures) {
        outlanderFeatures.abilName = "Outlander Features";
        outlanderFeatures.backgroundType = "Outlander";
        //Skills alphabetically: Acrobatics, Animal Handling, Arcana, Athletics, Deception, History, Insight, Intimidation,Investigation, Medicine, Nature, Perception, Performance, Persuasion, Religion, Sleight of Hand, Stealth, Survival.
        //                 {0    ,1     ,2     ,3     ,4     ,5     ,6     ,7     ,8     ,9     ,10    ,11    ,12    ,13    ,14    ,15    ,16    ,17  }
        boolean skills[] = {false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true};
        outlanderFeatures.backgroundSkills = skills;
        outlanderFeatures.toolProf = "One type of musical instrument";
        outlanderFeatures.languages = "One language of your choice.";
        outlanderFeatures.startGold = 10;
        outlanderFeatures.flavor = "You grew up in the wilds, far from civilization and the comforts of town and technology. You’ve witnessed the migration of herds larger than forests, survived weather more extreme than any city-dweller could comprehend, and enjoyed the solitude of being the only thinking creature for miles in any direction. The wilds are in your blood, whether you were a nomad, an explorer, a recluse, a hunter-gatherer, or even a marauder. Even in places where you don’t know the specific features of the terrain, you know the ways of the wild.";
    }

    Data outlanderWanderer = new Data();
    public void setOutlanderWanderer(Data outlanderWanderer) {
        outlanderWanderer.abilName = "Wanderer";
        outlanderWanderer.backgroundType = "Outlander";
        outlanderWanderer.dlevel = 1;
        outlanderWanderer.flavor = "You have an excellent memory for maps and geography, and you can always recall the general layout of terrain, settlements, and other features around you. In addition, you can find food and fresh water for yourself and up to five other people each day, provided that the land offers berries,small game,water,and so forth.";
    }

    Data sageFeatures = new Data();
    public void setSageFeatures(Data sageFeatures) {
        sageFeatures.abilName = "Outlander Features";
        sageFeatures.backgroundType = "Sage";
        //Skills alphabetically: Acrobatics, Animal Handling, Arcana, Athletics, Deception, History, Insight, Intimidation,Investigation, Medicine, Nature, Perception, Performance, Persuasion, Religion, Sleight of Hand, Stealth, Survival.
        //                 {0    ,1     ,2     ,3     ,4     ,5     ,6     ,7     ,8     ,9     ,10    ,11    ,12    ,13    ,14    ,15    ,16    ,17  }
        boolean skills[] = {false, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false};
        sageFeatures.backgroundSkills = skills;
        sageFeatures.languages = "Two languages of your choice.";
        sageFeatures.startGold = 10;
        sageFeatures.flavor = "You spent years learning the lore of the multiverse. You scoured manuscripts, studied scrolls, and listened to the greatest experts on the subjects that interest you. Your efforts have made you a master in your fields of study.\n";
    }

    Data sageResearcher = new Data();
    public void setSageResearcher(Data sageResearcher) {
        sageResearcher.abilName = "Researcher";
        sageResearcher.backgroundType = "Sage";

        sageResearcher.dlevel = 1;
        sageResearcher.flavor = "When you attempt to learn or recall a piece of lore, if you do not know that information, you often know where and from whom you can obtain it. Usually, this information com es from a library, scriptorium, university, or a sage or other learned person or creature. Your DM might\n" +
                "rule that the knowledge you seek is secreted away in an almost inaccessible place, or that it simply cannot be found. Unearthing the deepest secrets of the multiverse can require an adventure or even a whole campaign.";
    }

    Data sailorFeatures = new Data();
    public void setSailorFeatures(Data sailorFeatures) {
        sailorFeatures.abilName = "Sailor Features";
        sailorFeatures.backgroundType = "Sailor";
        //Skills alphabetically: Acrobatics, Animal Handling, Arcana, Athletics, Deception, History, Insight, Intimidation,Investigation, Medicine, Nature, Perception, Performance, Persuasion, Religion, Sleight of Hand, Stealth, Survival.
        //                 {0    ,1     ,2     ,3     ,4     ,5     ,6     ,7     ,8     ,9     ,10    ,11    ,12    ,13    ,14    ,15    ,16    ,17  }
        boolean skills[] = {false, false, false, true, false, false, false, false, false, false, false, true, false, false, false, false, false, false};
        sailorFeatures.backgroundSkills = skills;
        sailorFeatures.toolProf = "Navigator's Tools. Vehicles(water)";
        sailorFeatures.startGold = 10;
        sailorFeatures.flavor = "You sailed on a seagoing vessel for years. In that time, you faced down mighty storms, monsters of the deep, and those who wanted to sink your craft to the bottomless depths. Your first love is the distant line of the horizon, but the time has come to try your hand\n" +
                "at something new.\n" +
                "Discuss the nature of the ship you previously sailed with your Dungeon Master. Was it a merchant ship,\n" +
                "a naval vessel, a ship of discovery, or a pirate ship? How famous (or infamous) is it? Is it widely traveled? Is it still sailing, or is it missing and presumed lost with all hands?\n" +
                "What were your duties on board—boatswain, captain, navigator, cook, or some other position? Who were the captain and first mate? Did you leave your ship on good terms with your fellows, or on the run?\n";
    }

    Data sailorShipsPassage = new Data();
    public void setSailorShipsPassage(Data sailorShipsPassage) {
        sailorShipsPassage.abilName = "Ship's Passage";
        sailorShipsPassage.backgroundType = "Sailor";

        sailorShipsPassage.dlevel = 1;
        sailorShipsPassage.flavor = "When you need to, you can secure free passage on\n" +
                "a sailing ship for yourself and your adventuring companions. You might sail on the ship you served on, or another ship you have good relations with (perhaps one captained by a former crewmate). Because you’re calling in a favor, you can’t be certain of a schedule or route that will meet your every need. Your Dungeon Master will determine how long it takes to get where you need to go. In return for your free passage, you and your companions are expected to assist the crew during the voyage.";
    }

    Data sailorVariantPirate = new Data();
    public void setSailorVariantPirate(Data sailorVariantPirate) {
        sailorVariantPirate.abilName = "Pirate";
        sailorVariantPirate.backgroundType = "Sailor";

        sailorVariantPirate.dlevel = 1;
        sailorVariantPirate.flavor = "You spent your youth under the sway of a dread pirate,\n" +
                "a ruthless cutthroat who taught you how to survive in a world of sharks and savages. You’ve indulged in larceny on the high seas and sent more than one deserving soul to a briny grave. Fear and bloodshed are no strangers\n" +
                "to you, and you’ve garnered a somewhat unsavory reputation in many a port town.\n" +
                "If you decide that your sailing career involved piracy, you can choose the Bad Reputation feature (see sidebar) instead of the Ship’s Passage feature.\n";
    }

    Data sailorVariantFeature = new Data();
    public void setSailorVariantFeature(Data sailorVariantFeature) {
        sailorVariantFeature.abilName = "Bad Reputation";
        sailorVariantFeature.backgroundType = "Sailor";
        sailorVariantFeature.dlevel = 1;
        sailorVariantFeature.flavor = "If your character has a sailor background, you may select this background feature instead of Ship’s Passage.\n" +
                "No matter where you go, people are afraid of you due to your reputation. When you are in a civilized settlement, you can get away with minor criminal offenses, such as refusing to pay for food at a tavern or breaking down doors at a local shop, since most people will not report your activity to the authorities.";
    }

    Data soldierFeature = new Data();
    public void setSoldierFeature(Data soldierFeature) {
        soldierFeature.abilName = "Soldier Features";
        soldierFeature.backgroundType = "Soldier";
        //Skills alphabetically: Acrobatics, Animal Handling, Arcana, Athletics, Deception, History, Insight, Intimidation,Investigation, Medicine, Nature, Perception, Performance, Persuasion, Religion, Sleight of Hand, Stealth, Survival.
        //                 {0    ,1     ,2     ,3     ,4     ,5     ,6     ,7     ,8     ,9     ,10    ,11    ,12    ,13    ,14    ,15    ,16    ,17  }
        boolean skills[] = {false, false, false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false};
        soldierFeature.backgroundSkills = skills;
        soldierFeature.toolProf = "One type of gaming set.";
        soldierFeature.startGold = 10;
        soldierFeature.flavor = "War has been your life for as long as you care to remember. You trained as a youth, studied the use of weapons and armor, learned basic survival techniques, including how to stay alive on the battlefield. You\n" +
                "might have been part of a standing national army or a mercenary company, or perhaps a member of a local militia who rose to prominence during a recent war.\n" +
                "When you choose this background, work with your DM to determine which military organization you were\n" +
                "a part of, how far through its ranks you progressed, and what kind of experiences you had during your military career.Wasitastandingarmy,atownguard,oravillage militia? Or it might have been a noble’s or merchant’s private army, or a mercenary company.";
    }

    Data soldierMilitaryRank = new Data();
    public void setSoldierMilitaryRank(Data soldierMilitaryRank) {
        soldierMilitaryRank.abilName = "Military Rank";
        soldierMilitaryRank.backgroundType = "Soldier";

        soldierMilitaryRank.dlevel = 1;
        soldierMilitaryRank.flavor = "You have a military rank from your career as a soldier. Soldiers loyal to your former military organization still recognize your authority and influence, and they defer to you if they are of a lower rank. You can invoke your rank to exert influence over other soldiers and requisition simple equipment or horses for temporary use. You can also usually gain access to friendly military encampments and fortresses where your rank is recognized.\n";
    }

    Data urchinFeatures = new Data();
    public void setUrchinFeatures(Data urchinFeatures) {
        urchinFeatures.abilName = "Urchin Features";
        urchinFeatures.backgroundType = "Urchin";
        //Skills alphabetically: Acrobatics, Animal Handling, Arcana, Athletics, Deception, History, Insight, Intimidation,Investigation, Medicine, Nature, Perception, Performance, Persuasion, Religion, Sleight of Hand, Stealth, Survival.
        //                 {0    ,1     ,2     ,3     ,4     ,5     ,6     ,7     ,8     ,9     ,10    ,11    ,12    ,13    ,14    ,15    ,16    ,17  }
        boolean skills[] = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false};
        urchinFeatures.backgroundSkills = skills;
        urchinFeatures.toolProf = "Disguise Kit, Thieves' Tools";
        urchinFeatures.startGold = 10;
        urchinFeatures.flavor = "You grew up on the streets alone, orphaned, and poor. You had no one to watch over you or to provide for\n" +
                "you, so you learned to provide for yourself. You fought fiercely over food and kept a constant watch out for other desperate souls who might steal from you. You slept on rooftops and in alleyways, exposed to the elements, and endured sickness without the advantage of medicine or a place to recuperate. You’ve survived despite all odds, and did so through cunning, strength, speed, or some combination of each.\n" +
                "You begin your adventuring career with enough money to live modestly but securely for at least ten days. How did you come by that money? What allowed you to break free ofyour desperate circumstances and embark on a better life?";
    }

    Data urchinCitySecrets = new Data();
    public void setUrchinCitySecrets(Data urchinCitySecrets) {
        urchinCitySecrets.abilName = "City Secrets";
        urchinCitySecrets.backgroundType = "Urchin";

        urchinCitySecrets.dlevel = 1;
        urchinCitySecrets.flavor = "You know the secret patterns and flow to cities and can find passages through the urban sprawl that others would miss. When you are not in combat, you (and companions you lead) can travel between any two locations in the city twice as fast as your speed would normally allow.\n";
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
        setNobleFeatures(nobleFeatures);
        bd.add(nobleFeatures);

        setNoblePrivilage(noblePrivilage);
        bd.add(noblePrivilage);

        setNobleVariantKnight(nobleVariantKnight);
        bd.add(nobleVariantKnight);

        setNobleVariantFeature(nobleVariantFeature);
        bd.add(nobleVariantFeature);

        //Outlander
        setOutlanderFeatures(outlanderFeatures);
        bd.add(outlanderFeatures);

        setOutlanderWanderer(outlanderWanderer);
        bd.add(outlanderWanderer);

        //Sage
        setSageFeatures(sageFeatures);
        bd.add(sageFeatures);

        setSageResearcher(sageResearcher);
        bd.add(sageResearcher);

        //Sailor
        setSailorFeatures(sailorFeatures);
        bd.add(sailorFeatures);

        setSailorShipsPassage(sailorShipsPassage);
        bd.add(sailorShipsPassage);

        setSailorVariantPirate(sailorVariantPirate);
        bd.add(sailorVariantPirate);

        setSailorVariantFeature(sailorVariantFeature);
        bd.add(sailorVariantFeature);

        //Soldier
        setSoldierFeature(soldierFeature);
        bd.add(soldierFeature);

        setSoldierMilitaryRank(soldierMilitaryRank);
        bd.add(soldierMilitaryRank);

        //Urchin
        setUrchinFeatures(urchinFeatures);
        bd.add(urchinFeatures);

        setUrchinCitySecrets(urchinCitySecrets);
        bd.add(urchinCitySecrets);

        return bd;
    }





}
