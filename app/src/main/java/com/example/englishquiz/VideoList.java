package com.example.englishquiz;

public class VideoList {
    private String listOfVideo []= {
            "_UlWBcUn2DU",
            "NA6sCLgqkL4&t=223s",
            "FHaObkHEkHQ",
            "Rj-1pEpWx3Y&index=10&list=LLlVYPkWhwwVZpiojZEM7pOg"
    };

    private String videoName []= {
            "Numbers",
            "Day and Months",
            "People around us",
            "Activities"
    };

    public String getVideo (int a){
        String theVideo= listOfVideo[a];
        return theVideo;
    }

    public String getVideoName (int a){
        String theVideoName= videoName[a];
        return theVideoName;
    }
}
