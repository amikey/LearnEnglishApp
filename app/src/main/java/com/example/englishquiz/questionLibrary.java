package com.example.englishquiz;

public class questionLibrary {
    private String question []= {
            "What number is 18?",
            "What number is eleven ?",
            "You _____ my friend",
            "____ is a policeman",
            "John is reading ... ",
            "Tedi-watch a television",
            "Andi drive-a car",
            "What month is 5?",
            "What month is 11?",
            "A giraffe has a ....",
            "An elephant has a ....",
            "A kangaroo has a....",
            "A fish live in the ....",
            "Mr.Kusno is a ....",
            "Happy X ....",
            "Weak X ....",
            "Young X ....",
            "She is keen. She is not...",
            "She is beautiful. She is not ....",
            "She is sad. She is not...."
    };

    private String choices [][] = {
            {"Eight","Eighteen","Eighty","Ninety"},
            {"10","1","11","100"},
            {"are","is","am","we"},
            {"She","He","You","I"},
            {"a book","a film","a taxi","a pen"},
            {"watching","watch","watches","watch in"},
            {"driving","drives","drove","driver"},
            {"May","April","July","March"},
            {"April","October","November","December"},
            {"big eyes","trunk","small eyes","long neck"},
            {"trunk","teeth","small ears","punch"},
            {"long neck","pouch","trunk","big eyes"},
            {"Jungle","Meadow","Sea","Cage"},
            {"Man","Woman","Girl","Baby"},
            {"Sad","Big","Young","Short"},
            {"lazy","strong","keen","fat"},
            {"keen","old","slow","fast"},
            {"lazy","sad","fat","strong"},
            {"old","weak","ugly","fat"},
            {"keen","happy","beautiful","strong"}

    };

    private String answer [] = {
            "B",
            "C",
            "A",
            "B",
            "A",
            "A",
            "A",
            "A",
            "C",
            "D",
            "A",
            "B",
            "C",
            "A",
            "A",
            "B",
            "B",
            "A",
            "C",
            "B"

    };

    public String getQuestion (int a){
        String theQuestion= question[a];
        return theQuestion;
    }

    public String getChoices (int a, int b){
        String theChoices = choices[a][b];
        return theChoices;
    }

    public String getAnswer (int a){
        String theAnswer = answer[a];
        return theAnswer;
    }

}
