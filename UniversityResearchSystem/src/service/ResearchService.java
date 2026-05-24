package service;

import model.ResearchPaper;
import model.Researcher;
import exceptions.InvalidCitationsException;
import java.util.List;

public class ResearchService {

    public static int calculateHIndex(Researcher researcher) {
        List<ResearchPaper> papers = researcher.getPapers();
        if (papers == null || papers.isEmpty()) return 0;

        papers.sort((p1, p2) -> Integer.compare(p2.getCitations(), p1.getCitations()));

        int hIndex = 0;
        for (int i = 0; i < papers.size(); i++) {
            if (papers.get(i).getCitations() >= i + 1) {
                hIndex = i + 1;
            } else {
                break;
            }
        }
        return hIndex;
    }

    public static void publishPaper(Researcher researcher, ResearchPaper paper) throws InvalidCitationsException {
        if (paper.getCitations() < 0) {
            throw new InvalidCitationsException("Citations cannot be negative.");
        }
        researcher.addPaper(paper);
    }
}