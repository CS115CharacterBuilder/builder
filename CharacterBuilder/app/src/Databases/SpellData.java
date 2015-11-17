package Databases;

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
        acidSplash.spells = classProf;
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
        aid.spells = classProf;
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
        alarm.spells = classProf;
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
        animalFriendship.spells = classProf;
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
        armorOfAgathys.spells = classProf;
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
        armsOfHadar.spells = classProf;
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
        bane.spells = classProf;
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
        bladeWard.spells = classProf;
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
        bless.spells = classProf;
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
        burningHands.spells = classProf;
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
        charmPerson.spells = classProf;
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
        chillTouch.spells = classProf;
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
        chromaticOrb.spells = classProf;
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
        colorSpray.spells = classProf;
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
        command.spells = classProf;
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
        compelledDuel.spells = classProf;
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
        comprehendLanguages.spells = classProf;
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
        createOrDistroyWater.spells = classProf;
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
        cureWounds.spells = classProf;
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
        dancingLights.spells = classProf;
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
        detectEvilAndGood.spells = classProf;
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
        detectMagic.spells = classProf;
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
        detectPoisonAndDisease.spells = classProf;
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
        disguiseSelf.spells = classProf;
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
        dissonantWhispers.spells = classProf;
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
        divineFavor.spells = classProf;
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
        druidcraft.spells = classProf;
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
        eldrichBlast.spells = classProf;
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
        ensnaringStrike.spells = classProf;
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
        entangle.spells = classProf;
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
        expeditiousRetreat.spells = classProf;
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
        faerieFire.spells = classProf;
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
        falseLife.spells = classProf;
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
        featherFall.spells = classProf;
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
        findFamiliar.spells = classProf;
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
        fireBolt.spells = classProf;
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
        fogCloud.spells = classProf;
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
        friends.spells = classProf;
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
        goodberry.spells = classProf;
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
        grease.spells = classProf;
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
        grease.abilName = "Guidance";
        grease.spellLevel = 0;
        grease.school = "Divination";
        //                       bard, cler,   dru,   Pal, range,  Sorc,  War, Wizard
        boolean classProf[] = {false, true, true, false, false, false, false, false};
        grease.spells = classProf;
        grease.range = "Touch";
        grease.components = "V, S";
        grease.duration = "Concentration, up to 1 minute";
        grease.castTime = "1 action";
        grease.flavor = "You touch one willing creature. Once before the spell ends, the target can roll a d4 and add the number rolled to one ability check of its choice. It can roll the die before or after making the ability check. The spell then ends.";
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


        return sd;
    }

}
