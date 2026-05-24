package researchcommunication;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println("============================================");
        System.out.println("  Person 2: Research + Communication Demo");
        System.out.println("============================================\n");

        // --- 1. Researcher үүсгэх ---
        Researcher alice = new Researcher(1, "Alice", "Seitkali");
        Researcher bob   = new Researcher(2, "Bob", "Nurlanov");

        // --- 2. ResearchPaper үүсгэж нийтлэх ---
        ResearchPaper p1 = new ResearchPaper(1, "Deep Learning in NLP",
                "CS", 12, "p1.pdf", "IEEE Journal", "10.1109/001");
        ResearchPaper p2 = new ResearchPaper(2, "Quantum Computing",
                "Physics", 8, "p2.pdf", "Nature", "10.1038/002");
        ResearchPaper p3 = new ResearchPaper(3, "AI Ethics",
                "Social", 15, "p3.pdf", "ACM", "10.1145/003");

        // publishResearchPaper → автоматаар Research News үүснэ (pinned)
        alice.publishResearchPaper(p1);
        alice.publishResearchPaper(p2);
        alice.publishResearchPaper(p3);
        System.out.println();

        // --- 3. Citation нэмэх ---
        for (int i = 0; i < 5; i++) p1.addCite();
        for (int i = 0; i < 5; i++) p2.addCite();
        for (int i = 0; i < 2; i++) p3.addCite();
        System.out.println();

        // --- 4. h-index ---
        alice.calculateHIndex(); // 5,5,2 → h=2
        System.out.println();

        // --- 5. Citation format ---
        alice.getCitation(p1, CitationFormat.PLAIN_TEXT);
        System.out.println();
        alice.getCitation(p1, CitationFormat.BIBTEX);
        System.out.println();

        // --- 6. printPapers — citations буурах дарааллаар ---
        alice.printPapers(Comparator.comparingInt(ResearchPaper::getCitations).reversed());
        System.out.println();

        // --- 7. printPapers — pages буурах дарааллаар ---
        alice.printPapers(Comparator.comparingInt(ResearchPaper::getPages).reversed());
        System.out.println();

        // --- 8. ResearchProject + exception demo ---
        ResearchProject project = new ResearchProject(100, "AI in Healthcare");
        try {
            alice.joinProject(project);
            bob.joinProject(project);
        } catch (NotResearcherException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        project.addPaper(p1);
        System.out.println(project);
        System.out.println();

        // --- 9. Supervisor exception demo ---
        // alice h-index = 2, тиймээс exception шидэнэ
        try {
            alice.assignAsSupervisor("Graduate Student Zarina");
        } catch (LowHIndexException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println();

        // p1-д нэмэлт citation нэмж h-index >= 3 болговол
        for (int i = 0; i < 5; i++) p3.addCite(); // p3 citations = 7
        try {
            alice.assignAsSupervisor("Graduate Student Zarina");
        } catch (LowHIndexException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println();

        // --- 10. News + Comment ---
        News news = new News(10, "Conference 2025",
                "Annual research conference.", "Research", "Admin");
        // topic="Research" тул автоматаар pinned=true
        System.out.println("News pinned automatically: " + news.isPinned());
        news.viewNews();
        Comment c1 = new Comment(1, "Bob", "Great event!");
        news.addComment(c1);
        System.out.println();

        // --- 11. Message ---
        Message msg = new Message("Alice", "Bob", "Collaborate on AI Ethics paper?");
        alice.sendMessage(msg);
        bob.receiveMessage(msg);
        bob.viewMessages();
        System.out.println();

        // --- 12. toString / equals / hashCode ---
        System.out.println(alice);
        System.out.println(p1);
        System.out.println("Papers equal: " + p1.equals(p2));
        System.out.println("Same paper:   " + p1.equals(p1));

        System.out.println("\n============================================");
        System.out.println("  Demo complete.");
        System.out.println("============================================");
    }
}
