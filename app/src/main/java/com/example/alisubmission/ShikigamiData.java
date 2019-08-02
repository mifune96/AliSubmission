package com.example.alisubmission;

import java.util.ArrayList;

public class ShikigamiData {
    public static String[][] data = new String[][]{
            {"Ootengu 大天狗","Role Sikigami : AOE DPS","https://onmyojiguide.com/wp-content/uploads/2017/01/Great-Tengu-Onmyoji-Shikigami.png","Ōtengu appears as a handsome man with short pale blond hair and blue eyes. A large pair of black wings grow from his back. He wears a white sokutai with blue swirling patterns at the front panel, shoulders and sleeves, with a red tassel hanging from the hem of each sleeve. There is a red demon mask with long white moustache situated at the front of the belt. He also dons a pair of black trousers, white socks and steel blue geta sandals. He carries a blue uchiwa fan with two red tassels hanging from the edge and the kanji 祭 (matsuri, festival) written on both sides.","3136","10026","419"},
            {"Ichimokuren 目连","Role Sikigami : Support","https://onmyojiguide.com/wp-content/uploads/2017/01/One-Eyed-Onmyoji-Shikigami.png","Ichimoku Ren's name fits exactly within the 12 character name limit, but was still shortened","2305","14127","397"},
            {"Yoto Hime 妖刀姬","Role Sikigami : ST DPS","https://onmyojiguide.com/wp-content/uploads/2017/01/Princess-of-Evil-Blade-Onmyoji-Shikigami.png","Yoto Hime is one of Onmyoji’s most powerful single output Shikigami. Her multi-stage attack skill can give considerable damage to high HP Shikigami. Unlike Lord Arakawa, her skill of continuing to attack the enemy with the least HP after eliminating her target can better help her maximize output and reduce output spillover.","2305","14127","397"},
            {"Hana 花鸟 卷","Role Sikigami : Healer","https://onmyojiguide.com/wp-content/uploads/2017/01/Flower-Bird-Scroll-Onmyoji-Shikigami.png","Gain [Painting Realm]: 20% chance to increase 20% move bar for herself at the end of her turn. In addition, Hana sacrifices 1 bird to dispel adverse status effects of one ally (including Freeze, Daze, Sleep, Morph, Silence, Taunt, Confuse, and Bind). When one of your units is already under the controlling effect of a debuff, if a new debuff of the same kind is inflicted on it, Flying Bird no longer triggers to negate the controlling effect. If one of your units is inflicted by multiple kinds of controlling effects from one attack, Flying Bird’s chance of negating controlling effects triggers for each kind.","2305","14127","397"},
            {"Enma 阎魔","Role Sikigami : ST CC","https://onmyojiguide.com/wp-content/uploads/2017/01/Hell-Lord-Onmyoji-Shikigami.png","She is based on 阎罗王The eyes of Enma can indeed see through everything, yet Susabi, who can see the orbit of fate, states that it has limitations The \"iceberg\" consistently mentioned in her bio is Hangan, who doesn't realize that she just wants him to do something","2457","12253","456"},
            {"Ibaraki Doji 茨木童子","Role Sikigami : AOE DPS","https://onmyojiguide.com/wp-content/uploads/2017/01/Ibara-Doji-Onmyoji-Shikigami.png","When it comes to the offensive, there is no Shikigami in Onmyoji who can match Ibaraki Doji in attack output. As a close friend of another \"Boss\", Shuten Doji, Ibaraki Doji himself also has the power to make others quake with fear. Most people have the belief that Ibaraki Doji can destroy the entire enemy regiment in just one stroke. Since the game’s release, he is the desire of many players who seek great power, and who are itching to lay their hands on their own Super Warrior.","3270","10254","397"},
            {"Kuro 黑童子","Role Sikigami : DPS","https://onmyojiguide.com/wp-content/uploads/2018/01/Kurodoshi-Onmyoji-Shikigami.png","Kurodōji appears as a young boy with very long white hair that reaches his feet, worn in a hime-cut hairstyle and tied at the end with a turquoise-and-gold striped band. His eyes are pale yellow. He wears an outfit consisting of a black sokutai-like top with red-and-turquoise cords and tassels as well as white furry balls at the front, red and striped grey basting at the sleeves, and a pair of black puffed shorts with two small red ties at the hems. He also wears a golden anklet around his left ankle and a tall black hat with a red-and-black circle at the front, turquoise and gold beads on either side, and white bands sticking upwards. He wields a scythe decorated with a red tasseled cord.","3377","9912","384"}

    };

    public static ArrayList<Shikigami> getListData(){
        Shikigami shikigami = null;
        ArrayList<Shikigami> list = new ArrayList<>();
        for (String[] aData : data){
            shikigami = new Shikigami();
            shikigami.setNama(aData[0]);
            shikigami.setRemarks(aData[1]);
            shikigami.setPhoto(aData[2]);
            shikigami.setBio(aData[3]);
            shikigami.setAttack(aData[4]);
            shikigami.setHp(aData[5]);
            shikigami.setDef(aData[6]);

            list.add(shikigami);
        }
        return list;
    }
}
