package mainclasses;
public class Building {
       private String buildingId ;
      private String buildingName;
      private  String buildingFloors;
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public void setBuildingFloors(String buildingFloors) {
		this.buildingFloors = buildingFloors;
	}
	public String getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(String buildingId) {
		this.buildingId = buildingId;
	}      
	public String getBuildingFloors() {
		return buildingFloors;
	}
}
