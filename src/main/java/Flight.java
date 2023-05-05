import java.util.ArrayList;
import java.util.List;

public class Flight implements FlightCheck{

    private List<Employee> crew;

    public Flight(Language language) {
        this.language = language;
        this.crew= new ArrayList<>();
    }

    private Language language;

    @Override
    public boolean isCrewComplete() {
        int cpt=0;
        int co_plt=0;
        int attendants=0;
        for (int i = 0; i < crew.size(); i++) {
            if(crew.get(i).getType().equals(Type.CAPTAIN)){
                cpt++;
            }
            if(crew.get(i).getType().equals(Type.CO_PILOT)){
                co_plt++;
            }
            if(crew.get(i).getType().equals(Type.FLIGHT_ATTENDANT)){
                attendants++;
            }

        }
        return cpt==1 && co_plt==1 && attendants==3;
    }

    @Override
    public boolean isSameLanguage() {
        int count=0;
        for (int i = 0; i < crew.size(); i++) {
            if(crew.get(i) instanceof Attendant A){
                if(A.getLanguage().equals(language)){
                    count++;
                }
            }
        }
        return count==3;
    }

    @Override
    public boolean isReadyToFlight() {
        return isCrewComplete() && isSameLanguage() && pilotsHasCompass();
    }

    @Override
    public boolean pilotsHasCompass() {
        int count=0;
        for (int i = 0; i < crew.size(); i++) {
            if(crew.get(i) instanceof Pilot P){
                if (P.hasCompass()){
                    count++;
                }
            }
        }
        return count==2;
    }
}
