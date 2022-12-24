package momento;

public class MomentoMainClass {
    public static void main(String[] args) {
        DocumentHistory documentHistory = new DocumentHistory();
        Document doc = new Document("Hossein", "tahoma", 23);
        documentHistory.push(doc.createStatus());
        doc.setContent("javooni");
        documentHistory.push(doc.createStatus());
        doc.setFontName("nasta'aligh");
        documentHistory.push(doc.createStatus());
        doc.restore(documentHistory.pop());
        System.out.println(doc);
        doc.restore(documentHistory.pop());
        System.out.println(doc);
        doc.restore(documentHistory.pop());
        System.out.println(doc);
        doc.restore(documentHistory.pop());
        System.out.println(doc);
    }
}
