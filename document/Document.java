package document;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Document {
    private String documentId;
    private String name;
    private List<String> contentOfDocument;
    private Map<String,AccessLevel>accessMapOfDocument;

    public Document(String documentId, String name, String userId){
        this.documentId = documentId;
        this.name = name;
        contentOfDocument = new ArrayList<>();
        accessMapOfDocument = new HashMap<>();
        accessMapOfDocument.put(userId, AccessLevel.OWNER);
    }

    public String getName(){
        return name;
    }

    public String getDocumentId(){
        return documentId;
    }

    public void addContent(String content, String userId){
        if(accessMapOfDocument.get(userId)==null || accessMapOfDocument.get(userId)==AccessLevel.READ_ONLY){
            System.out.println("The user : " + userId + " does not have permission to update the document");
        }
        else{
            contentOfDocument.add(content);
        }
    }

    public void getContent(String userId){
        AccessLevel accessLevel = accessMapOfDocument.get(userId);
        if(accessLevel==null){
            System.out.println("The user : " + userId + " does not have permission to read the document");
        }

        for(int i=0;i<contentOfDocument.size();i++){
            System.out.println(contentOfDocument.get(i));
        }
    }

    public Map<String, AccessLevel> getAccessMapOfDocument(){
        return accessMapOfDocument;
    }

    public void setUserAccess(String userId, AccessLevel accessLevel){
        if(accessMapOfDocument.get(userId)==null){
            accessMapOfDocument.put(userId, accessLevel);
        }
        else{
            accessMapOfDocument.replace(userId, accessLevel);
        }
        System.out.println("User : " + userId + " has been granted " + accessLevel.toString() + " permission");
    }

    public void removeUserAccess(String userId){
        if(accessMapOfDocument.get(userId)==AccessLevel.OWNER){
            System.out.println("You can remove users with owner access");
        }
        else{
            accessMapOfDocument.remove(userId);
        }
    }
}
