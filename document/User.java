package document;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userId;
    private List<Document>allDocuments;

    public User(String userId){
        this.userId = userId;
        this.allDocuments = new ArrayList<>();
    }

    public String getUserId(){
        return userId;
    }

    public List<Document>getAllDocuments(){
        return allDocuments;
    }

    public void createDocument(String documentId, String documentName){
        Document newDocument = new Document(documentId, documentName, userId);
        allDocuments.add(newDocument);
    }

    public void addDocument(Document newDocument){
        allDocuments.add(newDocument);
    }

    public void grantAccess(String docId, String userId, AccessLevel accessLevel){
        for(Document document: allDocuments){
            if(document.getDocumentId().equals(docId)){
                document.setUserAccess(userId, accessLevel);
            }
        }
    }


    public void revokePermission(String docId, String userId){
        for(Document document: allDocuments){
            if(document.getDocumentId().equals(docId)){
                document.removeUserAccess(userId);
            }
        }
    }
}
