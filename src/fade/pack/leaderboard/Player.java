package fade.pack.leaderboard;

public class Player {
    private final String name;
    private final Integer score;

    public Player(String name, Integer score){
        this.name = name;
        this.score = score;

    }

    public String getName() {
        return name;
    }

    public Integer getScore() {
        return score;
    }
}
