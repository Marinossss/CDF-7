package gr.aueb.cf.ch17.knight;

public class Knight implements IKnight, Runnable{
    private final String name;

    public Knight(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void embarkOnMission(IMission mission) {
        System.out.println(this.getName());
        //mission.setStatus(MissionStatus.STARTED);
        mission.embark();
    }

    @Override
    public void run() {
        synchronized (IKnight.missions) { //thread safe, ενα ενα τα thread, μολις μπει το ενα κλειδωνει οποτε το επομενο θα δει την αλλαγη και δεν θα μπει.
            for (IMission mission : IKnight.missions) {
                if (mission.getStatus() == MissionStatus.NOT_STARTED) {
                    mission.setStatus(MissionStatus.STARTED);
                    this.embarkOnMission(mission);
                    break;
                }
            }
        }
    }
}
