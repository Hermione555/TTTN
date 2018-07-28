/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.WriteResult;
import com.mongodb.util.JSON;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bson.types.ObjectId;
import org.json.*;

/**
 *
 * @author DELL
 */
public class Connect {

    public static List<TuDien> getTuDien() {

        Mongo mongo = new Mongo("localhost", 27017); //to establish a connection
        DB db = mongo.getDB("galaxy_movie");                // select the databse test

        Set<String> colls = db.getCollectionNames();  //get all the collection names in "test"

        for (String s : colls) {
            System.out.println(s);   //printing the collection names on to the console
        }
        DBCollection collection = db.getCollection("emotion");

        DBCursor cursor = collection.find();
        JSON json = new JSON();
        String serialize = json.serialize(cursor);
        System.out.println(serialize);

        DBObject obj = cursor.next();
        obj.removeField("_id");
        System.out.println(obj);
        JSONObject obj2 = new JSONObject(obj.toString());
        JSONArray array = obj2.getJSONArray("emotion");
        List<TuDien> list = new ArrayList<TuDien>();

        for (int i = 0; i < array.length(); i++) {
            String tu = array.getJSONObject(i).get("tu").toString();
            float trongso = Float.parseFloat(array.getJSONObject(i).get("trongso").toString());
            int hatgiong = Integer.parseInt(array.getJSONObject(i).get("tuhatgiong").toString());
            list.add(new TuDien(tu, trongso, hatgiong));
        }

        return list;
    }

    public static List<Movie> getMovies() {

        Mongo mongo = new Mongo("localhost", 27017); //to establish a connection
        DB db = mongo.getDB("galaxy_movie");                // select the databse test

        Set<String> colls = db.getCollectionNames();  //get all the collection names in "test"

        for (String s : colls) {
            System.out.println(s);   //printing the collection names on to the console
        }
        DBCollection collection = db.getCollection("movie");

        DBCursor cursor = collection.find();
        JSON json = new JSON();
        String serialize = json.serialize(cursor);

        int num = cursor.count();
        List<Movie> list = new ArrayList<Movie>();
        for (DBObject obj : cursor) {
            JSONObject obj2 = new JSONObject(obj.toString());
            JSONObject phim = obj2.getJSONObject("phim");
            JSONObject _id = obj2.getJSONObject("_id");
            String id = _id.get("$oid").toString();
            JSONArray binhluans = phim.getJSONArray("binhluan");
            List<Comment> cmts = new ArrayList<Comment>();
            for (int i = 0; i < binhluans.length(); i++) {
                JSONObject binhluan = binhluans.getJSONObject(i);
                String email = binhluan.get("email").toString();
                String noiDung = binhluan.get("noidung").toString();
                String thoiGian = binhluan.get("thoigian").toString();
                cmts.add(new Comment(email, noiDung, thoiGian));
            }
            String khen = phim.get("khen").toString();
            String che = phim.get("che").toString();
            String ten = phim.get("tenphim").toString();
            list.add(new Movie(new ObjectId(id), cmts, Integer.parseInt(khen), Integer.parseInt(che), ten));
        }
        return list;
    }

    public static void main(String[] args) {

        List<Movie> movies = getMovies();
        ModuleXtract xtract = new ModuleXtract();
        for (Movie movie : movies) {
            System.out.println(movie.getName());
            int i = 1;
            int khen = movie.getKhen();
            int che = movie.getChe();
            System.out.println("Trước");
            System.out.println("khen: " + khen);
            System.out.println("chê: " + che);
            for (Comment cmt : movie.getComments()) {
                System.out.println("comment " + i + ": " + cmt.getNoiDung());
                String tongthe = xtract.xTract(cmt.getNoiDung());
                i++;
                if ("Trung lập".equals(tongthe)) {
                    continue;
                }
                if ("Tích cực".equals(tongthe)) {
                    //System.out.println(a);
                    khen++;

                    continue;
                } else {

                    che++;
                    

                }

            }

            System.out.println("Sau");
            System.out.println("khen: " + khen);
            System.out.println("chê: " + che);
            // Cập nhật khen chê lại lên mongo
            Mongo mongo = new Mongo("localhost", 27017); //to establish a connection
            DB db = mongo.getDB("galaxy_movie");                // select the databse test

            DBCollection collection = db.getCollection("movie");
            DBObject whereClause = new BasicDBObject("_id", movie.getId());
            DBObject values = new BasicDBObject();
            values.put("phim.khen", khen);
            values.put("phim.che", che);
            DBObject valuesWithSet = new BasicDBObject();
            valuesWithSet.put("$set", values);

            // Thực hiện việc update.
            WriteResult result = collection.update(whereClause, valuesWithSet);
            System.out.println("-------------------------------");
        }
    }

}
