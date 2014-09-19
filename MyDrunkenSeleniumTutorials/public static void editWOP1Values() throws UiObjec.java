public static void editWOP1Values() throws UiObjectNotFoundException {
        //edit p1 values

        String[] woNames = {
                "Distance", "Speed", "Calories", "Gain", "TSS", "IF", "Work",
                "Distance", "Speed", "Calories", "Gain", "TSS", "IF", "Work", "Loss", "N. Power",
                "HR", "Elev.", "Temp",
                "HR", "Power", "Torq.", "Elev.", "Cad.", "Temp",
                "HR", "Power", "Torq.", "Elev.", "Cad.", "Temp", "Speed",
        };
        String[] woNameLinearLayoutID = {
                "Planned", "Planned", "Planned", "Planned", "Planned", "Planned", "Planned",
                "Completed", "Completed", "Completed", "Completed", "Completed", "Completed", "Completed", "Completed", "Completed",
                "Minimum", "Minimum", "Minimum",
                "Average", "Average", "Average", "Average", "Average", "Average",
                "Maximum", "Maximum", "Maximum", "Maximum", "Maximum", "Maximum", "Maximum",
        };

        String[] woNameValues = {
                "8.765", "8.765", "8", "8", "8.765", "8.765", "8",
                "8.765", "8.765", "8", "8", "8.765", "8.765", "8", "8", "8",
                "8", "8", "8",
                "8", "8", "8.765", "8", "8", "8",
                "8", "8", "8.765", "8", "8", "8", "8.765"
        };

        for (int i = 0; i < woNames.length; i++) {
            Utils.testSetValueForItemInList(woNames[i], "Workout Data Row", woNameLinearLayoutID[i], woNameValues[i]);
        }
    }