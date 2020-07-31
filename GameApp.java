/*Software Development - Project
- Java Word Game-
HDCOMP, Year 1
@author Petra Furkes, 8th of May, 2020.
*/

import java.util.Random;
import java.util.Scanner;
public class GameApp{

	public static void main(String[] args){
	//declare instance variables

		String[] words = {
				"able",
				"about",
				"above",
				"act",
				"add",
				"afraid",
				"after",
				"again",
				"against",
				"age",
				"ago",
				"agree",
				"air",
				"all",
				"allow",
				"also",
				"always",
				"among",
				"and",
				"anger",
				"animal",
				"answer",
				"any",
				"appear",
				"apple",
				"are",
				"area",
				"aria",
				"arm",
				"arrange",
				"arrive",
				"art",
				"ask",
				"atom",
				"baby",
				"back",
				"bad",
				"ball",
				"balloon",
				"band",
				"bank",
				"bar",
				"base",
				"basic",
				"bat",
				"bear",
				"beat",
				"beauty",
				"bed",
				"been",
				"before",
				"began",
				"begin",
				"behind",
				"believe",
				"bell",
				"best",
				"better",
				"between",
				"big",
				"bird",
				"bit",
				"black",
				"bliss",
				"block",
				"blood",
				"blow",
				"blue",
				"board",
				"boat",
				"body",
				"bone",
				"book",
				"bookkeeper",
				"bookkeeping",
				"born",
				"both",
				"bottom",
				"bought",
				"box",
				"boy",
				"branch",
				"bread",
				"break",
				"bright",
				"bring",
				"broad",
				"broke",
				"brother",
				"brought",
				"brown",
				"build",
				"burn",
				"busy",
				"but",
				"buy",
				"cabin",
				"call",
				"came",
				"camp",
				"can",
				"capital",
				"captain",
				"car",
				"card",
				"care",
				"carry",
				"case",
				"cat",
				"catch",
				"caught",
				"cause",
				"cell",
				"cent",
				"center",
				"century",
				"certain",
				"chair",
				"chance",
				"change",
				"chaos",
				"character",
				"charge",
				"chart",
				"check",
				"cheerleader",
				"cheese",
				"chick",
				"chief",
				"child",
				"children",
				"choose",
				"chord",
				"circle",
				"city",
				"claim",
				"class",
				"classroom",
				"clean",
				"clear",
				"climb",
				"climbing",
				"clock",
				"close",
				"clothe",
				"cloud",
				"coast",
				"coat",
				"coffee",
				"cold",
				"collect",
				"colony",
				"color",
				"column",
				"come",
				"committee",
				"common",
				"company",
				"compare",
				"complete",
				"condition",
				"connect",
				"consider",
				"consonant",
				"contain",
				"continent",
				"continue",
				"control",
				"cook",
				"cool",
				"copy",
				"corn",
				"corner",
				"correct",
				"cost",
				"cotton",
				"could",
				"count",
				"country",
				"course",
				"cover",
				"cow",
				"crease",
				"create",
				"crop",
				"cross",
				"crowd",
				"cry",
				"current",
				"cut",
				"dad",
				"dance",
				"danger",
				"dark",
				"day",
				"dead",
				"deal",
				"dear",
				"death",
				"decide",
				"decimal",
				"deep",
				"deer",
				"degree",
				"depend",
				"describe",
				"desert",
				"design",
				"determine",
				"develop",
				"dictionary",
				"did",
				"die",
				"differ",
				"difficult",
				"direct",
				"discuss",
				"distant",
				"divide",
				"division",
				"doctor",
				"does",
				"dog",
				"dollar",
				"done",
				"door",
				"double",
				"down",
				"draw",
				"dream",
				"dress",
				"drink",
				"drive",
				"drop",
				"dry",
				"duck",
				"during",
				"each",
				"ear",
				"early",
				"earth",
				"ease",
				"east",
				"eat",
				"edge",
				"effect",
				"egg",
				"eight",
				"either",
				"electric",
				"element",
				"else",
				"end",
				"enemy",
				"energy",
				"engine",
				"enough",
				"enter",
				"equal",
				"equate",
				"especially",
				"even",
				"evening",
				"event",
				"ever",
				"every",
				"exact",
				"example",
				"except",
				"excite",
				"exercise",
				"expect",
				"experience",
				"experiment",
				"eye",
				"face",
				"fact",
				"fair",
				"fall",
				"family",
				"famous",
				"far",
				"farm",
				"fast",
				"fat",
				"father",
				"favor",
				"fear",
				"feed",
				"feel",
				"feeling",
				"feet",
				"fell",
				"felt",
				"few",
				"field",
				"fig",
				"fight",
				"figure",
				"fill",
				"final",
				"find",
				"fine",
				"finger",
				"finish",
				"fire",
				"first",
				"fish",
				"fit",
				"five",
				"flat",
				"floor",
				"flow",
				"flower",
				"fly",
				"follow",
				"food",
				"foot",
				"for",
				"force",
				"forest",
				"form",
				"forward",
				"found",
				"four",
				"fraction",
				"free",
				"freedom",
				"fresh",
				"friend",
				"from",
				"front",
				"fruit",
				"fry",
				"full",
				"fun",
				"game",
				"garden",
				"gas",
				"gather",
				"gave",
				"general",
				"gentle",
				"get",
				"girl",
				"give",
				"glad",
				"glass",
				"gold",
				"gone",
				"good",
				"got",
				"govern",
				"grand",
				"grass",
				"gray",
				"great",
				"green",
				"grew",
				"ground",
				"group",
				"grow",
				"guess",
				"guide",
				"gun",
				"gym",
				"had",
				"hair",
				"half",
				"hand",
				"happen",
				"happy",
				"hard",
				"has",
				"hat",
				"have",
				"head",
				"hear",
				"heard",
				"heart",
				"heat",
				"heavy",
				"held",
				"help",
				"her",
				"here",
				"high",
				"hill",
				"him",
				"his",
				"history",
				"hit",
				"hold",
				"hole",
				"home",
				"hope",
				"horse",
				"hot",
				"hour",
				"house",
				"how",
				"huge",
				"human",
				"hundred",
				"hunt",
				"hurry",
				"hymn",
				"ice",
				"idea",
				"imagine",
				"inch",
				"include",
				"indicate",
				"industry",
				"insect",
				"instant",
				"instrument",
				"interest",
				"invent",
				"iron",
				"island",
				"job",
				"join",
				"joy",
				"jump",
				"just",
				"keep",
				"kept",
				"key",
				"kill",
				"kind",
				"king",
				"knew",
				"know",
				"knowledge",
				"lady",
				"lake",
				"land",
				"language",
				"large",
				"last",
				"late",
				"laugh",
				"law",
				"lay",
				"lead",
				"learn",
				"least",
				"leave",
				"led",
				"left",
				"leg",
				"length",
				"less",
				"let",
				"letter",
				"level",
				"lie",
				"life",
				"lift",
				"light",
				"like",
				"line",
				"liquid",
				"list",
				"listen",
				"little",
				"live",
				"locate",
				"log",
				"lone",
				"long",
				"look",
				"loop",
				"lost",
				"lot",
				"loud",
				"love",
				"low",
				"lynx",
				"lyrics",
				"machine",
				"made",
				"magnet",
				"main",
				"major",
				"make",
				"man",
				"many",
				"map",
				"mark",
				"market",
				"mass",
				"master",
				"match",
				"material",
				"matter",
				"may",
				"mean",
				"meant",
				"measure",
				"meat",
				"meet",
				"melody",
				"men",
				"metal",
				"method",
				"middle",
				"might",
				"mile",
				"milk",
				"million",
				"mind",
				"mine",
				"minute",
				"miracle",
				"miss",
				"mix",
				"modern",
				"molecule",
				"moment",
				"money",
				"month",
				"moon",
				"more",
				"morning",
				"most",
				"mother",
				"motion",
				"mount",
				"mountain",
				"mountaineering",
				"mouth",
				"move",
				"much",
				"multiply",
				"music",
				"must",
				"myth",
				"name",
				"nation",
				"natural",
				"nature",
				"near",
				"necessary",
				"neck",
				"need",
				"neighbor",
				"never",
				"new",
				"next",
				"night",
				"nine",
				"noise",
				"noon",
				"nor",
				"north",
				"nose",
				"not",
				"note",
				"nothing",
				"notice",
				"noun",
				"now",
				"number",
				"numeral",
				"nymph",
				"object",
				"observe",
				"occur",
				"ocean",
				"off",
				"offer",
				"office",
				"often",
				"oil",
				"old",
				"once",
				"one",
				"only",
				"open",
				"opera",
				"operate",
				"opposite",
				"order",
				"organ",
				"original",
				"other",
				"our",
				"out",
				"over",
				"own",
				"oxygen",
				"page",
				"paint",
				"painter",
				"painting",
				"pair",
				"paper",
				"paragraph",
				"parent",
				"part",
				"particular",
				"party",
				"pass",
				"past",
				"path",
				"pattern",
				"pay",
				"people",
				"performance",
				"perhaps",
				"period",
				"person",
				"phrase",
				"pick",
				"picture",
				"piece",
				"pitch",
				"place",
				"plain",
				"plan",
				"plane",
				"planet",
				"plant",
				"play",
				"please",
				"plural",
				"poem",
				"point",
				"poor",
				"populate",
				"port",
				"pose",
				"position",
				"possible",
				"post",
				"pound",
				"power",
				"practice",
				"prepare",
				"present",
				"press",
				"pretty",
				"print",
				"probable",
				"problem",
				"process",
				"produce",
				"product",
				"program",
				"proof",
				"proper",
				"property",
				"protect",
				"prove",
				"provide",
				"pull",
				"push",
				"put",
				"quart",
				"queen",
				"question",
				"quick",
				"quiet",
				"quite",
				"quotient",
				"race",
				"radio",
				"rail",
				"rain",
				"raise",
				"ran",
				"range",
				"rather",
				"reach",
				"read",
				"ready",
				"real",
				"reason",
				"receive",
				"record",
				"red",
				"region",
				"remember",
				"repeat",
				"reply",
				"represent",
				"require",
				"rest",
				"result",
				"rhythm",
				"rich",
				"ride",
				"right",
				"ring",
				"rise",
				"river",
				"road",
				"rock",
				"roll",
				"room",
				"root",
				"rope",
				"rose",
				"round",
				"row",
				"rub",
				"rule",
				"run",
				"safe",
				"said",
				"sail",
				"salt",
				"same",
				"sample",
				"sand",
				"sat",
				"save",
				"saw",
				"say",
				"scale",
				"school",
				"science",
				"score",
				"sea",
				"search",
				"season",
				"seat",
				"second",
				"section",
				"see",
				"seed",
				"seem",
				"segment",
				"select",
				"self",
				"sell",
				"send",
				"sense",
				"sent",
				"sentence",
				"separate",
				"serve",
				"set",
				"settle",
				"seven",
				"several",
				"shall",
				"shape",
				"share",
				"sharp",
				"she",
				"sheet",
				"shell",
				"shine",
				"ship",
				"shoe",
				"shop",
				"shore",
				"short",
				"should",
				"shoulder",
				"shout",
				"show",
				"shy",
				"side",
				"sight",
				"sign",
				"silent",
				"silver",
				"similar",
				"simple",
				"since",
				"sing",
				"single",
				"sister",
				"sit",
				"six",
				"size",
				"skill",
				"skin",
				"sky",
				"slave",
				"sleep",
				"slip",
				"slow",
				"sly",
				"small",
				"smell",
				"smile",
				"snow",
				"soft",
				"soil",
				"soldier",
				"solution",
				"solve",
				"some",
				"son",
				"song",
				"soon",
				"soul",
				"sound",
				"south",
				"space",
				"speak",
				"special",
				"speech",
				"speed",
				"spell",
				"spend",
				"spoke",
				"spot",
				"spread",
				"spring",
				"spy",
				"square",
				"stand",
				"star",
				"start",
				"state",
				"station",
				"stay",
				"stead",
				"steam",
				"steel",
				"step",
				"stick",
				"still",
				"stone",
				"stood",
				"stop",
				"store",
				"story",
				"straight",
				"strange",
				"stream",
				"street",
				"stretch",
				"string",
				"strong",
				"student",
				"study",
				"subject",
				"substance",
				"subtract",
				"success",
				"such",
				"sudden",
				"suffix",
				"sugar",
				"suggest",
				"suit",
				"summer",
				"sun",
				"supply",
				"support",
				"sure",
				"surface",
				"surprise",
				"swim",
				"syllable",
				"symbol",
				"system",
				"table",
				"tail",
				"take",
				"talk",
				"tall",
				"teach",
				"team",
				"teeth",
				"tell",
				"temperature",
				"ten",
				"term",
				"test",
				"than",
				"thank",
				"that",
				"the",
				"their",
				"them",
				"then",
				"there",
				"these",
				"they",
				"thick",
				"thin",
				"thing",
				"think",
				"third",
				"this",
				"those",
				"though",
				"thought",
				"thousand",
				"three",
				"through",
				"throw",
				"thus",
				"tie",
				"time",
				"tiny",
				"tire",
				"together",
				"told",
				"tone",
				"too",
				"took",
				"tool",
				"top",
				"total",
				"touch",
				"toward",
				"town",
				"track",
				"trade",
				"train",
				"travel",
				"tree",
				"triangle",
				"trip",
				"trouble",
				"truck",
				"try",
				"tube",
				"turn",
				"twenty",
				"two",
				"type",
				"under",
				"unit",
				"until",
				"use",
				"usual",
				"valley",
				"value",
				"vary",
				"verb",
				"very",
				"view",
				"village",
				"visit",
				"voice",
				"vowel",
				"wait",
				"walk",
				"wall",
				"want",
				"war",
				"warm",
				"was",
				"wash",
				"watch",
				"water",
				"wave",
				"way",
				"wear",
				"weather",
				"week",
				"weekend",
				"weight",
				"well",
				"went",
				"were",
				"west",
				"what",
				"wheel",
				"when",
				"where",
				"whether",
				"which",
				"while",
				"white",
				"who",
				"whole",
				"whose",
				"why",
				"wide",
				"wife",
				"wild",
				"will",
				"win",
				"wind",
				"window",
				"wing",
				"winter",
				"wire",
				"wish",
				"with",
				"woman",
				"women",
				"wonder",
				"wood",
				"word",
				"work",
				"world",
				"would",
				"write",
				"written",
				"wrong",
				"wrote",
				"wry",
				"xerox",
				"xylophone",
				"yard",
				"year",
				"yellow",
				"yes",
				"yet",
				"you",
				"young",
				"your",
				"zebra",
				"zen",
				"zero",
				"zillion",
				"zinc",
				"zip",
				"zone",
				"zoo",
				"zookeeper",
				"zoologist"
				};  // here ends the 1D array of words

				String plFirstName;
				String plSecondName;
				int plFirstPoints;
				int plSecondPoints;
				int playerFirstLives = 5;  //the decision is that both players at the beginning of the game have been given 5 lives
				int playerSecondLives = 5; //the decision is that both players at the beginning of the game have been given 5 lives
				String enteredWordFirstPlayer;
				String enteredWordSecondPlayer;
				boolean gameWon = false;
				boolean roundLost = false;
				boolean lostLife = false;
				boolean isFirstPlayer = true;


			Scanner input = new Scanner(System.in);
			Scanner anotherInput = new Scanner(System.in);

			Game app = new Game();


			//greating message and rules description
			System.out.println();
			System.out.println("Welcome to Words Game!");
			System.out.println();
			System.out.println();
			System.out.println("The rules for gaining points are:");
			System.out.println("---------------------------------");
			System.out.println("The player receives the same amount of points as the number of characters
								in the entered word is,excluding the letters a, e and o.");
			System.out.println("To be entitled to get the points the word has to have minimum three
								letters and needs to be a valid word.");
			System.out.println("Valid word at the begining of every game/round is a word that starts
								with the provided letter by the computer and is part of vocabulary.");
			System.out.println("Further valid word is a word which starts with last two letters from
								word given by previous player and is a part of vocabulary.");
			System.out.println();
			//the decision is if the invalid word is provided player will lose one life
			System.out.println("If you provide an invalid word you will lost one life.");
			System.out.println("If you cannot provide valid word you can type '-' and you will pass
								round to another player and lose one life.");
			System.out.println();
			System.out.println("Both players at the beginning of the game have given 5 lives.");
			System.out.println();
			System.out.println("At the end of the game you can play the game again or you can finish the game.");
			System.out.println();
			System.out.println("Best of luck to both of you!");
			System.out.println("--------------------------------------------------------------------------------
								---------------------------------------------------------");
			System.out.println();


		//LOOP FOR NEW FULL GAME

			//input
			System.out.println("Player 1, please enter your name: ");
			plFirstName = input.nextLine();
			app.setFirstPlayerName(plFirstName);
			System.out.println("Player 2, please enter your name: ");
			plSecondName = anotherInput.nextLine();
			app.setSecondPlayerName(plSecondName);

			System.out.println();
			System.out.println(app.getFirstPlayerName() + " you will be playing as a first player and " +
								app.getSecondPlayerName() + " will be playing as a second player.");


			//BEGGINING OF THE ROUND
			while(!gameWon){
				roundLost = false;
					//process for validating who the winner of the game is if last life is lost outside of roundLost loop
					//if the winner of the game is first player
					if(playerSecondLives==0){
						System.out.println();
						System.out.println ("Congratulations "+plFirstName+ "! You are the winner of the game!");
						System.out.println(plFirstName+ " has " +app.getFirstPlayerCounter()+ " points and "+
											plSecondName+ " has " +app.getSecondPlayerCounter()+ " points ");
						System.out.println("-----------------------------------------------------------------
											-------------------------------------------------------");
						System.out.println();
						System.out.println(plFirstName+ " would you like to play a game again? Enter YES or NO. ");
						//process for playing a new game or ending a game
						if(input.nextLine().equalsIgnoreCase("yes")){
							System.out.println("Let's start again. Best of luck!");
							//calls method to reset game
							app.resetGame();
							playerFirstLives = 5;
							playerSecondLives = 5;
							gameWon = false;
							isFirstPlayer = true;

						}else{
							System.out.println();
							System.out.println(plFirstName+ " and " +plSecondName + " thank you for playing a game!");
							gameWon = true;
							break;
						}
					}
						//if the winner of the game is second player
					if(playerFirstLives==0){
						System.out.println();
						System.out.println ("Congratulations "+plSecondName+ "! You are the winner of the game!");
						System.out.println(plSecondName+ " has " +app.getSecondPlayerCounter()+ " points and "+
											plFirstName+ " has " +app.getFirstPlayerCounter()+ " points.");
						System.out.println("---------------------------------------------------------------------
											---------------------------------------------------");
						System.out.println();
						System.out.println(plSecondName+ " would you like to play a game again? Enter YES or NO.");
						//process for playing a new game or ending a game
						if(input.nextLine().equalsIgnoreCase("yes")){
							System.out.println("Let's start again. Best of luck!");
							//calls method to reset game
							app.resetGame();
							playerFirstLives = 5;
							playerSecondLives = 5;
							gameWon = false;
							isFirstPlayer = false;

						}else{
							System.out.println();
							System.out.println(plFirstName + " and " +plSecondName + " thank you for playing a game!");
							gameWon = true;
							break;
							}
					}

					System.out.println();
					System.out.println("----------");
					System.out.println("Round " +app.getRoundNumber());
					System.out.println();

					//random letter for first word
					String letter =  "abcdefghijklmnopqrstuvwxyz";
					Random rn = new Random();
					int randomLetter = rn.nextInt(letter.length());
					char rnLetter = letter.charAt(randomLetter);
					System.out.println("The letter for the first word is: " + rnLetter);

			//IF IS FIRST PLAYER AT THE BEGINING OF THE GAME AFTER RANDOM LETTER IS PROVIDED AND IF INVALID WORD IS
			//PROVIDED BY SECOND PLAYER SO FIRST PLAYER WILL START NEW ROUND
					if (isFirstPlayer){
						System.out.println(app.getFirstPlayerName() + " please enter a word: ");
						enteredWordFirstPlayer = input.nextLine();
						//first process for validating word if it starts with given random letter
						if(enteredWordFirstPlayer.charAt(0)==rnLetter){
							//second process for validating word, checking if it is part of an vocabulary array
							for(int i=0; i<words.length; i++){
								if (enteredWordFirstPlayer.equalsIgnoreCase(words[i])){
									app.setValidWordFirstPlayer(words[i]);
									System.out.println("The " + app.getValidWordFirstPlayer()+ " word is valid.");
									// process for gaining points when word is valid
									plFirstPoints = 0;
									for(int j=0; j<app.getValidWordFirstPlayer().length(); j++){
										char c = app.getValidWordFirstPlayer().charAt(j);
										if(!(c=='a') && !(c=='e') && !(c=='o') && (app.getValidWordFirstPlayer().length()>=3)){
											plFirstPoints = plFirstPoints + 1;
											app.setFirstPlayerPoints(plFirstPoints);
											app.setFirstPlayerCounter(plFirstPoints);
											}
										}
									}
							}
							//displaying message when player has provided valid word, satisfied both requerements and got points,
							//points are individual for provided word and total for the game
							if (enteredWordFirstPlayer.equalsIgnoreCase(app.getValidWordFirstPlayer())){
								System.out.println(plFirstName+ " you have got " + app.getFirstPlayerPoints() + " points.");
								System.out.println(plFirstName+ " your total points are " +app.getFirstPlayerCounter()+ " points.");
							}
							//displaying message and further process in a case when first letter of provided word was valid but full
							//word is not part of vocabulary array
							if (!app.getValidWordFirstPlayer().equalsIgnoreCase(enteredWordFirstPlayer)){
								playerFirstLives = playerFirstLives - 1;
								System.out.println(plFirstName+ ", the entered word: " +enteredWordFirstPlayer + " doesn't exist in
								given vocabulary and you lost one life. You have "  +playerFirstLives + " lives left.");
								isFirstPlayer = false;
								continue;
							}
						//displaying message and further process in a case when first letter of provided word
						//was not valid or '-' is entered
						}else{
							playerFirstLives = playerFirstLives - 1;
							if (enteredWordFirstPlayer.equals("-")){
								System.out.println(plFirstName+ ", sorry to see you cannot provide word as "
								+enteredWordFirstPlayer + " means you want to pass round to the next player and
								you lost one life. You have " +playerFirstLives + " lives left.");
							}else{
								System.out.println(plFirstName+ ", the entered word: " +enteredWordFirstPlayer +
								" doesn't start with given letter and you lost one life. You have "
								+playerFirstLives + " lives left.");
							}
							isFirstPlayer = false;
							continue;
						}



				//WHEN INVALID WORD IS PROVIDED BY PREVIOUS PLAYER AND PREVIOUS PLAYER WAS FIRST PLAYER
				//THEN ROUND WILL START WITH SECOND PLAYER
					} else {
						System.out.println(app.getSecondPlayerName() + " please enter a word: ");
						enteredWordSecondPlayer = anotherInput.nextLine();
						//first process for validating word if it starts with given random letter
						if(enteredWordSecondPlayer.charAt(0)==rnLetter){
							//second process for validating word, checking if it is part of an vocabulary array
							for(int i=0; i<words.length; i++){
								if (enteredWordSecondPlayer.equalsIgnoreCase(words[i])){
									app.setValidWordSecondPlayer(words[i]);
									System.out.println("The " + app.getValidWordSecondPlayer()+ " word is valid.");
									// process for gaining points when word is valid
									plSecondPoints = 0;
										for(int j=0; j<app.getValidWordSecondPlayer().length(); j++){
										char c = app.getValidWordSecondPlayer().charAt(j);
										if(!(c=='a') && !(c=='e') && !(c=='o') && (app.getValidWordSecondPlayer().length()>=3)){
											plSecondPoints = plSecondPoints + 1;
											app.setSecondPlayerPoints(plSecondPoints);
											app.setSecondPlayerCounter(plSecondPoints);
										}
									}
								}
							}
							//displaying message when player has provided valid word, satisfied both requerements and got points,
							//points are individual for provided word and total for the game
							if (enteredWordSecondPlayer.equalsIgnoreCase(app.getValidWordSecondPlayer())){
								System.out.println(plSecondName+ " you have got " +app.getSecondPlayerPoints()+ " points.");
								System.out.println(plSecondName+ " your total points are " + app.getSecondPlayerCounter() + " points.");
							}
							//displaying message and further process in a case when first letter of provided word was valid but
							//full word is not part of vocabulary array
							if(!app.getValidWordSecondPlayer().equalsIgnoreCase(enteredWordSecondPlayer)){
								playerSecondLives = playerSecondLives - 1;
								System.out.println(plSecondName+", the entered word: " +enteredWordSecondPlayer +
								" doesn't exist in given vocabulary and you lost one life. You have "
								+playerSecondLives + " lives left.");
								gameWon = false;
								isFirstPlayer = true;
								continue;
							}
						//displaying message and further process in a case when first letter of provided word was not valid or '-' is entered
						}else{
							playerSecondLives = playerSecondLives - 1;
							if (enteredWordSecondPlayer.equals("-")){
								System.out.println(plSecondName+ ", sorry to see you cannot provide word as "
								+enteredWordSecondPlayer + " means you want to pass the round to the next player and you lost one life.
								You have "+playerSecondLives + " lives left.");
							}else{
								System.out.println(plSecondName+ ", the entered word: " +enteredWordSecondPlayer
								+ " doesn't start with given letter and you lost one life. You have "
								+playerSecondLives + " lives left.");
							}
							gameWon = false;
							isFirstPlayer = true;
							continue;
						}
					}

					//process for validating who the winner of the game is if last life is lost outside of roundLost loop
					//if the winner of the game is first player
					if(playerSecondLives==0){
						System.out.println();
						System.out.println ("Congratulations "+plFirstName+ "! You are the winner of the game!");
						System.out.println(plFirstName+ " has " +app.getFirstPlayerCounter()+ " points and "
											+ plSecondName+ " has " +app.getSecondPlayerCounter()+ " points ");
						System.out.println("----------------------------------------------------------------
											--------------------------------------------------------");
						System.out.println();
						System.out.println(plFirstName+ " would you like to play a game again? Enter YES or NO. ");
						//process for playing a new game or ending a game
						if(input.nextLine().equalsIgnoreCase("yes")){
							System.out.println("Let's start again. Best of luck!");
							//calls method to reset game
							app.resetGame();
							playerFirstLives = 5;
							playerSecondLives = 5;
							gameWon = false;
							isFirstPlayer = true;

						}else{
							System.out.println();
							System.out.println(plFirstName+ " and " +plSecondName + " thank you for playing a game!");
							gameWon = true;
							break;
						}
					}
					//if the winner of the game is second player
					if(playerFirstLives==0){
						System.out.println();
						System.out.println ("Congratulations "+plSecondName+ "! You are the winner of the game!");
						System.out.println(plSecondName+ " has " +app.getSecondPlayerCounter()+ " points and "
											+ plFirstName+ " has " +app.getFirstPlayerCounter()+ " points.");
						System.out.println("------------------------------------------------------------------
											------------------------------------------------------");
						System.out.println();
						System.out.println(plSecondName+ " would you like to play a game again? Enter YES or NO.");
						//process for playing a new game or ending a game
						if(input.nextLine().equalsIgnoreCase("yes")){
							System.out.println("Let's start again. Best of luck!");
							//calls method to reset game
							app.resetGame();
							playerFirstLives = 5;
							playerSecondLives = 5;
							gameWon = false;
							isFirstPlayer = false;

						}else{
							System.out.println();
							System.out.println(plFirstName + " and " +plSecondName + " thank you for playing a game!");
							gameWon = true;
							break;
						}
					}



					//HALF OF ROUND, INSIDE LOOP
					while(!roundLost){
						isFirstPlayer = !isFirstPlayer;

						System.out.println();
					//IS FIRST PLAYER INSIDE LOOP
						if (isFirstPlayer){
							//asking player to provide a word which starts with last two letters of word provided by previous player
							System.out.println(app.getFirstPlayerName() + " please enter a word that beggins with : "
							+app.getValidWordSecondPlayer().charAt(app.getValidWordSecondPlayer().length()-2)
							+app.getValidWordSecondPlayer().charAt(app.getValidWordSecondPlayer().length()-1));
							enteredWordFirstPlayer = input.nextLine();

							//first process for validating word, if it starts with last two letters of word provided by previous player
							if(enteredWordFirstPlayer.charAt(0)==app.getValidWordSecondPlayer().charAt(app.getValidWordSecondPlayer().length()-2)
							&& enteredWordFirstPlayer.charAt(1)==app.getValidWordSecondPlayer().charAt(app.getValidWordSecondPlayer().length()-1)){

								//second process for validating word, checking if it is part of an vocabulary array
								for(int i=0; i<words.length; i++){
									if (enteredWordFirstPlayer.equalsIgnoreCase(words[i])){
									app.setValidWordFirstPlayer(words[i]);
									System.out.println("The " + app.getValidWordFirstPlayer()+ " word is valid.");
									// process for gaining points when word is valid
										plFirstPoints = 0;
										for(int j=0; j<app.getValidWordFirstPlayer().length(); j++){
											char c = app.getValidWordFirstPlayer().charAt(j);
											if(!(c=='a') && !(c=='e') && !(c=='o') && (app.getValidWordFirstPlayer().length()>=3)){
												plFirstPoints = plFirstPoints + 1;
												app.setFirstPlayerPoints(plFirstPoints);
												app.setFirstPlayerCounter(plFirstPoints);
											}
										}
									}
								}
								//displaying message when player has provided valid word, satisfied both requerements and got points,
								//points are individual for provided word and total for the game
								if (enteredWordFirstPlayer.equalsIgnoreCase(app.getValidWordFirstPlayer())){
									System.out.println(plFirstName+ " you have got " + app.getFirstPlayerPoints() + " points.");
									System.out.println(plFirstName+ " your total points are " +app.getFirstPlayerCounter()+ " points.");
								}
								//displaying message and further process in a case when first and second letter of provided word was
								//second last and last latter of word provided by previous player but full word is not part of vocabulary array
								if (!app.getValidWordFirstPlayer().equalsIgnoreCase(enteredWordFirstPlayer)){
									playerFirstLives = playerFirstLives - 1;
									System.out.println(plFirstName+ ", the entered word: " +enteredWordFirstPlayer
														+" doesn't exist in given vocabulary and you lost one life. You have "
														+playerFirstLives + " lives left.");
									gameWon = false;
									isFirstPlayer = false;
									roundLost = true;
								}

							//displaying message and further process in a case when first letter of provided word was not valid or '-' is entered
							}else{
								playerFirstLives = playerFirstLives - 1;
								if (enteredWordFirstPlayer.equals("-")){
									System.out.println(plFirstName+ ", sorry to see you cannot provide word as " +enteredWordFirstPlayer +
									" means you want to pass round to the next player and you lost one life. You have "
									+playerFirstLives + " lives left.");
								}else{
									System.out.println(plFirstName+ ", the entered word: " +enteredWordFirstPlayer
									+ " doesn't start with given letters and you lost one life. You have "
									+playerFirstLives + " lives left.");
								}
								gameWon = false;
								isFirstPlayer = false;
								roundLost = true;
							}

					//IF IS SECOND PLAYER INSIDE LOOP
						} else {
							//asking player to provide a word which starts with last two letters of word provided by previous player
							System.out.println(app.getSecondPlayerName() + " please enter a word that beggins with : "
							+app.getValidWordFirstPlayer().charAt(app.getValidWordFirstPlayer().length()-2)
							+app.getValidWordFirstPlayer().charAt(app.getValidWordFirstPlayer().length()-1));
							enteredWordSecondPlayer = anotherInput.nextLine();

							//first process for validating word, if it starts with last two letters of word provided by previous player
							if(enteredWordSecondPlayer.charAt(0)==app.getValidWordFirstPlayer().charAt(app.getValidWordFirstPlayer().length()-2)
							&& enteredWordSecondPlayer.charAt(1)==app.getValidWordFirstPlayer().charAt(app.getValidWordFirstPlayer().length()-1)){

								//second process for validating word, checking if it is part of an vocabulary array
								for(int i=0; i<words.length; i++){
									if (enteredWordSecondPlayer.equalsIgnoreCase(words[i])){
										app.setValidWordSecondPlayer(words[i]);
										//process for checking if the word is valid
										System.out.println("The " + app.getValidWordSecondPlayer()+ " word is valid.");
										// process for gaining points when word is valid
										plSecondPoints = 0;
										for(int j=0; j<app.getValidWordSecondPlayer().length(); j++){
											char c = app.getValidWordSecondPlayer().charAt(j);
											if(!(c=='a') && !(c=='e') && !(c=='o') && (app.getValidWordSecondPlayer().length()>=3)){
											plSecondPoints = plSecondPoints + 1;
											app.setSecondPlayerPoints(plSecondPoints);
											app.setSecondPlayerCounter(plSecondPoints);
											}
										}
									}
								}
								//displaying message when player has provided valid word, satisfied both requerements and got points,
								//points are individual for provided word and total for the game
								if (enteredWordSecondPlayer.equalsIgnoreCase(app.getValidWordSecondPlayer())){
									System.out.println(plSecondName+ " you have got " +app.getSecondPlayerPoints()+ " points.");
									System.out.println(plSecondName+ " your total points are " + app.getSecondPlayerCounter() + " points.");
								}
								//displaying message and further process in a case when first and second letter of provided word was second
								//last and last latter of word provided by previous player but full word is not part of vocabulary array
								if(!app.getValidWordSecondPlayer().equalsIgnoreCase(enteredWordSecondPlayer)){
									playerSecondLives = playerSecondLives - 1;
									System.out.println(plSecondName+ ", the entered word: " +enteredWordSecondPlayer
									+ " doesn't exist in given vocabulary and you lost one life. You have " +playerSecondLives + " lives left.");
									gameWon = false;
									isFirstPlayer = true;
									roundLost = true;
								}
							//displaying message and further process in a case when first letter of provided word was not valid or '-' is entered
							}else{
								playerSecondLives = playerSecondLives - 1;
								if (enteredWordSecondPlayer.equals("-")){
									System.out.println(plSecondName+ ", sorry to see you cannot provide word as " +enteredWordSecondPlayer
									+ " means you want to pass the round to the next player and you lost one life. You have "
									+playerSecondLives + " lives left.");

								}else{
									System.out.println(plSecondName+ ", the entered word: " +enteredWordSecondPlayer
									+ " doesn't start with given letters and you lost one life. You have "
									+playerSecondLives + " lives left.");
								}
								gameWon = false;
								isFirstPlayer = true;
								roundLost = true;
							}
						}


						//process for validating who the winner of the game is if last life is lost inside of roundLost loop
						//if the winner of the game is first player
						if(playerSecondLives==0){
							System.out.println();
							System.out.println ("Congratulations "+plFirstName+ "! You are the winner of the game!");
							System.out.println(plFirstName+ " has " +app.getFirstPlayerCounter()+ " points and "
							+ plSecondName+ " has " +app.getSecondPlayerCounter()+ " points.");
							System.out.println("-----------------------------------------------------------------
							-------------------------------------------------------");
							System.out.println();
							System.out.println(plFirstName+ " would you like to play a game again? Enter YES or NO.");
								if(input.nextLine().equalsIgnoreCase("yes")){
									System.out.println("Let's start again. Best of luck!");
									//calls method to reset game
									app.resetGame();
									playerFirstLives = 5;
									playerSecondLives = 5;
									gameWon = false;
									isFirstPlayer = true;

								}else{
									System.out.println();
									System.out.println(plFirstName+ " and " +plSecondName + " thank you for playing a game!");
									gameWon = true;
									break;
								}
						}
						//if the winner of the game is second player
						if(playerFirstLives==0){
							System.out.println();
							System.out.println ("Congratulations "+plSecondName+ "! You are the winner of the game!");
							System.out.println(plSecondName+ " has " +app.getSecondPlayerCounter()+ " points and "
												+ plFirstName+ " has " +app.getFirstPlayerCounter()+ " points.");
							System.out.println("------------------------------------------------------------------
												------------------------------------------------------");
							System.out.println();
							System.out.println(plSecondName+ " would you like to play a game again? Enter YES or NO.");
							//process for playing a new game or ending a game
							if(input.nextLine().equalsIgnoreCase("yes")){
								System.out.println("Let's start again. Best of luck!");
								//calls method to reset game
								app.resetGame();
								playerFirstLives = 5;
								playerSecondLives = 5;
								gameWon = false;
								isFirstPlayer = false;

							}else{
								System.out.println();
								System.out.println(plFirstName + " and " +plSecondName + " thank you for playing a game!");
								gameWon = true;
								break;
							}
						}

					}
			}
	}
}

