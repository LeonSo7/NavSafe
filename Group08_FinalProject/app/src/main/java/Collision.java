import java.lang.reflect.Array;
/**
 * An ADT for Collision Data
 */
public class Collision{

	private float fXCoord;		//X-coordinate of collision location
	private float fYCoord;		//Y-coordinate of a collision location
	private String fColDesc;	//Collision description
	private String fColType; 	//Collision type
	private String fJuncType; 	//Junction type
	private String fLightCond;	//Light conditions
	private String fRoadCond;	//Road conditions
	private String fSevCode; 	//Severity code
	private String fSevDesc;	//Severity description
	private String fWeather;	//Weather conditions
	private int fPedCount;		//pedestrian count
	private int fInjuries; 		//number of injuries
	private int fSInjuries;		//number of serious injuries
	private int fFatalities;	//number of fatalities
	
	
	/**
	 * Constructor for an intersection
	 * 
	 * @param splitRead - array of collision data from read module
	 */
	public Collision(String[] splitRead) {
		this.fXCoord = Integer.parseInt(splitRead[0]);
		this.fYCoord = Integer.parseInt(splitRead[1]);
		//TODO Complete when read file is complete
	}
	
	/**
	 * Gets x-coordinate for an intersection
	 * 
	 * @return fXCoord - The x-coordinate
	 */
	public float getXCoord() {
		return fXCoord;
	}
	
	/**
	 * Gets y-coordinate for an intersection
	 * 
	 * @return fYCoord - The y-coordinate
	 */
	public float getYCoord() {
		return fYCoord;
	}

	/** 
	 * Gets description of collision
	 * 
	 * @return fColDesc - collision description
	 */
	public String getColDesc(){
		return fColDesc;
	}

	/**
	 * Gets collision type
	 * 
	 * @return fColType - collision type
	 */
	public String getColType(){
		return fColType;
	}

	/**
	 * Get junction type of collision
	 * 
	 * @return fJuncType - junction type
	 */
	public String getJuncType(){
		return fJuncType;
	}

	/**
	 * Get light condition during collision
	 * 
	 * @return fLightCond - light condition during collision
	 */
	public String getLightCond(){
		return fLightCond;
	}

	/**
	 * Get road condition during collision
	 * 
	 * @return fRoadCond - road condition during collision
	 */
	public String getRoadCond(){
		return fRoadCond;
	}

	/**
	 * Get severity code
	 * 
	 * @return fSevCode - severity code
	 */
	public String getSevCode(){
		return fSevCode;
	}

	/**
	 * Get severity description
	 * 
	 * @return fSevDesc - severity description
	 */
	public String getSevDesc(){
		return fSevDesc;
	}

	/**
	 * Get weather conditions of a collsion
	 * 
	 * @return fWeather - weather conditions during accident
	 */
	public String getWeather(){
		return fWeather;
	}

	/**
	 * Get pedestrian count involved a collsiion
	 * 
	 * @return fPedCount - number of pedestrians
	 */
	public int getPedCount(){
		return fPedCount;
	}

	/**
	 * Get injury count from a collision
	 * 
	 * @return fInjuries - number of injuries
	 */
	public int getInjuries(){
		return fInjuries;
	}

	/**
	 * Get count of severe injuries from a collision
	 * 
	 * @return fSInjuries - number of severe injuries
	 */
	public int getSInjuries(){
		return fSInjuries;
	}

	/**
	 * Get fatality count from a collision
	 * 
	 * @return fFatalities - number of fatalities
	 */
	public int getFatalities(){
		return fFatalities;
	}
}