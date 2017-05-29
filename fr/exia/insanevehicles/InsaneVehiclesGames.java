package fr.exia.insanevehicles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import fr.exia.insanevehicles.element.Element;
import fr.exia.insanevehicles.element.mobile.MobileElement;
import fr.exia.insanevehicles.element.mobile.MobileElementsFactory;
import fr.exia.insanevehicles.element.mobile.MyVehicle;
import fr.exia.insanevehicles.element.motionless.MotionlessElementsFactory;

/**
 * <h1>The Class InsaneVehiclesGames.</h1>
 *
 * @author Jade
 * @version 0.1
 */
public class InsaneVehiclesGames {

    /** The Constant ROAD_VIEW. */
    public static final int ROAD_VIEW   = 13;

    /** The Constant ROAD_QUOTA. */
    public static final int ROAD_QUOTA  = 20;

    /** The road. */
    private Road            road;
    
    private MyVehicle voiture;

    /**
     * Instantiates a new insane vehicles games.
     * @throws FileNotFoundException 
     */
    public InsaneVehiclesGames() throws FileNotFoundException {
        this.setRoad(createRoad("ressources/road.txt"));
        addVehicleOnTheRoad();
    }
    
    public Road createRoad(String file) throws FileNotFoundException {
    	//Chemin complet vers le fichier road.txt
 
    	File target = new File(file);
    	// Ouverture du fichier et son traitement
    	Scanner input = new Scanner(target);
    	
    	int width = Integer.parseInt(input.nextLine());
    	int height = Integer.parseInt(input.nextLine());
    	
    	Road road = new Road(width, height, ROAD_VIEW, ROAD_QUOTA);
    	
    	int y = 0;
    	while (input.hasNextLine()) {
    		String line = input.nextLine();
    		for (int x =0; x < width; x++) {
    			char c = line.charAt(x);
    			Element e = MotionlessElementsFactory.create(c);
    			road.setOnTheRoadXY(e, x, y);
    		}
    		y++;
    		
    	}
    	//Fermture du fichier
    	input.close();
    	return road;
    }
    
    private void addVehicleOnTheRoad() {
    	// Create Vehicle on the plate
    	voiture = MobileElementsFactory.createMyVehicle();
    	// Placement du véhicule.
    	this.getRoad().setOnTheRoadXY(voiture, getRoad().getWidth() / 2, 1);
    }

    /**
     * Play.
     */
    public final void play() {
        while (true) {
        moveY(getVehicle(), 1);
        	
        Utilis.clearConsole();
    	this.getRoad().show(0);
    	Utilis.sleep(1000);
        }
    }
    

    
    
    private MobileElement getVehicle() {
		return voiture;
	}

	public void moveY(MobileElement element, int nbrDePas) {
    	Coordinates coord = getRoad().getOnTheRoad(element);
    	getRoad().removeOnTheRoad(coord, Macadam)
    	coord.addY(nbrDePas);
    	Element e = getRoad().removeOnTheRoad(coord, element);
    	// TODO Implémenter cette fonction et tout ce qui va avec.
    }

    /**
     * Gets the road.
     *
     * @return the road
     */
    public final Road getRoad() {
        return this.road;
    }

    /**
     * Sets the road.
     *
     * @param road
     *            the new road
     */
    private void setRoad(final Road road) {
        this.road = road;
    }
}
