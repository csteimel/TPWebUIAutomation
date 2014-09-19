public static void testSetValueForItemInList(String specificText, String generalContentDesc, String specificContentDesc, String valueValue) throws UiObjectNotFoundException {
        //FIND ITEM
        //VERIFY ITEM EXISTS with Value

        try {

            System.out.println("TEST locate " + generalContentDesc + " " + specificContentDesc + " " + specificText + " and set value to " + valueValue + ".");


            UiScrollable aList = new UiScrollable(new UiSelector().className("android.widget.ScrollView"));

            if (aList.isScrollable()) {

                //Set Swiping to Vertical
                aList.setAsVerticalList();
                int maxSearchSwipes = aList.getMaxSearchSwipes();

                UiObject itemName = aList.getChildByText(
                        new UiSelector().description(generalContentDesc)
                                .className(LinearLayout.class.getName()),
                        specificText, true
                );

                //Declare Text Field of Item
                UiObject itemTextField = itemName.getChild(new UiSelector().description(specificContentDesc));

                if (itemTextField.exists()) {
                    System.out.println(generalContentDesc + " " + specificContentDesc + " " + specificText + " exists. Value set to " + valueValue);
                    itemTextField.setText(valueValue);
                } else {
                    aList.scrollForward();
                    if (itemTextField.exists()) {
                        System.out.println(generalContentDesc + " " + specificContentDesc + " " + specificText + " exists. Value set to " + valueValue);
                        itemTextField.setText(valueValue);
                    } else {
                        aList.scrollToBeginning(maxSearchSwipes);
                        for (int x = 0; x < maxSearchSwipes; x++) {
                            if (itemTextField.exists()) {
                                System.out.println(generalContentDesc + " " + specificContentDesc + " " + specificText + " exists. Value set to " + valueValue);
                                itemTextField.setText(valueValue);
                                break;
                            } else if (x < maxSearchSwipes) {
                                aList.scrollForward();
                            } else {
                                System.out.println("ERROR !!! " + generalContentDesc + " " + specificContentDesc + " " + specificText + " DOES NOT EXISTS! SOMETHING IS WRONG!!!! could not set value to " + valueValue + " ERROR !!");
                            }
                        }
                    }

                }

            } else {

                //MAYBE THE THIS IS NOT SCROLLABLE!
                UiScrollable bList = new UiScrollable(new UiSelector().scrollable(false));
                //Declare Item in List that is not scrollable
                UiObject bItemName = bList.getChildByText(
                        new UiSelector().description(generalContentDesc)
                                .className(LinearLayout.class.getName()),
                        specificText, true
                );
                //Declare Text Field of Item in List that is not scrollable
                UiObject bItemTextField = bItemName.getChild(new UiSelector().description(specificContentDesc));

                if (bItemTextField.exists()) {
                    System.out.println(generalContentDesc + " " + specificContentDesc + " " + specificText + " exists. Value set to " + valueValue);
                    bItemTextField.setText(valueValue);
                } else {
                    System.out.println("ERROR!!! " + generalContentDesc + " " + specificContentDesc + " " + specificText + " could not set value " + valueValue + " SOMETHING IS WRONG!!!! ERROR ");
                }

            }

            System.out.println("PASS Setting " + generalContentDesc + " " + specificContentDesc + " " + specificText + " exists. Value set to " + valueValue + " PASS");

        } catch (UiObjectNotFoundException e) {
            System.out.println("ERROR!!! " + generalContentDesc + " " + specificContentDesc + " " + specificText + " could not set value " + valueValue + " SOMETHING IS WRONG!!!! ERROR");
        }

    }