package backend;

import java.time.Duration;
import java.time.Year;

/**
 * This class contains sample data.
 */
public class SampleData {

    public void fillMedia(TrackOrganizer to) {

        addCds(to);
        addLPs(to);
    }

    public void addLPs(TrackOrganizer to) {
        LP lp;

        lp = new LP("Dinosaurs Rule", "Led Zeppelin", Year.of(1967), "The Home(r) Entertainment Network", "8-track");
        lp.addTrack(new MusicTrack("Train Kept A Rollin'", "Led Zeppelin", Duration.ofSeconds(159)));
        lp.addTrack(new MusicTrack("Nobody's Fault But Mine", "Led Zeppelin", Duration.ofSeconds(226)));
        lp.addTrack(new MusicTrack("Black Dog", "Led Zeppelin", Duration.ofSeconds(212)));
        lp.addTrack(new MusicTrack("In The Evening", "Led Zeppelin", Duration.ofSeconds(245)));
        lp.addTrack(new MusicTrack("The Rain Song", "Led Zeppelin", Duration.ofSeconds(215)));
        lp.addTrack(new MusicTrack("Hot Dog", "Led Zeppelin", Duration.ofSeconds(213)));
        lp.addTrack(new MusicTrack("All My Love", "Led Zeppelin", Duration.ofSeconds(189)));
        lp.addTrack(new MusicTrack("Trampled Underfoot", "Led Zeppelin", Duration.ofSeconds(203)));
        lp.addTrack(new MusicTrack("Since I've Been Loving You", "Led Zeppelin", Duration.ofSeconds(240)));
        lp.addTrack(new MusicTrack("Archilles Last Stand", "Led Zeppelin", Duration.ofSeconds(230)));
        lp.addTrack(new MusicTrack("White Summer", "Led Zeppelin", Duration.ofSeconds(194)));
        lp.addTrack(new MusicTrack("Black Mountain Side", "Led Zeppelin", Duration.ofSeconds(240)));
        lp.addTrack(new MusicTrack("Kashmir", "Led Zeppelin", Duration.ofSeconds(235)));
        lp.addTrack(new MusicTrack("Stairway To Heaven", "Led Zeppelin", Duration.ofSeconds(243)));
        lp.addTrack(new MusicTrack("Whole Lotta Love", "Led Zeppelin", Duration.ofSeconds(158)));
        lp.addTrack(new MusicTrack("Heartbreaker", "Led Zeppelin", Duration.ofSeconds(156)));
        to.addMedia(lp);
    }

    public void addCds(TrackOrganizer to) {
        CD cd;

        cd = new CD("Dinosaurs Rule", "Led Zeppelin", Year.of(1967), "The Home(r) Entertainment Network");
        cd.addTrack(new MusicTrack("Train Kept A Rollin'", "Led Zeppelin", Duration.ofSeconds(159)));
        cd.addTrack(new MusicTrack("Nobody's Fault But Mine", "Led Zeppelin", Duration.ofSeconds(226)));
        cd.addTrack(new MusicTrack("Black Dog", "Led Zeppelin", Duration.ofSeconds(212)));
        cd.addTrack(new MusicTrack("In The Evening", "Led Zeppelin", Duration.ofSeconds(245)));
        cd.addTrack(new MusicTrack("The Rain Song", "Led Zeppelin", Duration.ofSeconds(215)));
        cd.addTrack(new MusicTrack("Hot Dog", "Led Zeppelin", Duration.ofSeconds(213)));
        cd.addTrack(new MusicTrack("All My Love", "Led Zeppelin", Duration.ofSeconds(189)));
        cd.addTrack(new MusicTrack("Trampled Underfoot", "Led Zeppelin", Duration.ofSeconds(203)));
        cd.addTrack(new MusicTrack("Since I've Been Loving You", "Led Zeppelin", Duration.ofSeconds(240)));
        cd.addTrack(new MusicTrack("Archilles Last Stand", "Led Zeppelin", Duration.ofSeconds(230)));
        cd.addTrack(new MusicTrack("White Summer", "Led Zeppelin", Duration.ofSeconds(194)));
        cd.addTrack(new MusicTrack("Black Mountain Side", "Led Zeppelin", Duration.ofSeconds(240)));
        cd.addTrack(new MusicTrack("Kashmir", "Led Zeppelin", Duration.ofSeconds(235)));
        cd.addTrack(new MusicTrack("Stairway To Heaven", "Led Zeppelin", Duration.ofSeconds(243)));
        cd.addTrack(new MusicTrack("Whole Lotta Love", "Led Zeppelin", Duration.ofSeconds(158)));
        cd.addTrack(new MusicTrack("Heartbreaker", "Led Zeppelin", Duration.ofSeconds(156)));
        to.addMedia(cd);

        cd = new CD("Time Pieces - The Best Of Eric Clapton", "Eric Clapton", Year.of(1954), "Polydor");
        cd.addTrack(new MusicTrack("I Shot The Sheriff", "Eric Clapton", Duration.ofSeconds(153)));
        cd.addTrack(new MusicTrack("After Midnight", "Eric Clapton", Duration.ofSeconds(246)));
        cd.addTrack(new MusicTrack("Knockin' On Heaven's Door", "Eric Clapton", Duration.ofSeconds(161)));
        cd.addTrack(new MusicTrack("Wonderful Tonight", "Eric Clapton", Duration.ofSeconds(180)));
        cd.addTrack(new MusicTrack("Layla", "Eric Clapton", Duration.ofSeconds(239)));
        cd.addTrack(new MusicTrack("Cocaine", "Eric Clapton", Duration.ofSeconds(239)));
        cd.addTrack(new MusicTrack("Lay Down Sally", "Eric Clapton", Duration.ofSeconds(182)));
        cd.addTrack(new MusicTrack("Willie And The Hand Jive", "Eric Clapton", Duration.ofSeconds(226)));
        cd.addTrack(new MusicTrack("Promises", "Eric Clapton", Duration.ofSeconds(226)));
        cd.addTrack(new MusicTrack("Swing Low Sweet Chariot", "Eric Clapton", Duration.ofSeconds(233)));
        cd.addTrack(new MusicTrack("Let It Grow", "Eric Clapton", Duration.ofSeconds(224)));
        to.addMedia(cd);

        cd = new CD("Creo En Mí", "Natalia Jiménez", Year.of(2015), "Sony Music Latin");
        cd.addTrack(new MusicTrack("Creo En Mí", "Natalia Jiménez", Duration.ofSeconds(193)));
        cd.addTrack(new MusicTrack("Quédate Con Ella", "Natalia Jiménez", Duration.ofSeconds(215)));
        cd.addTrack(new MusicTrack("Tú No Me Quieres Más", "Natalia Jiménez", Duration.ofSeconds(189)));
        cd.addTrack(new MusicTrack("Escapar", "Natalia Jiménez", Duration.ofSeconds(250)));
        cd.addTrack(new MusicTrack("Un Corazón Se Rompe", "Natalia Jiménez", Duration.ofSeconds(185)));
        cd.addTrack(new MusicTrack("Algo Brilla en Mí", "Natalia Jiménez", Duration.ofSeconds(162)));
        cd.addTrack(new MusicTrack("Ángeles Caídos", "Natalia Jiménez", Duration.ofSeconds(218)));
        cd.addTrack(new MusicTrack("Sólo Tú Me Haces Feliz", "Natalia Jiménez", Duration.ofSeconds(174)));
        cd.addTrack(new MusicTrack("Te Esperaré", "Natalia Jiménez", Duration.ofSeconds(151)));
        cd.addTrack(new MusicTrack("Mariposas", "Natalia Jiménez", Duration.ofSeconds(198)));
        cd.addTrack(new MusicTrack("Tú y Yo", "Natalia Jiménez", Duration.ofSeconds(229)));
        to.addMedia(cd);

        cd = new CD("Pretty Hate Machine", "Nine Inch Nails", Year.of(2002), "Interscope Records");
        cd.addTrack(new MusicTrack("Head Like A Hole", "Nine Inch Nails", Duration.ofSeconds(224)));
        cd.addTrack(new MusicTrack("Terrible Lie", "Nine Inch Nails", Duration.ofSeconds(168)));
        cd.addTrack(new MusicTrack("Down In It", "Nine Inch Nails", Duration.ofSeconds(188)));
        cd.addTrack(new MusicTrack("Sanctified", "Nine Inch Nails", Duration.ofSeconds(245)));
        cd.addTrack(new MusicTrack("Something I Can Never Have", "Nine Inch Nails", Duration.ofSeconds(201)));
        cd.addTrack(new MusicTrack("Kinda I Want To", "Nine Inch Nails", Duration.ofSeconds(215)));
        cd.addTrack(new MusicTrack("Sin", "Nine Inch Nails", Duration.ofSeconds(168)));
        cd.addTrack(new MusicTrack("That's What I Get", "Nine Inch Nails", Duration.ofSeconds(182)));
        cd.addTrack(new MusicTrack("The Only Time", "Nine Inch Nails", Duration.ofSeconds(199)));
        cd.addTrack(new MusicTrack("Ringfinger", "Nine Inch Nails", Duration.ofSeconds(222)));
        to.addMedia(cd);

        cd = new CD("One For The M6", "Led Zeppelin", Year.of(1975), "The Home(r) Entertainment Network");
        cd.addTrack(new MusicTrack("Over The Hills And Far Away", "Led Zeppelin", Duration.ofSeconds(186)));
        cd.addTrack(new MusicTrack("Black Dog", "Led Zeppelin", Duration.ofSeconds(230)));
        cd.addTrack(new MusicTrack("Misty Mountain Hop", "Led Zeppelin", Duration.ofSeconds(198)));
        cd.addTrack(new MusicTrack("Since I've Been Loving You", "Led Zeppelin", Duration.ofSeconds(162)));
        cd.addTrack(new MusicTrack("Dancing Days", "Led Zeppelin", Duration.ofSeconds(192)));
        cd.addTrack(new MusicTrack("Bron-Y-Aur Stomp", "Led Zeppelin", Duration.ofSeconds(250)));
        cd.addTrack(new MusicTrack("The Song Remains The Same", "Led Zeppelin", Duration.ofSeconds(245)));
        cd.addTrack(new MusicTrack("The Rain Song", "Led Zeppelin", Duration.ofSeconds(221)));
        cd.addTrack(new MusicTrack("Dazed And Confused", "Led Zeppelin", Duration.ofSeconds(203)));
        cd.addTrack(new MusicTrack("Stairway To Heaven", "Led Zeppelin", Duration.ofSeconds(190)));
        cd.addTrack(new MusicTrack("Whole Lotta Love Medley", "Led Zeppelin", Duration.ofSeconds(194)));
        cd.addTrack(new MusicTrack("Heartbreaker", "Led Zeppelin", Duration.ofSeconds(195)));
        cd.addTrack(new MusicTrack("The Ocean", "Led Zeppelin", Duration.ofSeconds(219)));
        to.addMedia(cd);

        cd = new CD("Dancing In The Sheets", "Shalamar", Year.of(1980), "Unidisc");
        cd.addTrack(new MusicTrack("Dancing In The Sheets", "Shalamar", Duration.ofSeconds(160)));
        cd.addTrack(new MusicTrack("Uptown Festival (Medley)", "Shalamar", Duration.ofSeconds(150)));
        cd.addTrack(new MusicTrack("Going To A Go-go", "Shalamar", Duration.ofSeconds(227)));
        cd.addTrack(new MusicTrack("I Can't Help Myself (Sugar Pie, Honey Bunch)", "Shalamar", Duration.ofSeconds(186)));
        cd.addTrack(new MusicTrack("Uptight (Everything's Alright)", "Shalamar", Duration.ofSeconds(223)));
        cd.addTrack(new MusicTrack("Stop! In The Name Of Love", "Shalamar", Duration.ofSeconds(213)));
        cd.addTrack(new MusicTrack("It's The Same Old Song", "Shalamar", Duration.ofSeconds(219)));
        cd.addTrack(new MusicTrack("Tears Of A Clown", "Shalamar", Duration.ofSeconds(209)));
        cd.addTrack(new MusicTrack("Love Is Like An Itching In My Heart", "Shalamar", Duration.ofSeconds(175)));
        cd.addTrack(new MusicTrack("This Old Heart Of Mine (Is Weak For You)", "Shalamar", Duration.ofSeconds(229)));
        cd.addTrack(new MusicTrack("Baby Love", "Shalamar", Duration.ofSeconds(242)));
        cd.addTrack(new MusicTrack("He Was Really Saying Something", "Shalamar", Duration.ofSeconds(214)));
        to.addMedia(cd);

        cd = new CD("Memories Of The Future", "Jaded Star", Year.of(2015), "Sensory");
        cd.addTrack(new MusicTrack("The Mask", "Jaded Star", Duration.ofSeconds(155)));
        cd.addTrack(new MusicTrack("Wake Up", "Jaded Star", Duration.ofSeconds(213)));
        cd.addTrack(new MusicTrack("Keep On Fighting", "Jaded Star", Duration.ofSeconds(234)));
        cd.addTrack(new MusicTrack("Stars", "Jaded Star", Duration.ofSeconds(150)));
        cd.addTrack(new MusicTrack("Into The End Of Time", "Jaded Star", Duration.ofSeconds(155)));
        cd.addTrack(new MusicTrack("Healing The Inner Child", "Jaded Star", Duration.ofSeconds(208)));
        cd.addTrack(new MusicTrack("You'll See", "Jaded Star", Duration.ofSeconds(249)));
        cd.addTrack(new MusicTrack("In Memory", "Jaded Star", Duration.ofSeconds(203)));
        cd.addTrack(new MusicTrack("Rainign In Sao Paolo", "Jaded Star", Duration.ofSeconds(247)));
        cd.addTrack(new MusicTrack("Innocence", "Jaded Star", Duration.ofSeconds(214)));
        to.addMedia(cd);

        cd = new CD("Crazy Love Records 2", "Various", Year.of(2001), "Crazy Love Records");
        cd.addTrack(new MusicTrack("Wrecking Dead Psychos", "Various", Duration.ofSeconds(250)));
        cd.addTrack(new MusicTrack("Porn Star", "Various", Duration.ofSeconds(204)));
        cd.addTrack(new MusicTrack("The Grim Ripper", "Various", Duration.ofSeconds(201)));
        cd.addTrack(new MusicTrack("Going Deadside", "Various", Duration.ofSeconds(246)));
        cd.addTrack(new MusicTrack("Corridor Of Lords", "Various", Duration.ofSeconds(166)));
        cd.addTrack(new MusicTrack("Spread The Virus", "Various", Duration.ofSeconds(159)));
        cd.addTrack(new MusicTrack("Bullies", "Various", Duration.ofSeconds(213)));
        cd.addTrack(new MusicTrack("Too Much For Your Heart", "Various", Duration.ofSeconds(245)));
        cd.addTrack(new MusicTrack("Scooter Boy", "Various", Duration.ofSeconds(184)));
        cd.addTrack(new MusicTrack("Arouse You", "Various", Duration.ofSeconds(218)));
        cd.addTrack(new MusicTrack("The Night Is So Long", "Various", Duration.ofSeconds(202)));
        to.addMedia(cd);

        cd = new CD("Deep Forest", "Deep Forest", Year.of(1992), "Columbia");
        cd.addTrack(new MusicTrack("Deep Forest", "Deep Forest", Duration.ofSeconds(177)));
        cd.addTrack(new MusicTrack("Sweet Lullaby", "Deep Forest", Duration.ofSeconds(208)));
        cd.addTrack(new MusicTrack("Hunting", "Deep Forest", Duration.ofSeconds(167)));
        cd.addTrack(new MusicTrack("Night Bird", "Deep Forest", Duration.ofSeconds(177)));
        cd.addTrack(new MusicTrack("The First Twilight", "Deep Forest", Duration.ofSeconds(208)));
        cd.addTrack(new MusicTrack("Savana Dance", "Deep Forest", Duration.ofSeconds(248)));
        cd.addTrack(new MusicTrack("Desert Walk", "Deep Forest", Duration.ofSeconds(246)));
        cd.addTrack(new MusicTrack("White Whisper", "Deep Forest", Duration.ofSeconds(177)));
        cd.addTrack(new MusicTrack("The Second Twilight", "Deep Forest", Duration.ofSeconds(164)));
        cd.addTrack(new MusicTrack("Sweet Lullaby (Ambient Mix)", "Deep Forest", Duration.ofSeconds(177)));
        to.addMedia(cd);

        cd = new CD("Blow Me (One Last Kiss)", "P!nk", Year.of(2012), "Sony Music");
        cd.addTrack(new MusicTrack("Blow Me (One Last Kiss)", "P!nk", Duration.ofSeconds(157)));
        to.addMedia(cd);

        cd = new CD("Mercury Falling", "Sting", Year.of(1996), "A&amp;M Records");
        cd.addTrack(new MusicTrack("The Hounds Of Winter", "Sting", Duration.ofSeconds(175)));
        cd.addTrack(new MusicTrack("I Hung My Head", "Sting", Duration.ofSeconds(238)));
        cd.addTrack(new MusicTrack("Let Your Soul Be Your Pilot", "Sting", Duration.ofSeconds(162)));
        cd.addTrack(new MusicTrack("I Was Brought To My Senses", "Sting", Duration.ofSeconds(234)));
        cd.addTrack(new MusicTrack("You Still Touch Me", "Sting", Duration.ofSeconds(173)));
        cd.addTrack(new MusicTrack("I'm So Happy I Can't Stop Crying", "Sting", Duration.ofSeconds(185)));
        cd.addTrack(new MusicTrack("All Four Seasons", "Sting", Duration.ofSeconds(167)));
        cd.addTrack(new MusicTrack("La Belle Dame Sans Regrets", "Sting", Duration.ofSeconds(165)));
        cd.addTrack(new MusicTrack("Valparaiso", "Sting", Duration.ofSeconds(196)));
        cd.addTrack(new MusicTrack("Lithium Sunset", "Sting", Duration.ofSeconds(214)));
        to.addMedia(cd);

        cd = new CD("Des Maux", "Explicit Clowns", Year.of(2003), "Not On Label (Explicit Clowns)");
        cd.addTrack(new MusicTrack("Un Monde Sans Furie", "Explicit Clowns", Duration.ofSeconds(225)));
        cd.addTrack(new MusicTrack("Inside The Circus", "Explicit Clowns", Duration.ofSeconds(186)));
        cd.addTrack(new MusicTrack("Vasectomia", "Explicit Clowns", Duration.ofSeconds(237)));
        cd.addTrack(new MusicTrack("Morbide", "Explicit Clowns", Duration.ofSeconds(175)));
        to.addMedia(cd);

        cd = new CD("Bye, Bye Baby", "Janis Joplin", Year.of(1992), "On Stage");
        cd.addTrack(new MusicTrack("Down On Me", "Janis Joplin", Duration.ofSeconds(248)));
        cd.addTrack(new MusicTrack("Bye, Bye Baby", "Janis Joplin", Duration.ofSeconds(200)));
        cd.addTrack(new MusicTrack("Piece Of My Heart", "Janis Joplin", Duration.ofSeconds(244)));
        cd.addTrack(new MusicTrack("Road Block", "Janis Joplin", Duration.ofSeconds(188)));
        cd.addTrack(new MusicTrack("Flower In The Sun", "Janis Joplin", Duration.ofSeconds(183)));
        cd.addTrack(new MusicTrack("Half Moon", "Janis Joplin", Duration.ofSeconds(205)));
        cd.addTrack(new MusicTrack("Kozmic Blues", "Janis Joplin", Duration.ofSeconds(221)));
        cd.addTrack(new MusicTrack("Move Over", "Janis Joplin", Duration.ofSeconds(157)));
        cd.addTrack(new MusicTrack("Ego Rock", "Janis Joplin", Duration.ofSeconds(224)));
        cd.addTrack(new MusicTrack("All Is Loneliness", "Janis Joplin", Duration.ofSeconds(190)));
        cd.addTrack(new MusicTrack("Try (Just A Little Bit Harder)", "Janis Joplin", Duration.ofSeconds(176)));
        cd.addTrack(new MusicTrack("Ball And Chain", "Janis Joplin", Duration.ofSeconds(155)));
        to.addMedia(cd);

        cd = new CD("Quand On Se Donne...", "Francis Martin", Year.of(1992), "Sony Musique");
        cd.addTrack(new MusicTrack("Rock It", "Francis Martin", Duration.ofSeconds(201)));
        cd.addTrack(new MusicTrack("Fou De Toi", "Francis Martin", Duration.ofSeconds(232)));
        cd.addTrack(new MusicTrack("Dis-Moi Pourquoi", "Francis Martin", Duration.ofSeconds(222)));
        cd.addTrack(new MusicTrack("Quand On Se Donne (À Une Femme D'Expérience)", "Francis Martin", Duration.ofSeconds(154)));
        cd.addTrack(new MusicTrack("Roc De Gilbraltar", "Francis Martin", Duration.ofSeconds(212)));
        cd.addTrack(new MusicTrack("Quitte Ou Double", "Francis Martin", Duration.ofSeconds(196)));
        cd.addTrack(new MusicTrack("Rêveur", "Francis Martin", Duration.ofSeconds(245)));
        cd.addTrack(new MusicTrack("Tous Les Jours Je Pense À Toi", "Francis Martin", Duration.ofSeconds(182)));
        cd.addTrack(new MusicTrack("S.O.S.", "Francis Martin", Duration.ofSeconds(211)));
        cd.addTrack(new MusicTrack("Décennie", "Francis Martin", Duration.ofSeconds(183)));
        to.addMedia(cd);

        cd = new CD("Ricchi &amp; Poveri", "Ricchi & Poveri", Year.of(2003), "Warner Strategic Marketing Italy");
        cd.addTrack(new MusicTrack("Questo Amore", "Ricchi & Poveri", Duration.ofSeconds(162)));
        cd.addTrack(new MusicTrack("Un Diadema Di Ciliege", "Ricchi & Poveri", Duration.ofSeconds(238)));
        cd.addTrack(new MusicTrack("Mama", "Ricchi & Poveri", Duration.ofSeconds(155)));
        cd.addTrack(new MusicTrack("E Poi...L'Amore", "Ricchi & Poveri", Duration.ofSeconds(223)));
        cd.addTrack(new MusicTrack("Giorno E Notte", "Ricchi & Poveri", Duration.ofSeconds(194)));
        cd.addTrack(new MusicTrack("Una Musica", "Ricchi & Poveri", Duration.ofSeconds(247)));
        cd.addTrack(new MusicTrack("Mi Manchi", "Ricchi & Poveri", Duration.ofSeconds(165)));
        cd.addTrack(new MusicTrack("Penso Sorrido E Canto", "Ricchi & Poveri", Duration.ofSeconds(151)));
        cd.addTrack(new MusicTrack("Caro Amore Mio", "Ricchi & Poveri", Duration.ofSeconds(233)));
        cd.addTrack(new MusicTrack("Musica Musica", "Ricchi & Poveri", Duration.ofSeconds(189)));
        to.addMedia(cd);

        cd = new CD("Lady In Red - A Collection Of Great Ballads 2", "Various", Year.of(1996), "Not On Label");
        cd.addTrack(new MusicTrack("More Than I Can Say", "Various", Duration.ofSeconds(165)));
        cd.addTrack(new MusicTrack("Paris Night", "Various", Duration.ofSeconds(186)));
        cd.addTrack(new MusicTrack("Joe Le Taxi", "Various", Duration.ofSeconds(180)));
        cd.addTrack(new MusicTrack("Nothing's Gonna Change My Love For You", "Various", Duration.ofSeconds(212)));
        cd.addTrack(new MusicTrack("Baker Street", "Various", Duration.ofSeconds(159)));
        cd.addTrack(new MusicTrack("Every Loser Wins", "Various", Duration.ofSeconds(186)));
        cd.addTrack(new MusicTrack("All Cried Out", "Various", Duration.ofSeconds(168)));
        cd.addTrack(new MusicTrack("You Can Leave Your Heat On", "Various", Duration.ofSeconds(235)));
        cd.addTrack(new MusicTrack("Don't Wanna Lose You", "Various", Duration.ofSeconds(155)));
        cd.addTrack(new MusicTrack("Tonight I Celebrate My Love", "Various", Duration.ofSeconds(199)));
        cd.addTrack(new MusicTrack("True", "Various", Duration.ofSeconds(180)));
        cd.addTrack(new MusicTrack("Lady Lady Lady", "Various", Duration.ofSeconds(156)));
        cd.addTrack(new MusicTrack("Because You Loved Me", "Various", Duration.ofSeconds(245)));
        cd.addTrack(new MusicTrack("Hold Me Now", "Various", Duration.ofSeconds(168)));
        cd.addTrack(new MusicTrack("Jeanny", "Various", Duration.ofSeconds(182)));
        cd.addTrack(new MusicTrack("Some Hearts Are Diamonds", "Various", Duration.ofSeconds(162)));
        cd.addTrack(new MusicTrack("Girl, You'll Be A Woman Soon", "Various", Duration.ofSeconds(220)));
        cd.addTrack(new MusicTrack("Sealed With A Kiss", "Various", Duration.ofSeconds(195)));
        to.addMedia(cd);

        cd = new CD("An Evening With All Mighty Senators", "All Mighty Senators", Year.of(1996), "Dog Eat Dog Records (2)");
        cd.addTrack(new MusicTrack("Race Car", "All Mighty Senators", Duration.ofSeconds(204)));
        cd.addTrack(new MusicTrack("E-Jam", "All Mighty Senators", Duration.ofSeconds(188)));
        cd.addTrack(new MusicTrack("G-Jam", "All Mighty Senators", Duration.ofSeconds(170)));
        cd.addTrack(new MusicTrack("Black Tie", "All Mighty Senators", Duration.ofSeconds(228)));
        cd.addTrack(new MusicTrack("Flow", "All Mighty Senators", Duration.ofSeconds(153)));
        cd.addTrack(new MusicTrack("No Clothes On", "All Mighty Senators", Duration.ofSeconds(200)));
        cd.addTrack(new MusicTrack("King Pin", "All Mighty Senators", Duration.ofSeconds(164)));
        to.addMedia(cd);

        cd = new CD("Hotter Than The Hindenburg", "Led Zeppelin", Year.of(1992), "The Home(r) Entertainment Network");
        cd.addTrack(new MusicTrack("The Train Kept A-Rollin'", "Led Zeppelin", Duration.ofSeconds(176)));
        cd.addTrack(new MusicTrack("Nobody's Fault But Mine", "Led Zeppelin", Duration.ofSeconds(226)));
        cd.addTrack(new MusicTrack("Black Dog", "Led Zeppelin", Duration.ofSeconds(210)));
        cd.addTrack(new MusicTrack("In The Evening", "Led Zeppelin", Duration.ofSeconds(226)));
        cd.addTrack(new MusicTrack("The Rain Song", "Led Zeppelin", Duration.ofSeconds(155)));
        cd.addTrack(new MusicTrack("Hot Dog", "Led Zeppelin", Duration.ofSeconds(185)));
        cd.addTrack(new MusicTrack("All My Love", "Led Zeppelin", Duration.ofSeconds(236)));
        cd.addTrack(new MusicTrack("Trampled Underfoot", "Led Zeppelin", Duration.ofSeconds(167)));
        cd.addTrack(new MusicTrack("Since I've Been Loving You", "Led Zeppelin", Duration.ofSeconds(243)));
        cd.addTrack(new MusicTrack("Archilles Last Stand", "Led Zeppelin", Duration.ofSeconds(250)));
        cd.addTrack(new MusicTrack("White Summer", "Led Zeppelin", Duration.ofSeconds(190)));
        cd.addTrack(new MusicTrack("Black Mountain Side", "Led Zeppelin", Duration.ofSeconds(197)));
        cd.addTrack(new MusicTrack("Kashmir", "Led Zeppelin", Duration.ofSeconds(186)));
        cd.addTrack(new MusicTrack("Stairway To Heaven", "Led Zeppelin", Duration.ofSeconds(223)));
        cd.addTrack(new MusicTrack("Rock And Roll", "Led Zeppelin", Duration.ofSeconds(173)));
        cd.addTrack(new MusicTrack("Money", "Led Zeppelin", Duration.ofSeconds(207)));
        cd.addTrack(new MusicTrack("Whole Lotta Love", "Led Zeppelin", Duration.ofSeconds(231)));
        to.addMedia(cd);

        cd = new CD("Essential Joey Arias, The", "Joey Arias", Year.of(2015), "Not On Label");
        cd.addTrack(new MusicTrack("Hard Day's Night", "Joey Arias", Duration.ofSeconds(165)));
        cd.addTrack(new MusicTrack("Dream Lover", "Joey Arias", Duration.ofSeconds(208)));
        cd.addTrack(new MusicTrack("You'll Be There", "Joey Arias", Duration.ofSeconds(178)));
        cd.addTrack(new MusicTrack("You've Changed", "Joey Arias", Duration.ofSeconds(160)));
        cd.addTrack(new MusicTrack("He's Funny That Way", "Joey Arias", Duration.ofSeconds(208)));
        cd.addTrack(new MusicTrack("God Bless The Child", "Joey Arias", Duration.ofSeconds(191)));
        cd.addTrack(new MusicTrack("All By Myself", "Joey Arias", Duration.ofSeconds(218)));
        cd.addTrack(new MusicTrack("Them There Eyes", "Joey Arias", Duration.ofSeconds(237)));
        cd.addTrack(new MusicTrack("Why Don't You Do Right", "Joey Arias", Duration.ofSeconds(152)));
        cd.addTrack(new MusicTrack("Black And Blue", "Joey Arias", Duration.ofSeconds(182)));
        cd.addTrack(new MusicTrack("Holiday", "Joey Arias", Duration.ofSeconds(213)));
        cd.addTrack(new MusicTrack("The Other Side Of Midnight", "Joey Arias", Duration.ofSeconds(178)));
        to.addMedia(cd);

        cd = new CD("Let&#39;s Spend A Quiet Night", "Mychal Marcel", Year.of(1994), "Mychen Ja");
        cd.addTrack(new MusicTrack("Let's Spend A Quiet Night", "Mychal Marcel", Duration.ofSeconds(212)));
        cd.addTrack(new MusicTrack("Come Here", "Mychal Marcel", Duration.ofSeconds(232)));
        cd.addTrack(new MusicTrack("Reprise (Interlude)", "Mychal Marcel", Duration.ofSeconds(210)));
        cd.addTrack(new MusicTrack("You Know (I Wanna Get Witcha)", "Mychal Marcel", Duration.ofSeconds(220)));
        cd.addTrack(new MusicTrack("You Make Me Feel Like Lovin'", "Mychal Marcel", Duration.ofSeconds(186)));
        cd.addTrack(new MusicTrack("Let's Spend A Quiet Night (Radio Mix)", "Mychal Marcel", Duration.ofSeconds(247)));
        cd.addTrack(new MusicTrack("Interlude (Quiet Night)", "Mychal Marcel", Duration.ofSeconds(168)));
        cd.addTrack(new MusicTrack("You Make Me Feel Like Lovin' (Remix)", "Mychal Marcel", Duration.ofSeconds(205)));
        to.addMedia(cd);

        cd = new CD("16 Suomalaista Kestosuosikkia", "Tapio Heinonen", Year.of(1998), "Bellevue Entertainment");
        cd.addTrack(new MusicTrack("Vanha Tie", "Tapio Heinonen", Duration.ofSeconds(184)));
        cd.addTrack(new MusicTrack("Tieni Länteen Toi", "Tapio Heinonen", Duration.ofSeconds(219)));
        cd.addTrack(new MusicTrack("Sotilaan Paluu (Philadelphia 1776)", "Tapio Heinonen", Duration.ofSeconds(224)));
        cd.addTrack(new MusicTrack("Kuusamo", "Tapio Heinonen", Duration.ofSeconds(155)));
        cd.addTrack(new MusicTrack("Sä Muistatko Metsätien", "Tapio Heinonen", Duration.ofSeconds(169)));
        cd.addTrack(new MusicTrack("Sulle Jokainen Päivä Tuon Vuokon", "Tapio Heinonen", Duration.ofSeconds(207)));
        cd.addTrack(new MusicTrack("Kulta-aikaan", "Tapio Heinonen", Duration.ofSeconds(201)));
        cd.addTrack(new MusicTrack("Tuo Onneton", "Tapio Heinonen", Duration.ofSeconds(206)));
        cd.addTrack(new MusicTrack("Lapsuutein Luo", "Tapio Heinonen", Duration.ofSeconds(228)));
        cd.addTrack(new MusicTrack("Luonnonlapsi", "Tapio Heinonen", Duration.ofSeconds(248)));
        cd.addTrack(new MusicTrack("Sen Verran Mustalaista", "Tapio Heinonen", Duration.ofSeconds(213)));
        cd.addTrack(new MusicTrack("Auringon Lapset", "Tapio Heinonen", Duration.ofSeconds(239)));
        cd.addTrack(new MusicTrack("Hän", "Tapio Heinonen", Duration.ofSeconds(171)));
        cd.addTrack(new MusicTrack("Sua Niin Rakastin", "Tapio Heinonen", Duration.ofSeconds(204)));
        cd.addTrack(new MusicTrack("Rakovalkealla", "Tapio Heinonen", Duration.ofSeconds(236)));
        cd.addTrack(new MusicTrack("Kuolleet Lehdet", "Tapio Heinonen", Duration.ofSeconds(154)));
        to.addMedia(cd);

        cd = new CD("Plan A!", "Thomas Godoj", Year.of(2008), "Sony BMG Music Entertainment");
        cd.addTrack(new MusicTrack("Love Is You", "Thomas Godoj", Duration.ofSeconds(213)));
        cd.addTrack(new MusicTrack("Not The Only One", "Thomas Godoj", Duration.ofSeconds(241)));
        cd.addTrack(new MusicTrack("Autopilot", "Thomas Godoj", Duration.ofSeconds(209)));
        cd.addTrack(new MusicTrack("Too Young To Grow Old", "Thomas Godoj", Duration.ofSeconds(170)));
        cd.addTrack(new MusicTrack("I Don't Feel The Same", "Thomas Godoj", Duration.ofSeconds(230)));
        cd.addTrack(new MusicTrack("Plan A!", "Thomas Godoj", Duration.ofSeconds(164)));
        cd.addTrack(new MusicTrack("Let It Be", "Thomas Godoj", Duration.ofSeconds(222)));
        cd.addTrack(new MusicTrack("It's Beautiful", "Thomas Godoj", Duration.ofSeconds(238)));
        cd.addTrack(new MusicTrack("Summer Breeze", "Thomas Godoj", Duration.ofSeconds(213)));
        cd.addTrack(new MusicTrack("The Morning Sun", "Thomas Godoj", Duration.ofSeconds(170)));
        cd.addTrack(new MusicTrack("Helden Gesucht", "Thomas Godoj", Duration.ofSeconds(249)));
        cd.addTrack(new MusicTrack("When The Tears Are Falling", "Thomas Godoj", Duration.ofSeconds(159)));
        cd.addTrack(new MusicTrack("Brandnew Start", "Thomas Godoj", Duration.ofSeconds(206)));
        cd.addTrack(new MusicTrack("Bonus: Love Is You (Video-Clip)", "Thomas Godoj", Duration.ofSeconds(247)));
        to.addMedia(cd);

        cd = new CD("Malinkého Ptáčka", "Buty", Year.of(1996), "Ariola");
        cd.addTrack(new MusicTrack("Dokouřit", "Buty", Duration.ofSeconds(201)));
        cd.addTrack(new MusicTrack("Malinkého Ptáčka II.", "Buty", Duration.ofSeconds(180)));
        cd.addTrack(new MusicTrack("Malinkého Ptáčka I. (Album Dřevo)", "Buty", Duration.ofSeconds(215)));
        cd.addTrack(new MusicTrack("Motyłe", "Buty", Duration.ofSeconds(180)));
        cd.addTrack(new MusicTrack("Uchem Jehly", "Buty", Duration.ofSeconds(172)));
        cd.addTrack(new MusicTrack("Vrána", "Buty", Duration.ofSeconds(194)));
        to.addMedia(cd);

        cd = new CD("Close To You", "David Cobb (3)", Year.of(1991), "Gold Castle");
        cd.addTrack(new MusicTrack("Step By Step", "David Cobb (3)", Duration.ofSeconds(212)));
        cd.addTrack(new MusicTrack("Found A Love", "David Cobb (3)", Duration.ofSeconds(218)));
        cd.addTrack(new MusicTrack("Been Born Again", "David Cobb (3)", Duration.ofSeconds(218)));
        cd.addTrack(new MusicTrack("Listen (Interlude)", "David Cobb (3)", Duration.ofSeconds(210)));
        cd.addTrack(new MusicTrack("Close To You", "David Cobb (3)", Duration.ofSeconds(222)));
        cd.addTrack(new MusicTrack("Holdin' On", "David Cobb (3)", Duration.ofSeconds(201)));
        cd.addTrack(new MusicTrack("I'll Never Let You Go", "David Cobb (3)", Duration.ofSeconds(157)));
        cd.addTrack(new MusicTrack("He That Hath An Ear", "David Cobb (3)", Duration.ofSeconds(167)));
        cd.addTrack(new MusicTrack("Close To You (Reprise)", "David Cobb (3)", Duration.ofSeconds(159)));
        cd.addTrack(new MusicTrack("Power", "David Cobb (3)", Duration.ofSeconds(213)));
        to.addMedia(cd);
    }
}
