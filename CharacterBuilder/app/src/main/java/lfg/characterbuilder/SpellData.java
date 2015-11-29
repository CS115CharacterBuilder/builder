package lfg.characterbuilder;
import java.util.ArrayList;

/**
 * Created by AndrewMiller on 11/13/15.
 */
public class SpellData extends Data {
    ArrayList<Data> sd = new ArrayList<Data>();

    Data acidSplash = new Data(); //declare a new ability object
    public void setAcidSplash(Data acidSplash) { //populate it
        acidSplash.abilName = "Acid Splash";
        acidSplash.spellLevel = 0;
        acidSplash.school = "Conjuration";
        //                       bard, cler,   dru,   Pal, range,  Sorc,   War, Wizard
        boolean classProf[] = {false, false, false, false, false, true, false, true};
        acidSplash.spells =  classProf.clone();
        acidSplash.range = "60";
        acidSplash.components = "V, S";
        acidSplash.duration = "Instantaneous";
        acidSplash.castTime = "1 Action";
        acidSplash.flavor = "You hurl a bubble of acid. Choose one creature within range, or choose two creatures within range that are within 5 feet of each other. A target must succeed on a Dexterity saving throw or take 1d6 acid damage.\n" +
                "This spell’s damage increases by 1d6 when you reach 5th level (2d6), 11th level (3d6), and 17th level (4d6).";

    }

    Data aid = new Data(); //declare a new ability object
    public void setAid(Data aid) { //populate it
        aid.abilName = "Aid";
        aid.spellLevel = 2;
        aid.school = "Abjuration";
        //                       bard, cler,   dru,   Pal, range,  Sorc,   War, Wizard
        boolean classProf[] = {false, false, false, false, false, false, false, false};
        aid.spells =  classProf.clone();
        aid.range = "30";
        aid.components = "V, S, M (a tiny strip of white cloth)";
        aid.castTime = "1 Action";
        aid.duration = "8 Hours";
        aid.flavor = "Your spell bolsters your allies with toughness and resolve. Choose up to three creatures within range. Each target’s hit point maximum and current hit points increase by 5 for the duration.\n" +
                "AtHigherLevels. When you cast this spell using\n" +
                "a spell slot of 3rd level or higher, a target’s hit points increase by an additional 5 for each slot level above 2nd.";

    }

    Data alarm = new Data(); //declare a new ability object
    public void setAlarm(Data alarm) { //populate it
        alarm.abilName = "Alarm";
        alarm.spellLevel = 1;
        alarm.school = "Abjuration (Ritual)";
        //                       bard, cler,   dru,   Pal, range,  Sorc,   War, Wizard
        boolean classProf[] = {false, false, false, true, true, false, false, true};
        alarm.spells =  classProf.clone();
        alarm.range = "30";
        alarm.components = "V, S, M (a tiny bell and a piece of\n" +
                "fine silver wire)";
        alarm.duration = "8 Hours";
        alarm.castTime = "1 Minute";
        alarm.flavor = "Your spell bolsters your allies with toughness and resolve. Choose up to three creatures within range. Each target’s hit point maximum and current hit points increase by 5 for the duration.\n" +
                "AtHigherLevels. When you cast this spell using\n" +
                "a spell slot of 3rd level or higher, a target’s hit points increase by an additional 5 for each slot level above 2nd.";

    }

    Data animalFriendship = new Data(); //declare a new ability object
    public void setAnimalFriendship(Data animalFriendship) { //populate it
        animalFriendship.abilName = "Animal Friendship";
        animalFriendship.spellLevel = 1;
        animalFriendship.school = "Enchantment";
        //                       bard, cler,   dru,   Pal, range,  Sorc,   War, Wizard
        boolean classProf[] = {true, false, true, false, true, false, false, false};
        animalFriendship.spells =  classProf.clone();
        animalFriendship.range = "30";
        animalFriendship.components = "V, S, M (a morsel of food)";
        animalFriendship.duration = "24 Hours";
        animalFriendship.castTime = "1 Action";
        animalFriendship.flavor = "This spell lets you convince a beast that you mean it no harm. Choose a beast that you can see within range.\n" +
                "It must see and hear you. If the beast’s Intelligence is\n" +
                "4 or higher, the spell fails. Otherwise, the beast must succeed on a Wisdom saving throw or be charmed\n" +
                "by you for the spell’s duration. If you or one of your companions harms the target, the spells ends.\n" +
                "AtHigherLevels. When you cast this spell using a spell slot of 2nd level or higher, you can affect one additional beast for each slot level above 1st.";

    }

    Data armorOfAgathys = new Data(); //declare a new ability object
    public void setArmorOfAgathys(Data armorOfAgathys) { //populate it
        armorOfAgathys.abilName = "Armor of Agathys";
        armorOfAgathys.spellLevel = 1;
        armorOfAgathys.school = "Abjuration";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, false, false, false, false, true, false};
        armorOfAgathys.spells =  classProf.clone();
        armorOfAgathys.range = "Self";
        armorOfAgathys.components = "V, S, M (a cup of water)";
        armorOfAgathys.duration = "1 Hour";
        armorOfAgathys.castTime = "1 Action";
        armorOfAgathys.flavor = "A protective magical force surrounds you, manifesting as a spectral frost that covers you and your gear.\n" +
                "You gain 5 temporary hit points for the duration. If a creature hits you with a melee attack while you have these hit points, the creature takes 5 cold damage.\n" +
                "AtHigherLevels. When you cast this spell using a spell slot of 2nd level or higher, both the temporary hit points and the cold damage increase by 5 for each slot level above 1st.";

    }

    Data armsOfHadar = new Data(); //declare a new ability object
    public void setArmsOfHadar(Data armsOfHadar) { //populate it
        armsOfHadar.abilName = "Arms of Hadar";
        armsOfHadar.spellLevel = 1;
        armsOfHadar.school = "Conjuration";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, false, false, false, false, true, false};
        armsOfHadar.spells =  classProf.clone();
        armsOfHadar.range = "Self";
        armsOfHadar.components = "V, S";
        armsOfHadar.duration = "Instantaneous";
        armsOfHadar.castTime = "1 Action";
        armsOfHadar.flavor = "You invoke the power of Hadar, the Dark Hunger. Tendrils of dark energy erupt from you and batter all creatures within 10 feet of you. Each creature in that area must make a Strength saving throw. On a failed save, a target takes 2d6 necrotic damage and can’t take reactions until its next turn. On a successful save, the creature takes half damage, but suffers no other effect.AtHigherLevels. When you cast this spell using a spell slot of 2nd level or higher, the damage increases by 1d6 for each slot level above 1st.";

    }

    Data bane = new Data(); //declare a new ability object
    public void setBane(Data bane) { //populate it
        bane.abilName = "Bane";
        bane.spellLevel = 1;
        bane.school = "Enchantment";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {true, true, false, false, false, false, false, false};
        bane.spells =  classProf.clone();
        bane.range = "30";
        bane.components = "V, S, M (a drop of blood)";
        bane.duration = "Concentration, up to 1 minute";
        bane.castTime = "1 Action";
        bane.flavor = "Up to three creatures of your choice that you can see within range must make Charisma saving throws. Whenever a target that fails this saving throw makes an attack roll or a saving throw before the spell ends, the target must roll a d4 and subtract the number rolled from the attack roll or saving throw.\n" +
                "AtHigherLevels. When you cast this spell using a spell slot of 2nd level or higher, you can target one additional creature for each slot level above 1st.";

    }

    Data bladeWard = new Data(); //declare a new ability object
    public void setBladeWard(Data bladeWard) { //populate it
        bladeWard.abilName = "Blade Ward";
        bladeWard.spellLevel = 0;
        bladeWard.school = "Abjuration";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {true, false, false, false, false, true, true, true};
        bladeWard.spells =  classProf.clone();
        bladeWard.range = "Self";
        bladeWard.components = "V, S";
        bladeWard.duration = "1 round";
        bladeWard.castTime = "1 Action";
        bladeWard.flavor = "You extend your hand and trace a sigil of warding in the air. Until the end of your next turn, you have resistance against bludgeoning, piercing, and slashing damage dealt by weapon attacks.\n";
    }

    Data bless = new Data(); //declare a new ability object
    public void setBless(Data bless) { //populate it
        bless.abilName = "Bless";
        bless.spellLevel = 1;
        bless.school = "Enchantment";
        //                     bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, true, false, true, false, false, false, false};
        bless.spells =  classProf.clone();
        bless.range = "30";
        bless.components = "V, S, M (a sprinkling of holy water)";
        bless.duration = "Concentration, up to one minute";
        bless.castTime = "1 Action";
        bless.flavor = "You bless up to three creatures of your choice within range. Whenever a target makes an attack roll or a saving throw before the spell ends, the target can roll a d4 and add the number rolled to the attack roll or saving throw.\n" +
                "At Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, you can target one additional creature for each slot level above 1st.\n";
    }

    Data burningHands = new Data(); //declare a new ability object
    public void setBurningHands(Data burningHands) { //populate it
        burningHands.abilName = "Burning Hands";
        burningHands.spellLevel = 1;
        burningHands.school = "Evocation";
        //                     bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, false, false, false, true, false, true};
        burningHands.spells =  classProf.clone();
        burningHands.range = "Self (15 Foot Cone)";
        burningHands.components = "V, S";
        burningHands.duration = "Instantaneous";
        burningHands.castTime = "1 Action";
        burningHands.flavor = "As you hold your hands with thumbs touching and fingers spread, a thin sheet of flames shoots forth from your outstretched fingertips. Each creature in a 15-foot cone must make a Dexterity saving throw. A creature takes 3d6 fire damage on a failed save, or half as much damage on a successful one.\n" +
                "The fire ignites any flammable objects in the area that aren’t being worn or carried.\n" +
                "AtHigherLevels. When you cast this spell using a spell slot of 2nd level or higher, the damage increases by 1d6 for each slot level above 1st.";
    }

    Data charmPerson = new Data(); //declare a new ability object
    public void setCharmPerson(Data charmPerson) { //populate it
        charmPerson.abilName = "Charm Person";
        charmPerson.spellLevel = 1;
        charmPerson.school = "Enchantment";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {true, false, true, false, false, true, true, true};
        charmPerson.spells =  classProf.clone();
        charmPerson.range = "30";
        charmPerson.components = "V, S";
        charmPerson.duration = "1 Hour";
        charmPerson.castTime = "1 Action";
        charmPerson.flavor = "You attempt to charm a humanoid you can see within range. It must make a W isdom saving throw, and does so with advantage if you or your companions are fighting it. If it fails the saving throw, it is charmed by you until the spell ends or until you or your companions do anything harmful to it. The charmed creature regards you as a friendly acquaintance. When the spell ends, the creature knows it was charmed by you.\n" +
                "AtHigherLevels. When you cast this spell using a spell slot of 2nd level or higher, you can target one additional creature for each slot level above 1st. The creatures must be within 30 feet of each other when you target them.";
    }

    Data chillTouch = new Data(); //declare a new ability object
    public void setChillTouch(Data chillTouch) { //populate it
        chillTouch.abilName = "Chill Touch";
        chillTouch.spellLevel = 0;
        chillTouch.school = "Necromancy";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, false, false, false, true, true, true};
        chillTouch.spells =  classProf.clone();
        chillTouch.range = "120";
        chillTouch.components = "V, S";
        chillTouch.duration = "1 round";
        chillTouch.castTime = "1 Action";
        chillTouch.flavor = "You create a ghostly, skeletal hand in the space of a creature within range. Make a ranged spell attack against the creature to assail it with the chill of the grave. On a hit, the target takes 1d8 necrotic damage, and it can’t regain hit points until the start of your next turn. Until then, the hand clings to the target.\n" +
                "If you hit an undead target, it also has disadvantage on attack rolls against you until the end of your next turn.\n" +
                "This spell’s damage increases by 1d8 when you reach 5th level (2d8), 11th level (3d8), and 17th level (4d8).";
    }

    Data chromaticOrb = new Data(); //declare a new ability object
    public void setChromaticOrb(Data chromaticOrb) { //populate it
        chromaticOrb.abilName = "Chromatic Orb";
        chromaticOrb.spellLevel = 1;
        chromaticOrb.school = "Envocation";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, false, false, false, true, false, true};
        chromaticOrb.spells =  classProf.clone();
        chromaticOrb.range = "90";
        chromaticOrb.components = "V, S, M (a diamond worth at least 50 gp)";
        chromaticOrb.duration = "Instantaneous";
        chromaticOrb.castTime = "1 Action";
        chromaticOrb.flavor = "You hurl a 4-inch-diameter sphere of energy at a creature that you can see within range. You choose acid, cold, fire, lightning, poison, or thunder for the type of orb you create, and then make a ranged spell attack against the target. If the attack hits, the creature takes 3d8 damage of the type you chose.\n" +
                "AtHigherLevels. When you cast this spell using a spell slot of 2nd level or higher, the damage increases by 1d8 for each slot level above 1st.";
    }

    Data colorSpray = new Data(); //declare a new ability object
    public void setColorSpray(Data colorSpray) { //populate it
        colorSpray.abilName = "Color Spray";
        colorSpray.spellLevel = 1;
        colorSpray.school = "Illusion";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, false, false, false, true, false, true};
        colorSpray.spells =  classProf.clone();
        colorSpray.range = "Self (15 foot cone)";
        colorSpray.components = "V, S, M (a pinch of powder or sand that is\n" +
                "colored red, yellow, and blue)";
        colorSpray.duration = "1 round";
        colorSpray.castTime = "1 Action";
        colorSpray.flavor = "A dazzling array of flashing, colored light springs from your hand. Roll 6d10; the total is how many hit points of creatures this spell can effect. Creatures in a 15-foot cone originating from you are affected in ascending order of their current hit points (ignoring unconscious creatures and creatures that can’t see).\n" +
                "Starting with the creature that has the lowest current hit points, each creature affected by this spell is blinded until the spell ends. Subtract each creature’s hit points from the total before moving on to the creature with\n" +
                "the next lowest hit points. A creature’s hit points must be equal to or less than the remaining total for that creature to be affected. When you cast this spell using a spell slot of 2nd level or higher, roll an additional 2d10 for each slot level above 1st.";
    }

    Data command = new Data(); //declare a new ability object
    public void setCommand(Data command) { //populate it
        command.abilName = "Command";
        command.spellLevel = 1;
        command.school = "Enchantment";
        //                      bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, true, false, true, false, false, false, false};
        command.spells =  classProf.clone();
        command.range = "60";
        command.components = "V";
        command.duration = "1 round";
        command.castTime = "1 Action";
        command.flavor = "You speak a one-word command to a creature you can see within range. The target must succeed on a Wisdom saving throw or follow the command on its next turn. The spell has no effect if the target is undead, if it doesn’t understand your language, or if your command is directly harmful to it.\n" +
                "Some typical commands and their effects follow. You might issue a command other than one described here. Ifyou do so, the DM determines how the target behaves. If the target can’t follow your command, the spell ends.\n" +
                "Approach. The target moves toward you by the shortest and most direct route, ending its turn if it moves within 5 feet of you.\n" +
                "Drop. The target drops whatever it is holding and then ends its turn.\n" +
                "Flee. The target spends its turn moving away from you by the fastest available means.\n" +
                "Grovel. The target falls prone and then ends its turn.\n" +
                "Halt. The target doesn’t move and takes no actions. A flying creature stays aloft, provided that it is able to do so. If it must move to stay aloft, it flies the minimum distance needed to remain in the air.\n" +
                "AtHigherLevels. When you cast this spell using a spell slot of 2nd level or higher, you can affect one additional creature for each slot level above 1st. The creatures must be within 30 feet of each other when you target them.";
    }

    Data compelledDuel = new Data(); //declare a new ability object
    public void setCompelledDuel(Data compelledDuel) { //populate it
        compelledDuel.abilName = "Compelled Duel";
        compelledDuel.spellLevel = 1;
        compelledDuel.school = "Enchantment";
        //                      bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, false, true, false, false, false, false};
        compelledDuel.spells =  classProf.clone();
        compelledDuel.range = "30";
        compelledDuel.components = "V";
        compelledDuel.duration = "Concentration up to 1 minute";
        compelledDuel.castTime = "1 Action";
        compelledDuel.flavor =  "You attempt to compel a creature into a duel. One creature that you can see within range must make a Wisdom saving throw. On a failed save, the creature is drawn to you, compelled by your divine demand. For the duration, it has disadvantage on attack rolls against creatures other than you, and must make a Wisdom saving throw each time it attempts to move to a space that is more than 30 feet away from you; if it succeeds on this saving throw, this spell doesn’t restrict the target’s movement for that turn.\n" +
                "The spell ends if you attack any other creature, if you cast a spell that targets a hostile creature other than the target, if a creature friendly to you damages the target or casts a harmful spell on it, or if you end your turn more than 30 feet away from the target.";
    }

    Data comprehendLanguages = new Data(); //declare a new ability object
    public void setComprehendLanguages(Data comprehendLanguages) { //populate it
        comprehendLanguages.abilName = "Comprehend Languages";
        comprehendLanguages.spellLevel = 1;
        comprehendLanguages.school = "Divination (ritual)";
        //                      bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {true, false, false, false, false, true, true, true};
        comprehendLanguages.spells =  classProf.clone();
        comprehendLanguages.range = "Self";
        comprehendLanguages.components = "V";
        comprehendLanguages.duration = "1 Hour";
        comprehendLanguages.castTime = "1 Action";
        comprehendLanguages.flavor =  "For the duration, you understand the literal meaning of any spoken language that you hear. You also understand any written language that you see, but you must be touching the surface on which the words are written. It takes about 1 minute to read one page of text. This spell doesn’t decode secret messages in a text or a glyph, such as an arcane sigil, that isn’t part of a written language.";
    }

    Data createOrDistroyWater = new Data(); //declare a new ability object
    public void setCreateOrDistroyWater(Data createOrDistroyWater) { //populate it
        createOrDistroyWater.abilName = "Create or Destroy Water";
        createOrDistroyWater.spellLevel = 1;
        createOrDistroyWater.school = "Transmutation";
        //                      bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, true, true, false, false, false, false, false};
        createOrDistroyWater.spells =  classProf.clone();
        createOrDistroyWater.range = "30";
        createOrDistroyWater.components = "V, S, M (a drop of water if creating water\n" +
                "or a few grains of sand if destroying it)";
        createOrDistroyWater.duration = "Instantaneous";
        createOrDistroyWater.castTime = "1 Action";
        createOrDistroyWater.flavor =  "You either create or destroy water.\n" +
                "Create Water. You create up to 10 gallons of clean\n" +
                "water within range in an open container. Alternatively, the water falls as rain in a 30-foot cube within range, extinguishing exposed flames in the area.\n" +
                "Destroy Water. You destroy up to 10 gallons of water in an open container within range. Alternatively, you destroy fog in a 30-foot cube within range.\n" +
                "AtHigherLevels. When you cast this spell using a spell slot of 2nd level or higher, you create or destroy 10 additional gallons of water, or the size of the cube increases by 5 feet, for each slot level above 1st.\n";
    }

    Data cureWounds = new Data(); //declare a new ability object
    public void setCureWounds(Data cureWounds) { //populate it
        cureWounds.abilName = "Cure Wounds";
        cureWounds.spellLevel = 1;
        cureWounds.school = "Evocation";
        //                      bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {true, true, true, true, true, false, false, false};
        cureWounds.spells =  classProf.clone();
        cureWounds.range = "Touch";
        cureWounds.components = "V, S";
        cureWounds.duration = "Instantaneous";
        cureWounds.castTime = "1 Action";
        cureWounds.flavor =  "A creature you touch regains a number of hit points equal to 1d8 + your spellcasting ability modifier. This spell has no effect on undead or constructs.\n" +
                "AtHigherLevels. When you cast this spell using a spell slot of 2nd level or higher, the healing increases by\n" +
                "1d8 for each slot level above 1st.";
    }

    Data dancingLights = new Data(); //declare a new ability object
    public void setDancingLights(Data dancingLights) { //populate it
        dancingLights.abilName = "Dancing Lights";
        dancingLights.spellLevel = 0;
        dancingLights.school = "Evocation";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {true, false, false, false, false, false, false, true};
        dancingLights.spells =  classProf.clone();
        dancingLights.range = "120";
        dancingLights.components = "V, S, M (a bit of phosphorus or wychwood,\n" +
                "or a glowworm)";
        dancingLights.duration = "Concentration, up to 1 minute";
        dancingLights.castTime = "1 Action";
        dancingLights.flavor =  "You create up to four torch-sized lights within range, making them appear as torches, lanterns, or glowing orbs that hover in the air for the duration. You can also combine the four lights into one glowing vaguely humanoid form of Medium size. Whichever form you choose, each light sheds dim light in a 10-foot radius.\n" +
                "As a bonus action on your turn, you can move the lights up to 60 feet to a new spot within range. A light must be within 20 feet of another light created by this spell, and a light winks out if it exceeds the spell’s range.\n";
    }

    Data detectEvilAndGood = new Data(); //declare a new ability object
    public void setDetectEvilAndGood(Data detectEvilAndGood) { //populate it
        detectEvilAndGood.abilName = "Detect Evil and Good";
        detectEvilAndGood.spellLevel = 1;
        detectEvilAndGood.school = "Divination";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, true, false, true, false, false, false, false};
        detectEvilAndGood.spells =  classProf.clone();
        detectEvilAndGood.range = "Self";
        detectEvilAndGood.components = "V, S";
        detectEvilAndGood.duration = "Concentration, up to 10 minute";
        detectEvilAndGood.castTime = "1 Action";
        detectEvilAndGood.flavor =  "For the duration, you know if there is an aberration, celestial, elemental, fey, fiend, or undead within 30 feet of you, as well as where the creature is located. Similarly, you know if there is a place or object within 30 feet of you that has been magically consecrated\n" +
                "or desecrated.\n" +
                "The spell can penetrate most barriers, but it is blocked\n" +
                "by 1 foot of stone, 1 inch of common metal, a thin sheet of lead, or 3 feet of wood or dirt.";
    }

    Data detectMagic = new Data(); //declare a new ability object
    public void setDetectMagic(Data detectMagic) { //populate it
        detectMagic.abilName = "Detect Magic (Ritual)";
        detectMagic.spellLevel = 1;
        detectMagic.school = "Divination";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {true, true, true, true, false, true, false, true};
        detectMagic.spells =  classProf.clone();
        detectMagic.range = "Self";
        detectMagic.components = "V, S";
        detectMagic.duration = "Concentration, up to 10 minute";
        detectMagic.castTime = "1 Action";
        detectMagic.flavor =  "For the duration, you sense the presence of magic\n" +
                "within 30 feet of you. If you sense magic in this way, you can use your action to see a faint aura around any visible creature or object in the area that bears magic, and you learn its school of magic, if any.\n" +
                "The spell can penetrate most barriers, but it is blocked by 1 foot of stone, 1 inch of common metal, a thin sheet of lead, or 3 feet of wood or dirt.";
    }

    Data detectPoisonAndDisease = new Data(); //declare a new ability object
    public void setDetectPoisonAndDisease(Data detectPoisonAndDisease) { //populate it
        detectPoisonAndDisease.abilName = "Detect Poison and Disease (ritual)";
        detectPoisonAndDisease.spellLevel = 1;
        detectPoisonAndDisease.school = "Divination";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, true, true, true, true, false, false, false};
        detectPoisonAndDisease.spells =  classProf.clone();
        detectPoisonAndDisease.range = "Self";
        detectPoisonAndDisease.components = "V, S, M (a yew leaf)";
        detectPoisonAndDisease.duration = "Concentration, up to 10 minute";
        detectPoisonAndDisease.castTime = "1 Action";
        detectPoisonAndDisease.flavor =  "For the duration, you can sense the presence and location of poisons, poisonous creatures, and diseases within 30 feet of you. You also identify the kind of poison, poisonous creature, or disease in each case.\n" +
                "The spell can penetrate most barriers, but it is blocked by 1 foot of stone, 1 inch of common metal, a thin sheet of lead, or 3 feet of wood or dirt.";
    }

    Data disguiseSelf = new Data(); //declare a new ability object
    public void setDisguiseSelf(Data disguiseSelf) { //populate it
        disguiseSelf.abilName = "Disguise Self";
        disguiseSelf.spellLevel = 1;
        disguiseSelf.school = "Illusion";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {true, false, false, false, false, true, false, true};
        disguiseSelf.spells =  classProf.clone();
        disguiseSelf.range = "Self";
        disguiseSelf.components = "V, S";
        disguiseSelf.duration = "1 Hour";
        disguiseSelf.castTime = "1 Action";
        disguiseSelf.flavor =  "You make yourself—including your clothing, armor, weapons, and other belongings on your person—look different until the spell ends or until you use your action to dismiss it. You can seem 1 foot shorter or taller and can appear thin, fat, or in between. You can’t change your body type, so you must adopt a form that has the same basic arrangement of limbs. Otherwise, the extent of the illusion is up to you.\n" +
                "The changes wrought by this spell fail to hold up to physical inspection. For example, if you use this spell\n" +
                "to add a hat to your outfit, objects pass through the hat, and anyone who touches it would feel nothing or would feel your head and hair. If you use this spell to appear thinner than you are, the hand of someone who reaches out to touch you would bump into you while it was seemingly still in midair.\n" +
                "To discern that you are disguised, a creature can use its action to inspect your appearance and must succeed on an Intelligence (Investigation) check against your spell save DC.\n";
    }

    Data dissonantWhispers = new Data(); //declare a new ability object
    public void setDissonantWhispers(Data dissonantWhispers) { //populate it
        dissonantWhispers.abilName = "Dissonant Whispers";
        dissonantWhispers.spellLevel = 1;
        dissonantWhispers.school = "Enchantment";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {true, false, false, false, false, false, false, false};
        dissonantWhispers.spells =  classProf.clone();
        dissonantWhispers.range = "60";
        dissonantWhispers.components = "V";
        dissonantWhispers.duration = "Instantaneous";
        dissonantWhispers.castTime = "1 Action";
        dissonantWhispers.flavor =  "You whisper a discordant melody that only one creature of your choice within range can hear, wracking it with terrible pain. The target must make a Wisdom saving throw. On a failed save, it takes 3d6 psychic damage and must immediately use its reaction, if available, to move as far as its speed allows away from you. The creature doesn’t move into obviously dangerous ground, such\n" +
                "as a fire or a pit. On a successful save, the target takes half as much damage and doesn’t have to move away. A deafened creature automatically succeeds on the save.\n" +
                "AtHigherLevels.Whenyoucastthisspellusinga spell slot of 2nd level or higher, the damage increases by 1d6 for each slot level above 1st.";
    }

    Data divineFavor = new Data(); //declare a new ability object
    public void setDivineFavor(Data divineFavor) { //populate it
        divineFavor.abilName = "Divine Favor";
        divineFavor.spellLevel = 1;
        divineFavor.school = "Evocation";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, false, true, false, false, false, false};
        divineFavor.spells =  classProf.clone();
        divineFavor.range = "Self";
        divineFavor.components = "V, S";
        divineFavor.duration = "Concentration, up to 1 minute";
        divineFavor.castTime = "1 Action";
        divineFavor.flavor =  "Your prayer empowers you with divine radiance. Until the spell ends, your weapon attacks deal an extra 1d4 radiant damage on a hit.";
    }

    Data druidcraft = new Data(); //declare a new ability object
    public void setDruidcraft(Data druidcraft) { //populate it
        druidcraft.abilName = "Druidcraft";
        druidcraft.spellLevel = 0;
        druidcraft.school = "Transmutation";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, true, false, false, false, false, false};
        druidcraft.spells =  classProf.clone();
        druidcraft.range = "30";
        druidcraft.components = "V, S";
        druidcraft.duration = "Instantaneous";
        druidcraft.castTime = "1 Action";
        druidcraft.flavor =  "Whispering to the spirits of nature, you create one of the following effects within range:\n" +
                "• You create a tiny, harmless sensory effect that predicts what the weather will be at your location for the next 24 hours. The effect might manifest as a golden orb for clear skies, a cloud for rain, falling snowflakes for\n" +
                "snow, and so on. This effect persists for 1 round.\n" +
                "• You instantly make a flower blossom, a seed pod open,\n" +
                "or a leaf bud bloom.\n" +
                "• You create an instantaneous, harmless sensory effect,\n" +
                "such as falling leaves, a puff of wind, the sound of a small animal, or the faint odor of skunk. The effect must fit in a 5-foot cube.\n" +
                "• You instantly light or snuff out a candle, a torch, or a small campfire.\n";
    }

    Data eldrichBlast = new Data(); //declare a new ability object
    public void setEldrichBlast(Data eldrichBlast) { //populate it
        eldrichBlast.abilName = "Eldrich Blast";
        eldrichBlast.spellLevel = 0;
        eldrichBlast.school = "Evocation";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, false, false, false, false, true, false};
        eldrichBlast.spells =  classProf.clone();
        eldrichBlast.range = "120";
        eldrichBlast.components = "V, S";
        eldrichBlast.duration = "Instantaneous";
        eldrichBlast.castTime = "1 Action";
        eldrichBlast.flavor =  "A beam of crackling energy streaks toward a creature within range. Make a ranged spell attack against the target. On a hit, the target takes 1dlO force damage.\n" +
                "The spell creates more than one beam when you reach higher levels: two beams at 5th level, three beams at 11th level, and four beams at 17th level. You can direct the beams at the same target or at different ones. Make a separate attack roll for each beam.\n";
    }

    Data ensnaringStrike = new Data(); //declare a new ability object
    public void setEnsnaringStrike(Data ensnaringStrike) { //populate it
        ensnaringStrike.abilName = "Ensnaring Strike";
        ensnaringStrike.spellLevel = 1;
        ensnaringStrike.school = "Conjuration";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, false, false, true, false, false, false};
        ensnaringStrike.spells =  classProf.clone();
        ensnaringStrike.range = "Self";
        ensnaringStrike.components = "V";
        ensnaringStrike.duration = "Concentration, up to 1 minute";
        ensnaringStrike.castTime = "1 Action";
        ensnaringStrike.flavor = "The next time you hit a creature with a weapon attack before this spell ends, a writhing mass of thorny vines appears at the point of impact, and the target must succeed on a Strength saving throw or be restrained by the magical vines until the spell ends. A Large or larger creature has advantage on this saving throw. If the target succeeds on the save, the vines shrivel away.\n" +
                "While restrained by this spell, the target takes 1d6 piercing damage at the start of each of its turns. A creature restrained by the vines or one that can touch the creature can use its action to make a Strength check against your spell save DC. On a success, the target is freed.\n" +
                "AtHigherLevels. If you cast this spell using a spell slot of 2nd level or higher, the damage increases by 1d6 for each slot level above 1st.";
    }

    Data entangle = new Data(); //declare a new ability object
    public void setEntangle(Data entangle) { //populate it
        entangle.abilName = "Entangle";
        entangle.spellLevel = 1;
        entangle.school = "Conjuration";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, true, false, false, false, false, false};
        entangle.spells =  classProf.clone();
        entangle.range = "90";
        entangle.components = "V, S";
        entangle.duration = "Concentration, up to 1 minute";
        entangle.castTime = "1 Action";
        entangle.flavor = "Grasping weeds and vines sprout from the ground in a 20-foot square starting from a point within range. For the duration, these plants turn the ground in the area into difficult terrain.\n" +
                "A creature in the area when you cast the spell must succeed on a Strength saving throw or be restrained by the entangling plants until the spell ends. A creature restrained by the plants can use its action to make\n" +
                "a Strength check against your spell save DC. On a success,itfreesitself.\n" +
                "When the spell ends, the conjured plants wilt away.";
    }

    Data expeditiousRetreat = new Data(); //declare a new ability object
    public void setExpeditiousRetreat(Data expeditiousRetreat) { //populate it
        expeditiousRetreat.abilName = "Expedious Retreat";
        expeditiousRetreat.spellLevel = 1;
        expeditiousRetreat.school = "Transmutation";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, false, false, false, false, true, false};
        expeditiousRetreat.spells =  classProf.clone();
        expeditiousRetreat.range = "Self";
        expeditiousRetreat.components = "V, S";
        expeditiousRetreat.duration = "Concentration, up to 10 minute";
        expeditiousRetreat.castTime = "1 Action";
        expeditiousRetreat.flavor = "This spell allows you to move at an incredible pace. When you cast this spell, and then as a bonus action on each of your turns until the spell ends, you can take the Dash action.";
    }

    Data faerieFire = new Data(); //declare a new ability object
    public void setFaerieFire(Data faerieFire) { //populate it
        faerieFire.abilName = "Faerie Fire";
        faerieFire.spellLevel = 1;
        faerieFire.school = "Envocation";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {true, false, true, false, false, false, false, false};
        faerieFire.spells =  classProf.clone();
        faerieFire.range = "60";
        faerieFire.components = "V";
        faerieFire.duration = "Concentration, up to 10 minute";
        faerieFire.castTime = "1 Action";
        faerieFire.flavor = "Each object in a 20-foot cube within range is outlined in blue, green, or violet light (your choice). Any creature in the area when the spell is cast is also outlined in light if it fails a Dexterity saving throw. For the duration, objects and affected creatures shed dim light in a 10-foot radius.\n" +
                "Any attack roll against an affected creature or object has advantage if the attacker can see it, and the affected creature or object can’t benefit from being invisible.";
    }

    Data falseLife = new Data(); //declare a new ability object
    public void setFalseLife(Data falseLife) { //populate it
        falseLife.abilName = "False Life";
        falseLife.spellLevel = 1;
        falseLife.school = "Necromancy";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, false, false, false, true, false, true};
        falseLife.spells =  classProf.clone();
        falseLife.range = "Self";
        falseLife.components = "V, S, M (a small amount of alcohol or\n" +
                "distilled spirits)";
        falseLife.duration = "1 Hour";
        falseLife.castTime = "1 Action";
        falseLife.flavor = "Bolstering yourself with a necromantic facsimile of life, you gain 1d4 + 4 temporary hit points for the duration.\n" +
                "AtHigherLevels. When you cast this spell using a spell slot of 2nd level or higher, you gain 5 additional temporary hit points for each slot level above 1st.";
    }

    Data featherFall = new Data(); //declare a new ability object
    public void setFeatherFall(Data featherFall) { //populate it
        featherFall.abilName = "Feather Fall";
        featherFall.spellLevel = 1;
        featherFall.school = "Transmutation";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {true, false, false, false, false, true, false, true};
        featherFall.spells =  classProf.clone();
        featherFall.range = "60";
        featherFall.components = "V, M (a small feather or piece of down)";
        featherFall.duration = "1 Minute";
        featherFall.castTime = "1 reaction, which you take when you or a creature within 60 feet of you falls";
        featherFall.flavor = "Choose up to five falling creatures within range. A falling creature's rate of descent slows to 60 feet per round until the spell ends. If the creature lands before the spell ends, it takes no falling damage and can land on its feet, and the spell ends for that creature.";
    }

    Data findFamiliar = new Data(); //declare a new ability object
    public void setFindFamiliar(Data findFamiliar) { //populate it
        findFamiliar.abilName = "Find Familiar";
        findFamiliar.spellLevel = 1;
        findFamiliar.school = "Conjuration (Ritual)";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, false, false, false, false, false, true};
        findFamiliar.spells =  classProf.clone();
        findFamiliar.range = "10";
        findFamiliar.components = "V, S, M (10 gp worth of charcoal,\n" +
                "incense, and herbs that must be consumed by fire in a\n" +
                "brass brazier)";
        findFamiliar.duration = "Instantaneous";
        findFamiliar.castTime = "1 Hour";
        findFamiliar.flavor = "You gain the service of a familiar, a spirit that takes an animal form you choose: bat, cat, crab, frog (toad), hawk, lizard, octopus, owl, poisonous snake, fish (quipper),\n" +
                "rat, raven, sea horse, spider, or weasel. Appearing in\n" +
                "an unoccupied space within range, the familiar has the statistics of the chosen form, though it is a celestial, fey, or fiend (your choice) instead of a beast.\n" +
                "Your familiar acts independently of you, but it always obeys your commands. In combat, it rolls its own initiative and acts on its own turn. A familiar can’t attack, but it can take other actions as normal.\n" +
                "When the familiar drops to 0 hit points, it disappears, leaving behind no physical form. It reappears after you cast this spell again\n" +
                "While your familiar is within 100 feet of you, you\n" +
                "can communicate with it telepathically. Additionally, as an action, you can see through your familiar’s eyes and hear what it hears until the start of your next turn, gaining the benefits of any special senses that the familiar has. During this time, you are deaf and blind with regard to your own senses.\n" +
                "As an action, you can temporarily dismiss your familiar. It disappears into a pocket dimension where it awaits your summons. Alternatively, you can dismiss it forever. As an action while it is temporarily dismissed, you can cause it to reappear in any unoccupied space within 30 feet of you.\n" +
                "You can’t have more than one familiar at a time. If you cast this spell while you already have a familiar, you instead cause it to adopt a new form. Choose one of the forms from the above list. Your familiar transforms into the chosen creature.\n" +
                "Finally, when you cast a spell with a range of touch, your familiar can deliver the spell as if it had cast the spell. Your familiar must be within 100 feet of you, and it must use its reaction to deliver the spell when you cast it. If the spell requires an attack roll, you use your attack modifier for the roll.";
    }

    Data fireBolt = new Data(); //declare a new ability object
    public void setFireBolt(Data fireBolt) { //populate it
        fireBolt.abilName = "Fire Bolt";
        fireBolt.spellLevel = 0;
        fireBolt.school = "Evocation";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, false, false, false, true, false, true};
        fireBolt.spells =  classProf.clone();
        fireBolt.range = "120";
        fireBolt.components = "V, S";
        fireBolt.duration = "Instantaneous";
        fireBolt.castTime = "1 action";
        fireBolt.flavor = "You hurl a mote of fire at a creature or object within range. Make a ranged spell attack against the\n" +
                "target. On a hit, the target takes 1d10 fire damage. A flammable object hit by this spell ignites if it isn't being worn or carried.\n" +
                "This spell’s damage increases by 1d10 when you reach 5th level (2d10), 11th level (3d10), and 17th level (4d10).";
    }

    Data fogCloud = new Data(); //declare a new ability object
    public void setFogCloud(Data fogCloud) { //populate it
        fogCloud.abilName = "Fog Cloud";
        fogCloud.spellLevel = 1;
        fogCloud.school = "Conjuration";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, true, false, true, true, false, true};
        fogCloud.spells =  classProf.clone();
        fogCloud.range = "120";
        fogCloud.components = "V, S";
        fogCloud.duration = "Concentration, up to 1 hour";
        fogCloud.castTime = "1 action";
        fogCloud.flavor = "You create a 20-foot-radius sphere of fog centered on a point within range. The sphere spreads around corners, and its area is heavily obscured. It lasts for the duration or until a wind of moderate or greater speed (at least 10 miles per hour) disperses it.\n" +
                "AtHigherLevels. When you cast this spell using a spell slot of 2nd level or higher, the radius of the fog increases by 20 feet for each slot level above 1st.";
    }

    Data friends = new Data(); //declare a new ability object
    public void setFriends(Data friends) { //populate it
        friends.abilName = "Friends";
        friends.spellLevel = 0;
        friends.school = "Enchantment";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {true, false, false, false, true, true, true, true};
        friends.spells =  classProf.clone();
        friends.range = "Self";
        friends.components = "S, M (a small amount of makeup applied\n" +
                "to the face as this spell is cast)";
        friends.duration = "Concentration, up to 1 minute";
        friends.castTime = "1 action";
        friends.flavor = "For the duration, you have advantage on all Charisma checks directed at one creature of your choice that isn’t hostile toward you. When the spell ends, the creature realizes that you used magic to influence its mood\n" +
                "and becomes hostile toward you. A creature prone\n" +
                "to violence might attack you. Another creature might seek retribution in other ways (at the DM’s discretion), depending on the nature of your interaction with it.";
    }

    Data goodberry = new Data(); //declare a new ability object
    public void setGoodberry(Data goodberry) { //populate it
        goodberry.abilName = "Goodberry";
        goodberry.spellLevel = 1;
        goodberry.school = "Transmutation";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, true, false, true, false, false, false};
        goodberry.spells =  classProf.clone();
        goodberry.range = "Touch";
        goodberry.components = "V, S, M (a sprig of mistletoe)";
        goodberry.duration = "Instantaneous";
        goodberry.castTime = "1 action";
        goodberry.flavor = "Up to ten berries appear in your hand and are infused with magic for the duration. A creature can use its action to eat one berry. Eating a berry restores 1 hit point, and the berry provides enough nourishment to sustain a creature for one day.\n" +
                "The berries lose their potency if they have not been consumed within 24 hours of the casting of this spell.";
    }

    Data grease = new Data(); //declare a new ability object
    public void setGrease(Data grease) { //populate it
        grease.abilName = "Grease";
        grease.spellLevel = 1;
        grease.school = "Conjuration";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, false, false, false, false, false, true};
        grease.spells =  classProf.clone();
        grease.range = "60";
        grease.components = "V, S, M (a bit of pork rind or butter)";
        grease.duration = "1 Minute";
        grease.castTime = "1 action";
        grease.flavor = "Slick grease covers the ground in a 10-foot square centered on a point within range and turns it into difficult terrain for the duration.\n" +
                "When the grease appears, each creature standing in its area must succeed on a Dexterity saving throw or fall prone. A creature that enters the area or ends its turn there must also succeed on a Dexterity saving throw\n" +
                "or fall prone.";
    }

    Data guidance = new Data(); //declare a new ability object
    public void setGuidance(Data guidance) { //populate it
        guidance.abilName = "Guidance";
        guidance.spellLevel = 0;
        guidance.school = "Divination";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, true, true, false, false, false, false, false};
        guidance.spells =  classProf.clone();
        guidance.range = "Touch";
        guidance.components = "V, S";
        guidance.duration = "Concentration, up to 1 minute";
        guidance.castTime = "1 action";
        guidance.flavor = "You touch one willing creature. Once before the spell ends, the target can roll a d4 and add the number rolled to one ability check of its choice. It can roll the die before or after making the ability check. The spell then ends.";
    }

    Data guidingBolt = new Data(); //declare a new ability object
    public void setGuidingBolt(Data guidingBolt) { //populate it
        guidingBolt.abilName = "Guiding Bolt";
        guidingBolt.spellLevel = 1;
        guidingBolt.school = "Evocation";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, true, false, false, false, false, false, false};
        guidingBolt.spells =  classProf.clone();
        guidingBolt.range = "Self (60-foot line)";
        guidingBolt.components = "V, S, M (a legume seed)";
        guidingBolt.duration = "Concentration, up to 1 minute";
        guidingBolt.castTime = "1 action";
        guidingBolt.flavor = "A line of strong wind 60 feet long and 10 feet wide blasts from you in a direction you choose for the spell’s duration. Each creature that starts its turn in the line must succeed on a Strength saving throw or be pushed 15 feet away from you in a direction following the line.\n" +
                "Any creature in the line must spend 2 feet of movement for every 1 foot it moves when moving closer to you.\n" +
                "The gust disperses gas or vapor, and it extinguishes candles, torches, and similar unprotected flames in\n" +
                "the area. It causes protected flames, such as those of lanterns, to dance wildly and has a 50 percent chance to extinguish them.\n" +
                "As a bonus action on each of your turns before the spell ends, you can change the direction in which the line blasts from you.";
    }

    Data hailOfThorns = new Data(); //declare a new ability object
    public void setHailOfThorns(Data hailOfThorns) { //populate it
        hailOfThorns.abilName = "Hail of Thorns";
        hailOfThorns.spellLevel = 1;
        hailOfThorns.school = "Conjuration";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, false, false, true, false, false, false};
        hailOfThorns.spells =  classProf.clone();
        hailOfThorns.range = "Self";
        hailOfThorns.components = "V";
        hailOfThorns.duration = "Concentration, up to 1 minute";
        hailOfThorns.castTime = "1 bonus action";
        hailOfThorns.flavor = "The next time you hit a creature with a ranged weapon attack before the spell ends, this spell creates a rain\n" +
                "of thorns that sprouts from your ranged weapon or ammunition. In addition to the normal effect of the attack, the target of the attack and each creature within 5 feet of it must make a Dexterity saving throw. A creature takes 1dlO piercing damage on a failed save, or half as much damage on a successful one.\n" +
                "AtHigherLevels. If you cast this spell using a spell slot of 2nd level or higher, the damage increases by 1d10 for each slot level above 1st (to a maximum of 6d10).";
    }

    Data healingWord = new Data(); //declare a new ability object
    public void setHealingWord(Data healingWord) { //populate it
        healingWord.abilName = "Healing Word";
        healingWord.spellLevel = 1;
        healingWord.school = "Evocation";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {true, true, true, false, false, false, false, false};
        healingWord.spells =  classProf.clone();
        healingWord.range = "60";
        healingWord.components = "V";
        healingWord.duration = "Instantaneous";
        healingWord.castTime = "1 bonus action";
        healingWord.flavor = "A creature of your choice that you can see within range regains hit points equal to 1d4 + your spellcasting ability modifier. This spell has no effect on undead\n" +
                "or constructs.\n" +
                "AtHigherLevels. When you cast this spell using a spell slot of 2nd level or higher, the healing increases by 1d4 for each slot level above 1st.\n";
    }

    Data hellishRebuke = new Data(); //declare a new ability object
    public void setHellishRebuke(Data hellishRebuke) { //populate it
        hellishRebuke.abilName = "Hellish Rebuke";
        hellishRebuke.spellLevel = 1;
        hellishRebuke.school = "Evocation";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, false, false, false, false, true, false};
        hellishRebuke.spells =  classProf.clone();
        hellishRebuke.range = "60";
        hellishRebuke.components = "V, S";
        hellishRebuke.duration = "Instantaneous";
        hellishRebuke.castTime = "1 reaction, which you take in response to being damaged by a creature within 60 feet of you that you can see";
        hellishRebuke.flavor = "A creature of your choice that you can see within range regains hit points equal to 1d4 + your spellcasting ability modifier. This spell has no effect on undead\n" +
                "or constructs.\n" +
                "AtHigherLevels. When you cast this spell using a spell slot of 2nd level or higher, the healing increases by 1d4 for each slot level above 1st.\n";
    }

    Data heroism = new Data(); //declare a new ability object
    public void setHeroism(Data heroism) { //populate it
        heroism.abilName = "Heroism";
        heroism.spellLevel = 1;
        heroism.school = "Enchantment";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {true, false, false, true, false, false, false, false};
        heroism.spells =  classProf.clone();
        heroism.range = "Touch";
        heroism.components = "V, S";
        heroism.duration = "Concentration, up to 1 minute";
        heroism.castTime = "1 reaction, which you take in response to being damaged by a creature within 60 feet of you that you can see";
        heroism.flavor = "A willing creature you touch is imbued with bravery. Until the spell ends, the creature is immune to being frightened and gains temporary hit points equal to your spellcasting ability modifier at the start of each of its turns. When the spell ends, the target loses any remaining temporary hit points from this spell.";
    }

    Data hex = new Data(); //declare a new ability object
    public void setHex(Data hex) { //populate it
        hex.abilName = "hex";
        hex.spellLevel = 1;
        hex.school = "Enchantment";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, false, false, false, false, true, false};
        hex.spells =  classProf.clone();
        hex.range = "90";
        hex.components = "V, S, M (the petrified eye of a newt)";
        hex.duration = "Concentration, up to 1 hour";
        hex.castTime = "1 bonus action";
        hex.flavor = "You place a curse on a creature that you can see within range. Until the spell ends, you deal an extra 1d6 necrotic damage to the target whenever you hit it with an attack. Also, choose one ability when you cast the spell. The target has disadvantage on ability checks made with the chosen ability.\n" +
                "If the target drops to 0 hit points before this spell ends, you can use a bonus action on a subsequent turn of yours to curse a new creature.\n" +
                "A remove curse cast on the target ends this spell early.\n" +
                "AtHigherLevels. When you cast this spell using aspellslotof3rdor4thlevel,youcanmaintainyour concentration on the spell for up to 8 hours. When you use a spell slot of 5th level or higher, you can maintain your concentration on the spell for up to 24 hours.";
    }

    Data huntersMark = new Data(); //declare a new ability object
    public void setHuntersMark(Data huntersMark) { //populate it
        huntersMark.abilName = "Hunters Mark";
        huntersMark.spellLevel = 1;
        huntersMark.school = "Divination";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, false, false, true, false, false, false};
        huntersMark.spells =  classProf.clone();
        huntersMark.range = "90";
        huntersMark.components = "V";
        huntersMark.duration = "Concentration, up to 1 hour";
        huntersMark.castTime = "1 bonus action";
        huntersMark.flavor = "You choose a creature you can see within range and mystically mark it as your quarry. Until the spell ends, you deal an extra 1d6 damage to the target whenever you hit it with a weapon attack, and you have advantage on any W isdom (Perception) or W isdom (Survival) check you make to find it. If the target drops to 0 hit points before this spell ends, you can use a bonus action on a subsequent turn of yours to mark a new creature.\n" +
                "AtHigherLevels. When you cast this spell using\n" +
                "a spell slot of 3rd or 4th level, you can maintain your concentration on the spell for up to 8 hours. When you use a spell slot of 5th level or higher, you can maintain your concentration on the spell for up to 24 hours.";
    }

    Data identify = new Data(); //declare a new ability object
    public void setIdentify(Data identify) { //populate it
        identify.abilName = "Identify";
        identify.spellLevel = 1;
        identify.school = "Divination (Ritual)";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {true, false, false, false, false, false, false, true};
        identify.spells =  classProf.clone();
        identify.range = "Touch";
        identify.components = "V, S, M (a pearl worth at least 100 gp and\n" +
                "an owl feather)";
        identify.duration = "Instantaneous";
        identify.castTime = "1 Minute";
        identify.flavor = "You choose one object that you must touch throughout the casting of the spell. If it is a magic item or some other magic-imbued object, you learn its properties\n" +
                "and how to use them, whether it requires attunement to use, and how many charges it has, if any. You learn whether any spells are affecting the item and what they are. If the item was created by a spell, you learn which spell created it.\n" +
                "If you instead touch a creature throughout the casting, you learn what spells, if any, are currently affecting it.";
    }

    Data illusoryScript = new Data(); //declare a new ability object
    public void setIllusoryScript(Data illusoryScript) { //populate it
        illusoryScript.abilName = "Illusory Script";
        illusoryScript.spellLevel = 1;
        illusoryScript.school = "Illusion (Ritual)";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {true, false, false, false, false, false, true, true};
        illusoryScript.spells =  classProf.clone();
        illusoryScript.range = "Touch";
        illusoryScript.components = "S,M(alead-basedinkworthatleast10 gp, which the spell consumes)";
        illusoryScript.duration = "10 Days";
        illusoryScript.castTime = "1 Minute";
        illusoryScript.flavor = "You write on parchment, paper, or some other suitable writing material and imbue it with a potent illusion that lasts for the duration.\n" +
                "To you and any creatures you designate when you\n" +
                "cast the spell, the writing appears normal, written in your hand, and conveys whatever meaning you intended when you wrote the text. To all others, the writing appears as if it were written in an unknown or magical script that is unintelligible. Alternatively, you can cause the writing to appear to be an entirely different message, written in a different hand and language, though the language must be one you know.\n" +
                "Should the spell be dispelled, the original script and the illusion both disappear.\n" +
                "A creature with truesight can read the hidden message.";
    }

    Data inflictWounds = new Data(); //declare a new ability object
    public void setInflictWounds(Data inflictWounds) { //populate it
        inflictWounds.abilName = "Inflict Wounds";
        inflictWounds.spellLevel = 1;
        inflictWounds.school = "Necromancy";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, true, false, false, false, false, false, false};
        inflictWounds.spells =  classProf.clone();
        inflictWounds.range = "Touch";
        inflictWounds.components = "V,S";
        inflictWounds.duration = "Instantaneous";
        inflictWounds.castTime = "1 action";
        inflictWounds.flavor = "Make a melee spell attack against a creature you can reach. On a hit, the target takes 3d10 necrotic damage.\n" +
                "AtHigherLevels. When you cast this spell using a spell slot of 2nd level or higher, the damage increases by\n" +
                "1d10 for each slot level above 1st.";
    }

    Data jump = new Data(); //declare a new ability object
    public void setJump(Data jump) { //populate it
        jump.abilName = "Jump";
        jump.spellLevel = 1;
        jump.school = "Transmutation";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, false, false, false, false, false, false};
        jump.spells =  classProf.clone();
        jump.range = "Touch";
        jump.components = "V, S, M (a grasshopper’s hind leg)";
        jump.duration = "1 minute";
        jump.castTime = "1 action";
        jump.flavor = "You touch a creature. The creature’s jump distance is tripled until the spell ends.";
    }

    Data light = new Data(); //declare a new ability object
    public void setLight(Data light) { //populate it
        light.abilName = "Light";
        light.spellLevel = 0;
        light.school = "Evocation";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {true, true, false, false, false, true, false, true};
        light.spells =  classProf.clone();
        light.range = "Touch";
        light.components = "V, M (a firefly or phosphorescent moss)";
        light.duration = "1 Hour";
        light.castTime = "1 action";
        light.flavor = "You touch one object that is no larger than 10 feet in any dimension. Until the spell ends, the object sheds bright light in a 20-foot radius and dim light for an additional 20 feet. The light can be colored as you like. Completely covering the object with something opaque blocks the light. The spell ends if you cast it again or dismiss it\n" +
                "as an action.\n" +
                "If you target an object held or worn by a hostile\n" +
                "creature, that creature must succeed on a Dexterity saving throw to avoid the spell.";
    }

    Data longstrider = new Data(); //declare a new ability object
    public void setLongstrider(Data longstrider) { //populate it
        longstrider.abilName = "Longstrider";
        longstrider.spellLevel = 1;
        longstrider.school = "Transmutation";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, true, false, false, true, false, true};
        longstrider.spells =  classProf.clone();
        longstrider.range = "Touch";
        longstrider.components = "V, S, M (a pinch of dirt)";
        longstrider.duration = "1 Hour";
        longstrider.castTime = "1 action";
        longstrider.flavor = "You touch a creature. The target’s speed increases by 10 feet until the spell ends. AtHigherLevels.Whenyoucastthisspellusing a spell slot of 2nd level or higher, you can target one additional creature for each slot level above 1st.";
    }

    Data mageArmor = new Data(); //declare a new ability object
    public void setMageArmor(Data mageArmor) { //populate it
        mageArmor.abilName = "Mage Armor";
        mageArmor.spellLevel = 1;
        mageArmor.school = "Abjuration";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, false, false, false, true, false, true};
        mageArmor.spells =  classProf.clone();
        mageArmor.range = "Touch";
        mageArmor.components = "V, S, M (a piece of cured leather)";
        mageArmor.duration = "8 Hour";
        mageArmor.castTime = "1 action";
        mageArmor.flavor = "You touch a willing creature who isn’t wearing armor, and a protective magical force surrounds it until the spellends.Thetarget’sbaseACbecomes13+its Dexterity modifier. The spell ends if the target dons armor or ifyou dismiss the spell as an action.";
    }

    Data mageHand = new Data(); //declare a new ability object
    public void setMageHand(Data mageHand) { //populate it
        mageHand.abilName = "Mage Hand";
        mageHand.spellLevel = 0;
        mageHand.school = "Conjuration";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {true, false, false, false, false, true, true, true};
        mageHand.spells =  classProf.clone();
        mageHand.range = "30";
        mageHand.components = "V, S";
        mageHand.duration = "1 minute";
        mageHand.castTime = "1 action";
        mageHand.flavor = "A spectral, floating hand appears at a point you choose within range. The hand lasts for the duration or until you dismiss it as an action. The hand vanishes if it is ever m ore than 30 feet away from you or if you cast this spell again.\n" +
                "You can use your action to control the hand. You can use the hand to manipulate an object, open an unlocked door or container, stow or retrieve an item from an open container, or pour the contents out of a vial. You can move the hand up to 30 feet each time you use it.\n" +
                "The hand can’t attack, activate magic items, or carry morethan10pounds.";
    }

    Data magicMissile = new Data(); //declare a new ability object
    public void setMagicMissile(Data magicMissile) { //populate it
        magicMissile.abilName = "Magic Missile";
        magicMissile.spellLevel = 1;
        magicMissile.school = "Evocation";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, false, false, false, true, false, true};
        magicMissile.spells =  classProf.clone();
        magicMissile.range = "120";
        magicMissile.components = "V, S";
        magicMissile.duration = "Instantaneous";
        magicMissile.castTime = "1 action";
        magicMissile.flavor = "You create three glowing darts of magical force. Each darthitsacreatureofyourchoicethatyoucansee within range. A dart deals 1d4 + 1 force damage to its target. The darts all strike simultaneously, and you can direct them to hit one creature or several.\n" +
                "AtHigherLevels. When you cast this spell using a spell slot of 2nd level or higher, the spell creates one more dart for each slot level above 1st.";
    }

    Data mending = new Data(); //declare a new ability object
    public void setMending(Data mending) { //populate it
        mending.abilName = "Mending";
        mending.spellLevel = 0;
        mending.school = "Transmutation";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {true, true, true, false, false, true, false, true};
        mending.spells =  classProf.clone();
        mending.range = "Touch";
        mending.components = "V, S, M (two lodestones)";
        mending.duration = "Instantaneous";
        mending.castTime = "1 Minute";
        mending.flavor = "This spell repairs a single break or tear in an object you touch, such as a broken chain link, two halves of a broken key, a torn cloak, or a leaking wineskin. As long as the break or tear is no larger than 1 foot in any dimension, you mend it. leaving no trace of the former damage.\n" +
                "This spell can physically repair a magic item or construct, but the spell can’t restore magic to such an object.";
    }

    Data message = new Data(); //declare a new ability object
    public void setMessage(Data message) { //populate it
        message.abilName = "Message";
        message.spellLevel = 0;
        message.school = "Transmutation";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {true, false, false, false, false, true, false, true};
        message.spells =  classProf.clone();
        message.range = "120";
        message.components = "V, S, M (a short piece of copper wire)";
        message.duration = "1 round";
        message.castTime = "1 action";
        message.flavor = "You point your finger toward a creature within range and whisper a message. The target (and only the target) hears the message and can reply in a whisper that only you can hear.\n" +
                "You can cast this spell through solid objects if you are familiar with the target and know it is beyond the barrier. Magical silence. 1 foot of stone, 1 inch of common metal, a thin sheet of lead, or 3 feet of wood blocks the spell. The spell doesn’t have to follow a straight line and can travel freely around corners or through openings.";
    }

    Data minorIllusion = new Data(); //declare a new ability object
    public void setMinorIllusion(Data minorIllusion) { //populate it
        minorIllusion.abilName = "Minor Illusion";
        minorIllusion.spellLevel = 0;
        minorIllusion.school = "Illusion";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {true, false, false, false, false, true, true, true};
        minorIllusion.spells =  classProf.clone();
        minorIllusion.range = "30";
        minorIllusion.components = "S, M (a bit of fleece)";
        minorIllusion.duration = "1 minute";
        minorIllusion.castTime = "1 action";
        minorIllusion.flavor = "You create a sound or an image of an object within\n" +
                "range that lasts for the duration. The illusion also ends if you dismiss it as an action or cast this spell again.\n" +
                "If you create a sound, its volume can range from a whisper to a scream. It can be your voice, someone else’s voice, a lion’s roar, a beating of drums, or any other sound you choose. The sound continues unabated throughout the duration, or you can make discrete sounds at different times before the spell ends.\n" +
                "If you create an image of an object—such as a chair, muddy footprints, or a small chest—it must be no larger than a 5-foot cube. The image can’t create sound, light, smell, or any other sensory effect. Physical interaction with the image reveals it to be an illusion, because things can pass through it.\n" +
                "If a creature uses its action to examine the sound or image, the creature can determine that it is an illusion with a successful Intelligence (Investigation) check against your spell save DC. If a creature discerns the illusion for what it is, the illusion becomes faint to\n" +
                "the creature.";
    }

    Data poisonSpray = new Data(); //declare a new ability object
    public void setPoisonSpray(Data poisonSpray) { //populate it
        poisonSpray.abilName = "Poison Spray";
        poisonSpray.spellLevel = 0;
        poisonSpray.school = "Conjuration";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, true, false, false, true, true, true};
        poisonSpray.spells =  classProf.clone();
        poisonSpray.range = "10";
        poisonSpray.components = "V, S";
        poisonSpray.duration = "Instantaneous";
        poisonSpray.castTime = "1 action";
        poisonSpray.flavor = "You extend your hand toward a creature you can see within range and project a puff of noxious gas from your palm. The creature must succeed on a Constitution saving throw or take 1d12 poison damage.\n" +
                "This spell’s damage increases by 1d12 when you reach 5th level (2d12), 11th level (3d12), and 17th level (4d12).\n";
    }

    Data prestidigitation = new Data(); //declare a new ability object
    public void setPrestidigitation(Data prestidigitation) { //populate it
        prestidigitation.abilName = "Prestidigitation";
        prestidigitation.spellLevel = 0;
        prestidigitation.school = "Transmutation";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {true, false, true, false, false, true, true, true};
        prestidigitation.spells =  classProf.clone();
        prestidigitation.range = "10";
        prestidigitation.components = "V, S";
        prestidigitation.duration = "Up to 1 Hour";
        prestidigitation.castTime = "1 action";
        prestidigitation.flavor = "This spell is a mino magical trick that novice spellcasters use for practice. You create one of the following magical effects within range:\n" +
                "• You create an instantaneous, harmless sensory effect, such as a shower of sparks, a puff of wind, faint musi cal notes, or an odd odor.\n" +
                "• You instantaneously light or snuff out a candle, a torch, or a small campfire.\n" +
                "• You instantaneously clean or soil an object no larger than 1 cubic foot.\n" +
                "• You chill, warm, or flavor up to 1 cubic foot of nonliv ing material for 1 hour.\n" +
                "• You make a color, a small mark, or a symbol appear on an object or a surface for 1 hour.\n" +
                "• You create a nonmagical trinket or an illusory image that can fit in your hand and that lasts until the end of your next turn.\n" +
                "If you cast this spell multiple times, you can have up to three of its non-instantaneous effects active at a time, and you can dismiss such an effect as an action.";
    }

    Data produceFlame = new Data(); //declare a new ability object
    public void setProduceFlame(Data produceFlame) { //populate it
        produceFlame.abilName = "Produce Flame";
        produceFlame.spellLevel = 0;
        produceFlame.school = "Conjuration";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, true, false, false, false, false, false};
        produceFlame.spells =  classProf.clone();
        produceFlame.range = "Self";
        produceFlame.components = "V, S";
        produceFlame.duration = "10 Minutes";
        produceFlame.castTime = "1 action";
        produceFlame.flavor = "A flickering flame appears in your hand. The flame remains there for the duration and harms neither you nor your equipment. The flame sheds bright light in a 10-foot radius and dim light for an additional 10 feet. The spell ends if you dismiss it as an action or if you cast it again.\n" +
                "You can also attack with the flame, although doing so ends the spell. When you cast this spell, or as an action on a later turn, you can hurl the flame at a creature within 30 feet of you. Make a ranged spell attack. On a hit, the target takes 1d8 fire damage.\n" +
                "This spell’s damage increases by 1d8 when you reach 5th level (2d8), 11th level (3d8), and 17th level (4d8).";
    }

    Data protectionFromEvilandGood = new Data(); //declare a new ability object
    public void setProtectionFromEvilandGood(Data protectionFromEvilandGood) { //populate it
        protectionFromEvilandGood.abilName = "Protection From Evil and Good";
        protectionFromEvilandGood.spellLevel = 1;
        protectionFromEvilandGood.school = "Abjuration";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, true, false, true, false, false, false, false};
        protectionFromEvilandGood.spells =  classProf.clone();
        protectionFromEvilandGood.range = "Touch";
        protectionFromEvilandGood.components = "V, S, M (holy water or powdered silver\n" +
                "and iron, which the spell consumes)";
        protectionFromEvilandGood.duration = "Concentration up to 10 Minutes";
        protectionFromEvilandGood.castTime = "1 action";
        protectionFromEvilandGood.flavor = "Until the spell ends, one willing creature you touch is protected against certain types of creatures: aberrations, celestials, elementals, fey, fiends, and undead.\n" +
                "The protection grants several benefits. Creatures of those types have disadvantage on attack rolls against the target. The target also can’t be charmed, frightened, or possessed by them. If the target is already charmed, frightened, or possessed by such a creature, the target has advantage on any new saving throw against the relevant effect.";
    }

    Data purifyFoodAndDrink = new Data(); //declare a new ability object
    public void setPurifyFoodAndDrink(Data purifyFoodAndDrink) { //populate it
        purifyFoodAndDrink.abilName = "Purify Food and Drink";
        purifyFoodAndDrink.spellLevel = 1;
        purifyFoodAndDrink.school = "Transmutation (ritual)";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, true, true, true, false, false, false, false};
        purifyFoodAndDrink.spells =  classProf.clone();
        purifyFoodAndDrink.range = "10";
        purifyFoodAndDrink.components = "V, S";
        purifyFoodAndDrink.duration = "Instantaneous";
        purifyFoodAndDrink.castTime = "1 action";
        purifyFoodAndDrink.flavor = "All nonmagical food and drink within a 5-foot-radius sphere centered on a point of your choice within range is purified and rendered free of poison and disease.";
    }

    Data rayOfFrost = new Data(); //declare a new ability object
    public void setRayOfFrost(Data rayOfFrost) { //populate it
        rayOfFrost.abilName = "Ray of Frost";
        rayOfFrost.spellLevel = 0;
        rayOfFrost.school = "Evocation";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, false, false, false, true, false, true};
        rayOfFrost.spells =  classProf.clone();
        rayOfFrost.range = "60";
        rayOfFrost.components = "V, S";
        rayOfFrost.duration = "Instantaneous";
        rayOfFrost.castTime = "1 action";
        rayOfFrost.flavor = "A frigid beam of blue-white light streaks toward a creature within range. Make a ranged spell attack against the target. On a hit, it takes 1d8 cold damage, and its speed is reduced by 10 feet until the start of your next turn.\n" +
                "The spell’s damage increases by 1d8 when you reach 5th level (2d8), 11th level (3d8), and 17th level (4d8).";
    }

    Data rayOfSickness = new Data(); //declare a new ability object
    public void setRayOfSickness(Data rayOfSickness) { //populate it
        rayOfSickness.abilName = "Ray of Sickness";
        rayOfSickness.spellLevel = 1;
        rayOfSickness.school = "Necromancy";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, false, false, false, true, false, true};
        rayOfSickness.spells =  classProf.clone();
        rayOfSickness.range = "60";
        rayOfSickness.components = "V, S";
        rayOfSickness.duration = "Instantaneous";
        rayOfSickness.castTime = "1 action";
        rayOfSickness.flavor = "A ray of sickening greenish energy lashes out toward\n" +
                "a creature within range. Make a ranged spell attack against the target. On a hit, the target takes 2d8 poison damage and must make a Constitution saving throw. On a failed save, it is also poisoned until the end of your next turn.\n" +
                "AtHigherLevels. When you cast this spell using a spell slot of 2nd level or higher, the damage increases by 1d8 for each slot level above 1st.";
    }

    Data resistance = new Data(); //declare a new ability object
    public void setResistance(Data resistance) { //populate it
        resistance.abilName = "Resistance";
        resistance.spellLevel = 0;
        resistance.school = "Abjuration";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, true, true, false, false, false, false, false};
        resistance.spells =  classProf.clone();
        resistance.range = "Touch";
        resistance.components = "V, S, M (a miniature cloak)";
        resistance.duration = "Concentration, up to 1 minute";
        resistance.castTime = "1 action";
        resistance.flavor = "You touch one willing creature. Once before the spell ends, the target can roll a d4 and add the number rolled to one saving throw of its choice. It can roll\n" +
                "the die before or after making the saving throw. The spell then ends.";
    }

    Data sacredFlame = new Data(); //declare a new ability object
    public void setSacredFlame(Data sacredFlame) { //populate it
        sacredFlame.abilName = "Sacred Flame";
        sacredFlame.spellLevel = 0;
        sacredFlame.school = "Evocation";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, true, false, false, false, false, false, false};
        sacredFlame.spells =  classProf.clone();
        sacredFlame.range = "60";
        sacredFlame.components = "V, S";
        sacredFlame.duration = "Instantaneous";
        sacredFlame.castTime = "1 action";
        sacredFlame.flavor = "Flame-like radiance descends on a creature that you can see within range. The target must succeed on a Dexterity saving throw or take 1d8 radiant damage. The target gains no benefit from cover for this saving throw.\n" +
                "The spell’s damage increases by 1d8 when you reach 5th level (2d8), 11th level (3d8), and 17th level (4d8).";
    }

    Data sanctuary = new Data(); //declare a new ability object
    public void setSanctuary(Data sanctuary) { //populate it
        sanctuary.abilName = "Sanctuary";
        sanctuary.spellLevel = 1;
        sanctuary.school = "Abjuration";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, true, false, false, false, false, false, false};
        sanctuary.spells =  classProf.clone();
        sanctuary.range = "30";
        sanctuary.components = "V, S, M (a small silver mirror)";
        sanctuary.duration = "1 minute";
        sanctuary.castTime = "1 bonus action";
        sanctuary.flavor = "You ward a creature within range against attack. Until the spell ends, any creature who targets the warded creature with an attack or a harmful spell must first make a W isdom saving throw. On a failed save, the creature must choose a new target or lose the attack or spell. This spell doesn’t protect the warded creature from area effects, such as the explosion of a fireball.\n" +
                "If the warded creature makes an attack or casts a spell that affects an enemy creature, this spell ends.";
    }

    Data searingSmite = new Data(); //declare a new ability object
    public void setSearingSmite(Data searingSmite) { //populate it
        searingSmite.abilName = "Searing Smite";
        searingSmite.spellLevel = 1;
        searingSmite.school = "Evocation";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, false, true, false, false, false, false};
        searingSmite.spells =  classProf.clone();
        searingSmite.range = "Self";
        searingSmite.components = "V";
        searingSmite.duration = "Concentration, up to 1 minute";
        searingSmite.castTime = "1 bonus action";
        searingSmite.flavor =
                "The next time you hit a creature with a melee weapon attack during the spell’s duration, your weapon flares with white-hot intensity, and the attack deals an extra 1d6 fire damage to the target and causes the target to ignite in flames. At the start of each of its turns until the spell ends, the target must make a Constitution saving throw. On a failed save, it takes 1d6 fire damage. On a successful save, the spell ends. If the target or a creature within 5 feet of it uses an action to put out the flames, or if some other effect douses the flames (such as the target being submerged in water), the spell ends.\n" +
                        "AtHigherLevels. When you cast this spell using a spell slot of 2nd level or higher, the initial extra damage dealt by the attack increases by 1d6 for each slot level above 1st.";
    }

    Data shield = new Data(); //declare a new ability object
    public void setShield(Data shield) { //populate it
        shield.abilName = "Shield";
        shield.spellLevel = 1;
        shield.school = "Abjuration";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, false, false, false, true, false, true};
        shield.spells =  classProf.clone();
        shield.range = "Self";
        shield.components = "V, S";
        shield.duration = "1 Round";
        shield.castTime = "1 reaction, which you take when you are hit by an attack or targeted by the magic missile spell";
        shield.flavor = "An invisible barrier of magical force appears and protects you. Until the start of your next turn, you have a +5 bonus to AC, including against the triggering attack, and you take no damage from magic missile.";
    }

    Data shieldOfFaith = new Data(); //declare a new ability object
    public void setShieldOfFaith(Data shieldOfFaith) { //populate it
        shieldOfFaith.abilName = "Shield of Faith";
        shieldOfFaith.spellLevel = 1;
        shieldOfFaith.school = "Abjuration";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, true, false, true, false, false, false, false};
        shieldOfFaith.spells =  classProf.clone();
        shieldOfFaith.range = "60";
        shieldOfFaith.components = "V, S, M (a small parchment with a bit of\n" +
                "holy text written on it)";
        shieldOfFaith.duration = "Concentration, up to 10 minutes\n";
        shieldOfFaith.castTime = "1 bonus action";
        shieldOfFaith.flavor = "A shimmering field appears and surrounds a creature\n" +
                "of your choice within range, granting it a +2 bonus to AC for the duration.";
    }

    Data shillelagh = new Data(); //declare a new ability object
    public void setShillelagh(Data shillelagh) { //populate it
        shillelagh.abilName = "Shillelagh";
        shillelagh.spellLevel = 0;
        shillelagh.school = "Transmutation";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, true, false, false, false, false, false};
        shillelagh.spells =  classProf.clone();
        shillelagh.range = "Touch";
        shillelagh.components = "V, S, M (a small parchment with a bit of\n" +
                "holy text written on it)";
        shillelagh.duration = "1 Minute";
        shillelagh.castTime = "1 bonus action";
        shillelagh.flavor = "The wood of a club or quarterstaffyou are holding is imbued with nature’s power. For the duration, you can use your spellcasting ability instead of Strength for the attack and damage rolls of melee attacks using that weapon, and the weapon's damage die becomes\n" +
                "a d8. The weapon also becom es magical, if it isn’t already. The spell ends if you cast it again or if you let go of the weapon.\n";
    }

    Data shockingGrasp = new Data(); //declare a new ability object
    public void setShockingGrasp(Data shockingGrasp) { //populate it
        shockingGrasp.abilName = "Shocking Grasp";
        shockingGrasp.spellLevel = 0;
        shockingGrasp.school = "Evocation";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, false, false, false, true, false, true};
        shockingGrasp.spells =  classProf.clone();
        shockingGrasp.range = "Touch";
        shockingGrasp.components = "V, S";
        shockingGrasp.duration = "Instantaneous";
        shockingGrasp.castTime = "1 action";
        shockingGrasp.flavor = "Lightning springs from your hand to deliver a shock to a creature you try to touch. Make a melee spell attack against the target. You have advantage on the attack roll if the target is wearing armor made of metal. On a hit, the target takes 1d8 lightning damage, and it can’t take reactions until the start of its next turn.\n" +
                "The spell’s damage increases by 1d8 when you reach 5th level (2d8), 11th level (3d8), and 17th level (4d8).";
    }

    Data silentImage = new Data(); //declare a new ability object
    public void setSilentImage(Data silentImage) { //populate it
        silentImage.abilName = "Silent Image";
        silentImage.spellLevel = 1;
        silentImage.school = "Evocation";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {true, false, false, false, false, true, false, true};
        silentImage.spells =  classProf.clone();
        silentImage.range = "60";
        silentImage.components = "V, S, M (a bit of fleece)";
        silentImage.duration = "Concentration, up to 10 minutes";
        silentImage.castTime = "1 action";
        silentImage.flavor = "You create the image of an object, a creature, or some other visible phenomenon that is no larger than a 15-foot cube. The image appears at a spot within range and lasts for the duration. The image is purely visual; it isn't accompanied by sound, smell, or other sensory effects.\n" +
                "You can use your action to cause the image to move to any spot within range. As the image changes location, you can alter its appearance so that its movements appear natural for the image. For example, if you create an image of a creature and move it, you can alter the image so that it appears to be walking.\n" +
                "Physical interaction with the image reveals it to be an illusion, because things can pass through it. A creature that uses its action to examine the image can determine that it is an illusion with a successful Intelligence (Investigation) check against your spell save DC. If a creature discerns the illusion for what it is, the creature can see through the image.";
    }

    Data sleep = new Data(); //declare a new ability object
    public void setSleep(Data sleep) { //populate it
        sleep.abilName = "Silent Image";
        sleep.spellLevel = 1;
        sleep.school = "Enchantment";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, false, false, false, false, false, false, false};
        sleep.spells =  classProf.clone();
        sleep.range = "90";
        sleep.components = "V, S, M (a pinch of fine sand, rose petals,\n" +
                "or a cricket)";
        sleep.duration = "1 Minutes";
        sleep.castTime = "1 action";
        sleep.flavor = "This spell sends creatures into a magical slumber. Roll 5d8; the total is how many hit points of creatures this spell can affect. Creatures within 20 feet of\n" +
                "a point you choose within range are affected in ascending order of their current hit points (ignoring unconscious creatures).\n" +
                "Starting with the creature that has the lowest current hit points, each creature affected by this spell falls unconscious until the spell ends, the sleeper takes damage, or someone uses an action to shake or slap the sleeper awake. Subtract each creature’s hit points from the total before moving on to the creature with the next lowest hit points. A creature’s hit points must be equal to or less than the remaining total for that creature\n" +
                "to be affected.\n" +
                "Undead and creatures immune to being charmed\n" +
                "aren’t affected by this spell.\n" +
                "AtHigherLevels. When you cast this spell using a\n" +
                "spell slot of 2nd level or higher, roll an additional 2d8 for each slot level above 1st.";
    }

    //This method returns all the race data
    public ArrayList<Data> getSd() {

        setAcidSplash(acidSplash); //Be sure to set all abilities first
        sd.add(acidSplash); //Then add them to the Arraylist

        setAid(aid);
        sd.add(aid);

        setAlarm(alarm);
        sd.add(alarm);

        setAnimalFriendship(animalFriendship);
        sd.add(animalFriendship);

        setArmorOfAgathys(armorOfAgathys);
        sd.add(armorOfAgathys);

        setArmsOfHadar(armsOfHadar);
        sd.add(armsOfHadar);

        setBane(bane);
        sd.add(bane);

        setBladeWard(bladeWard);
        sd.add(bladeWard);

        setBless(bless);
        sd.add(bless);

        setBurningHands(burningHands);
        sd.add(burningHands);

        setCharmPerson(charmPerson);
        sd.add(charmPerson);

        setChillTouch(chillTouch);
        sd.add(chillTouch);

        setChromaticOrb(chromaticOrb);
        sd.add(chromaticOrb);

        setColorSpray(colorSpray);
        sd.add(colorSpray);

        setCommand(command);
        sd.add(command);

        setCompelledDuel(compelledDuel);
        sd.add(compelledDuel);

        setComprehendLanguages(comprehendLanguages);
        sd.add(comprehendLanguages);

        setCreateOrDistroyWater(createOrDistroyWater);
        sd.add(createOrDistroyWater);

        setCureWounds(cureWounds);
        sd.add(cureWounds);

        setDancingLights(dancingLights);
        sd.add(dancingLights);

        setDetectEvilAndGood(detectEvilAndGood);
        sd.add(detectEvilAndGood);

        setDetectMagic(detectMagic);
        sd.add(detectMagic);

        setDetectPoisonAndDisease(detectPoisonAndDisease);
        sd.add(detectPoisonAndDisease);

        setDisguiseSelf(disguiseSelf);
        sd.add(disguiseSelf);

        setDissonantWhispers(dissonantWhispers);
        sd.add(dissonantWhispers);

        setDivineFavor(divineFavor);
        sd.add(divineFavor);

        setDruidcraft(druidcraft);
        sd.add(druidcraft);

        setEldrichBlast(eldrichBlast);
        sd.add(eldrichBlast);

        setEnsnaringStrike(ensnaringStrike);
        sd.add(ensnaringStrike);

        setEntangle(entangle);
        sd.add(entangle);

        setExpeditiousRetreat(expeditiousRetreat);
        sd.add(expeditiousRetreat);

        setFaerieFire(faerieFire);
        sd.add(faerieFire);

        setFalseLife(falseLife);
        sd.add(falseLife);

        setFeatherFall(featherFall);
        sd.add(featherFall);

        setFindFamiliar(findFamiliar);
        sd.add(findFamiliar);

        setFireBolt(fireBolt);
        sd.add(fireBolt);

        setFogCloud(fogCloud);
        sd.add(fogCloud);

        setFriends(friends);
        sd.add(friends);

        setGoodberry(goodberry);
        sd.add(goodberry);

        setGrease(grease);
        sd.add(grease);

        setGuidance(guidance);
        sd.add(guidance);

        setGuidingBolt(guidingBolt);
        sd.add(guidingBolt);

        setHailOfThorns(hailOfThorns);
        sd.add(hailOfThorns);

        setHealingWord(healingWord);
        sd.add(healingWord);

        setHellishRebuke(hellishRebuke);
        sd.add(hellishRebuke);

        setHeroism(heroism);
        sd.add(heroism);

        setHex(hex);
        sd.add(hex);

        setHuntersMark(huntersMark);
        sd.add(huntersMark);

        setIdentify(identify);
        sd.add(identify);

        setIllusoryScript(illusoryScript);
        sd.add(illusoryScript);

        setInflictWounds(inflictWounds);
        sd.add(inflictWounds);

        setJump(jump);
        sd.add(jump);

        setLight(light);
        sd.add(light);

        setLongstrider(longstrider);
        sd.add(longstrider);

        setMageArmor(mageArmor);
        sd.add(mageArmor);

        setMageHand(mageHand);
        sd.add(mageHand);

        setMagicMissile(magicMissile);
        sd.add(magicMissile);

        setMending(mending);
        sd.add(mending);

        setMessage(message);
        sd.add(message);

        setMinorIllusion(minorIllusion);
        sd.add(minorIllusion);

        setPoisonSpray(poisonSpray);
        sd.add(poisonSpray);

        setPrestidigitation(prestidigitation);
        sd.add(prestidigitation);

        setProduceFlame(produceFlame);
        sd.add(produceFlame);

        setProtectionFromEvilandGood(protectionFromEvilandGood);
        sd.add(protectionFromEvilandGood);

        setPurifyFoodAndDrink(purifyFoodAndDrink);
        sd.add(purifyFoodAndDrink);

        setRayOfFrost(rayOfFrost);
        sd.add(rayOfFrost);

        setRayOfSickness(rayOfSickness);
        sd.add(rayOfSickness);

        setResistance(resistance);
        sd.add(resistance);

        setSacredFlame(sacredFlame);
        sd.add(sacredFlame);

        setSanctuary(sanctuary);
        sd.add(sanctuary);

        setSearingSmite(searingSmite);
        sd.add(searingSmite);

        setShield(shield);
        sd.add(shield);

        setShieldOfFaith(shieldOfFaith);
        sd.add(shieldOfFaith);

        setShillelagh(shillelagh);
        sd.add(shillelagh);

        setShockingGrasp(shockingGrasp);
        sd.add(shockingGrasp);

        setSilentImage(silentImage);
        sd.add(silentImage);

        setSleep(sleep);
        sd.add(sleep);

        return sd;
    }

}