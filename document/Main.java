package document;

public class Main {
    public static void main(String[] args){
        User user = new User("123456");

        Document document = new Document("1", "Theory", user.getUserId());
        user.addDocument(document);
        document.addContent("This is index page of theory", user.getUserId());
        document.getContent(user.getUserId());

        User user2 = new User("456789");
        document.getContent(user2.getUserId());

        user.grantAccess("1", user2.getUserId(), AccessLevel.READ_ONLY);
        document.getContent(user2.getUserId());

        document.addContent("This is first page of theory", user2.getUserId());

        user.grantAccess("1", user2.getUserId(), AccessLevel.WRITE_ONLY);
        document.addContent("This is first page of theory", user2.getUserId());
        document.getContent(user2.getUserId());
    }
}
