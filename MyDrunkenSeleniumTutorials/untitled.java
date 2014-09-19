            //Declare linear layout string Workout Data Row
            String generalContentDesc = "Workout Data Row";

            //initial distance unit
            String[] initialDist = {"mi", "km", "yds", "m"};

            //Distance Units Full Name
            String[] distanceUnitsFullName = {"kilometers", "yards", "meters", "miles"};

            //Distance Units Abbreviated Name
            String[] distanceUnitsAbbName = {"km", "yds", "m", "mi"};

            //Verify Distance Units
            for (int i = 0; i < initialDist.length; i++) {

                Utils.verifyWOUnits(generalContentDesc, initialDist[i], distanceUnitsFullName[i], "Distance", distanceUnitsAbbName[i]);

            }





            