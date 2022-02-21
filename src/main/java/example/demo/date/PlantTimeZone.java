package example.demo.date;

public enum PlantTimeZone {

    MICHIGAN_AP("America/New_York",2),
    OHIO_AP("America/New_York",4),
    DEARBORN_AP("America/New_York",6),
    CHICAGO_AP("America/Chicago",7),
    LOUISVILLE_AP("America/Louisville",10),
    KANSAS_CITY_AP_1("America/Chicago",14),
    CUAUTITLAN_AP("Mexico/General",18),
    HERMOSILLO_AP("Mexico/BajaNorte",19),
    KENTUCKY_AP("America/Louisville",20),
    FLAT_ROCK_AP("America/New_York",37),
    KANSAS_CITY_AP_2("America/Chicago",49),
    OAKVILLE_AP("America/Toronto",52),
    COLOGNE_AP("Europe/Berlin",9),
    CRAIOVA_AP("Europe/Bucharest",21),
    VALENCIA_AP("Europe/Madrid",24),
    CHENNAI_AP("Asia/Kolkata",27),
    SILVERTON_AP("Africa/Johannesburg",32),
    SAARLOUIS_AP("Europe/Berlin",38),
    CAMACARI_AP("America/Sao_Paulo",53),
    FTM_RAYONG_PLANT("Asia/Bangkok",28),
    PACHECO_AP("America/Buenos_Aires",36),
    UNKNOWN("America/New_York", null);

    private String timezone;
    private Integer plantId;

    public String getTimezone(){
        return timezone;
    }

    public Integer getPlantId() {
        return plantId;
    }

    PlantTimeZone(String timezone, Integer plantId) {
        this.timezone=timezone;
        this.plantId = plantId;
    }

    public static PlantTimeZone forPlantId(Integer plantId){
        for(PlantTimeZone plant : PlantTimeZone.values()){
            if( plant.plantId != null && plant.plantId.equals(plantId)){
                return plant;
            }
        }
        return UNKNOWN;
    }

}