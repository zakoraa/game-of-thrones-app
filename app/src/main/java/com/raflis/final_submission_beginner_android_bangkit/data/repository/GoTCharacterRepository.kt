package com.raflis.final_submission_beginner_android_bangkit.data.repository

import com.raflis.final_submission_beginner_android_bangkit.data.model.EnumHouse
import com.raflis.final_submission_beginner_android_bangkit.data.model.GoTCharacter
import com.raflis.final_submission_beginner_android_bangkit.data.model.House

object GoTCharacterRepository {
    fun getGoTCharacters(): List<GoTCharacter> {
        val houseStark: House = House(name = EnumHouse.STARK, image ="https://static.wikia.nocookie.net/gameofthrones/images/7/7e/House_Stark.svg/revision/latest/thumbnail/width/360/height/360?cb=20230905233833")
        val houseTargaryen: House = House(name = EnumHouse.TARGARYEN, image ="https://awoiaf.westeros.org/images/thumb/1/1e/House_Targaryen.svg/1200px-House_Targaryen.svg.png")
        val houseLannister: House = House(name = EnumHouse.LANNISTER, image ="https://awoiaf.westeros.org/images/thumb/d/d5/House_Lannister.svg/1200px-House_Lannister.svg.png")
        val houseBaratheon: House = House(name = EnumHouse.BARATHEON, image ="https://static.wikia.nocookie.net/the-winds-of-winter-roleplay/images/c/c6/House_Baratheon_of_storms_end.webp/revision/latest/thumbnail/width/360/height/360?cb=20230412082108")
        val houseGreyjoy: House = House(name = EnumHouse.GREYJOY, image ="https://awoiaf.westeros.org/images/thumb/5/5b/House_Greyjoy.svg/1200px-House_Greyjoy.svg.png")
        val houseMartell: House = House(name = EnumHouse.MARTELL, image ="https://awoiaf.westeros.org/images/thumb/6/60/House_Martell.svg/1200px-House_Martell.svg.png")
        val houseTyrell: House = House(name = EnumHouse.TYRELL, image ="https://static.wikia.nocookie.net/awoiaf-rp/images/f/f2/545px-House_Tyrell.svg.png/revision/latest?cb=20171207043620")

        return listOf(
            GoTCharacter(
                name = "Eddard Stark",
                house = houseStark,
                title = "Lord of Winterfell",
                age = 45,
                actorName = "Sean Bean",
                culture = "Northern, First Men",
                episodeCount = 9,
                description = "Lord Eddard Stark, also known as Ned Stark, was the head of House Stark, the Lord of Winterfell and Warden of the North, and later Hand of the King to King Robert I Baratheon. He was the son of Lord Rickard Stark, older brother of Benjen and Lyanna Stark, and the younger brother of Brandon Stark. He is the father of Robb, Sansa, Arya, Bran, and Rickon by his wife, Catelyn Tully, and uncle of Jon Snow, whom he raised as his bastard son. He was a dedicated husband and father, a loyal friend, and an honorable lord.Lord Eddard Stark, also known as Ned Stark, was the head of House Stark, the Lord of Winterfell and Warden of the North, and later Hand of the King to King Robert I Baratheon. He was the son of Lord Rickard Stark, older brother of Benjen and Lyanna Stark, and the younger brother of Brandon Stark. He is the father of Robb, Sansa, Arya, Bran, and Rickon by his wife, Catelyn Tully, and uncle of Jon Snow, whom he raised as his bastard son. He was a dedicated husband and father, a loyal friend, and an honorable lord.Lord Eddard Stark, also known as Ned Stark, was the head of House Stark, the Lord of Winterfell and Warden of the North, and later Hand of the King to King Robert I Baratheon. He was the son of Lord Rickard Stark, older brother of Benjen and Lyanna Stark, and the younger brother of Brandon Stark. He is the father of Robb, Sansa, Arya, Bran, and Rickon by his wife, Catelyn Tully, and uncle of Jon Snow, whom he raised as his bastard son. He was a dedicated husband and father, a loyal friend, and an honorable lord.Lord Eddard Stark, also known as Ned Stark, was the head of House Stark, the Lord of Winterfell and Warden of the North, and later Hand of the King to King Robert I Baratheon. He was the son of Lord Rickard Stark, older brother of Benjen and Lyanna Stark, and the younger brother of Brandon Stark. He is the father of Robb, Sansa, Arya, Bran, and Rickon by his wife, Catelyn Tully, and uncle of Jon Snow, whom he raised as his bastard son. He was a dedicated husband and father, a loyal friend, and an honorable lord.",
                image = "https://upload.wikimedia.org/wikipedia/en/5/52/Ned_Stark-Sean_Bean.jpg"
            ),
            GoTCharacter(
                name = "Sansa Stark",
                house = houseStark,
                title = "Lady of Winterfell",
                age = 22,
                actorName = "Sophie Turner",
                culture = "Northern, First Men",
                episodeCount = 59,
                description = "Queen Sansa Stark is the eldest daughter of Lord Eddard Stark and his wife, Lady Catelyn, sister of Robb, Arya, Bran, and Rickon Stark, and \"half-sister\" of Jon Snow; though truthfully he is her cousin. Initially betrothed to Prince Joffrey Baratheon, the heir to the Iron Throne, Sansa travels to King's Landing in preparation for her nuptials, but essentially becomes a hostage of House Lannister following the execution of her father on trumped-up charges of treason. Under the (sometimes unwitting) tutelage of Cersei Lannister, Margaery Tyrell, and Petyr Baelish, Sansa becomes well-versed in politics and court intrigue, but suffers all the same.",
                image = "https://static.wikia.nocookie.net/gameofthrones/images/6/63/QueenSansa.PNG/revision/latest?cb=20210215100224"
            ),
            GoTCharacter(
                name = "Arya Stark",
                house = houseStark,
                title = "Faceless Assassin",
                age = 18,
                actorName = "Maisie Williams",
                culture = "Northern, First Men",
                episodeCount = 59,
                description = "Arya Stark is the third child and second daughter of Lord Eddard Stark and his wife, Lady Catelyn Stark. She is the sister of the incumbent Westerosi monarchs, Sansa, Queen in the North, and Brandon, King of the Andals and the First Men.",
                image = "https://static.wikia.nocookie.net/gameofthrones/images/b/be/AryaShipIronThrone.PNG/revision/latest?cb=20190520174300"
            ),
            GoTCharacter(
                name = "Bran Stark",
                house = houseStark,
                title = "Three-Eyed Raven",
                age = 17,
                actorName = "Isaac Hempstead Wright",
                culture = "Northern, First Men",
                episodeCount = 47,
                description = "Bran Stark is the current Three-Eyed Raven, capable of visions.King Bran I the Broken, born Brandon Stark and commonly known simply as Bran, is the fourth child and second son of Eddard and Catelyn Stark. Bran is a warg and a greenseer serving as the new Three-Eyed Raven. Eventually, he was crowned as the first elected ruler of the Six Kingdoms. Bran was born and raised at Winterfell. He has an older brother Robb, a younger brother Rickon, two older sisters Sansa and Arya, and an older \"bastard half-brother\", Jon Snow, who is actually Bran's first cousin by his aunt Lyanna Stark. Bran was named for Ned's elder brother, Brandon, who was brutally executed by the Mad King along with Bran's paternal grandfather Rickard Stark. He is only called \"Brandon\" by his mother when he has done something wrong. Bran dreams of being a knight of the Kingsguard, and his favorite hobby is climbing the walls of Winterfell, using its old rooftops and passageways to get around.",
                image = "https://static.wikia.nocookie.net/gameofthrones/images/8/81/KingBran.PNG/revision/latest?cb=20190520173855"
            ),
            GoTCharacter(
                name = "Catelyn Stark",
                house = houseStark,
                title = "Lady of Winterfell",
                age = 40,
                actorName = "Michelle Fairley",
                culture = "Riverlands, Andal (Tully family origin)",
                episodeCount = 25,
                description = "Catelyn was born into House Tully and is the eldest child of Lord Hoster and Lady Minisa Tully. She has a younger brother, Edmure, and a younger sister, Lysa. Petyr Baelish was fostered with the Tullys and Catelyn grew up with him. She was betrothed to marry Brandon Stark of Winterfell, but he was brutally murdered along with his father, Lord Rickard Stark, by the Mad King, Aerys II Targaryen, after his Prince Rhaegar purportedly kidnapped Brandon's sister Lyanna.",
                image = "https://upload.wikimedia.org/wikipedia/id/3/3c/Michelle_Fairley_Cat_Stark_in_the_Vale.png"
            ),
            GoTCharacter(
                name = "Robb Stark",
                house = houseStark,
                title = "King in the North",
                age = 20,
                actorName = "Richard Madden",
                culture = "Northern, First Men",
                episodeCount =21,
                description = "King Robb Stark was the eldest son of Lord Eddard Stark of Winterfell and his wife, Lady Catelyn. Following his father's execution, Robb was declared King in the North, won many battles against the House Lannister, but eventually he, his mother, and his forces were slain at the Red Wedding.",
                image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSOZSrJrb3TnOr6LuG2wyQavy2WGZRulQTGZw&s"
            ),
            GoTCharacter(
                name = "Benjen Stark",
                house = houseStark,
                title = "First Ranger of the Night's Watch",
                age = 45,
                actorName = "Joseph Mawle",
                culture = "Northern, First Men",
                episodeCount = 6,
                description = "Benjen Stark is the youngest child and third son of Lord Rickard Stark, the head of House Stark. The North is one of the constituent regions of the Seven Kingdoms and House Stark is one of the Great Houses of the realm. House Stark rule the region from their seat of Winterfell and Rickard also held the title Lord of Winterfell.[1] He attended the the Great Tourney at Harrenhal.[2]\n" +
                        "\n" +
                        "Benjen is the younger brother of Brandon, Eddard and Lyanna. Rickard, Brandon and Lyanna were all killed in the civil war known as Robert's Rebellion. Eddard inherited his father's titles and responsibilities.",
                image = "https://static.wikia.nocookie.net/gameofthrones/images/0/0f/610_Benjen_Promo_Crop.png/revision/latest?cb=20160629183134"
            ),
            GoTCharacter(
                name = "Rickon Stark",
                house = houseStark,
                title = "Lord of Winterfell's Son",
                age = 10,
                actorName = "Art Parkinson",
                culture = "Northern, First Men",
                episodeCount = 6,
                description = "Rickon Stark is the youngest son of Ned Stark and brother to Robb, Sansa, Arya, and Bran. Rickon is the fifth child and youngest son of Lady Catelyn and Lord Eddard Stark. Eddard is the head of House Stark. The North is one of the constituent regions of the Seven Kingdoms and House Stark is one of the Great Houses of the realm. House Stark rules the region from their seat of Winterfell while Eddard holds the title of Lord of Winterfell. He is also the Warden of the North to King Robert Baratheon.",
                image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR9r_CKhczQJQTTK7yI-iyN5J4BBAJRtCAJrw&s"
            ),

            GoTCharacter(
                name = "Jon Snow (Aegon Targaryen)",
                house = houseTargaryen,
                title = "Rightful Heir to the Iron Throne",
                age = 24,
                actorName = "Kit Harington",
                culture = "Northern (raised) / Valyrian, Targaryen (by blood)",
                episodeCount = 62,
                description = "Jon Snow, born Aegon Targaryen, is the son of Lyanna Stark and Rhaegar Targaryen, the late Prince of Dragonstone. From infancy, Jon is presented as the bastard son of Lord Eddard Stark, Lyanna's brother, and raised alongside Eddard's lawful children at Winterfell. Jon's true parentage is kept secret from everyone, including Jon himself, in order to protect him from those that sought the complete annihilation of House Targaryen.",
                image = "https://static.wikia.nocookie.net/gameofthrones/images/d/d0/JonSnow8x06.PNG/revision/latest?cb=20190714094440"
            ),
            GoTCharacter(
                name = "Daenerys Targaryen",
                house = houseTargaryen,
                title = "Mother of Dragons",
                age = 24,
                actorName = "Emilia Clarke",
                culture = "Valyrian, Targaryen",
                episodeCount = 67,
                description = "Queen Daenerys I Targaryen,[c] also known as Daenerys Stormborn, and affectionately known as Dany, was the only daughter of King Aerys II Targaryen and Queen Rhaella, and the younger sister of Rhaegar and Viserys Targaryen. Daenerys was initially a timid, obedient youth. After her marriage to Drogo she gathered the confidence of his khalasar. Following his death, she expanded her dominion into Essos, gaining the loyalty of an army of Unsullied and liberating Slaver's Bay from the Ghiscari slave masters.",
                image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcToXA2R7iB6H8wrNgBQxzr9CJKxGkolnj-cKw&s"
            ),
            GoTCharacter(
                name = "Viserys Targaryen",
                house = houseTargaryen,
                title = "Rightful King",
                age = 27,
                actorName = "Harry Lloyd",
                culture = "Valyrian, Targaryen",
                episodeCount = 5,
                description = "Viserys Targaryen[e] was the second son of Aerys II Targaryen, the \"Mad King.\" Following Robert's Rebellion, he and his sister Daenerys Targaryen were the remnants of the exiled House Targaryen. He claimed the Iron Throne as King Viserys III, but was killed before he could make any attempt to take the throne.",
                image = "https://static.wikia.nocookie.net/goff/images/a/a8/Viserys.png/revision/latest?cb=20190510211742"
            ),
            GoTCharacter(
                name = "Rhaegar Targaryen",
                house = houseTargaryen,
                title = "Prince of Dragonstone",
                age = 33,
                actorName = "Wilf Scolding",
                culture = "Valyrian, Targaryen",
                episodeCount = 3,
                description = "Prince Rhaegar Targaryen, the last Prince of Dragonstone, was the eldest son and heir to King Aerys II Targaryen, the Mad King. He was the older brother of Viserys and Daenerys Targaryen and the husband of Elia Martell, with whom he had two children, Rhaenys and Aegon. He also fathered Jon Snow with Lyanna Stark, whom he secretly married following an annulment from Elia.",
                image = "https://static.wikia.nocookie.net/p__/images/4/47/Rhaegar_Targaryen_%28GOT%29.jpg/revision/latest?cb=20240920001922&path-prefix=protagonist"
            ),
            GoTCharacter(
                name = "Aerys II Targaryen",
                house = houseTargaryen,
                title = "The Mad King",
                age = 54,
                actorName = "David Rintoul",
                culture = "Valyrian, Targaryen",
                episodeCount = 1,
                description = "King Aerys II Targaryen,[c] commonly called the Mad King, was the sixteenth member of House Targaryen to rule from the Iron Throne. Although his rule began benevolently, he succumbed to the madness caused by his incestuous lineage, and was eventually deposed by Lord Robert Baratheon in a civil war. He was the last Targaryen to sit on the Iron Throne.",
                image = "https://static.wikia.nocookie.net/gameofthrones/images/4/47/Aerys_II_Targaryen_Mad_King.jpg/revision/latest?cb=20170821102509"
            ),

            GoTCharacter(
                name = "Tywin Lannister",
                house = houseLannister,
                title = "Lord of Casterly Rock",
                age = 67,
                actorName = "Charles Dance",
                culture = "Westerlands, Andal",
                episodeCount = 27,
                description = "Tywin was the head of House Lannister, Lord of Casterly Rock, and Warden of the West. Despite the several recent Kings in King's Landing, Tywin was the real power in King's Landing. Tywin was among the richest and most powerful people in Westeros. He is a widower with three children, Jaime, Cersei, and Tyrion.[12] Casterly Rock, the Lannisters' ancestral seat of power, is located over a group of highly productive goldmines, which have provided the Lannisters with immense wealth and power over the years and led to the joke that Tywin \"shits gold.\"",
                image = "https://static.wikia.nocookie.net/gameofthrones/images/7/71/Tywin_Lannister_4x08.jpg/revision/latest?cb=20170830015346"
            ),
            GoTCharacter(
                name = "Cersei Lannister",
                house = houseLannister,
                title = "Queen of the Seven Kingdoms",
                age = 42,
                actorName = "Lena Headey",
                culture = "Westerlands, Andal",
                episodeCount = 62,
                description = "Queen Cersei I Lannister was the twentieth ruler of the Seven Kingdoms and the widow of King Robert Baratheon. She was the daughter of Lord Tywin Lannister, twin sister of Jaime Lannister and elder sister of Tyrion Lannister. She was involved in an incestuous relationship with Jaime, who was secretly the father of her three bastard children, Joffrey, Myrcella and Tommen.",
                image = "https://static.wikia.nocookie.net/gameofthrones/images/b/b0/CERSEIBATTLEOFKINGSLANDING.PNG/revision/latest?cb=20190906021534"
            ),
            GoTCharacter(
                name = "Jaime Lannister",
                house = houseLannister,
                title = "Kingslayer",
                age = 42,
                actorName = "Nikolaj Coster-Waldau",
                culture = "Westerlands, Andal",
                episodeCount = 55,
                description = "Ser Jaime Lannister was the elder son of Lord Tywin Lannister, younger twin brother of Queen Cersei Lannister, and older brother of Tyrion Lannister. He was involved in an incestuous relationship with Cersei, and unknown to most, he was the biological father of her three bastard children, Joffrey, Myrcella, and Tommen, as well as her unborn child.",
                image = "https://hbz.h-cdn.co/assets/16/21/3200x3200/square-1464214104-hbz-got-jaime-lannister.jpeg"
            ),
            GoTCharacter(
                name = "Tyrion Lannister",
                house = houseLannister,
                title = "Hand of the Queen",
                age = 39,
                actorName = "Peter Dinklage",
                culture = "Westerlands, Andal",
                episodeCount = 67,
                description = "Lord Tyrion Lannister is the youngest child of Lord Tywin Lannister and younger brother of Cersei and Jaime Lannister. A dwarf, he uses his wit and intellect to overcome the prejudice he faces. He is the current Lord of Casterly Rock and Hand of the King to Brandon Stark.",
                image = "https://static.wikia.nocookie.net/gameofthrones/images/9/95/HandoftheKingTyrionLannister.PNG/revision/latest?cb=20190520175204"
            ),
            GoTCharacter(
                name = "Joffrey Baratheon",
                house = houseLannister,
                title = "King of the Seven Kingdoms",
                age = 19,
                actorName = "Jack Gleeson",
                culture = "Crownlands, Andal",
                episodeCount = 26,
                description = "King Joffrey I Baratheon was the eighteenth king to rule from the Iron Throne and the second king of the Baratheon dynasty. Though believed by most to be the eldest son of King Robert Baratheon and Queen Cersei Lannister, Joffrey is actually a bastard born from Cersei's incestuous relationship with her twin brother Jaime Lannister. He is the older brother of Myrcella and Tommen Baratheon.",
                image = "https://upload.wikimedia.org/wikipedia/en/b/bd/Joffrey_Baratheon-Jack_Gleeson.jpg"
            ),
            GoTCharacter(
                name = "Myrcella Baratheon",
                house = houseLannister,
                title = "Princess of the Seven Kingdoms",
                age = 16,
                actorName = "Nell Tiger Free",
                culture = "Crownlands, Andal",
                episodeCount = 8,
                description = "Princess Myrcella was commonly thought to be the only daughter of King Robert Baratheon and Queen Cersei Lannister. Cersei and Robert married to seal a political alliance between House Baratheon and House Lannister after Robert took the throne by force from the Mad King Aerys II Targaryen.",
                image = "https://static.wikia.nocookie.net/gameofthrones/images/0/02/MyrcellaS5Cropped.jpg/revision/latest?cb=20160802025401"
            ),
            GoTCharacter(
                name = "Tommen Baratheon",
                house = houseLannister,
                title = "King of the Seven Kingdoms",
                age = 17,
                actorName = "Dean-Charles Chapman",
                culture = "Crownlands, Andal",
                episodeCount = 16,
                description = "King Tommen I Baratheon was the nineteenth ruler of the Seven Kingdoms, the third king of the Baratheon dynasty, and the younger brother of Joffrey and Myrcella Baratheon. Though legally the son of the late King Robert Baratheon and Queen Cersei Lannister, his true father is Ser Jaime Lannister, the Queen's twin brother, and is thus a bastard born of incest.",
                image = "https://static.wikia.nocookie.net/gameofthrones/images/7/7c/Tommen_blood_of_my_blood.jpg/revision/latest?cb=20160530234845"
            ),

            GoTCharacter(
                name = "Robert Baratheon",
                house = houseBaratheon,
                title = "King of the Seven Kingdoms",
                age = 45,
                actorName = "Mark Addy",
                culture = "Stormlands, Andal",
                episodeCount = 7,
                description = "Robert, a great warrior and charismatic man in his youth, took the throne through conquest in the war known as Robert's Rebellion, which began when the Prince of Dragonstone, Rhaegar Targaryen, allegedly abducted Robert's betrothed, Lyanna Stark. Killing Rhaegar at the Battle of the Trident, his climactic duel turned the tides of the war in his favor. After the war and following Lyanna's death, Robert married Cersei Lannister to cement an alliance with House Lannister to hold the kingdoms together, but he mistreated her and the marriage was loveless.",
                image = "https://static.wikia.nocookie.net/gameofthrones/images/4/43/Robert_crop.png/revision/latest?cb=20210223122212"
            ),
            GoTCharacter(
                name = "Stannis Baratheon",
                house = houseBaratheon,
                title = "Lord of Dragonstone",
                age = 42,
                actorName = "Stephen Dillane",
                culture = "Stormlands, Andal",
                episodeCount = 30,
                description = "Stannis is the second-born son of Lord Steffon Baratheon and Lady Cassana Estermont, the younger brother of the late King Robert Baratheon and older brother of Renly Baratheon. Steffon was the head of House Baratheon and Lord Paramount of the Stormlands. The Stormlands are one of the constituent regions of the Seven Kingdoms and House Baratheon is one of the Great Houses of the realm. Steffon died when the boys were young and Robert inherited his titles. Stannis is a serious and severe man.",
                image = "https://static.wikia.nocookie.net/gameofthrones/images/2/2f/StannisNew.png/revision/latest?cb=20210313165449"
            ),
            GoTCharacter(
                name = "Renly Baratheon",
                house = houseBaratheon,
                title = "Lord of Storm's End",
                age = 27,
                actorName = "Gethin Anthony",
                culture = "Stormlands, Andal",
                episodeCount = 9,
                description = "Renly is the third and youngest son of Steffon and Cassana Baratheon. Steffon was the head of House Baratheon and Lord Paramount of the Stormlands. The Stormlands are one of the constituent regions of the Seven Kingdoms and House Baratheon is one of the Great Houses of the realm. Renly has two older brothers Robert and Stannis. Their parents died when the boys were young and Robert inherited his father's titles. Robert led a rebellion against King Aerys II Targaryen, deposing and replacing him as the King of the Andals and the First Men. He made Renly the Lord of Storm's End following his victory. Renly was only a child during the civil war, so he did not fight.",
                image = "https://static.wikia.nocookie.net/gameofthrones/images/f/ff/Profile-Renly_Baratheon.png/revision/latest?cb=20171006064500"
            ),

            GoTCharacter(
                name = "Balon Greyjoy",
                house = houseGreyjoy,
                title = "Lord of the Iron Islands",
                age = 55,
                actorName = "Patrick Malahide",
                culture = "Ironborn",
                episodeCount = 6,
                description = "Balon Greyjoy was the head of House Greyjoy and Lord of the Iron Islands. The Iron Islands are one of the constituent regions of the Seven Kingdoms and House Greyjoy is one of the Great Houses of the realm. House Greyjoy rule the region from their seat at Pyke and Balon also holds the title Lord Reaper of Pyke. He was a hard, ambitious and ruthless man.",
                image = "https://static.wikia.nocookie.net/gameofthrones/images/1/19/Balon-profile.png/revision/latest/thumbnail/width/360/height/360?cb=20170420085750"
            ),
            GoTCharacter(
                name = "Theon Greyjoy",
                house = houseGreyjoy,
                title = "Ward of the Starks",
                age = 25,
                actorName = "Alfie Allen",
                culture = "Ironborn",
                episodeCount = 47,
                description = "Theon Greyjoy was the youngest son of King Balon Greyjoy of the Iron Islands and the younger brother of Rodrik, Maron, and Yara Greyjoy. Following his father's failed rebellion against the Iron Throne, Theon is taken as a ward (initially hostage) to Lord Eddard Stark of Winterfell. Theon was the youngest son of Lord Balon and Lady Alannys Greyjoy. Balon is the head of House Greyjoy and Lord of the Iron Islands. The Iron Islands are one of the constituent regions of the Seven Kingdoms and House Greyjoy is one of the Great Houses of the realm. House Greyjoy rule the region from their seat at Pyke and Balon also holds the title Lord Reaper of Pyke.",
                image = "https://static.wikia.nocookie.net/gameofthrones/images/7/78/TheonS8E1.PNG/revision/latest?cb=20190415192721"
            ),
            GoTCharacter(
                name = "Yara Greyjoy",
                house = houseGreyjoy,
                title = "Lady of the Iron Islands",
                age = 30,
                actorName = "Gemma Whelan",
                culture = "Ironborn",
                episodeCount = 21,
                description = "Yara Greyjoy is the fierce and loyal sister of Theon, determined to rule the Iron Islands. Lady Yara Greyjoy is the Lady of the Iron Islands and Lady Reaper of Pyke, the daughter and last surviving child of Balon Greyjoy, and older sister and only surviving sibling of Theon Greyjoy. She was raised at Pyke, the stronghold of House Greyjoy. Yara is a fierce warrior and commands her own longship, the Black Wind.",
                image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRP4RLhOyjx1RiwgRTGL3Q1gNZja8sDbbJKFw&s"
            ),

            GoTCharacter(
                name = "Oberyn Martell",
                house = houseMartell,
                title = "Prince of Dorne",
                age = 42,
                actorName = "Pedro Pascal",
                culture = "Dornish, Rhoynar",
                episodeCount = 7,
                description = "Prince Oberyn was the younger brother of Prince Doran Martell and Princess Elia Martell, and like most members of House Martell, he was styled \"Prince\" instead of \"Lord.\" He was nicknamed \"the Red Viper\" for his knowledge of poisons and for his unusual, deadly style of combat. Oberyn was known for being an accomplished warrior, but he was just as infamous for his sexual appetite, which extends to both men and women; Tyrion Lannister tells Bronn that Oberyn is \"famous for fucking half of Westeros.\" Oberyn's paramour was Ellaria Sand; she is his wife in all but name, and Doran once noted that Ellaria made Oberyn very happy. She was also the mother of four of Oberyn's infamous eight bastard daughters, all of whom he has acknowledged and given his love and care. He named the fifth one, Elia Sand, after his late sister.",
                image = "https://upload.wikimedia.org/wikipedia/en/thumb/a/ac/Oberyn_Martell-Pedro_Pascal.jpg/220px-Oberyn_Martell-Pedro_Pascal.jpg"
            ),
            GoTCharacter(
                name = "Ellaria Sand",
                house = houseMartell,
                title = "Paramour of Oberyn Martell",
                age = 39,
                actorName = "Indira Varma",
                culture = "Dornish, Rhoynar",
                episodeCount = 18,
                description = "Ellaria Sand is the paramour of Oberyn and seeks to avenge his death. After Oberyn's death while defending Tyrion Lannister in a trial by combat, Ellaria pushes for House Martell to go to war with House Lannister, but is refused by Oberyn's older brother, Doran Martell. In retaliation, Ellaria and the Sand Snakes murder Doran's ward, Myrcella Baratheon, and eventually Doran himself and his son, Trystane Martell. They usurp power in Dorne, pledging the army of House Martell to Daenerys Targaryen.",
                image = "https://upload.wikimedia.org/wikipedia/en/8/85/Ellaria_Sand.jpg"
            ),
            GoTCharacter(
                name = "Doran Martell",
                house = houseMartell,
                title = "Prince of Dorne",
                age = 55,
                actorName = "Alexander Siddig",
                culture = "Dornish, Rhoynar",
                episodeCount = 5,
                description = "Prince Doran Martell was the head of House Martell and the ruling Prince of Dorne. He was the older brother of Elia and Oberyn Martell, and the father of Trystane Martell.\n" +
                        "\n" +
                        "He was murdered along with his heir, Trystane, by Ellaria Sand and the Sand Snakes in an act of retaliation for his inaction against House Lannister for their crimes against Dorne.",
                image = "https://static.wikia.nocookie.net/gameofthrones/images/f/f9/Profile-DoranMartell.png/revision/latest?cb=20170728221257"
            ),

            GoTCharacter(
                name = "Olenna Tyrell",
                house = houseTyrell,
                title = "Queen of Thorns",
                age = 70,
                actorName = "Diana Rigg",
                culture = "Reach, Andal",
                episodeCount = 18,
                description = "Lady Olenna Tyrell, née Redwyne, was the elderly matriarch of House Tyrell and the last known head of that house. Lady Olenna had been a mistress of court politics, plotting and intrigue par excellence throughout her life. She was also known for her wit and sarcasm. As a result, Lady Olenna was popularly nicknamed the Queen of Thorns, in reference to the Tyrell sigil - a rose - and her cutting, barbed comments.",
                image = "https://upload.wikimedia.org/wikipedia/en/thumb/d/da/Olenna_Tyrell-Diana_Rigg.jpg/220px-Olenna_Tyrell-Diana_Rigg.jpg"
            ),
            GoTCharacter(
                name = "Margaery Tyrell",
                house = houseTyrell,
                title = "Queen of the Seven Kingdoms",
                age = 23,
                actorName = "Natalie Dormer",
                culture = "Reach, Andal",
                episodeCount = 26,
                description = "Queen Margaery Tyrell was the only daughter of Lord Mace Tyrell and Lady Alerie Tyrell, granddaughter of Lady Olenna Tyrell and sister of Ser Loras Tyrell. Margaery became Queen Consort through her marriage to King Joffrey Baratheon, and later his younger brother, King Tommen Baratheon, following Joffrey's death. However, a charge of perjury and a false dedication to the Sparrow movement led to her downfall as she was eventually killed along with her brother and father when the Great Sept of Baelor was destroyed with wildfire as orchestrated by Cersei Lannister to reclaim her lost power.",
                image = "https://upload.wikimedia.org/wikipedia/en/3/37/Margaery_Tyrell_in_the_Gardens.jpg"
            ),
            GoTCharacter(
                name = "Loras Tyrell",
                house = houseTyrell,
                title = "Knight of the Flowers",
                age = 22,
                actorName = "Finn Jones",
                culture = "Reach, Andal",
                episodeCount = 20,
                description = "Ser Loras Tyrell was a popular tourney knight and was regarded as one of the most skilled knights in Westeros. He was the heir to Highgarden, as well as the brother of Margaery Tyrell, who would later become Queen of the Seven Kingdoms. He also had a long-term romantic relationship with Renly Baratheon and was devastated when Renly was murdered; following this, Loras fought at Blackwater to avenge his death, and helped to win the battle to save King's Landing. Afterwards, he stayed in the city to support his sister in the new alliance between the Tyrells and House Lannister.",
                image = "https://static.wikia.nocookie.net/gameofthrones/images/0/02/LorasTyrell5X06.PNG/revision/latest?cb=20181013200613"
            )
        )
    }
}