package parcial01.c22022.ej01;

import java.util.Arrays;
import java.util.Comparator;

public class TVSeason {
    TVEpisode[] episodes;

    public TVSeason(TVEpisode[] episodes) {
        this.episodes = episodes;
    }

    private TVEpisode[] getEpisodesSortedCopy(Comparator<TVEpisode> comparator) {
        TVEpisode[] toReturn = Arrays.copyOf(episodes, episodes.length);
        Arrays.sort(toReturn, new Comparator<TVEpisode>() {
            @Override
            public int compare(TVEpisode e1, TVEpisode e2) {
                int cmp = comparator.compare(e1, e2);
                if (cmp == 0) cmp = e1.compareTo(e2);
                return cmp;
            }
        });
        return toReturn;

    }


    public TVEpisode[] getDateOrderCopy() {
        return getEpisodesSortedCopy((e1, e2) -> {
            return e2.getAiredDate().compareTo(e1.getAiredDate());
        });
    }

    public TVEpisode[] getNameOrderCopy() {
        return getEpisodesSortedCopy((e1, e2) -> {
            return e1.getTitle().compareTo(e2.getTitle());
        });
    }

    public TVEpisode[] getRatingOrderCopy() {
        return getEpisodesSortedCopy((e1, e2) -> {
            return e2.getRating().compareTo(e1.getRating());
        });
    }
}
