/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildyourdreamhouse;

import byui.cit260.buildYourDreamHouse.model.Actor;
import byui.cit260.buildYourDreamHouse.model.Game;
import byui.cit260.buildYourDreamHouse.model.Home;
import byui.cit260.buildYourDreamHouse.model.HomeMaterials;
import byui.cit260.buildYourDreamHouse.model.Level;
import byui.cit260.buildYourDreamHouse.model.Player;
import byui.cit260.buildYourDreamHouse.model.Room;
import byui.cit260.buildYourDreamHouse.view.GameMenu;
import byui.cit260.buildYourDreamHouse.view.HelpMenu;
import byui.cit260.buildYourDreamHouse.view.Inventory;
import byui.cit260.buildYourDreamHouse.view.Layout;
import byui.cit260.buildYourDreamHouse.view.MainMenu;
import byui.cit260.buildYourDreamHouse.view.ViewHomeStatus;
import byui.edu.cit260.buildYourDreamHouse.control.Appraiser;
import byui.edu.cit260.buildYourDreamHouse.control.HomeMeasurements;
import byui.edu.cit260.buildYourDreamHouse.control.SupplyQuantity;

/**
 *
 * @author Renee
 */
public class BuildYourDreamHouse {

    private static double layout;
    private static double furniture;
    private static double location;
    private static double size;
    private static double level;
    private static double room;
    private static double design;
    private static double window;
    private static double door;
    private static double floor;
    private static double wall;
    private static Object roomOne;
    private static Object homeOne;
    private static Object layoutOne;
    private static double levels;
    private static String urban;
    private static String rural;
    private static String surbub;
    private static String bungalowstyle;
    private static String colonialstyle;
    private static String victorianstyle;
    private static String paint;
    private static String countertops;
    private static String grabfixtures;
    private static String movefixtures;
    private static String grabfurniture;
    private static String movefurniture;
    private static String grabshrubbery;
    private static String moveshrubbery;
    private static String toolsneeded;
    private static boolean supplyQuanitityInfo;
    private static Object helpMenuOne;

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Player playerOne = new Player();

        playerOne.setName("Fred Flintstone");
        playerOne.setBestTime(7.00);

        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);

        Actor actorOne = new Actor();

        actorOne.setName("Barney Rubbles");
        actorOne.setBestTime(7.00);

        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);

        Game gameOne = new Game();

        gameOne.setName("Build Your Dream House");
        gameOne.setTotalTime(5.00);
        gameOne.setNumPeople(Boolean.TRUE);

        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);

        Home homeOne = new Home();

        homeOne.setName("Bungalow");
        homeOne.setFurniture(furniture);
        homeOne.setLayout(layout);
        homeOne.setLocation(location);
        homeOne.setSize(size);
        homeOne.setLevels(level);
        homeOne.setRooms(room);

        String homeInfo = homeOne.toString();
        System.out.println(homeInfo);
        
        Room roomOne = new Room();

        roomOne.setName("Kitchen");
        roomOne.setDesign(7);
        roomOne.setFurniture(4);
        roomOne.setWindow(8);
        roomOne.setDoor(2);
        roomOne.setFloor(1);
        roomOne.setWall(28);
        roomOne.setSize(55, 80);

        Double roomInfo = roomOne.toDouble();
        System.out.println(roomInfo);

        Level levelOne = new Level();

        levelOne.setAddRoom("Kitchen");
        levelOne.setLevel(level);

        String levelInfo = levelOne.toString();
        System.out.println();

        Layout layoutOne = new Layout();

        layoutOne.setSpace(500, 20);
        layoutOne.setOneLevel(level);
        layoutOne.setTwolevels(levels);
        layoutOne.setThreelevels(levels);
        layoutOne.setUrban(urban);
        layoutOne.setRural(rural);
        layoutOne.setSurburb(surbub);
        layoutOne.setBungalowStyle(bungalowstyle);
        layoutOne.setColonialStyle(colonialstyle);
        layoutOne.setVictorianStyle(victorianstyle);

        String layoutInfo = layoutOne.toString();
        System.out.println(layoutInfo);

        HomeMeasurements homeMeasurementsOne = new HomeMeasurements();

        homeMeasurementsOne.setDescription("brick home");
        homeMeasurementsOne.setWidth(700);
        homeMeasurementsOne.setLength(1000);
        homeMeasurementsOne.setHeight(675);
        homeMeasurementsOne.setSqFtOfRoom(300, 225);
        homeMeasurementsOne.setMaxCapacity(2);

        String homeMeasurementsInfo = homeMeasurementsOne.toString();
        System.out.println(homeMeasurementsInfo);

        HomeMaterials homeMaterialsOne = new HomeMaterials();

        homeMaterialsOne.setBuyHomeSupplies(paint);
        homeMaterialsOne.setBuyFurnitureFurnishings(countertops);
        homeMaterialsOne.setBuyLanscapeSupplies("seedlings,fertilizer,and rose bush");
        homeMaterialsOne.setGrabFixtures(grabfixtures);
        homeMaterialsOne.setMoveFixtures(movefixtures);
        homeMaterialsOne.setGrabFurniture(grabfurniture);
        homeMaterialsOne.setMoveFurniture(movefurniture);
        homeMaterialsOne.setGrabShrubbery(grabshrubbery);
        homeMaterialsOne.setMoveShrubbery(moveshrubbery);
        homeMaterialsOne.setToolsNeeded(toolsneeded);

        String homeMaterialsInfo = homeMaterialsOne.toString();
        System.out.println(homeMaterialsInfo);

        SupplyQuantity supplyQuanitityOne = new SupplyQuantity();

        supplyQuantityOne.setDiameter(212);
        supplyQuantityOne.setHeight(65);
        supplyQuantityOne.setVolume(84);
        supplyQuantityOne.setMaxWeight(71);

        Double supplyQuantityInfo;
        supplyQuantityInfo = supplyQuantityOne.toDouble();
        System.out.println(supplyQuanitityInfo);

        MainMenu mainMenuOne = new MainMenu();

        mainMenuOne.setHomeButton("home button");
        mainMenuOne.setNewGame("new game");
        mainMenuOne.setHelp("help");
        mainMenuOne.setAboutThisGame("about this game");
        mainMenuOne.setKeyboardShortCuts("keyboard short cuts");
        mainMenuOne.setIndex("index");

        String mainMenuInfo = mainMenuOne.toString();
        System.out.println(mainMenuInfo);

        HelpMenu helpMenuOne = new HelpMenu();

        helpMenuOne.setHowToPlayGame("object of game level");
        helpMenuOne.setLevelShortCuts("display game level shortcuts");
        helpMenuOne.setToolIndex("drill-can drill holes");

        GameMenu gameMenuOne = new GameMenu();

        gameMenuOne.setStoryBackground("describe scene and player objective");
        gameMenuOne.setChooseAHouse("Colonial");
        gameMenuOne.setChooseAFamily("Single");
        gameMenuOne.setChooseALocation("urban");
        gameMenuOne.setSelectTools("powerdrill,screws,and wood");
        gameMenuOne.setPlayGame("This begins the game");
        gameMenuOne.setPauseGame("This pauses or suspends the game to hold position");
        gameMenuOne.setStatusCompletion("Information window popup nd reveals player completion of a game level");
        gameMenuOne.setScore(0 - 99, 999, 999);
        gameMenuOne.setSaveGame("This saves all of the player's moves or completed tasks");
        gameMenuOne.setExitGame("This removes the player from game level to home or help menu");

        String gameMenuInfo = gameMenuOne.toString();
        System.out.println(gameMenuInfo);

        ViewHomeStatus viewHomeStatusOne = new ViewHomeStatus();

        viewHomeStatusOne.SetCompletionStatusOfHome(0);
        viewHomeStatusOne.SetCompletionStatusOfLandscape(2);
        viewHomeStatusOne.SetBalanceAmount(14, 500.00);
        viewHomeStatusOne.SetDeadLineDate(2015 / 30 / 8);

        Float viewHomeStatusInfo = viewHomeStatusOne.toFloat();
        System.out.println(viewHomeStatusInfo);

        Appraiser appraiserOne = new Appraiser();

        appraiserOne.setInteriorInspection("pass or fail");
        appraiserOne.setExteriorInspection("pass or fail");
        appraiserOne.setOverallImprovement("pass or fail");

        String appraiserInfo = appraiserOne.toString();
        System.out.println(appraiserInfo);
       
        

        Inventory inventoryOne = new Inventory();
        
        inventoryOne.setHomeMaterialReserve("full or empty");
        inventoryOne.setWindows(7);
        inventoryOne.setDoor(2);
        inventoryOne.setsink(2);
        inventoryOne.setbathtub(1);
        inventoryOne.setToilet(2);
        inventoryOne.setCabintry(3);
        inventoryOne.setWoodFloorsSqFt(140,92);
        inventoryOne.setTileLbs(42l);
        inventoryOne.setCounterTops(3);
        inventoryOne.setLightFixtures(8);
        inventoryOne.setCapetSqFt(80,120);
        inventoryOne.setPaintGal(15);
        inventoryOne.setNails(120);
        inventoryOne.setScrews(70);
        inventoryOne.setHammer(1);
        inventoryOne.setElectricDrill(1);
        inventoryOne.setFurnitureFurnishingsReserve("yes or no");
        inventoryOne.setLivingRoomFurniture(1);
        inventoryOne.setDiningRoomFurniture(1);
        inventoryOne.setBedroomFurniture(1);
        inventoryOne.setKitchenAppliances(4);
        inventoryOne.setWasherAndDryer(2);
        inventoryOne.setOfficeFurniture(0);
        inventoryOne.setPatioFurniture(0);
        inventoryOne.setLandscapeSupplyReserve("full or empty");
        inventoryOne.setShrubbery(12);
        inventoryOne.setTrees(3);
        inventoryOne.setFlowerVariety(7);
        inventoryOne.setBagsOfFertilizer(3);
        inventoryOne.setBagsOfGrassSeeds(5);
        inventoryOne.setSprinkersystem(3);
    }
    
}
