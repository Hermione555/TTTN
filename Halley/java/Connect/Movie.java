/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author HANG
 */
public class Movie {
    private ObjectId id;
    private List<Comment> comments;
    private int khen;
    private int che;
    private String name;

    public Movie(ObjectId id, List<Comment> comments, int khen, int che, String name) {
        this.id = id;
        this.comments = comments;
        this.khen = khen;
        this.che = che;
        this.name = name;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void setKhen(int khen) {
        this.khen = khen;
    }

    public void setChe(int che) {
        this.che = che;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ObjectId getId() {
        return id;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public int getKhen() {
        return khen;
    }

    public int getChe() {
        return che;
    }

    public String getName() {
        return name;
    }
    
    
    
}
